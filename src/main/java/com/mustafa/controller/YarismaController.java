package com.mustafa.controller;

import com.mustafa.entity.UnluBilgileri;
import com.mustafa.entity.UnluKisi;
import com.mustafa.entity.Yarisma;
import com.mustafa.entity.Yarismaci;
import com.mustafa.service.UnluBilgileriService;
import com.mustafa.service.YarismaService;

import java.util.List;
import java.util.Scanner;

public class YarismaController {
    private YarismaService yarismaService;
    static Scanner scanner=new Scanner(System.in);
    public static void tahminEt(Yarismaci yarismaci, List<UnluKisi> unluList){

        long baslangicZamani =0L;

        for (UnluKisi unlu: unluList) {
            System.out.println("************ WHO AM I **************");

            List<UnluBilgileri> ipucuList = UnluBilgileriService.unluBilgileriGetir(List.of(unlu));
            baslangicZamani= System.currentTimeMillis();
            boolean tahminDogruMu=false;
            do {
                System.out.println("Who Am I-Tahminde Bulun.....");
                String tahmin=scanner.nextLine();
                UnluBilgileri soru=ipucuList.get(0);

                if (unlu.getId().equals(soru.getUnluKisiId())){
                    if (tahmin.equalsIgnoreCase(unlu.getAdSoyad())){
                        System.out.println("DOGRU CEVAP ");
                        tahminDogruMu=true;
                        break;
                    }else {
                        System.out.println("YANLIS CEVAP :( ");
                    }
                }
            }while (!tahminDogruMu);
        }
        Long bitisZamani = System.currentTimeMillis();
        Long yarismaSuresi = ((bitisZamani - baslangicZamani) / 1000);
        yarismaci.getYarisma().setSure(yarismaSuresi);

 }

    public void save(Yarisma yarisma){
        yarismaService.save(yarisma);
    }

    public List<Yarisma> findAll(){
        return yarismaService.findAll();
    }
}
