package main.java.ChainOfResponsibility;

public class EmailValidation {

    public static void main(String[] args) {
        EmailValidationService emailValidationService = new EmailValidationServiceImpl();
        boolean result = emailValidationService.validateEmail("vicky@gmail.com", "abc1234");
        assert result == true;
    }
}
