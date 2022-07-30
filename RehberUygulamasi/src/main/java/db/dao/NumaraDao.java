package db.dao;

import db.entity.Numara;

import java.util.List;

public interface NumaraDao {

    public void addNumara(Numara numara);

    public List<Numara> findAllNumara();

    public Boolean deleteNumara(Long id);
}
