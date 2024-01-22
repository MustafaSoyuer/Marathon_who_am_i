package com.mustafa.service;

import com.mustafa.entity.Puanlama;
import com.mustafa.repository.PuanlamaRepository;

import java.util.List;

public class PuanlamaService {
    private PuanlamaRepository puanlamaRepository;
    public void save(Puanlama puanlama) {
        puanlamaRepository.save(puanlama);
    }

    public List<Puanlama> findAll() {
        return puanlamaRepository.findAll();
    }
}
