package com.example.candi

object CandiData {
    private val candinames = arrayOf(
        "Candi Banyunibo",
        "Candi Batujaya",
        "Candi Borobudur",
        "Candi Brahu",
        "Candi Lumbung",
        "Candi Mendut",
        "Candi Muara Takus",
        "Candi Ngawen",
        "Candi Sewu",
        "Candi Sumberawan")

    private val candidetails = arrayOf(
        "Candi Banyunibo yang berarti air jatuh-menetes (dalam bahasa Jawa) adalah candi Buddha yang berada tidak jauh dari Candi Ratu Boko, yaitu di bagian sebelah timur dari kota Yogyakarta ke arah kota Wonosari. Candi ini dibangun pada sekitar abad ke-9 pada saat zaman Kerajaan Mataram Kuno. Pada bagian atas candi ini terdapat sebuah stupa yang merupakan ciri khas agama Buddha.",
        "Kompleks Percandian Batujaya adalah sebuah suatu kompleks sisa-sisa percandian Buddha kuna yang terletak di Kecamatan Batujaya dan Kecamatan Pakisjaya, Kabupaten Karawang, Provinsi Jawa Barat. Situs ini disebut percandian karena terdiri dari sekumpulan candi yang tersebar di beberapa titik.",
        "Borobudur adalah nama sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah. Lokasi candi adalah kurang lebih 100 km di sebelah barat daya Semarang dan 40 km di sebelah barat laut Yogyakarta. Candi ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra.",
        "Candi Brahu merupakan tempat pembakaran (krematorium) jenazah raja-raja Brawijaya. Anehnya dalam penelitian, tak ada satu pakarpun yang berhasil menemukan bekas abu mayat dalam bilik candi. Lebih lebih setelah ada pemugaran candi yang dilakukan pada tahun 1990 hingga 1995.",
        "Candi Lumbung adalah candi Buddha yang berada di dalam kompleks Taman Wisata Candi Prambanan, yaitu di sebelah candi Bubrah. Menurut perkiraan, candi ini dibangun pada abad ke-9 pada zaman Kerajaan Mataram Kuno. Candi ini merupakan kumpulan dari satu candi utama (bertema bangunan candi Buddha)",
        "Candi Mendut adalah sebuah candi berlatar belakang agama Buddha. Candi ini terletak di desa Mendut, kecamatan Mungkid, Kabupaten Magelang, Jawa Tengah, beberapa kilometer dari candi Borobudur.\n" + "Candi Mendut didirikan semasa pemerintahan Raja Indra dari dinasti Syailendra. Di dalam prasasti Karangtengah yang bertarikh 824 Masehi, disebutkan bahwa raja Indra telah membangun bangunan suci bernama veluvana yang artinya adalah hutan bambu. Oleh seorang ahli arkeologi Belanda bernama J.G. de Casparis, kata ini dihubungkan dengan Candi Mendut.",
        "Candi Muara Takus adalah sebuah candi Buddha yang terletak di Riau, Indonesia. Kompleks candi ini tepatnya terletak di desa Muara Takus, Kecamatan XIII Koto, Kabupaten Kampar atau jaraknya kurang lebih 135 kilometer dari Kota Pekanbaru, Riau. Jarak antara kompleks candi ini dengan pusat desa Muara Takus sekitar 2,5 kilometer dan tak jauh dari pinggir Sungai Kampar Kanan.",
        "Candi Ngawen adalah candi Buddha yang berada kira-kira 5 km sebelum candi Mendut dari arah Yogyakarta, yaitu di desa Ngawen, kecamatan Muntilan, Magelang. Menurut perkiraan, candi ini dibangun oleh wangsa Syailendra pada abad ke-8 pada zaman Kerajaan Mataram Kuno. Keberadaan candi Ngawen ini kemungkinan besar adalah yang tersebut dalam prasasti Karang Tengah pada tahun 824 M.",
        "Candi Sewu adalah candi Buddha yang berada di dalam kompleks candi Prambanan (hanya beberapa ratus meter dari candi utama Roro Jonggrang). Candi Sewu (seribu) ini diperkirakan　dibangun pada saat kerajaan Mataram Kuno oleh raja Rakai Panangkaran (746 – 784). Candi Sewu merupakan komplek candi Buddha terbesar setelah candi Borobudur, sementara candi Roro Jonggrang merupakan candi bercorak Hindu.",
        "Candi Sumberawan hanya berupa sebuah stupa, berlokasi di Kecamatan Singosari, Malang. Dengan jarak sekitar 6 km dari Candi Singosari. Candi ini Merupakan peninggalan Kerajaan Singhasari dan digunakan oleh umat Buddha pada masa itu."
    )

    private val candiimg = intArrayOf(
        R.drawable.candi_banyunibo,
        R.drawable.candi_batujaya,
        R.drawable.candi_borobudur,
        R.drawable.candi_brahu,
        R.drawable.candi_lumbung,
        R.drawable.candi_mendut,
        R.drawable.candi_muara_takus,
        R.drawable.candi_ngawen,
        R.drawable.candi_sewu,
        R.drawable.candi_sumberawan
    )

    val listData: ArrayList<Candi> get() {
        val list = arrayListOf<Candi>()
        for (position in candinames.indices){
            val candi = Candi()
            candi.name = candinames[position]
            candi.detail = candidetails[position]
            candi.photo = candiimg[position]
            list.add(candi)
        }
        return list
    }
}