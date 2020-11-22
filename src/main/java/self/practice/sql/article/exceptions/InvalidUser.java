package self.practice.sql.article.exceptions;

public class InvalidUser extends RuntimeException {

    private String alert;

    public InvalidUser(String alert) {
        this.alert = alert;
    }

    public String getAlert() {
        return alert;
    }
}
