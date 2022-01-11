package com.designPatterns.Essentials.Abstarction;

public class Implementation {
    public static void perform() {
        var mailService = new MailService();
        mailService.sendMail();
    }
}
