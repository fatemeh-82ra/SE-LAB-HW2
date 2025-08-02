package edu.sharif.selab.services;

import edu.sharif.selab.models.TelegramMessage;

public class TelegramSender implements Sender<TelegramMessage> {
    @Override
    public void send(TelegramMessage message) {
        System.out.println("Sending Telegram from " + message.getSource() + " to " + message.getTarget() + ": " + message.getContent());
    }
}