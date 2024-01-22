package com.mustafa.service;

import com.mustafa.entity.UnluBilgileri;
import com.mustafa.entity.UnluKisi;
import com.mustafa.repository.UnluBilgileriRepository;


import java.util.ArrayList;
import java.util.List;


public class UnluBilgileriService {
    private UnluBilgileriRepository unluBilgileriRepository;
    public static List<UnluBilgileri> unluBilgileriGetir(List<UnluKisi> unluList){
        List<UnluBilgileri>  unluBilgileriListesi = new UnluBilgileriRepository().findAll();

        List<UnluBilgileri> unluBilgileriList=new ArrayList<>();

        for (UnluKisi unluKisi : unluList) {
            UnluBilgileri unluBilgileri = unluBilgileriListesi.stream().filter(x -> x.getId().equals(unluKisi.getId())).findFirst().orElse(null);
            if (unluBilgileri != null) {
                System.out.println("********** İPUÇLARI *********");
                System.out.println("Cinsiyet..: " +unluBilgileri.getCinsiyet());
                System.out.println("Yas..: " +unluBilgileri.getYas());
                System.out.println("Meslek" +unluBilgileri.getMeslek());
                System.out.println("Boy..: ");
                System.out.println("Memleket..: " +unluBilgileri.getMemleket());
                System.out.println("Sac Tipi..:  " +unluBilgileri.getSacTipi());
                System.out.println("Sac Rengi..:  " +unluBilgileri.getSacRengi());
                System.out.println("Gozluk Takiyor mu? :  " +unluBilgileri.getGozlukTakiyorMu());
                System.out.println("Ipucu..:  " +unluBilgileri.getIpucu());
                System.out.println("------------------");
                unluBilgileriList.add(unluBilgileri);
            }
        }
        return unluBilgileriList;
 }

    public void save(UnluBilgileri unluBilgileri) {
        unluBilgileriRepository.save(unluBilgileri);
    }

    public List<UnluBilgileri> findAll() {
        return unluBilgileriRepository.findAll();
    }
}
