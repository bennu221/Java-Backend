public class UserProfile {

    private String username;
    private String password;
    private String email;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void setPassword(String password) {

        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters.");
            return;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch))
                hasDigit = true;

            if (Character.isUpperCase(ch))
                hasUpper = true;
        }

        if (!hasDigit || !hasUpper) {
            System.out.println("Password must contain 1 uppercase letter and 1 digit.");
            return;
        }

        this.password = password;
        System.out.println("Password set successfully.");
    }

    public String getPassword() {
        return "********";
    }

    public boolean verifyPassword(String input) {
        return password != null && password.equals(input);
    }

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Benarji", "benarji@gmail.com");

        user.setPassword("hello");
        user.setPassword("password1");
        user.setPassword("Password1");

        System.out.println("Stored Password: " + user.getPassword());

        System.out.println("Verify Password1: " +
                user.verifyPassword("Password1"));

        System.out.println("Verify Wrong123: " +
                user.verifyPassword("Wrong123"));
    }
}