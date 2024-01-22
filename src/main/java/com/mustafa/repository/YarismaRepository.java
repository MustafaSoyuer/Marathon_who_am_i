package com.mustafa.repository;

import com.mustafa.entity.Yarisma;
import com.mustafa.utility.RepositoryManager;

public class YarismaRepository extends RepositoryManager<Yarisma,Long> {
    public YarismaRepository(){
        super(new Yarisma());
    }
}
