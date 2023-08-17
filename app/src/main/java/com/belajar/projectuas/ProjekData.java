package com.belajar.projectuas;

import java.util.ArrayList;

public class ProjekData {
    private static String[] projekNames = {
            "Laut Bercerita",
            "Ada Apa di Bumi? Pohon",
            "Rich Dad's - Increase Your Financial IQ\n",
            "Atomic Habits",
            "Disney: Bermain Stiker Aktivitas Menakjubkan",
            "To Heal Is To Be Happy\n",
            "Matahari Minor\n",
            "The School For Good And Evil #6: One True King\n",
            "Wedding Date #6",
            "Crash"
    };

    private static String[] projekDetails = {
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "394.0\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Kepustakaan Populer Gramedia\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "25 Okt 2017\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786024246952",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "64.0\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Gramedia Pustaka Utama\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "15 Des 2019\n" +
                    "\n" +
                    "Berat\n" +
                    "0.12 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786020636566\n" +
                    "\n" +
                    "Lebar\n" +
                    "18.5 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "Indonesia\n" +
                    "\n" +
                    "Panjang\n" +
                    "24.0cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "256\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Gramedia Pustaka Utama\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "31 Jul 2016\n" +
                    "\n" +
                    "Berat\n" +
                    "0.35 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786020333519\n" +
                    "\n" +
                    "Lebar\n" +
                    "15.0 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "Indonesia\n" +
                    "\n" +
                    "Panjang\n" +
                    "23.0cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "356\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Gramedia Pustaka Utama\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "15 Sep 2019\n" +
                    "\n" +
                    "Berat\n" +
                    "0.0 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786020633176\n" +
                    "\n" +
                    "Lebar\n" +
                    "0.0 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "ind",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "16.0\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Gramedia Pustaka Utama\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "17 Mei 2020\n" +
                    "\n" +
                    "Berat\n" +
                    "0.25 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786020640730\n" +
                    "\n" +
                    "Lebar\n" +
                    "21.0 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "Indonesia\n" +
                    "\n" +
                    "Panjang\n" +
                    "28.0cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "176\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Elex Media Komputindo\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "6 Jan 2023\n" +
                    "\n" +
                    "Berat\n" +
                    "0.25 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786230037139\n" +
                    "\n" +
                    "Lebar\n" +
                    "10 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "indonesia\n" +
                    "\n" +
                    "Panjang\n" +
                    "15cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "361\n" +
                    "\n" +
                    "Penerbit\n" +
                    "PENERBIT SABAK GRIP\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "27 Okt 2022\n" +
                    "\n" +
                    "Berat\n" +
                    "0.295 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9786239987893\n" +
                    "\n" +
                    "Lebar\n" +
                    "13.5 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "Indonesia\n" +
                    "\n" +
                    "Panjang\n" +
                    "20.0cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "640.0\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Harper Collins Us\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "29 Agt 2022\n" +
                    "\n" +
                    "Berat\n" +
                    "0.415 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9780062695222\n" +
                    "\n" +
                    "Lebar\n" +
                    "13.0 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "English\n" +
                    "\n" +
                    "Panjang\n" +
                    "19.0cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "384.0\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Penguin Us\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "8 Jul 2022\n" +
                    "\n" +
                    "Berat\n" +
                    "0.36 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9780593100851\n" +
                    "\n" +
                    "Lebar\n" +
                    "14.0 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "English\n" +
                    "\n" +
                    "Panjang\n" +
                    "21.0cm",
            "Detail\n" +
                    "Jumlah Halaman\n" +
                    "176.0\n" +
                    "\n" +
                    "Penerbit\n" +
                    "Random House USA\n" +
                    "\n" +
                    "Tanggal Terbit\n" +
                    "7 Jul 2022\n" +
                    "\n" +
                    "Berat\n" +
                    "0.125 kg\n" +
                    "\n" +
                    "ISBN\n" +
                    "9780679885504\n" +
                    "\n" +
                    "Lebar\n" +
                    "13.0 cm\n" +
                    "\n" +
                    "Bahasa\n" +
                    "English\n" +
                    "\n" +
                    "Panjang\n" +
                    "19.0cm"
    };

