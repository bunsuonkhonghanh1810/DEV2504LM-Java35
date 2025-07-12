package vn.devmaster.lab02_examples.service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Gửi Email với nội dung: " + message);
    }
}
