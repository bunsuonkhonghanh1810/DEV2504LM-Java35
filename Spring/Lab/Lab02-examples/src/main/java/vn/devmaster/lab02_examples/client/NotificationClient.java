package vn.devmaster.lab02_examples.client;

import vn.devmaster.lab02_examples.service.MessageService;

public class NotificationClient {
    private MessageService service;

    public NotificationClient(MessageService service) {
        this.service = service;
    }

    public void notifyUser(String message) {
        service.sendMessage(message);
    }

    public void setService(MessageService service) {
        this.service = service;
    }
}
