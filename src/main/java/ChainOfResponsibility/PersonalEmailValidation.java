package main.java.ChainOfResponsibility;

import java.util.Arrays;
import java.util.List;

public class PersonalEmailValidation extends AbstractEmailValidation {

    List<String> personalEmailProviders = Arrays.asList("gmail", "live", "yahoo");
    @Override
    public boolean verify(String email, String password) {
        boolean isValid = personalEmailProviders.stream()
                .anyMatch(e -> email.contains(e));
        return isValid ? checkNext(email, password) : false;
    }
}
