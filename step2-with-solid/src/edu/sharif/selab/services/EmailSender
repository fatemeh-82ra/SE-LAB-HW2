package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;

public class EmailSender implements Sender<EmailMessage> {
    @Override
    public void send(EmailMessage message) {
        System.out.println("Sending Email from " + message.getSource() + " to " + message.getTarget() + ": " + message.getContent());
    }
}
