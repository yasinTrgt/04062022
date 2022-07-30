package db.service;

import db.dao.NumaraImpl;
import db.entity.Numara;

import java.util.List;

public class NumaraServis {

    NumaraImpl numaraImpl = new NumaraImpl();

    public void addNumara(Numara numara) {
        numaraImpl.addNumara(numara);
    }

    public List<Numara> findAll() {
        return numaraImpl.findAllNumara();
    }

    public Boolean deleteNumar(Long id) {
        return numaraImpl.deleteNumara(id);
    }
}
