package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        // Empty Body!
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        // Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if (validateId(telegramMessage.getSourceId()) && validateId(telegramMessage.getTargetId())) {
            System.out.println("Sending a Telegram message from " + telegramMessage.getSourceId() + " to " + telegramMessage.getTargetId() + " with content: " + telegramMessage.getContent());
        } else {
            throw new IllegalArgumentException("ID is not correct!");
        }
    }

    private boolean validateId(String id) {
        // A simple validation: ID should be 10 characters long and all digits.
        if (id == null || id.length() != 10) {
            return false;
        }
        for (char c : id.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}