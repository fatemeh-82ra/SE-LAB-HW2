package edu.sharif.selab.models;

public interface Message {
    String getSource();
    String getTarget();
    String getContent();
}