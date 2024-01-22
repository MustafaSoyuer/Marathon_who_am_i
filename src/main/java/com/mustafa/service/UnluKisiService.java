package com.mustafa.service;


import com.mustafa.entity.UnluKisi;
import com.mustafa.repository.UnluKisiRepository;

import java.util.Collections;
import java.util.List;
public class UnluKisiService {
    private UnluKisiRepository unluKisiRepository;
    public static List<UnluKisi> rastgeleUnluGetir(){
        List<UnluKisi> unluList = new UnluKisiRepository().findAll();
        Collections.shuffle(unluList);
        return unluList;
    }

    public void save(UnluKisi unluKisi) {
        unluKisiRepository.save(unluKisi);
    }

    public List<UnluKisi> findAll() {
        return unluKisiRepository.findAll();
    }
}