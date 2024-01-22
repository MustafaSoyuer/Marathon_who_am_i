package com.mustafa.utility;

import com.mustafa.entity.*;
import com.mustafa.entity.enums.Cinsiyet;
import com.mustafa.repository.*;

import java.util.List;

public class RepoImpl {
    private final KazananlarRepository kazananlarRepository;
    private final PuanlamaRepository puanlamaRepository;
    private final SoruRepository soruRepository;
    private final UnluBilgileriRepository unluBilgileriRepository;
    private final UnluKisiRepository unluKisiRepository;
    private final YarismaRepository yarismaRepository;
    private final YarismaciRepository yarismaciRepository;


    public RepoImpl() {
        this.kazananlarRepository=new KazananlarRepository();
        this.puanlamaRepository=new PuanlamaRepository();
        this.soruRepository = new SoruRepository();
        this.unluBilgileriRepository = new UnluBilgileriRepository();
        this.unluKisiRepository = new UnluKisiRepository();
        this.yarismaciRepository = new YarismaciRepository();
        this.yarismaRepository = new YarismaRepository();
    }

    public void defaultDataOlustur() {

        //unlukisileri oluşturuyorum
        unluKisiRepository.save(UnluKisi.builder()
                .adSoyad("Sebnem Ferah")
                .resimURL("https://resim1")
                .build());

        unluKisiRepository.save(UnluKisi.builder()
                .adSoyad("Cem Yilmaz")
                .resimURL("https://resim2")
                .build());

        unluKisiRepository.save(UnluKisi.builder()
                .adSoyad("Mesut Ozil")
                .resimURL("https://resim3")
                .build());

        unluKisiRepository.save(UnluKisi.builder()
                .adSoyad("Merve Dizdar")
                .resimURL("https://resim4")
                .build());

        unluKisiRepository.save(UnluKisi.builder()
                .adSoyad("Orhan Pamuk")
                .resimURL("https://resim5")
                .build());


        //ünlü bilgilerini giriyorum
        unluBilgileriRepository.save(UnluBilgileri.builder()
                .cinsiyet(Cinsiyet.KADIN)
                .yas(51)
                .meslek("Sarkici")
                .boy("155")
                .memleket("Yalova")
                .sacTipi("Duz")
                .sacRengi("Siyah")
                .gozlukTakiyorMu(false)
                .ipucu("Alternatif rock ve hard rock türünde sarkilar bestelemekte ve seslendirmektedir.")
                .unluKisiId(1L)
                .build());

        unluBilgileriRepository.save(UnluBilgileri.builder()
                .cinsiyet(Cinsiyet.ERKEK)
                .yas(50)
                .meslek("Komedyen")
                .boy("170")
                .memleket("Istanbul")
                .sacTipi("Duz")
                .sacRengi("Siyah")
                .gozlukTakiyorMu(false)
                .ipucu("Hokkabaz filmindeki Iskender rolu ile En iyi erkek oyuncu odulunu almistir.")
                .unluKisiId(2L)
                .build());

        unluBilgileriRepository.save(UnluBilgileri.builder()
                .cinsiyet(Cinsiyet.ERKEK)
                .yas(35)
                .meslek("Futbolcu")
                .boy("180")
                .memleket("Almanya")
                .sacTipi("Duz")
                .sacRengi("Kavherengi")
                .gozlukTakiyorMu(false)
                .ipucu("2010-2013 yillari arasinda Real Madrid te oynamıs Turk asilli futbolcudur.")
                .unluKisiId(3L)
                .build());

        unluBilgileriRepository.save(UnluBilgileri.builder()
                .cinsiyet(Cinsiyet.KADIN)
                .yas(37)
                .meslek("Oyuncu")
                .boy("162")
                .memleket("Izmir")
                .sacTipi("Duz")
                .sacRengi("Kavherengi")
                .gozlukTakiyorMu(false)
                .ipucu("2023 yilinda Cannes Film Festivalinde En iyi Kadin Oyuncu odulunu almıstir.")
                .unluKisiId(4L)
                .build());

        unluBilgileriRepository.save(UnluBilgileri.builder()
                .cinsiyet(Cinsiyet.KADIN)
                .yas(37)
                .meslek("Yazar")
                .boy("180")
                .memleket("Istanbul")
                .sacTipi("Duz")
                .sacRengi("Gri")
                .gozlukTakiyorMu(true)
                .ipucu("2006 yilinda Nobel Edebiyat odulu almisitr")
                .unluKisiId(5L)
                .build());


        // soruları oluşturuyorum
        Soru soru1=new Soru();
        soru1.setUnluBilgileriId(1L);
        soru1.setUnluKisiId(1L);
        soru1.setPuan("50");
        soru1.setSure("5dk");

        Soru soru2=new Soru();
        soru2.setUnluBilgileriId(2L);
        soru2.setUnluKisiId(2L);
        soru2.setPuan("75");
        soru2.setSure("5dk");

        Soru soru3=new Soru();
        soru3.setUnluBilgileriId(3L);
        soru3.setUnluKisiId(3L);
        soru3.setPuan("100");
        soru3.setSure("5dk");

        Soru soru4=new Soru();
        soru4.setUnluBilgileriId(4L);
        soru4.setUnluKisiId(4L);
        soru4.setPuan("125");
        soru4.setSure("5dk");

        Soru soru5=new Soru();
        soru5.setUnluBilgileriId(5L);
        soru5.setUnluKisiId(5L);
        soru5.setPuan("150");
        soru5.setSure("5dk");


        // Yarışmacıları oluşturuyorum
        Yarismaci yarismaci1 = Yarismaci.builder()
                .ad("Mustafa SOYUER")
                .username("musty")
                .avatarURL("http://avatar1")
                .email("mustafa@gmail.com")
                .cinsiyet(Cinsiyet.ERKEK)
                .build();

        Yarismaci yarismaci2= Yarismaci.builder()
                .ad("Metin DONMEZ")
                .username("meto")
                .avatarURL("http://avatar2")
                .email("metin@gmail.com")
                .cinsiyet(Cinsiyet.ERKEK)
                .build();

        Yarismaci yarismaci3 = Yarismaci.builder()
                .ad("Merve ATES")
                .username("mervi")
                .avatarURL("http://avatar3")
                .email("merve@gmail.com")
                .cinsiyet(Cinsiyet.KADIN)
                .build();

        Yarismaci yarismaci4 = Yarismaci.builder()
                .ad("Bahar ATES")
                .username("baharr")
                .avatarURL("http://avatar4")
                .email("bahar@gmail.com")
                .cinsiyet(Cinsiyet.KADIN)
                .build();



        //yarisma olusturuyorum
        Yarisma yarisma = Yarisma.builder()
        .ad("Turk Unluler Yarismasi")
        .soruListesi(List.of(soru1, soru2, soru3, soru4, soru5))
        .yarismaciListesi(List.of(yarismaci1, yarismaci2, yarismaci3,yarismaci4))
        .baslangicTarihi(System.currentTimeMillis())
        .sure(3600*1000L)
        .build();

        soru1.setYarisma(yarisma);
        soru2.setYarisma(yarisma);
        soru3.setYarisma(yarisma);
        soru4.setYarisma(yarisma);
        soru5.setYarisma(yarisma);

        yarismaci1.setYarisma(yarisma);
        yarismaci2.setYarisma(yarisma);
        yarismaci3.setYarisma(yarisma);
        yarismaci4.setYarisma(yarisma);
        yarismaRepository.save(yarisma);


        // Puanlamalar
        puanlamaRepository.save(Puanlama.builder()
                .yarismaId(1L)
                .yarismaciId(1L)
                .sure(5000L)
                .puan(100L)
                .build());
        puanlamaRepository.save(Puanlama.builder()
                .yarismaId(1L)
                .yarismaciId(2L)
                .sure(8000L)
                .puan(300L)
                .build());
        puanlamaRepository.save(Puanlama.builder()
                .yarismaId(1L)
                .yarismaciId(3L)
                .sure(10000L)
                .puan(500L)
                .build());
        puanlamaRepository.save(Puanlama.builder()
                .yarismaId(1L)
                .yarismaciId(4L)
                .sure(3000L)
                .puan(250L)
                .build());

        Kazananlar kazananlar = Kazananlar.builder()
                .yarismaId(1L)
                .yarismaciId(2L)
                .siralama(1)
                .build();
        kazananlarRepository.save(kazananlar);

    }
}
