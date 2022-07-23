package com.company.entity;

public class RehberEntity {

    private Long id;
    private Long numara;
    private Long telefonId;

    public RehberEntity() {
    }

    public RehberEntity(Long id, Long numara, Long telefonId) {
        this.id = id;
        this.numara = numara;
        this.telefonId = telefonId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumara() {
        return numara;
    }

    public void setNumara(Long numara) {
        this.numara = numara;
    }

    public Long getTelefonId() {
        return telefonId;
    }

    public void setTelefonId(Long telefonId) {
        this.telefonId = telefonId;
    }

    @Override
    public String toString() {
        return "RehberEntity{" +
                "id=" + id +
                ", numara=" + numara +
                ", telefonId=" + telefonId +
                '}';
    }
}
