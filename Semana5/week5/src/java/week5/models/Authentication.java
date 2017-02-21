package week5.models;

public class Authentication {

    public static boolean authenticate(String username, String password) {

        String userDataBase = "Kenneth";
        String passwordDataBase = "MiPassword";
        
        if(username.equals(userDataBase) && password.equals(passwordDataBase)) {
            return true;
        }
        else {
            return false;
        }
    }
}
