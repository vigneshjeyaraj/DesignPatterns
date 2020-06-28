package main.java.ChainOfResponsibility;


public abstract class AbstractEmailValidation {

    private AbstractEmailValidation next;

    public AbstractEmailValidation linkWith(AbstractEmailValidation next) {
        this.next = next;
        return next;
    }

    public abstract boolean verify(String email, String password);

    public boolean checkNext(String email, String password) {
        if (this.next == null) {
            return true;
        }
        return checkNext(email, password);
    }
}
