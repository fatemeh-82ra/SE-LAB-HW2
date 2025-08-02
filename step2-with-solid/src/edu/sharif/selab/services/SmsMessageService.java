package edu.sharif.selab.models;

public class SmsMessage implements Message {
    private String sourcePhoneNumber;
    private String targetPhoneNumber;
    private String content;

    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    public void setTargetPhoneNumber(String targetPhoneNumber) {
        this.targetPhoneNumber = targetPhoneNumber;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getSource() {
        return sourcePhoneNumber;
    }

    @Override
    public String getTarget() {
        return targetPhoneNumber;
    }

    @Override
    public String getContent() {
        return content;
    }
}