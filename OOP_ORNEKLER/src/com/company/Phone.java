package com.company;

public class Phone {

    private String model;
    private Double price;
    private String color;
    private int cpuCoreSize;
    private boolean cameraStatus;
    private Long hardDriveCapacity;
    private Long batteryCapacity;
    private boolean fiveGStatus;

    public Phone() {
    }

    public Phone(String model, Double price, boolean fiveGStatus) {
        this.model = model;
        this.price = price;
        this.fiveGStatus = fiveGStatus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCpuCoreSize() {
        return cpuCoreSize;
    }

    public void setCpuCoreSize(int cpuCoreSize) {
        this.cpuCoreSize = cpuCoreSize;
    }

    public boolean isCameraStatus() {
        return cameraStatus;
    }

    public void setCameraStatus(boolean cameraStatus) {
        this.cameraStatus = cameraStatus;
    }

    public Long getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setHardDriveCapacity(Long hardDriveCapacity) {
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public Long getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Long batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isFiveGStatus() {
        return fiveGStatus;
    }

    public void setFiveGStatus(boolean fiveGStatus) {
        this.fiveGStatus = fiveGStatus;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", cpuCoreSize=" + cpuCoreSize +
                ", cameraStatus=" + cameraStatus +
                ", hardDriveCapacity=" + hardDriveCapacity +
                ", batteryCapacity=" + batteryCapacity +
                ", fiveGStatus=" + fiveGStatus +
                '}';
    }
}
