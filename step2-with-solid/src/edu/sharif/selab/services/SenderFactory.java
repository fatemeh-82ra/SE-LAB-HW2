package edu.sharif.selab.services;

public class SenderFactory {
    public static Sender createSender(int choice) {
        switch (choice) {
            case 1:
                return new SmsSender();
            case 2:
                return new EmailSender();
            case 3:
                return new TelegramSender();
            default:
                throw new IllegalArgumentException("Invalid sender type choice: " + choice);
        }
    }
}
