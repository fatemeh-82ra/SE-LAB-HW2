package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;

public interface Sender<T extends Message> {
    void send(T message);
}
