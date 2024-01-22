package com.mustafa.service;


import com.mustafa.controller.YarismaController;
import com.mustafa.entity.UnluKisi;
import com.mustafa.entity.Yarisma;
import com.mustafa.entity.Yarismaci;
import com.mustafa.repository.YarismaRepository;
import com.mustafa.repository.YarismaciRepository;

import java.util.List;

public class YarismaService {
    private YarismaRepository yarismaRepository;
    public static void yarismayiBaslat() {
        List<Yarismaci> yarismaciList = new YarismaciRepository().findAll();
        List<UnluKisi> unluList = UnluKisiService.rastgeleUnluGetir();

        for (Yarismaci yarismaci : yarismaciList) {
            System.out.println("Yarişmaci...: " + yarismaci.getAd()+" "+ yarismaci.getUsername());
            YarismaController.tahminEt(yarismaci, unluList);
            yarismaci.getYarisma().setSure(0L);
        }

        Yarismaci kazanan = yarismaciList.get(0);
        for (Yarismaci yarismaci : yarismaciList) {
            if (yarismaci.getYarisma().getSure() > kazanan.getYarisma().getSure()) {
                kazanan = yarismaci;
            }
        }
        System.out.println("Who Am I kazananı --> " + kazanan.getAd()+" "+kazanan.getUsername());
    }

    public void save(Yarisma yarisma) {
        yarismaRepository.save(yarisma);
    }

    public List<Yarisma> findAll() {
        return yarismaRepository.findAll();
    }
}