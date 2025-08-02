package edu.sharif.selab.services;

import edu.sharif.selab.models.SmsMessage;

public class SmsSender implements Sender<SmsMessage> {
    @Override
    public void send(SmsMessage message) {
        System.out.println("Sending SMS from " + message.getSource() + " to " + message.getTarget() + ": " + message.getContent());
    }
}