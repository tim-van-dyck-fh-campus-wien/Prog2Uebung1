package at.ac.fhcampuswien;

public class PasswordValidator {
    public  boolean checkPassword(String pwd){
        if(checkPwdLength(pwd)){
            return true;
        }
        return false;
    }
    public boolean checkPwdLength(String pwd){
        return (pwd.length()>=8)&&(pwd.length()<=25);
    }
}
