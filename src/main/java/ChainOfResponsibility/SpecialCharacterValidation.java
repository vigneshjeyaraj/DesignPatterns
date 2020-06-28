package main.java.ChainOfResponsibility;

public class SpecialCharacterValidation extends AbstractEmailValidation {

    @Override
    public boolean verify(String email, String password) {
        if (email.contains("@") && email.contains(".")) {
            return checkNext(email, password);
        } else {
            return false;
        }
    }
}
