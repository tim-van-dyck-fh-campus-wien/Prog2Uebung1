package at.ac.fhcampuswien;

public class PasswordValidator {
    public  boolean checkPassword(String pwd){
        if(checkPwdLength(pwd)){
            return true;
        }
        return false;
    }
    private boolean checkPwdLength(String pwd){
        return (pwd.length()>=8)&&(pwd.length()<=25);
    }

}
