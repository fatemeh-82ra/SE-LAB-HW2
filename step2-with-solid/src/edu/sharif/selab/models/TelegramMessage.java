package edu.sharif.selab.models;

public class TelegramMessage implements Message {
    private String sourceId;
    private String targetId;
    private String content;

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getSource() {
        return sourceId;
    }

    @Override
    public String getTarget() {
        return targetId;
    }

    @Override
    public String getContent() {
        return content;
    }
}
