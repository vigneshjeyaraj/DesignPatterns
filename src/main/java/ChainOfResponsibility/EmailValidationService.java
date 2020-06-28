package main.java.ChainOfResponsibility;

public interface EmailValidationService {

    boolean validateEmail(String email, String password);
}
