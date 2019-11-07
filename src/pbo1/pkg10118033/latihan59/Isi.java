package pbo1.pkg10118033.latihan59;

import java.util.Scanner;

public final class Isi extends Biodata implements Karakter, Detektif, Anak, Persamaan{
    Scanner sc = new Scanner(System.in);
    public Isi() {
        int pilih = pilihan();
        switch (pilih){
            case 1:
                this.id = 1;
                chara(tampilKarakter());
                tampilProfil();
                break;
            case 2 :
                this.id = 2;
                tampilDetektif();
                break;
            case 3 :
                this.id = 3;
                tampilAnak();
                break;
            case 4 :
                this.id = 4;
                tampilPersamaan();
                break;
            default :
                System.out.println("Tidak ditemukan");
                break;
        }
    }
    
    @Override
    public void tampilDetektif(){
        System.out.println("\n==========Detektif==========");
        System.out.println("----------------------------");
        System.out.println("1.) Conan Edogawa");
        System.out.println("2.) Kogoro Mouri");
        System.out.println("3.) Heiji Hattori");
    }
    
    @Override
    public void chara(int pilihan) {
        int pilih = pilihan;
        switch (pilih){
            case 1:
                this.id = 1;
                this.nama = "Kazuha Toyama";
                this.bio =  "Kazuha adalah teman semasa kecilnya Heiji yang menyukai Heiji. Jika Heiji muncul dalam cerita, ia selalu nampak bersamanya. Terampil dalam Aikido dan takut dengan hantu sama dengan Ran. (Sumber : Wikipedia)";
                break;
            case 2 :
                this.id = 2;
                this.nama = "Heiji Hattori";
                this.bio =  "Detektif yang berasal dari barat yang merupakan saingan Shinichi. Setelah mengetahui identitas Conan adalah Shinichi,\n"+ 
                            "\t  mereka menjadi akrab dan sering bekerja sama untuk memecahkan suatu kasus. Ia mempunyai teman sejak kecil sama seperti Shinichi dan Ran,\n"+
                            "\t  yaitu Kazuha. Sepertinya ia mempunyai rasa kepada Kazuha, tetapi ia malu untuk mengatakannya begitu juga sebaliknya. Ayahnya adalah Heizo Hattori yang bekerja di kepolisian Osaka.\n"+ 
                            "\t  Ia juga bisa kendo. (Sumber : Wikipedia)";  
                break;
            case 3 :    
                this.id = 3;
                this.nama = "Sonoko Suzuki";
                this.bio =  "Sonoko adalah teman sekelas Ran dan juga teman baiknya. Berasal dari keluarga kaya. Ia suka menarik perhatian laki-laki yang dipilihnya.\n"+
                            "\t  Saat ini ia berhubungan dengan Makoto Kyogoku, seseorang yang disebut sebagai Raja Karate yang dulu pernah menolong Sonoko ketika ia akan dibunuh oleh seseorang\n"+ 
                            "\t  bule yang sekaligus pelaku pembunuhan gadis berambut pirang. Saat Kogoro tidak ada, Conan kadang memakai Sonoko untuk membuat analisis. (Sumber : Wikipedia)";
                break;
            case 4 :    
                this.id = 4;
                this.nama = "Ran Mouri";
                this.bio =  "Siswi di SMU Teitan yang sekaligus teman sekelas dan semasa kecilnya Shinichi. Ia selalu menunggu kepulangan Shinichi. Ran beberapa kali pernah mencurigai\n"+
                            "\t  Conan yang identitasnya adalah Shinichi, tetapi Conan selalu berhasil mengelabui Ran. \n"+
                            "\t  Ia mempunyai bakat dalam karate, dan takut dengan hantu. Memiliki sifat yang lembut dan gampang menangis. (Sumber : Wikipedia)";
                break;
            case 5 :    
                this.id = 5;
                this.nama = "Kogoro Mouri";
                this.bio =  "Kogoro Mouri adalah ayahnya Ran yang bekerja sebagai Detektif. Tetapi, jika ia membuat analisis, pasti analisis itu hanyalah \"asal-asalan\".\n"+ 
                            "\t  Conan yang biasa bersama Kogoro yang selalu bertemu kasus, Kogoro selalu dipakai Conan untuk memecahkan kasus dengan cara menidurkannya dengan peluru bius\n"+ 
                            "\t  dan maka dari itu ia menjadi terkenal dengan sebutan \"Kogoro Tidur\". (Sumber : Wikipedia)";
                break;
            case 6 :    
                this.id = 6;
                this.nama = "Eri Kisaki";
                this.bio =  "Ibu nya Ran dan juga istri Kogoro. Bekerja sebagai pengacara dan disebut sebagai \"Ratu Pengacara\". Pisah tempat tinggal dengan Kogoro karena Kogoro selalu mabuk-mabukan,\n"+ 
                            "\t  bertaruh, dan sebagainya hal2 yang membuat Eri kesal. Namun, ia masih menaruh perasaan terhadap Kogoro dan cincin kawinnya masih dipakai. Mempunyai kucing yang bernama Goro,\n"+ 
                            "\t  nama tersebut berasal dari nama Kogoro. (Sumber : Wikipedia)";
                break;
            case 7 :    
                this.id = 7;
                this.nama = "Hiroshi Agasa";
                this.bio =  "Professor yang rumahnya dekat dengan rumah Shinichi. Ketika ia bertemu Shinichi yang tubuhnya menjadi kecil, awalnya ia tidak mempercayai itu adalah Shinichi.\n"+ 
                            "\t  Tetapi akhirnya ia percaya. Ia yang menciptakan berbagai macam peralatan canggih yang dipakai Conan yang dapat berguna sewaktu-waktu ketika Conan membutuhkannya.\n"+ 
                            "\t  Ia yang menemukan Ai yang pingsan didepan rumah Shinichi lalu mengadopsinya. (Sumber : Wikipedia)";
                break;
            case 8 :    
                this.id = 8;
                this.nama = "Genta Kojima";
                this.bio =  "Orang yang otaknya selalu dipenuhi dengan makanan. Awalnya ia berkata Conan adalah pengikutnya, tetapi setelahnya ia tidak pernah mengatakan hal itu. (Sumber : Wikipedia)";    
                break;
            case 9 :    
                this.id = 9;
                this.nama = "Mitsuhiko Tsuburaya";
                this.bio =  "Teman Conan yang memiliki pengetahuan yang melebihi kelas 1 sd. Penyuka teknologi. Awalnya ia menyukai Ayumi. Ketika Ai muncul,\n"+ 
                            "\t  ia menaruh hati juga kepada Ai dan sering cemburu karena Ai selalu dekat dengan Conan. (Sumber : Wikipedia)";    
                break;
            case 10 :    
                this.id = 10;
                this.nama = "Shinichi Kudo/Conan Edogawa";
                this.bio =  "Tokoh protagonis utama dari serial Detektif Conan. Dia kemudian bernama samaran Conan Edogawa (江戸川 コナン Edogawa Conan).\n"+
                            "\t  Conan Edogawa berasal dari nama Sir Arthur Conan Doyle yang merupakan nama pengarang serial petualangan Sherlock Holmes dan Edogawa Rampo \n"+
                            "\t  yang merupakan nama seorang pengarang sekaligus kritikus cerita detektif.\n"+ 
                            "\t  Shinichi Kudo adalah seorang detektif SMU terkenal yang sering membantu polisi menyelesaikan kasus sulit.\n" +
                            "\t  Suatu hari ketika menginvestigasi 2 orang mencurigakan, yang kemudian diketahui sebagai Gin dan Vodka, dia terlihat oleh Gin, dipukul, lalu dipaksa meminum racun.\n"+
                            "\t  Setelah itu, dia bangun dan menemukan dirinya telah menjadi seorang anak kecil. Menyadari bahwa dua orang tersebut akan menyelidikinya,\n"+ 
                            "\t  Shinichi menggunakan nama samaran Conan Edogawa untuk identitas barunya.\n"+
                            "\t  Dia kemudian tinggal bersama teman masa kecilnya Ran Mouri dan membantu ayahnya Kogoro Mouri yang merupakan seorang detektif swasta, untuk menyelesaikan kasus, \n"+
                            "\t  dengan harapan dapat menemukan kasus yang melibatkan Organisasi Hitam. (Sumber : Wikipedia)";        
                break;
            case 11 :    
                this.id = 11;
                this.nama = "Sherry/Ai Haibara";
                this.bio =  "Seorang anggota Organisasi Hitam yang berkhianat pada organisasi tersebut setelah kakaknya, Akemi Miyano, terbunuh di tangan Gin.\n"+
                            "\t  Perempuan yang cerdas dan serius. Melalui tangannya susunan formula misterius warisan orang tuanya yang juga bekerja pada organisasi\n"+
                            "\t  ia menciptakan berbagai macam formula untuk organisasi termasuk racun yang telah mengecilkan tubuhnya serta Shinichi Kudo.\n"+
                            "\t  Dulunya punya hubungan dengan Shuichi Akai karena kakaknya Akemi Miyano merupakan pacar Suichi Akai. Haibara kadang mengucapkan kata yang dalam artinya.\n"+
                            "\t  Dia mencurigai Okiya Subaru yang tinggal di rumahnya Shinichi Kudo sebagai anggota Organisasi Hitam. (Sumber : Wikipedia)";
                break;
            case 12 :    
                this.id = 12;
                this.nama = "Ayumi Yoshida";
                this.bio =  "Teman Conan yang juga menyukai Conan. Ia memiliki sifat yang periang dan baik hati. Ia juga menarik perhatian Mitsuhiko dan Genta.\n"+ 
                            "\t  Paling suka sama yang namanya pencarian harta karun dan setiap mendengar itu, Ayumi, Genta, Mitsuhiko langsung bersemangat untuk mencarinya. (Sumber : Wikipedia)";
                break;
            default :
                System.out.println("Tidak ditemukan");
                break;
        }
    }

