package com.mustafa.service;

import com.mustafa.entity.Yarismaci;
import com.mustafa.repository.YarismaciRepository;

import java.util.List;

public class YarismaciService {
    private YarismaciRepository yarismaciRepository;
    public void save(Yarismaci yarismaci) {
        yarismaciRepository.save(yarismaci);
    }

    public List<Yarismaci> findAll() {
        return yarismaciRepository.findAll();
    }
}
