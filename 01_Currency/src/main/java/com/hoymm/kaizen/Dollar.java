package com.hoymm.kaizen;

class Dollar {
    int amount;

    Dollar(int amount){
        this.amount = amount;
    }

    void times (int multipler){
        amount *= multipler;
    }
}
