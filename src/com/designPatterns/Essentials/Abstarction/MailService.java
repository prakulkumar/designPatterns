package com.designPatterns.Essentials.Abstarction;

public class MailService {
    public void sendMail() {
        connect();
        authenticate();
        // Send Email
        disconnected();
    }

    private void connect() {
        System.out.println("Connected");
    }

    private void disconnected() {
        System.out.println("Disconnected");
    }

    private void authenticate() {
        System.out.println("Authenticated");
    }
}