    @Override
    public int tampilKarakter(){
       System.out.println("\n=====Pilih Karakter=====");
       System.out.println("------------------------");
       System.out.println("1.) Kazuha Toyama");
       System.out.println("2.) Heiji Hattori");
       System.out.println("3.) Sonoko Suzuki");
       System.out.println("4.) Ran Mouri");
       System.out.println("5.) Kogoro Mouri");
       System.out.println("6.) Eri Kisaki");
       System.out.println("7.) Hiroshi Agasa");
       System.out.println("8.) Genta Kojima");
       System.out.println("9.) Mitsuhiko Tsuburaya");
       System.out.println("10.) Conan Edogawa");
       System.out.println("11.) Ai Haibara");
       System.out.println("12.) Ayumi Yoshida");
       System.out.println("------------------------");
       System.out.print("Pilih Karakter : ");
       return sc.nextInt();
    }

    @Override
    public void tampilAnak(){
        System.out.println("\n=====Anak-anak=====");
        System.out.println("1.) Genta Kojima");
        System.out.println("2.) Mitsuhiko Tsuburaya");
        System.out.println("3.) Conan Edogawa");
        System.out.println("4.) Ai Haibara");
        System.out.println("5.) Ayumi Yoshida");
    }

    @Override
    public void tampilPersamaan() {
        System.out.println("\n=====5 Persamaan=====");
        
        System.out.println("\n===Perempuan===");
        System.out.println("1.) Kazuha Toyama");
        System.out.println("2.) Sonoko Suzuki");
        System.out.println("3.) Ran Mouri");
        System.out.println("4.) Eri Kisaki");
        System.out.println("5.) Ai Haibara");
        System.out.println("6.) Ayumi Yoshida");
        
        System.out.println("\n===Laki-laki===");
        System.out.println("1.) Heiji Hattori");
        System.out.println("2.) Kogoro Mouri");
        System.out.println("3.) Hiroshi Agasa");
        System.out.println("4.) Genta Kojima");
        System.out.println("5.) Mitsuhiko Tsuburaya");
        System.out.println("6.) Conan Edogawa");
        
        System.out.println("\n===Menyilangkan Tangan===");
        System.out.println("1.) Conan Edogawa");
        System.out.println("2.) Kogoro Mouri");
        System.out.println("3.) Ai Haibara");
        
        System.out.println("\n===Berkacamata===");
        System.out.println("1.) Conan Edogawa");
        System.out.println("2.) Eri Kisaki");
        System.out.println("3.) Hiroshi Agasa");
        
        System.out.println("\n===Berkumis===");
        System.out.println("1. Kogoro Mouri");
        System.out.println("2. Hiroshi Agasa");
    }
}