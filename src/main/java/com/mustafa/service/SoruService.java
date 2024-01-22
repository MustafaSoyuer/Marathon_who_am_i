package com.mustafa.service;

import com.mustafa.entity.Soru;
import com.mustafa.repository.SoruRepository;

import java.util.List;

public class SoruService {
    private SoruRepository soruRepository;
    public void save(Soru soru) {
        soruRepository.save(soru);
    }

    public List<Soru> findAll() {
        return soruRepository.findAll();
    }

}
