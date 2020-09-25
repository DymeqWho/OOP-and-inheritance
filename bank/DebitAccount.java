package com.sda.bank;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(BigDecimal currentBallance) {
        super(currentBallance);
    }

    @Override
    public BigDecimal yearProfit() {
        return super.getCurrentBallance();
    }

    @Override
    public String printProfits() {
        return "Możesz używać dwóch kart debetowych jednocześnie!";
    }
}
