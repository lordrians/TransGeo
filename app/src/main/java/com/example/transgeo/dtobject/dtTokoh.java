package com.example.transgeo.dtobject;

import com.example.transgeo.object.Tokoh;

import java.util.ArrayList;

public class dtTokoh {
    private static String[] nama = {
            "Omar Khayyam",
            "Ibnu al-Haytham",
            "Thales",
            "Thabit Ibnu Qurra",
            "Julius Wilhelm Richard Dedekind",
            "Georg Friedrich Bernhard Riemann",
            "Euclid"
    };

    private static String[] bidang = {
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat",
            "Master Filsafat"
    };

    private static String[] poto = {
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg",
            "https://3.bp.blogspot.com/-EeHVZ87pmck/UF75WXjZ2MI/AAAAAAAAAtg/m5MLaBlRQ6w/s1600/pythagoras.jpg"
    };

    private static String[] deskripsi = {
            "\u0009\u0009\u0009\u0009Omar Khayyam lahir 18 Mei 1048 di Nishapur di timur laut Iran. Pada usia muda ia pindah ke Samarkand dan memperoleh pendidikan di sana. Setelah itu ia pindah ke Bukhara dan berhasil menjadi matematikawan besar dan astronom dari periode abad pertengahan. Dia adalah penulis dari salah satu risalah yang paling penting pada aljabar dan ditulis sebelum aman modern, Treatise on Demonstrasi Masalah Aljabar, yang mencakup metode geometris untuk memecahkan persamaan kubik dengan memotong sebuah hiperbola dengan lingkaran.\n" +
                    "\u0009\u0009\u0009\u0009Omar Khayyam meneruskan tradisi aljabar al-Khawarizmi dengan memberikan persamaan sampai pangkat tiga. Seperti pendahulunya, Omar Khayyam melengkapi dengan persamaan kuadrat baik untuk solusi aritmatika maupun solusi geometri. Untuk persamaan-persamaan umum pangkat tiga dipercayainya bahwa solusi untuk aritmatika adalah tidak mungkin (kelak pada abad lima belas dibuktikan bahwa pernyataan ini salah), sehingga dia hanya memberi solusi geometri.\n" +
                    "\u0009\u0009\u0009\u0009Gambar kerucut yang dipotong untuk menyelesaikan persamaan pangkat dua sudah pernah dipakai oleh Menaechmus, Archimedes, dan Alhazen. Namun, Omar Khayyam mengambil cara lebih elegan dengan melakukan generalisasi metode guna mencakup persamaan-persamaan pangkat tiga dengan hasil berupa akar bilangan positif. Untuk persamaan dengan pangkat lebih dari tiga, Omar Khayyam tidak dapat memberi gambaran dengan menggunakan metode geometri yang sama. Dianggap bahwa tidak ada dimensi lebih dari tiga, “Apa yang disebut dengan kuadrat dikuadratkan oleh para ahli aljabar, memberi daya tarik dari sisi teoritis.”",
            "\u0009\u0009\u0009\u0009Ibnu al-Haytham adalah salah satu saintis besar yang hidup antara tahun 965-1038 M, tepatnya lahir pada 1 Juli 965 di Bashra, Irak. Nama lengkapnya Abū ʿAlī al-Ḥasan ibn al-Ḥasan Ibn al-Haytham. Masyarakat barat mengenalnya dengan nama Alhazen. Ibn al-Haytham hidup di masa Daulah Abbasiyah, salah satu dinasti muslim besar yang pernah berkuasa di Timur Tengah hingga Eropa.\n" +
                    "\u0009\u0009\u0009\u0009Alhazen seorang prolific tulen. Karyanya mencapai lebih dari 185 buah, ia juga seorang polymath sejati sebab karyanya meliputi berbagai bidang keilmuan seperti matematika, fisika, astronomi, metafisika, anatomi tubuh, akuntansi hingga kaligrafi. Namanya sering dikaitkan dengan camera obscura yang merupakan cikal bakal kamera saat ini. Ia memperkenalkan nama bagian-bagian mata yang kita kenal melalui terjemah Latinnya seperti vitreous humour, aqueous humour, retina, kornea, dan lain-lain. Ia meredakan polemik beratus tahun lamanya tentang teori penglihatan, memunculkan permasalahan klasik dalam matematika di mana dunia mengenalnya dengan Alhazen’s Problem yang baru dapat dipecahkan secara eksak pada 1997 oleh matematikawan Oxford Peter Neumann.\n" +
                    "\u0009\u0009\u0009\u0009Karya Ibnu al-Haytham di bidang optik pada masa itu seakan melampaui jaman. Dari eksperimen yang dilakukan, Ibn al-Haytham berkesimpulan bahwa cahaya merambat lurus. Ia mengembangkan konsep pemantulan pada cermin parabolik. Ia juga melakukan eksperimen untuk pembiasan. Konvensi “sudut datang” dan “sudut bias” adalah temuannya, dan hingga kini masih digunakan dalam hukum pembiasan Snellius. Ibn al-Haytham jugalah yang menyatakan bahwa ketika cahaya memasuki suatu medium yang lebih rapat, cahaya tersebut bergerak lebih lambat. Pendapatnya tentang pembiasan itu digunakannya untuk menjelaskan fenomena fajar/senja, dengan menyatakan bahwa fajar/senja terjadi karena matahari berada di bawah ufuk (horizon) sehingga cahayanya dibiaskan oleh atmosfer. Karya Ibnu al-Haytham dalam bidang optik ini berkaitan erat dengan salah satu aplikasi matematika di bidang transformasi geometri, yaitu refleksi.",
            "\u0009\u0009\u0009\u0009Thales merupakan salah seorang filsuf Yunani yang hidup pada abad ke-6 SM. Ia (624-546 SM) lahir di kota Miletus. Awalnya, Thales adalah seorang pedagang, profesi yang membuatnya sering melakukan perjalanan. Kondisi kota Miletos yang cukup makmur memungkinkan orang-orang di sana untuk mengisi waktu dengan berdiskusi dan berpikir tentang segala sesuatu yang ada di sekitar mereka, sehingga banyak para filsuf Yunani pertama yang lahir di tempat ini. Pemikiran Thales dianggap sebagai kegiatan berfilsafat pertama karena ia mencoba menjelaskan dunia dan gejala-gejala di dalamnya dengan menggunakan rasio manusia dan tidak bergantung pada mitos yang berkembang di masyarakat. Ia juga dikenal sebagai salah satu dari Tujuh Orang Bijaksana (dalam bahasa Yunani disebut dengan hoi hepta sophio), yang oleh Aristoteles diberi gelar 'filsuf yang pertama'.\n" +
                    "\u0009\u0009\u0009\u0009Thales juga dikenal sebagai ahli geometri, astronomi, dan politik. Pada bidang matematika, Thales mengungkapkan salah satu gagasan yang cukup fenomenal, yakni di bidang kesebangunan. Diceritakan bahwa dia dapat menghitung tinggi piramida dengan menggunakan bantuan dari bayangan suatu tongkat. Thales menggunakan kenyataan bahwa segitiga yang dibentuk oleh piramida dan bayangannya sebangun dengan segitiga kecil yang dibentuk oleh tongkat dan bayangannya. Dengan menggunakan perbandingan kesebangunandua segitiga itu ia dapat memperkirakan tinggi dari piramida tersebut.\n" +
                    "\u0009\u0009\u0009\u0009Selain itu, dia juga dapat mengukur jauhnya kapal di laut dari pantai. Kemudian Thales menjadi terkenal setelah dia berhasil memprediksi terjadinya gerhana matahari pada tanggal 28 Mei atau 30 September tahun 609 SM. Dia dapat melakukan prediksi tersebut karena dia telah mempelajari catatan-catatan astronomis yang tersimpan di Babilonia sejak tahun 747 SM. Thales tidak meninggalkan cukup bukti tertulis mengenai pemikiran filsafatnya. Pemikirannya didapatkan melalui tulisan Aristoteles tentang dirinya. Aristoteles mengatakan bahwa Thales adalah orang yang pertama kali memikirkan tentang asal mula terjadinya alam semesta. Oleh karena itu, Thales juga dianggap sebagai perintis filsafat alam (natural philosophy).",
            "\u0009\u0009\u0009\u0009Thabit (Tsabit) Ibnu qurra Ibnu Marwanal-Sabi al-Harrani atau yang lebih dikenal dengan nama Thabit Ibn Qurra adalah seorang ilmuwan yang berasal dari Harran (Turki sekarang) yang menguasai ilmu matematika, astronomi dan mekanika. Selain itu, karena keahliannya dalam bahasa ia juga telah menerjemahkan sejumlah besar karya-karya dari Yunani ke Arab. Tsabit bin Qurrah lahir pada tahun 833 di Haran, Mesopotamia. Ia dikenal sebagai ahli geometri terbesar pada masa itu. Tsabit merupakan salah satu penerus karya al-Khawarizmi. Beberapa karyanya diterjemahkan dalam bahasa Arab dan Latin, khususnya karya tentang Kerucut Apollonius. Tsabit juga pernah menerjemahkan sejumlah karya ilmuwan Yunani, seperti Euclides, Archimedes, dan Ptolomeus.\n" +
                    "\u0009\u0009\u0009\u0009Karya orisinal Archimedes yang diterjemahkannya berupa manuskrip berbahasa Arab, yang ditemukan di Kairo. Setelah diterjemahkan, karya tersebut kemudian diterbitkan di Eropa. Pada tahun 1929, karya tersebut diterjemahkan lagi dalam bahasa Jerman. Adapun karya Euclides yang diterjemahkannya berjudul On the Promises of Euclid; on the Propositions of Euclid dan sebuah buku tentang sejumlah dalil dan pertanyaan yang muncul jika dua buah garis lurus dipotong oleh garis ketiga. Hal tersebut merupakan salah satu bukti dari pernyataan Euclides yang terkenal di dunia ilmu pengetahuan. Selain itu, Tsabit juga pernah menerjemahkan sebuah buku geometri yang berjudul Introduction to the Book of Euclid.\n" +
                    "\u0009\u0009\u0009\u0009Kontribusi besar Thabit terletak dalam matematika dan astronomi. Tsabit merupakan salah satu penerus karya al-Khawarizmi. Beberapa karyanya diterjemahkan dalam bahasa Arab dan Latin, khususnya karya tentang Kerucut Apollonius. Tsabit meninggalkan karya berharga yaitu penentuan luas bumi yang masih dipakai hingga saat ini. Ia juga penemu jam matahari (Mazawil asy-Syamsiyyah).\n" +
                    "\u0009\u0009\u0009\u0009Buku Elements karya Euclides merupakan sebuah titik awal dalam kajian ilmu geometri. Seperti yang dilakukan para ilmuwan muslim lain, Tsabit bin Qurrah pun tidak mau ketinggalan mengembangkan dalil baru tersebut. Ia mulai mempelajari dan mendalami masalah bilangan irasional. Dengan metode geometri, ia ternyata mampu memecahkan soal khusus persamaan pangkat tiga. Sejumlah persamaan geometri yang dikembangkan Tsabit bin Qurrah mendapat perhatian dari sejumlah ilmuwan muslim, terutama para ahli matematika. Salah satu ilmuwan tersebut adalah Abu Ja’far al-Khazin, seorang ahli yang sanggup menyelesaikan beberapa soal perhitungan dengan menggunakan bagian dari kerucut. Para ahli matematika menganggap penyelesaian yang dibuaat Tsabit bin Qurrah sangat kreatif. Tentu saja, hal tersebut disebabkan Tsabit bin Qurrah sangat menguasai semua buku karya ilmuwan asing yang pernah diterjemahkannya.",
            "\u0009\u0009\u0009\u0009Julius Wilhelm Richard Dedekind lahir pada 3 Oktober 1831 dan wafat pada 12 Februari 1916, pada usia 85 tahun. Beliau merupakan matematikawan berasal dari Jerman yang sangat dipertimbangkan dalam sejarah matematika, sebagai salah satu penemu di bidang matematika. Pemikiran Dedekind banyak dijadikan metode untuk membentuk konsep baru (The Man and The Number, 1982). Dedekind menyebutkan bahwa dari konsep itu angka adalah kreasi pikiran manusia. Beliau menemukan konsep bilangan secara kuantitif dan merupakan representatif suatu label yang disebut bilangan.\n" +
                    "\u0009\u0009\u0009\u0009Dedekind merupakan professor di Pholytecnic School di Zurich, Jerman. Selama hidupnya, Dedekind banyak menerima penghargaan dalam bidang matematika ketika bekerja. Dia terpilih dalam Göttingen Academy (1862), The Berlin Academy (1880), Academy of Rome, The Leopoldino-California Naturae Curiosorum Academia, dan the Académie des Sciences in Paris (1900). Penghargaan dalam bidang doktoral diberikan kepadanya oleh The Universities of Kristiania (Oslo), Zurich and Brunswick. Pada tahun 1879 Dedekin menerbitkan buku berjudul Über die Theorie der ganzen algebraischen Zahlen yang sekali lagi memberikan pengaruh sangat besar terhadap dasar-dasar Matematika. Hikmah yang dapat diambil dari biografi singkat Richard Dedekind antara lain sebagai berikut:\n" +
                    "    • Semangat Dedekind untuk merumuskan suatu teori bilangan yang lebih sederhana\n" +
                    "dan dapat dipahami sekaligus sebagai dasar metodologi konsep-konsep modern pada usia yang relatif muda.\n" +
                    "    • Dedekind tetap rendah hati sehingga dia selalu memiliki semangat belajar yang tinggi sekalipun telah menjadi seorang pengajar.\n" +
                    "    • Dedekind tidak mudah puas dengan segala penghargaan yang telah dianugerahkan kepadanya terbukti dengan keaktifannya dalam hal penelitian khususnya teori aljabar.",
            "\u0009\u0009\u0009\u0009Georg Friedrich Bernhard Riemann adalah seorang matematikawan berpengaruh asal Jerman. Riemann memberikan kontribusi dalam bidang matematika yang bertahan lama, di antaranya analisis riil, geometri differensial dan teori bilangan. Riemann adalah anak kedua dari enam bersaudara, ia menderita berbagai kerusakan saraf. Riemann sudah memiliki kemampuan matematika yang luar biasa, seperti kemampuan kalkulasi dari usia dini, tetapi karna ia memiliki kekurangan, hingga membuatnya takut untuk berbicara di depan umum.\n" +
                    "\u0009\u0009\u0009\u0009Selanjutnya Riemann pindah ke Berlin dan mulai menekuni bidang matematika. meskipun teorema dasar kalkulus telah dikemukakan oleh Newton, namun Riemann memberi definisi mutakhir tentang integral tentu. Atas sumbangnnya inilah integral tentu sering disebut sebagai Integral Riemann. Hikmah yang dapat kita ambil adalah:\n" +
                    "    • Walaupun Riemann termasuk dalam keluarga miskin dengan banyak anggota keluarga, dia tetap berusaha dalam bidang yang dia yakini, yaitu bidang Matematika. walaupun sulit, tapi dia tetap berusaha hingga akhirnya membuahkan hasil dan menjadi guru besar istimewa di Universitas Göttingen.\n" +
                    "    • Dengan kekurangan yang ia miliki, ia tetap berjuang menekuni bidangnya. Hingga ia memiliki banyaknya penemuan yang amat berguna untuk dunia matematika.\n" +
                    "    • Rieman mempunyai sifat yang tidak mudah menyerah yang dibuktikan dengan sumbangan yang Riemann berikan bagi ilmu matematika, karena meskipun Newton dan Leibniz mempunyai suatu versi mengenai integral dan mengetahui teorema dasar kalkulus namun Riemannlah yang memberikan definisi modern tentang integral tentu, oleh karena itu untuk menghormatinya disebutlah integral Riemann.",
            "\u0009\u0009\u0009\u0009Euclid dapat disebut sebagai matematikawan utama atau bisa disebut bapak Geometri, sebab telah berhasil melahirkan karya tulis dalam bidang matematika berjudul The Element. Karya ini merupakan karya yang sangat monumental, sehingga ia dinobatkan sebagai matematikawan terbesar Yunani dan guru mate\u00ADmatika sepanjang masa. The Element terdiri atas 13 buah buku yang tersusun berdasarkan tema dan topik. Setiap buku diawali dengan definisi, postulat, preposisi, teorema, dan ditutup dengan pembuktian menggunakan definisi serta postulat yang sudah dise\u00ADbutkan sebelumnya.\n" +
                    "\u0009\u0009\u0009\u0009Pada tahun 1482, buku ini diterjemahkan ke dalam bahasa Latin dan Arab. Pada awal tahun 1700, buku tersebut dijadikan sebagai buku teks geometri dan logika. Adapun garis-garis besar isi masing-masing buku tersebut adalah :\n" +
                    "    • Buku I : Dasar-Dasar Geometri; Teori Segitiga, Sejajar, dan Luas\n" +
                    "    • Buku II : Aljabar Geometri\n" +
                    "    • Buku III : Teori-Teori tentang Lingkaran\n" +
                    "    • Buku IV : Cara Membuat Garis dan Gambar Melengkung lc\n" +
                    "    • BukuV : Teori tentang Proporsi-Proporsi Abstrak\n" +
                    "    • Buku VI : Bentuk yang Sama dan Proporsi-Proporsi dalam Geometri\n" +
                    "    • Buku VII : Dasar-Dasar Teori Angka\n" +
                    "    • Buku VIII: Proporsi-Proporsi Lanjutan dalam Teori Angka\n" +
                    "    • Buku IX : Teori Angka\n" +
                    "    • Buku X : Klasifikasi\n" +
                    "    • Buku XI : Geometri Tiga Dimensi\n" +
                    "    • Buku XII : Mengukur Bentuk-Bentuk\n" +
                    "    • Buku XIII: Bentuk-Bentuk Trimatra (Tiga Dimensi).\n" +
                    "\u0009\u0009\u0009\u0009Pada mulanya, ia mengumpulkan segala sesuatu yang perlu diketahui berdasarkan topik yang telah ditentukan. Lalu, ia menyatakan sejumlah definisi dan kebenaran dasar (aksioma). Kemudian, ia menyusun sisa bukunya secara logis sekaligus menambahkan bukti-bukti yang masih dianggap kurang. Selanjutnya, ia mengembangkan kesimpulan-kesimpulan geometri dari bukti-bukti ma\u00ADtematis yang didasarkan pada aksioma-aksioma dan aturan-aturan dasar atau asumsi-asumsi yang telah disebutkan pada bagian awal buku itu. Dalam hal ini, asumsi kelima Euclid adalah aturan sejajar. Dari aturan ini, ia menyimpulkan bahwa 3 sudut sebelah dari berbagai jenis segitiga harus berjumlah total 180°. Berabad-abad tahun kemudian, seorang ahli matematika bernama Carl Gauss, menguji hasil peng\u00ADamatan ini. Ia menggunakan teleskop yang memiliki daya kuat tinggi dan peralatan survei berpresisi tinggi untuk mengukur besar sudut-sudut dalam berbagai jenis segitiga. Hasilnya, jumlah total sudut dalam setiap segi\u00ADtiga adalah 180°, sesuai dengan Geometri Euclid."
    };


    public static ArrayList<Tokoh> getData(){
        ArrayList<Tokoh> arrayList = new ArrayList<>();
        for (int i = 0; i < nama.length; i++){
            Tokoh tokoh = new Tokoh();
            tokoh.setNama(nama[i]);
            tokoh.setBidang(bidang[i]);
            tokoh.setDeksripsi(deskripsi[i]);
            tokoh.setPoto(poto[i]);
            arrayList.add(tokoh);
        }
        return arrayList;
    }

}
