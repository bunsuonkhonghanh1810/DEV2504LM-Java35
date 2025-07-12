package vn.devmaster.lab02_examples.service;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gửi SMS với nội dung: " + message);
    }
}
