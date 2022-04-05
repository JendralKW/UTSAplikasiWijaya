package com.wijaya.utsaplikasiwijaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // membuat isi dari setiap attribut
        val beritalist = listOf<Berita>(
            Berita(
                R.drawable.gambar4,
                nama = "Dosen UTDI Beri Motivasi Siswa SMA N 1 Sewon",
                detil = "Dosen Prodi Sistem Informasi, Fakultas Teknologi Informasi, Universitas Teknologi Digital Indonesia (UTDI) yang dahulu bernama STMIK Akakom, Edy Prayitno, S.Kom., M.Eng., menjadi motivator dalam acara Achievement Motivation Training & Doa Bersama untuk siswa kelas XII dan para orang tuanya, Kamis (31/3). Dalam acara tersebut, Edy menyampaikan pentingnya untuk mengoptimalkan kemampuan diri & meminta restu orang tua dalam segala hal.\n" +
                        "\n" +
                        "Karena masih dalam kondisi pandemi Covid-19, acara yang berlangsung di GOR SMA N 1 Sewon ini dibagi menjadi 2 gelombang pagi dan siang. Turut memberikan sambutan pada acara tersebut yaitu Kepala SMA N 1 Sewon, Dra. Yati Utami Purwaningsih, M.Pd., dan Ketua Komite SMA N 1 Sewon, Prof. Dr. Kasidi, M.Hum. Ucapan terima kasih dan apresiasi diberikan untuk UTDI atas kontribusinya untuk membantu meningkatkan motivasi para siswa dalam mempersiapkan ujian.\n" +
                        "\n" +
                        "Salah satu siswa peserta kegiatan tersebut, Alya Teranisa, mengatakan bahwa acara ini sangat seru walaupun menguras emosi. “Saya jadi lebih bersemangat dan termotivasi melakukan yang terbaik untuk kedua orang tua”, tutupnya."
            ),
            Berita(
                R.drawable.gambar2,
                nama = "UTDI Adakan Kerja Sama dengan MGBK SMA/MA Gunung Kidul",
                detil = "Universitas Teknologi Digital Indonesia (UTDI) yang dahulu bernama STMIK Akakom mengadakan pertemuan kerja sama dengan Musyawarah Guru Bimbingan Konseling (MGBK) SMA/MA Kabupaten Gunung Kidul, Kamis (2/3). Acara ini diikuti sekitar 35 guru BK SMA/MA se-Kab. Gunung Kidul.\n" +
                        "\n" +
                        "Dalam acara tersebut Kabag Humas, Kerja Sama, Admisi & Pemasaran UTDI, Ariesta Damayanti menyampaikan beberapa informasi & peluang kerja sama yang dapat dilakukan antara kedua belah pihak. Sementara itu, Ketua MGBK SMA/MA Gunung Kidul, Sasmito Budi Utomo, menyambut dengan baik & berharap tercipta simbiosis mutualisme antara sekolah & perguruan tinggi."
            ),
            Berita(
                R.drawable.gambar,
                nama = "UTDI Laksanakan Pelatihan IoT di SMK N 2 Magetan",
                detil = "Kamis (24/3), Universitas Teknologi Digital Indonesia (UTDI) melaksanakan pelatihan Internet of Things (IoT) di SMK N 2 Magetan. Kegiatan ini merupakan bentuk kerja sama yang rutin diselenggarakan sejak UTDI masih bernama STMIK Akakom. Narasumber kegiatan ini, Kuindra Iriyanta, S.Kom, melatih siswa untuk membangun IoT mereka sendiri, yaitu membangun sistem monitoring suhu dan kelembaban udara menggunakan thinger.io.\n" +
                        "\n" +
                        "Pelatihan ini diikuti oleh seluruh siswa dari kelas X dan XII berlangsung mulai pukul 8.00 hingga 13.00. Para siswa sangat antusias mengikuti kegiatan ini, karena dapat mengembangkan perangkat IoT-nya sendiri.\n" +
                        "\n" +
                        "Sementara itu, Kepala SMK N 2 Magetan, Drs. Susilo Purwantono, M.M. dalam sambutannya mengatakan bahwa saat ini adalah jaman yang serba modern & tidak mungkin lepas dari teknolog, salah satunya adalah IoT. Oleh karena itu, diadakan workshop bagi siswa & bekerja sama dengan UTDI. \"Terima kasih kepada pihak UTDI dan semoga setelah pelatihan ini, para siswa dapat membangun IoT mini sendiri\", tambah Susilo."
            ),
            Berita(
                R.drawable.gambar1,
                nama = "UTDI Jajaki Kerja Sama dengan SMA/K se-Kabupaten Kulon Progo",
                detil = "Universitas Teknologi Digital Indonesia (UTDI) yang dahulu bernama STMIK Akakom melakukan kegiatan penjajakan kerja sama dengan SMA/K se-Kabupaten Kulon Progo, DIY. Kegiatan yang berlangsung di aula SMK N 2 Pengasih ini diprakarsai oleh Balai Dikmen Kulon Progo dan diikuti oleh sekitar 50 Kepala SMA/K, Kamis (24/2).\n" +
                        "\n" +
                        "Dalam sambutannya, Kepala Balai Dikmen Kulon Progo Rudy Prakanto, S.Pd., M.Eng. sangat menyambut dengan baik insiasi kerja sama yang dilakukan UTDI. \"Kami juga berharap bahwa dengan adanya kerja sama ini dapat menjadikan SMA/K di Kulon Progo sebagai future school di DIY\", tambah Rudy didampingi Kasie Layanan Balai Suharyanto.\n" +
                        "\n" +
                        "Sementara itu Rektor UTDI Ir. Totok Suprawoto, M.M., M.T. didampingi Warek 4 UTDI Dison Librado, S.E., M.Kom. menyampaikan bahwa kerja sama ini merupakan upaya UTDI sebagai perguruan tinggi untuk memperluas jejaring kemitraan yang saling menguntungkan pada bidang tridarma dengan sekolah.\n" +
                        "\n" +
                        "Kabag Humas, Kerja Sama, Admisi & Pemasaran UTDI mengatakan bahwa terdapat sekitar 10 lingkup kerja sama yang ditawarkan, yaitu pendampingan siswa, pendampingan riset, pengabdian kepada masyarakat, peningkatan & pengembangan kompetensi SDM, pelaksanaan magang & PKL, kegiatan guru tamu, pengembangan karakter & budaya kerja siswa, pemberian beasiswa KIP-Kuliah Merdeka/penghargaan bagi siswa berprestasi, pengembangan & pelatihan IT, serta kejas ama lain yang menguntungkan kedua belah pihak. \"Tidak menutup kemungkinan untuk melakukan kerja sama di luar dari lingkup yang sudah ditawarkan tersebut\", tegasnya."
            ),
            Berita(
                R.drawable.gambar3,
                nama = "Lowongan Bagian Humas UTDI",
                detil = "Halo Teknozen!\n" +
                        "\n" +
                        "Ada #infoloker baru nih, kini bagian Humas UTDI membuka kesempatan bagi siswa lulusan SMK yang berminat mengembangkan bakat & tertarik untuk mengisi posisi sebagai :\n" +
                        "\n" +
                        "- Operator Studio (1 orang)\n" +
                        "\n" +
                        "Yuk tunggu apa lagi, segera daftarkan diri kalian di link berikut :\n" +
                        "https://bit.ly/reg-operator-utdi\n" +
                        "\n" +
                        "Jangan lupa share dan mention teman kalian yang berminat"
            ),
            Berita(
                R.drawable.gambar5,
                nama = "UTDI Awali 2022 dengan Pendampingan di SMK N 2 Ponorogo",
                detil = "UTDI memberikan pendampingan implementasi Internet of Things IoT di salah satu sekolah mitra, SMK N 2 Ponorogo (3/1). Pada kesempatan ini, 2 mahasiswa Prodi Teknologi Komputer UTDI mendampingi siswa-siswi untuk membuat piranti IoT. Piranti yang dibuat seperti monitoring suhu dan kelembaban udara, di mana suhu dalam ruang kelas dimonitor menggunakan sensor DHT11. Kemudian data suhu yang berhasil ditangkap dikirim ke web server dan ditampilkan di smarphone, sehingga bisa dipantau setiap saat.\n" +
                        "\n" +
                        "Kemudian juga dibuat alat penyiraman tanaman otomatis. Alat ini akan bekkerja otomatis menyiram, tanaman ketika tanah kering gan berhenti ketika kelembaban tanpa sudah cukup basah. Yang terakhir dibuat adalah alat penyemprot hand sanitizer otomatis. Dengan alat ini kita tidak perlu menyentuh tombol apapun untuk mencuci tangan, karena adanya sensor yang dapat mendeteksi keberadaan tangan. Bila sensor mendeteksi keberadaan tangan, maka hand sanitizer akan menyemprot otomatis\n" +
                        "\n" +
                        "Pendamping kegiatan tersebut, Aldi Iksan Setiawan dan M. Syechan menjelaskan bahwa, pelatihan yang diberikan selama 1 hari ini diikuti dengan serius oleh tim siswa dari sekolah. Nantinya produk ini akan dipamerkan pada acara Hari Ulang Tahun SMK N 2 Ponorogo."
            ),
            Berita(
                R.drawable.gambar22,
                nama = "POLDA DIY Kembali Gandeng UTDI Gelar Test Psikotes Tertulis",
                detil = "YOGYAKARTA – Kamis (20/01/2022) Polda DIY Kembali bekerjasama dengan Universitas Teknologi Digital Indonesia (UTDI) untuk menyelenggarakan test psikotes tertulis.\n" +
                        "\n" +
                        "Kegiatan tersebut dilaksanakan sebagai salah satu proses seleksi kenaikan pangkat di jajaran Polda DIY. Sebanyak 200 peserta mengikuti test tersebut yang dilakukan di kompleks gedung timur dan gedung selatan kampus Universitas Teknologi Digital Indonesia.\n" +
                        "\n" +
                        "Semua rangkaian kegiatan dilakukan dengan mengikuti protokol kesehatan COVID 19 yang berlaku di kampus UTDI. Seluruh peserta dan panitia juga sudah melakukan test Swab antigen pada H-1 dan dipastikan bebas dari COVID-19.\n" +
                        "\n" +
                        "Polda DIY sudah sering bekerjasama dengan UTDI yang dahulu bernama STMIK Akakom untuk memfasilitasi berbagai kegiatan mereka sejak tahun 2018. Polda DIY merasa bahwa selama bekerja sama dengan kampus UTDI selama ini tidak pernah ada masalah ataupun kendala apapun sehingga acara dapat berjalan dengan lancar. "
            ),
            Berita(
                R.drawable.gambar6,
                nama = "4 Dosen UTDI Lolos Uji Kompetensi Asesor BKD",
                detil = "Dalam Ujian Kompetensi Asesor Beban Kinerja Dosen (BKD) tahap tiga yang diselenggarakan Kementerian Pendidikan Kebudayaan, Riset, dan Teknologi empat doaen UTDI dinyatakan lolos. Ujian kompetensi tersebut dalam rangka Penjaminan Mutu Asesor BKD berstandar Nasional. Keempat dosen UTDI telah menduduki Jabatan Fungsional Lektor Kepala yaitu LN Harnaningrum SSi MT, Indra Yatini Buryadi SKom MKom, Heru Agus Triyanto SE MM dan Wagito ST MT.\n" +
                        "\n" +
                        "Asesor BKD memiliki tugas antara lain menilai rencana dan laporan BKD, memberikan rekomendasi atau catatan perbaikan dan memberi keputusan penilaian BKD. Seperti yang diketahui, Pasal 72 UU Guru dan Dosen mengatur bahwa BKD mencakup kegiatan pokok yaitu merencanakan pembelajaran, melaksanakan proses pembelajaran, melakukan evaluasi pembelajaran, membimbing dan melatih, melakukan penelitian, melakukan tugas tambahan serta melakukan pengabdian kepada masyarakat.\n" +
                        "\n" +
                        "Rektor UTDI Totok Suprawoto menjelaskan, dengan memiliki Asesor BKD maka UTDI telah dipercaya pemerintah untuk menilai kinerja dosen yang bersertifikasi baik di lingkungan UTDI sendiri maupun di perguruan tinggi lain."
            ),
            Berita(
                R.drawable.gambar7,
                nama = "UTDI Gelar Seminar Internasional, Peserta dari 20 Negara Turut Serta",
                detil = "Universitas Teknologi Digital Indonesia (UTDI) yang dahulu bernama STMIK Akakom telah menyelenggarakan the 4th International Seminar on Research of Information Technology and Intelligent Systems (ISRITI) 2021, Kamis (16/12). Seminar ini diselenggarakan secara daring dan diikuti oleh lebih dari 130 peneliti, ilmuwan dan praktisi dari 20 negara.\n" +
                        "\n" +
                        "ISRITI ke 4 2021 ini adalah seminar internasional yang ke 4 yang diselenggarakan oleh UTDI. Mengambil tema “Machine Learning for Data Science” panitia menghadirkan pembicara utama Ts. Dr. Madihah Mohd Saudi dari Universiti Sains Islam Malaysia-USIM Malaysia dengan tema model pendeteksi malware dan Prof. Yoni Nazarathy dari University of Queensland, Australia dengan topik deep learning untuk penelitian terapan.\n" +
                        "\n" +
                        "Ketua Panitia, Dr. Bambang Purnomosidi Dwi Putranto, S.E., Ak. S.Kom, MMSI menyatakan bahwa “Tujuan seminar ini adalah untuk membentuk sebuah forum internasional yang aktif dalam saling bertukar informasi tentang penelitian terbaru di bidang Teknologi Informasi, Ilmu Komputer, Informatika dan bidang terkait lainnya”. Seminar kali ini menerima lebih dari 300 tulisan ilmiah dan 140 diantaranya telah dinyatakan lolos proses review.\n" +
                        "\n" +
                        "Rektor UTDI, Ir. Totok Suprawoto, M.M, M.T berharap agar tahun depan kondisi pandemi virus corona sudah terkendali, sehingga dapat diberikan kesempatan untuk bertemu kembali secara langsung dan mengadakan konferensi ilmiah bersama antara para peneliti, akademisi, praktisi, dan pemerintah, serta membangun jaringan untuk saling bertukar informasi ilmiah."
            ),
            Berita(
                R.drawable.gambar8,
                nama = "Kawal Teknologi Digital, dari Disket Sampai Cloud Storage",
                detil = "YOGYAKARTA - Universitas Teknologi Digital Indonesia (UTDI) yang dahulu bernama STMIK Akakom telah berkembang begitu pesat. Dari yang dahulu menggunakan diskette yang hanya berkapasitas kilobyte kini telah berkembang menjadi teknologi penyimpanan awan (cloud storage) berkapasitas exabyte.\n" +
                        "Seperti yang disebutkan oleh Rektor UTDI, Ir. Totok Suprawoto, MM MT “Pergantian Akakom menjadi UTDI ini tidak hanya sekadar nama, melainkan sebuah upaya menjawab tantangan jaman yang berubah semakin cepat. Dengan berubah menjadi universitas, ia berharap mahasiswa dapat lebih mampu berpikir secara multidisiplin dengan tetap berfokus pada pengembangan teknologi digital,”\n" +
                        "\n" +
                        "Saat banyak orang masih mengidap phobia terhadap komputer, dahulu ia sudah belajar pemrograman menggunakan punched card. Sebelum UTDI memiliki komputer sendiri, ia dulu ikut praktikum di UGM. “Kami praktikum di UGM menggunakan komputer mainframe hard disk 2 GB. Saat itu masih mengalami membuat program punched card. Berebut teman-teman dari UGM. UGM dapat itu tahun 1978,” jelas mahasiswa UTDI angkatan pertama ini.\n" +
                        "\n" +
                        "Baru pada tahun 1981 UTDI memiliki Apple 2A dan IBM Compatible. Dari perkembangan ini sampai sekarang berbagai produk telah dikembangkan oleh UTDI, salah satunya aplikasi Registrasi Destinasi Wisata (Resideswita). Aplikasi ini memiliki tujuan untuk mendata keberadaan dan kondisi obyek wisata di wilayah Kabupaten Bantul. Ada pula Bantul Online Shop (BOS), marketplace yang dikembangkan untuk membantu pelaku UMKM memasarkan produknya.\n" +
                        "\n" +
                        "Jadi bisa dibilang jika Totok Suprawoto sudah ikut mengawal perubahan dari Akakom kemudian menjadi STMIK Akakom lalu kini UTDI. dari mulai jadi mahasiswa, asisten dosen, dosen, sampai kini jadi rektor. Ditengah kesibukannya menjalani amanah sebagai Rektor UTDI, ia juga dipercaya sebagai asesor di bidang informatika Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT).\n" +
                        "\n" +
                        "Dengan adanya prestasi ini, Teguh Wijono Budi Prasetijo, Ketua Yayasan Pendidikan Widya Bakti Yogyakarta sebagai Badan Penyelenggara UTDI memberikan apresiasinya. “Ini merupakan bukti bahwa profesionalisme dosen UTDI tidak diragukan lagi karena telah mendapatkan kepercayaan dari pemerintah,” tegasnya."
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = BeritaAdapter(this, beritalist){

            // Intent merupakan mekanisme untuk melakukan sebuah action dan komunikasi antar komponen aplikasi.
            val intent =Intent(this, DetailBerita::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}