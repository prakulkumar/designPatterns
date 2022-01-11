package com.designPatterns.Essentials.Encapsulation;

public class Implementation {
    public static void perform() {
        var account = new Account();
        account.deposite(10);
        account.withdrawl(5);

        System.out.println(account.getBalance());
    }
}