    private static String[] projekDesc = {
            "Sinopsis\n" +
                    "Laut Bercerita, novel terbaru Leila S. Chudori, bertutur tentang kisah keluarga yang kehilangan, sekumpulan sahabat yang merasakan kekosongan di dada, sekelompok orang yang gemar menyiksa dan lancar berkhianat, sejumlah keluarga yang mencari kejelasan makam anaknya, dan tentang cinta yang tak akan luntur.",
            "Sinopsis:\n" +
                    "Pohon adalah bagian penting dari planet kita. Apa saja sih yang bisa kita ketahui tentang pohon? Jelajahi... Bagaimana pohon tumbuh dan manfaatnya bagi kita Selidiki... Mencari tahu umur pohon dan melihat pohon-pohon tertua di dunia Buat... Kolase pohon penuh warna menggunakan daun-daun yang cantik.",
            "Sinopsis\n" +
                    "Pada tahun 1997, buku Rich Dad Poor Dad karya Robert membuat para pembaca tertegun. Buku itu mengklaim, \"Rumah Anda bukanlah aset.\" Seiring dengan berkumandangnya protes dari seluruh penjuru dunia, buku itu menjadi buku terlaris internasional, salah satu buku terlaris selama jangka waktu terpanjang dalam sejarah New York Times.",
            "Atomic Habits: Perubahan Kecil yang Memberikan Hasil Luar Biasa adalah buku kategori self improvement karya James Clear. Pada umumnya, perubahan-perubahan kecil seringkali terkesan tak bermakna karena tidak langsung membawa perubahan nyata pada hidup suatu manusia. Jika diumpamakan sekeping koin tidak bisa menjadikan kaya, suatu perubahan positif seperti meditasi selama satu menit atau membaca buku satu halaman setiap hari mustahil menghasilkan perbedaan yang bisa terdeteksi. Namun hal tersebut tidak sejalan dengan pemikiran James Clear, ia merupakan seorang pakar dunia yang terkenal dengan 'habits' atau kebiasaan. Ia tahu bahwa tiap perbaikan kecil bagaikan menambahkan pasir ke sisi positif timbangan dan akan menghasilkan perubahan nyata yang berasal dari efek gabungan ratusan bahkan ribuan keputusan kecil. Ia menamakan perubahan kecil yang membawa pengaruh yang luar biasa dengan nama atomic habits.",
            "Stiker memiliki bentuk dan warna yang beragam, membuat stiker banyak disukai oleh anak-anak. Stiker dapat ditempel di mana saja sesuai keinginan dan imajinasi anak. Bermain stiker dapat jadi pilihan orang tua untuk mengajak anak melakukan aktivitas seru, tetapi tetap bermanfaat. Manfaat bermain stiker untuk anak-anak, di antaranya melatih motorik halus dan pengembangan sensori, mengasah fokus, konsentrasi, ketekunan memecah masalah, mengenal bentuk, mengasah imajinasi, dan masih banyak lagi.",
            "Kebahagiaan adalah tujuan hidup setiap orang, tetapi tidak semua orang dapat mewujudkan kebahagiaannya. Ada yang merasa sulit untuk meraih kebahagiaan, ada yang merasa kebahagiaannya telah direnggut, bahkan ada pula yang merasa kalau dirinya tidak pantas untuk berbahagia. Kebahagiaan tidak jatuh dari langit, bukan belas kasih atau pemberian, bukan pula hasil dari merampas kebahagiaan orang lain. Kebahagiaan adalah hasil kerja keras dan penerimaan. Dengan memperjuangkan kebahagiaan, kau menyembuhkan dirimu sendiri. “To Heal is To Be Happy” adalah buku motivasi diri untuk remaja hingga dewasa yang sedang dilanda masalah dan kehilangan rasa percaya diri. Dengan nasihat-nasihat yang pendek, lugas, dan tajam, buku ini dapat menjadi inspirasi, penyemangat, serta penenang hati.",
            "Namaku Seli, dan aku bisa mengeluarkan petir.\n" +
                    "Apa yang akan kalian lakukan jika teman kalian dalam bahaya besar? Apakah menolongnya? Atau diam saja tidak bisa melakukan apapun? Aku tahu apa yang akan aku lakukan: berangkat bertarung membantunya.\n" +
                    "Kali ini kami bertualang ke Klan yang malam-malamnya adalah horor panjang. Kekuatan gelap menyelimuti separuh Klan, dan aku harus memecahkan misteri pesan yang dikirimkan lewat teknologi mimpi. Petualangan ini tidak kalah seru, tidak kalah menegangkan. Dan sungguh, aku mohon maaf, kalian mungkin berteriak kesal saat tiba di halaman terakhir buku ini. \\\n" +
                    "Buku ini adalah buku ke-74 dad serial BUMI.",
            "The first test was passed.\n" +
                    "Excalibur pulled from the stone.\n" +
                    "A new king named.\n" +
                    "But two claim the crown.\n" +
                    "The sword returns to the stone,\n" +
                    "for only one is the true king.\n" +
                    "Who?\n" +
                    "The future I have seen has many possibilities…\n" +
                    "So by my will, none shall be crowned until the Tournament is complete.\n" +
                    "The Tournament of Kings.\n" +
                    "Three trials.\n" +
                    "Three answers to find.\n" +
                    "A race to the finish.\n" +
                    "My last coronation test.\n" +
                    "Excalibur will crown the winner and take the loser's head.\n" +
                    "The first test is coming. Prepare . . .",
            "Ben Stephens has never bothered with serious relationships. He has plenty of casual dates to keep him busy, family drama he's trying to ignore and his advertising job to focus on. When Ben lands a huge ad campaign featuring movie star, Anna Gardiner, however, it's hard to keep it purely professional. Anna is not just gorgeous and sexy, she's also down to earth and considerate, and he can't help flirting a little...\n" +
                    "\n",
            "Take a look behind the bully in this modern classic from Newbery medalist Jerry Spinelli that packs a punch. And don't miss the highly anticipated new novel, Dead Wednesday.\n" +
                    "\n" +
                    "Cocky seventh-grade super-jock Crash Coogan got his nickname the day he used his first football helmet to knock his cousin Bridget flat on her backside. And he has been running over people ever since, especially Penn Webb, the dweeby, vegetarian Quaker kid who lives down the block. Through the eyes of Crash, readers get a rare glimpse into the life of a bully in this unforgettable and beloved story about stereotypes and the surprises life can bring."
    };

    private static int[] projekImages = {
            R.drawable.buku1,
            R.drawable.buku2,
            R.drawable.buku3,
            R.drawable.buku4,
            R.drawable.buku5,
            R.drawable.buku6,
            R.drawable.buku7,
            R.drawable.buku8,
            R.drawable.buku9,
            R.drawable.buku10
    };

    static ArrayList<Projek> getListData() {
        ArrayList<Projek> list = new ArrayList<>();
        for(int position = 0; position < projekNames.length; position++) {
            Projek projek = new Projek();
            projek.setName(projekNames[position]);
            projek.setDetail(projekDetails[position]);
            projek.setDesc(projekDesc[position]);
            projek.setPhoto(projekImages[position]);
            list.add(projek);
        }
        return list;
    }
}
