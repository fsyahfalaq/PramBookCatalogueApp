package com.akohidev.prambookcatalogue

object BooksData {
    private val bookTitles = arrayOf(
        "Bumi Manusia",
        "Anak Semua Bangsa",
        "Jejak Langkah",
        "Rumah Kaca",
        "Gadis Pantai",
        "Arok Dedes",
        "Bukan Pasar Malam",
        "Arus Balik",
        "Jalan Raya Pos, Jalan Daendels",
        "Larasati",
        "Panggil Aku Kartini Saja",
        "Dongeng Calon Arang",
        "Perburuan",
        "Cerita Dari Blora"
    )

    private val bookRatings = arrayOf(
        "4.39",
        "4.37",
        "4.35",
        "4.31",
        "4.06",
        "4.21",
        "4.00",
        "4.35",
        "3.75",
        "3.67",
        "3.93",
        "3.49",
        "3.82",
        "3.96"
    )

    private val bookIsbn = arrayOf(
        "9799731232",
        "0140256334",
        "9799731259",
        "0140256792",
        "9799731285",
        "9798659112",
        "9793820039",
        "979865904X",
        "9799731283",
        "9799731291",
        "9789799731210",
        "9798793609",
        "9798659007",
        "9798659015"
    )

    private val bookSynopsis = arrayOf(
        "Roman Tetralogi Buru mengambil latar belakang dan cikalbakal nation Indonesia di awal ke-20. Dengan membacanya waktu kita dibalikkan sedemikian rupa dan hidup di era membibitnya pergerakan nasional mula-mula, juga pertautan rasa, kegamangan jiwa, percintaan, dan pertarungan kekuatan anonym para srikandi yang mengawal penyemaian bangunan nasional yang kemudian kelak melahirkan Indonesia modern.\n\nRoman bagian pertama; Bumi Manusia, sebagai periode penyemaian dan kegelisahan dimana Minke sebagai aktor sekaligus kreator adalah manusia berdarah priyayi yang semampu mungkin keluar dari kepompong: kejawaannya menuju manusia yang bebas dan merdeka.",
        "Novel Anak Semua Bangsa karya Pramoedya Ananta Toer menggambarkan penderitaan rakyat Jawa dibawah pemerintahan Belanda yang licik dan haus kekuasaan. Dari sudut pandang Minke, seorang penulis pribumi yang begitu mendewakan Eropa, kita dapat melihat kembali sejarah bangsa Indonesia, serta bercermin melihat diri sendiri. Kita diajak menelusuri pikiran Minke yang terombang-ambing dalam keyakinannya, sampai akhirnya sadar bahwa ia harus turun dan memperhatikan bangsanya sendiri.\n\nMinke kehilangan istrinya, Annelies Mellema, pada bagian awal novel. Sahabatnya, Panji Darman atau Robert Jan Dapperste-lah yang menemani Annelies sampai ajalnya di Belanda.",
        "Jejak Langkah adalah bagian ketiga dari tetralogi Buru. Minke datang ke Betawi untuk belajar di sekolah dokter Hindia, yaitu STOVIA. Suatu saat, Ter Haar—wartawan De Locomotirf—mengajak Minke menghadiri pertemuan dengan Ir. Van Kollewijn. Merasa memiliki kesempatan yang bagus, Minke menanyakan pertanyaan yang kritis kepada Ir Van Kollewijn tentang Hindia-Belanda yang tidak bisa dijawab oleh insinyur tersebut. Jadilah Minke seorang pribumi yang diperhatikan dengan serius.\n\nSaat Minke diizinkan keluar dari asrama STOVIA, Minke menghabiskan waktunya untuk menulis di kediaman Ibu Badrun, yang biasa ia singgahi. Suatu hari ia bertemu dengan Mei, gadis Cina, yang sanggup membuatnya jatuh cinta.",
        "Rumah Kaca adalah novel terakhir dari tetralogi Buru. Sesuatu yang berbeda disajikan Pramoedya dalam Rumah Kaca. Hal yang paling mendasar adalah penggunaan sudut pandang dalam bercerita. Yaitu menggunakan tokoh Jacques Pangemanann sebagai tokoh utama cerita. \n\nPangemanann adalah seorang yang menangkap Minke sebelum diasingkan ke Maluku. Dalam penangkapan dan penyerangan itu, Prinses—istri Minke—melakukan penembakan terhadap gerombolan Robert Surhoof. Hal itu terjadi karena Pangemanann melayangkan surat kepada Prinses bahwa Minke dalam bahaya. Pangemanann melakukan itu karena mengira jika Minke tidak ada, maka Medan pun akan musnah.",
        "Di sebuah kampung nelayan yang jauh dari keramaian, hiduplah sebuah keluarga miskin yang kehidupannya menggantungkan dari laut. Mereka memiliki seorang anak gadis yang usianya baru berusia empat belas tahun. Usia yang belum cukup untuk mengarungi bahtera rumah tangga.\n\nPada usia yang sedini ini dia sudah dinikahkan dengan seorang Bendoro dari kota yang diwakili oleh sebilah keris. Perkawinan mereka hanya disaksikan oleh ketua kampung yang sekaligus sebagai perwakilan dari kota. Setelah pernikahan dilangsungkan, Gadis Pantai itulah nama anak nelayan miskin itu langsung diboyong ke kota, ke tempat keluarga Bendoro tinggal.",
        "Roman novel Arok Dedes bukan roman mistika-irasional (kutukan keris Gandring tujuh turunan). Ini adalah roman politik seutuh-utuhnya. Berkisah tentang kudeta pertama di Nusantara. Kudeta ala Jawa. Kudeta merangkak yang menggunakan banyak tangan untuk kemudian memukul habis dan mengambil bagian kekuasaan sepenuh-penuhnya. Kudeta licik tapi cerdik. Berdarah, tapi para pembunuh yang sejati bertepuk dada mendapati penghormatan yang tinggi. Melibatkan gerakan militer (Gerakan Gandring), menyebarkan syak wasangka dari dalam, memperhadapkan antarkawan, dan memanasi perkubuan.",
        "Perjalanan seorang anak revolusi yang pulang kampung karena ayahandanya jatuh sakit. Dari seputaran perjalanan itu, terungkap beberapa potong puing gejolak hati yang teka pernah teranggap dalam gebyar-gebyar revolusi.\n\nDikisahkan bagaimana keperwiraan seseorang dalam revolusi pada akhirnya melunak ketika dihadapkan pada kenyataan sehari-hari: ia menemukan ayahnya yang seorang guru yang penuh bakti tergolek sakit karena TBC, anggota keluarganya yang miskin, rumah tuanya yang sudah tidak kuat lagi menahan arus waktu, dan menghadapi istri yang cerewet.",
        "IDAYU dan Galeng adalah pemuda desa yang berasal dari keturunan rakyat biasa. Di desanya, mereka sering mendengarkan ceramah Rama Cluring (seorang guru pembicara yang kerjanya berpetualang dan berbicara di setiap tempat yang disinggahinya). Isi ceramah Rama Cluring yang selalu hidup di pikiran mereka adalah tentang melawan kemerosotan dan tentang persatuan Nusantara. Inilah yang kemudian jadi dasar bagi Galeng dalam menjalankan tugas negara.",
        "Jalan Raya Pos, Jalan Daendels, membentang 1.000 km sepanjang utara Pulau Jawa, dari Anyer sampai Panarukan, tepatnya jalan ini hanya dilebarkan di bawah pimpinan Maarschalk en Gouverneur General, Mr. Herman Willem Daendels. Digunakan pada tahun 1809. Mr. Herman Willem Daendels, memerintahkan pembangunan Jalan Raya Pos melalui penjatahan pada para bupati yang kabupatennya dilalui jalan ini. Penanggungjawab teknis pengerahan rodi, yang tak dapat menyelesaikan jatah yang telah ditentukan, digantung sampai mati pada dahan-dahan pohon sekitar proyek. Di sepanjang Jalan Raya Pos-Jalan Daendels terdapat kuburan-kuburan terluas di Pulau Jawa.",
        "Cerita ini bermula dari perjalanan Larasati (seorang bintang film termashyur pada saat itu) dari Yogya ke Jakarta untuk menemui sang ibu tercinta yang sudah tidak ditemuinya selama satu tahun. Dari awal cerita kita disuguhkan dengan suasana hati Larasati yang tidak pernah tenang, ia selalu merasa curiga dan ketakutan, takut dimata-matai. Karena ia tahu, meskipun ia seorang pelacur (diceritakan dalam roman tersebut ia juga sering diminta untuk “menemani” para lelaki), ia tetap seorang republikein –sebutan bagi orang-orang yang membela atau mendukung Pemerintah Indonesia-. Dan ia mafhum benar bahwa mata-mata NICA ada dimana-mana.",
        "Perang Diponegoro telah usai dan pendudukan Kolonial Belanda menanggung begitu banyak hutang material. Perang ini merupakan perang termahal yang pernah dialami. Untuk mengatasi itu Van Den Bosch diberangkatkan ke Jawa dan bertugas untuk memimpin dan menstabilkan keuangan kembali. Tercetuslah ide tanam paksa yang begitu menyiksa warga pribumi. Dimana pribumi dipaksa untuk bekerja tanpa imbalan bahkan penghidupan yang layak. Setelah sekian lama sistem ini berlangsung keuangan Belanda kembali terisi dan stabil, namun disisi lain terjadi gejolak oleh golongan liberal ialah Multatulis atau Dowes Dekker. Secara diam-diam atau terang-terangan ia mulai mengecam negrinya sendiri yang mengekploitasi Hindia-Belanda tanpa belas kasihan.",
        "Cerita Calon Arang bertutur tentang kehidupan seorang perempuan tua yang jahat. Pemilik teluh hitam dan penghisap darah manusia. Ia pongah. Semua-mua lawan politiknya dibabatnya. Yang mengkritik dihabisinya. Ia senang menganiaya sesama manusia, membunuh, merampas dan menyakiti. Ia punya banyak ilmu ajaib untuk membunuh orang... murid-muridnya dipaksa berkeramas dengan darah manusia. Kalau sedang berpesta, mereka tak ubahnya sekawanan binatang buas, takut orang melihatnya.",
        "Novel pendek PAT ditulis semasa ia di dalam penjara memaksa kita mengingat-ngingat terus bahwa kebebasan tidak bisa dianggap gampang saja datang dengan sendirinya. Perburuan memiliki segala kewenangan yang sah dari seorang yang mampu bertahan, dan mengandung sebanyak-banyak kebenaran semampu kita menulisnya",
        "Cerita dari Blora adalah kumpulan cerpen PAT yang ditulis semasa revolusi 1945-1949, semasa di dalam dan selepas penjara Belanda di Bukit Duri, Jakarta. Pertama kali diterbitkan oleh Balai Pustaka pada tahun 1952, dan semenjak itu kumpulan cerpen ini telah diterjemahkan ke dalam pelbagai bahasa asing, lengkap keseluruhannya ataupun terpisah satu persatu. Kesemua cerpen ini mengisahkan kejadian di tahun-tahun awal revolusi di kota kelahiran penulis."
    )

