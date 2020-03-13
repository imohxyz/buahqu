package xyz.imoh.buahqu.buahqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Buahnih> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        recyclerView = (RecyclerView) findViewById(R.id.rv_category);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(Buahnya.getListData());

        showRecyclerList();
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListBuahAdapter listBuahAdapter = new ListBuahAdapter(this, new ListBuahAdapter.OnClick() {
            @Override
            public void onClick(Object buahnih) {
                Buahnih buahnih1 = (Buahnih) buahnih;
                Intent intent = new Intent(MainActivity.this, DetailBuahActivity.class);
                intent.putExtra("kunci", buahnih1);
                startActivity(intent);
            }
        });
        listBuahAdapter.setListBuahnih(list);
        recyclerView.setAdapter(listBuahAdapter);

    }
}
