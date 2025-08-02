package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class MessageFactory {
    public static Message createMessage(int choice, String source, String target, String content) {
        switch (choice) {
            case 1:
                SmsMessage sms = new SmsMessage();
                sms.setSourcePhoneNumber(source);
                sms.setTargetPhoneNumber(target);
                sms.setContent(content);
                return sms;
            case 2:
                EmailMessage email = new EmailMessage();
                email.setSourceEmailAddress(source);
                email.setTargetEmailAddress(target);
                email.setContent(content);
                return email;
            case 3:
                TelegramMessage telegram = new TelegramMessage();
                telegram.setSourceId(source);
                telegram.setTargetId(target);
                telegram.setContent(content);
                return telegram;
            default:
                throw new IllegalArgumentException("Invalid message type choice: " + choice);
        }
    }
}