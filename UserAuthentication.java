class UserAuthentication {

    String validUsername = "admin";
    String validPassword = "1234";

    public void checkLogin(String username, String password) 
            throws InvalidLoginException {

        if (!username.equals(validUsername) || 
            !password.equals(validPassword)) {
            throw new InvalidLoginException("Invalid Username or Password!");
        } else {
            System.out.println("Login Successful!");
        }
    }
}