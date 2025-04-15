
class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class AuthDemo {

    
    public static void authenticate(String username, String password) throws AuthenticationException {
        String validUsername = "admin";
        String validPassword = "password123";

        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new AuthenticationException("Invalid username or password!");
        }

        System.out.println("Authentication successful. Welcome, " + username + "!");
    }

    public static void main(String[] args) {
        try {
           
            authenticate("admin", "wrongpass");
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
