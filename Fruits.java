package com.company;

public class Fruits {
    private Integer apple;
    private Integer strawberry;
    private Integer mango;

    public Fruits(Integer apple, Integer strawberry, Integer mango) {
        this.apple = apple;
        this.strawberry = strawberry;
        this.mango = mango;
    }

    public Fruits(Integer apple, Integer strawberry) {
        this.apple = apple;
        this.strawberry = strawberry;
    }
    public Fruits(){}
    public Integer getApple() {
        return apple;
    }

    public void setApple(Integer apple) {
        this.apple = apple;
    }

    public Integer getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(Integer strawberry) {
        this.strawberry = strawberry;
    }

    public Integer getMango() {
        return mango;
    }

    public void setMango(Integer mango) {
        this.mango = mango;
    }
}
