package com.mustafa.repository;

import com.mustafa.entity.UnluBilgileri;
import com.mustafa.utility.RepositoryManager;

public class UnluBilgileriRepository extends RepositoryManager<UnluBilgileri,Long> {
    public UnluBilgileriRepository(){
        super(new UnluBilgileri());
    }
}
