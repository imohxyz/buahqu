package xyz.imoh.buahqu.buahqu;

import java.util.ArrayList;

public class Buahnya {
    public static String[][] data = new String[][]{
            {
                    "APEL",
                    "Apel adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68794&root=881/PNG/128/&file=Apple_icon-icons.com_68794.png",
                    "Ini adalah detail buah apel"
            },

            {
                    "PIR",
                    "Pir adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68711&root=881/PNG/128/&file=Pear_icon-icons.com_68711.png",
                    "Ini adalah detail buah pir"
            },

            {
                    "PISANG",
                    "Pisang adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68789&root=881/PNG/128/&file=Banana_icon-icons.com_68789.png",
                    "Ini adalah detail buah pisang"
            },

            {
                    "STRAWBERRY",
                    "Strawberry adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68687&root=881/PNG/128/&file=Strawberry_icon-icons.com_68687.png",
                    "Ini adalah detail buah strawberry"
            },

            {
                    "ANGGUR",
                    "Anggur adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68696&root=881/PNG/128/&file=Raspberry_icon-icons.com_68696.png",
                    "Ini adalah detail buah anggur"
            },

            {
                    "ALPUKAT",
                    "Alpukat adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68792&root=881/PNG/128/&file=Avocado_icon-icons.com_68792.png",
                    "Ini adalah detail buah alpukat"
            },

            {
                    "CHERRY",
                    "Cherry adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68770&root=881/PNG/128/&file=Cherry_icon-icons.com_68770.png",
                    "Ini adalah detail buah cherry"
            },

            {
                    "NANAS",
                    "Nanas adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68707&root=881/PNG/128/&file=Pineapple_icon-icons.com_68707.png",
                    "Ini adalah detail buah nanas"
            },

            {
                    "SEMANGKA",
                    "Semangka adalah buah buahan",
                    "https://icon-icons.com/descargaimagen.php?id=68672&root=881/PNG/128/&file=Watermelon_icon-icons.com_68672.png",
                    "Ini adalah detail buah semangka"
            }

    };

    public static ArrayList<Buahnih> getListData() {
        Buahnih buahnih = null;
        ArrayList<Buahnih> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            buahnih = new Buahnih();
            buahnih.setName(data[i][0]);
            buahnih.setDetail(data[i][1]);
            buahnih.setFoto(data[i][2]);
            buahnih.setDetail2(data[i][3]);
//            buahnih.setLahir(data[i][4]);
//            buahnih.setWafat(data[i][5]);

            list.add(buahnih);

        }
        return list;

    }
}
