package com.mehmetnuri.kapbul.repository;


import com.mehmetnuri.kapbul.entity.Kap;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KapRepository  extends BaseRepository<Kap> {

    @Query("select kap from Kap  kap")
    List<Kap> findAllKap();

    @Query("select  kap from  Kap  kap where kap.kapAdi like ?1%")
    List<Kap> findKapByAdi(String adi);

}
