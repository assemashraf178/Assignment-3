package com.company.task1;

public class Ball implements Tossable {
    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName(){
        return brandName;
    }

    public void bounce(){}

    @Override
    public void toss() {

    }
}
