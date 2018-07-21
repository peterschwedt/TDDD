package pl.sda.tdd;

public class NotificationService {
    private EmailService emailService;
    private PigeonService pigeonService;
    public void sendnotification(){
        if(emailService.isAvailable()){
            emailService.sendEmail("wyslano email");
        }
        
    }

    public void sendNotification() {
    }
}
