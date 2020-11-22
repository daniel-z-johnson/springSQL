package self.practice.sql.article.exceptions;

public class InvalidCategory extends RuntimeException {
    private String alert;

    public InvalidCategory(String alert) {
        this.alert = alert;
    }

    public String getAlert() {
        return alert;
    }
}
