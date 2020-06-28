package main.java.ChainOfResponsibility;

public class EmailValidationServiceImpl implements EmailValidationService {

    @Override
    public boolean validateEmail(String email, String password) {
        return new PersonalEmailValidation()
                .linkWith(new PersonalEmailValidation())
                .verify(email, password);
    }
}