    private val bookPublishers = arrayOf(
        "Lentera Dipantara",
        "Lentera Dipantara",
        "Lentera Dipantara",
        "Lentera Dipantara",
        "Hasta Mitra",
        "Hasta Mitra",
        "Lentera Dipantara",
        "Hasta Mitra",
        "Lentera Dipantara",
        "Lentera Dipantara",
        "Lentera Dipantara",
        "Yayasan Bentang Budaya",
        "Hasta Mitra",
        "Hasta Mitra"
    )

    private val bookImages = intArrayOf(
        R.drawable.bumi_manusi,
        R.drawable.anak_semua_bangsa,
        R.drawable.jejak_langkah,
        R.drawable.rumah_kaca,
        R.drawable.gadis_pantai,
        R.drawable.arok_dedes,
        R.drawable.bukan_pasar_malam,
        R.drawable.arus_balik,
        R.drawable.jalan_raya_pos_jalan_daendels,
        R.drawable.larasati,
        R.drawable.panggil_aku_kartini_saja,
        R.drawable.calon_arang,
        R.drawable.perburuan,
        R.drawable.cerita_dari_blora
        )

    val listData: ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in bookTitles.indices) {
                val book = Book()
                book.title = bookTitles[position]
                book.rating = bookRatings[position]
                book.isbn = bookIsbn[position]
                book.publisher = bookPublishers[position]
                book.synopsis = bookSynopsis[position]
                book.photo = bookImages[position]
                list.add(book)
            }
            return list
        }
}