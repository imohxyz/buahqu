package xyz.imoh.buahqu.buahqu;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListBuahAdapter extends RecyclerView.Adapter<ListBuahAdapter.CardViewViewHolder> {

    private Context context;
    private ArrayList<Buahnih> listBuahnih;
    private OnClick onClick;

    public ListBuahAdapter(Context context, OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }


    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_buah, viewGroup, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {

        Buahnih p = getListBuah().get(i);
        cardViewViewHolder.tampil(p, onClick);

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View v, int position) {
                Toast.makeText(context, "Share info tentang " + getListBuah().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListBuah().size();
    }

    public ArrayList<Buahnih> getListBuah() {
        return listBuahnih;
    }

    public void setListBuahnih(ArrayList<Buahnih> listBuahnih) {
        this.listBuahnih = listBuahnih;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvDetail;
        Button btnShare, btnDetail;
        Buahnih buahnih;


        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_view);
            tvNama = (TextView) itemView.findViewById(R.id.txt_nama);
            tvDetail = (TextView) itemView.findViewById(R.id.txt_detail);
            btnShare = (Button) itemView.findViewById(R.id.btn_share);
            btnDetail = (Button) itemView.findViewById(R.id.btn_detail);

        }

        public void tampil(final Buahnih buahnih, final OnClick OnItemClick) {

            Glide.with(context)
                    .load(buahnih.getFoto())
                    .override(350, 550)

                    .into(imgFoto);

            tvNama.setText(buahnih.getNama());
            tvDetail.setText(buahnih.getDetail());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(buahnih);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object buahnih);
    }
}
