package com.sda.bank;

import java.math.BigDecimal;

public class CreditAccount extends Account {


    public CreditAccount(BigDecimal currentBalance){
        super(currentBalance);
    }

    @Override
    public BigDecimal yearProfit() {
        return super.getCurrentBallance();
    }

    @Override
    public String printProfits() {
        return "Możesz używać dwóch kart kredytowych jednocześnie! Nic się nie martw, karty są ubezpieczone przed kradzierzą! Poza tym, otrzymujesz liczne zniżki w programie SuperDiscout!";
    }
}
