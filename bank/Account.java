package com.sda.bank;

import java.math.BigDecimal;

public abstract class Account {

    private BigDecimal currentBallance;

    public Account(BigDecimal currentBallance) {
        this.currentBallance = currentBallance;
    }

    public BigDecimal getCurrentBallance() {
        return currentBallance;
    }

    public void setCurrentBallance(BigDecimal currentBallance) {
        this.currentBallance = currentBallance;
    }

    public abstract BigDecimal yearProfit();

    public abstract String printProfits();

}
