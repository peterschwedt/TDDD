package pl.sda.tdd;

public interface EmailService {
    void sendEmail(String wyslano_email);

    boolean isAvailable();
}
