package com.mustafa.service;

import com.mustafa.entity.Kazananlar;
import com.mustafa.repository.KazananlarRepository;

import java.util.List;

public class KazananlarService {
    private KazananlarRepository kazananlarRepository;
    public void save(Kazananlar kazananlar) {
        kazananlarRepository.save(kazananlar);
    }

    public List<Kazananlar> findAll() {
        return kazananlarRepository.findAll();
    }
}
