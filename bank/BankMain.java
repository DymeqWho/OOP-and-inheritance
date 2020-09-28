package com.sda.bank;

import java.math.BigDecimal;

public class BankMain {
    public static void main(String[] args) {


        DebitAccount debitAccount = new DebitAccount(BigDecimal.ZERO);
        CreditAccount creditAccount = new CreditAccount(BigDecimal.ZERO);
        SavingAccount savingAccount = new SavingAccount(BigDecimal.ZERO);


        debitAccount.setCurrentBallance(BigDecimal.valueOf(1000.23));
        BigDecimal debitAccountCurrentBallance = debitAccount.getCurrentBallance();
        System.out.println("debitAccountCurrentBallance = " + debitAccountCurrentBallance);
        String debitAccountProfits = debitAccount.printProfits();
        System.out.println("debitAccountProfits = " + debitAccountProfits);
        BigDecimal debitAccountYearProfit = debitAccount.yearProfit();
        System.out.println("debitAccountYearProfit = " + debitAccountYearProfit);

        System.out.println();

        creditAccount.setCurrentBallance(BigDecimal.valueOf(1048.88));
        BigDecimal creditAccountCurrentBallance = creditAccount.getCurrentBallance();
        System.out.println("creditAccountCurrentBallance = " + creditAccountCurrentBallance);
        String creditAccountProfits = creditAccount.printProfits();
        System.out.println("creditAccountProfits = " + creditAccountProfits);
        BigDecimal creditAccountYearProfit = creditAccount.yearProfit();
        System.out.println("creditAccountYearProfit = " + creditAccountYearProfit);

        System.out.println();

        savingAccount.setCurrentBallance(BigDecimal.valueOf(50789.99));
        BigDecimal savingAccountCurrentBallance = savingAccount.getCurrentBallance();
        System.out.println("savingAccountCurrentBallance = " + savingAccountCurrentBallance);
        String savingAccountProfits = savingAccount.printProfits();
        System.out.println("savingAccountProfits = " + savingAccountProfits);
        BigDecimal savingAccountYearProfit = savingAccount.yearProfit();
        System.out.println("savingAccountYearProfit = " + savingAccountYearProfit);

    }
}
