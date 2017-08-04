package com.br.udemy.javamasterclass;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String coulor;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unkown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
