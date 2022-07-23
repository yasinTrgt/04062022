package com.company.entity;

public class TelefonEntity {

    private Long id;
    private String seriNo;
    private String model;
    private String marka;

    public TelefonEntity() {
    }

    public TelefonEntity(Long id, String seriNo, String model, String marka) {
        this.id = id;
        this.seriNo = seriNo;
        this.model = model;
        this.marka = marka;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "TelefonEntity{" +
                "id=" + id +
                ", seriNo='" + seriNo + '\'' +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
