package com.meibao.interfacedemo;

public enum CarEnum {

    BMW("BMW"), TOYOTA("TOYOTA"), FIAT("FIAT");
    private String CarType;

    private CarEnum(String CarType) {
        this.CarType = CarType;
    }

    public String getCarType() {
        return CarType;
    }
}