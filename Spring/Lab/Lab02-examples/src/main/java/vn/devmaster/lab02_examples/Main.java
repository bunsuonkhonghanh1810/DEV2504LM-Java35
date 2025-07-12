package vn.devmaster.lab02_examples;

import vn.devmaster.lab02_examples.client.NotificationClient;
import vn.devmaster.lab02_examples.service.EmailService;
import vn.devmaster.lab02_examples.service.MessageService;
import vn.devmaster.lab02_examples.service.SMSService;

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        NotificationClient client1 = new NotificationClient(emailService);
        client1.notifyUser("Chào mừng bạn đến với IoC bằng Email!");

        NotificationClient client2 = new NotificationClient(emailService);
        client2.notifyUser("Chào mừng bạn đến với IoC bằng SMS!");

        NotificationClient client3 = new NotificationClient(null);
        client3.setService(new EmailService());
        client3.notifyUser("Thông báo bằng Email qua setter");
    }
}
