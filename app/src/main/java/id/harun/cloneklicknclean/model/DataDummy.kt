package id.harun.cloneklicknclean.model

object DataDummy {

    fun getServices(): List<ServiceModel> {
        val listServices: ArrayList<ServiceModel> = ArrayList()

        listServices.add(
            ServiceModel(
                1,
                "Pembersihan Umum / General Cleaning",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKJP8klAs64Jilh_FToW_rY7ReCWG9iXozJA&usqp=CAU",
                true,
                "Apa itu General Cleaning di KliknClean",
                "Pembersihan umum dengan Disinfektan",
                "Layanan pembersihan rumah profesional yang meliputi mengelap debu, mengepel lantai, merapikan kamar tidur dan membersihkan kamar mandi.",
                "*Estimasi pengerjaan yakni 30 menit untuk setiap ruangan.",
                "g2sW35RdafU"
            )
        )

        listServices.add(
            ServiceModel(
                2,
                "Fogging Disinfektan",
                "https://www.kliknclean.com/frontend/img/mobile/service/ULV.jpg",
                true,
                "Testimoni Fogging Disinfektan",
                "Fogging Disinfektan",
                "Layanan penyemprotan ruangan dengan cairan sterilisasi untuk membunuh kuman dan bakteri. Ruangan disterilisasi dengan cara disemprotkan cairan sterilisasi pada seluruh bagian ruangan dengan alat khusus ULV (Ultra Low Volume) yang berupa uap untuk membunuh kuman, bakteri dan virus. Ruangan setelah dilakukan sterilisasi tidak dapat digunakan selama 2 jam.",
                "*Estimasi pengerjaan yakni 30 menit untuk setiap 50m2 ruangan.\n" +
                        "*Mesin desinfeksi berdaya 1400 Watt.",
                "AGosK6iXX_U"
            )
        )

        listServices.add(
            ServiceModel(
                3,
                "Cuci Mobil/ Fogging Disinfektan",
                "https://www.kliknclean.com/frontend/img/mobile/service/CW.jpg",
                true,
                "Proses Cuci Mobil di KliknClean",
                "Cuci Mobil / Fogging Disinfektan",
                "Layanan cuci mobil mulai dari eksterior, pembersihan interior, semi ban, wax hingga perawatan kaca. Pilih layanan sesuai kebutuhan dan biarkan teknisi KliknClean mengerjakannya.",
                "*Estimasi pengerjaan yakni 60 menit untuk setiap unit mobil.",
                "laPC32ie0pk"
            )
        )

        listServices.add(
            ServiceModel(
                4,
                "Cuci Kasur, Sofa & Karpet",
                "data:image/jpeg;base64,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",
                false,
                "",
                "Cuci Kasur, Sofa & Karpet",
                "Layanan pencucian yang diperuntukkan karpet, sofa, kursi makan dan kursi kerja guna mengangkat noda, debu dan tungau secara maksimal.",
                "*Noda tidak dapat hilang 100%, bergantung pada kondisi noda."
            )
        )

        listServices.add(
            ServiceModel(
                5,
                "Vakum Tungau / Hydro Cleaning",
                "https://www.kliknclean.com/frontend/img/mobile/kliknclean-cuci-sofa.jpg",
                false,
                "Hydro Cleaning Kasur",
                "Vakum Tungau",
                "Layanan Vakum Tungau atau sedot tungau yang diperuntukkan kasur, sofa, karpet dan gorden dengan hitungan per/item. Dengan daya hisap mesin sebesar 2000rpm, debu dan tungau pasti terangkat maksimal.",
                "*Tidak dapat mengangkat noda",
                "JgG1Kibau2w"
            )
        )

        listServices.add(
            ServiceModel(
                6,
                "Layanan AC",
                "https://www.kliknclean.com/frontend/img/mobile/kliknclean-ac.jpg",
                false,
                "Klik n Clean Layanan Pembersihan AC",
                "Layanan AC",
                "Layanan yang meliputi cuci AC, tambah dan isi freon terbaik untuk jenis AC split dan inverter. Pilih layanan sesuai kebutuhan dan biarkan teknisi KliknClean mengerjakannya.",
                "*Tangga sudah disediakan oleh KliknClean.\n" +
                        "\n" +
                        "*Pelanggan akan dikenakan biaya sebesar Rp 50.000 untuk biaya pengecekan atau jika kondisi AC tidak memungkinkan dilakukan pencucian AC, isi freon, tambah freon, cuci AC besar (overhoul).",
                "mLfGjoq4ps4&t=2s"
            )
        )

        listServices.add(
            ServiceModel(
                7,
                "Layanan Paket",
                "https://www.kliknclean.com/frontend/img/mobile/kliknclean-deep.jpg",
                false,
                "",
                "Layanan Paket",
                "Layanan paket kebersihan yang dibuat sesuai dengan kebutuhan Anda dan harga yang terjangkau.",
                ""
            )
        )

        listServices.add(
            ServiceModel(
                8,
                "Pest Control",
                "https://www.kliknclean.com/frontend/img/mobile/service/PC.jpg",
                false,
                "Proses Basmi Nyamuk dari KliknClean",
                "Pest Control",
                "Layanan pembasmian dan pengendalian hama penganggu dan perusak lingkungan rumah atau lingkungan sekitar Anda. Pengerjaan dilakukan oleh petugas profesional dan terpercaya KliknClean\n" +
                        "\n" +
                        "Jasa Pest Control KliknClean meliputi:\n" +
                        "• Jasa Pembasmi Rayap\n" +
                        "• Jasa Pembasmi Kecoa\n" +
                        "• Jasa Pembasmi Kutu Busuk\n" +
                        "• Jasa Pembasmi Semut\n" +
                        "• Jasa Pembasmi Serangga\n" +
                        "• Jasa Pembasmi Nyamuk\n" +
                        "• Jasa Pembasmi Lalat\n" +
                        "• Jasa Pembasmi Tawon\n" +
                        "• Jasa Pembasmi Tikus\n" +
                        "• Jasa Pembasmi Ular\n" +
                        "• Jasa Pembasmi Cicak\n" +
                        "• Fumigasi\n" +
                        "\n" +
                        "Pilih sesuai kebutuhan Anda.",
                "*Estimasi pengerjaan yakni 20 menit untuk setiap 10m2 ruangan.",
                "5xz5rkC_E7k"
            )
        )

        listServices.add(
            ServiceModel(
                9,
                "Setrika",
                "https://www.kliknclean.com/frontend/img/mobile/kliknclean-ironing.jpg",
                false,
                "",
                "Setrika",
                "Layanan setrika terbaik untuk pakaian Anda. Minimal pemesanan dilakukan selama 2 jam. Jumlah pakaian yang dapat disetrika selama 1 jam adalah 10 - 15 potong",
                "*Disesuaikan dengan jenis, model & bahan pakaian."
            )
        )

        listServices.add(
            ServiceModel(
                10,
                "Poles Lantai atau Kristalisasi Marmer / Granit",
                "https://www.kliknclean.com/frontend/img/mobile/kliknclean-marmer-polish.jpg",
                false,
                "Proses Kristalisasi Marmer / Granit dari KlickNClean",
                "Kristalisasi Marmer / Granit",
                "Kristalisasi bertujuan untuk mengembalikan warna asli marmer / granit dan membuat permukaan menjadi mengkilap serta keras. Kristalisasi juga bertujuan untuk menghindari noda karena resapan kimiawinya membentuk lapisan film sebagai pelindung permukaan lantai dan membuat lantai menjadi anti slip dan anti debu sehingga sangat mengurangi kebutuhan perawatan lantai.",
                "",
                "QIIqOsdJrAA"
            )
        )

        return listServices
    }
}