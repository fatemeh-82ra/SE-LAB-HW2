package edu.sharif.selab.models;

public class EmailMessage implements Message {
    private String sourceEmailAddress;
    private String targetEmailAddress;
    private String content;

    public void setSourceEmailAddress(String sourceEmailAddress) {
        this.sourceEmailAddress = sourceEmailAddress;
    }

    public void setTargetEmailAddress(String targetEmailAddress) {
        this.targetEmailAddress = targetEmailAddress;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getSource() {
        return sourceEmailAddress;
    }

    @Override
    public String getTarget() {
        return targetEmailAddress;
    }

    @Override
    public String getContent() {
        return content;
    }
}