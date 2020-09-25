package com.sda.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingAccount extends Account{

    public SavingAccount(BigDecimal currentBalance){
        super(currentBalance);
    }

    @Override
    public BigDecimal yearProfit() {
        BigDecimal currentBalance = getCurrentBallance();
        BigDecimal profit = new BigDecimal(0.001);
        return (currentBalance.multiply(profit).add(currentBalance)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String printProfits() {
        return "Brak profitów";
    }
}
