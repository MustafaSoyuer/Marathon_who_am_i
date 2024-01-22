package com.mustafa.repository;

import com.mustafa.entity.Kazananlar;
import com.mustafa.utility.RepositoryManager;

public class KazananlarRepository extends RepositoryManager<Kazananlar,Long> {
    public KazananlarRepository(){
        super(new Kazananlar());
    }
}
