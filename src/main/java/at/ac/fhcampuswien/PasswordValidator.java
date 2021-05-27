package at.ac.fhcampuswien;

public class PasswordValidator {
    public  boolean checkPassword(String pwd){
        if(checkPwdLength(pwd)){
            if(checkCorrectCapitalization(pwd)){
                return true;
            }
        }
        return false;
    }
    private boolean checkPwdLength(String pwd){
        return (pwd.length()>=8)&&(pwd.length()<=25);
    }
    private boolean checkCorrectCapitalization(String pwd){
        boolean containsCapitals=false;
        boolean containsSmallLetters=false;
        for(int c=0;(c<pwd.length());c++){
            char curChar=pwd.charAt(c);
            if(Character.isAlphabetic(curChar)){
                if(Character.isLowerCase(curChar)){
                    containsSmallLetters=true;
                }
                if(Character.isUpperCase(curChar)){
                    containsCapitals=true;
                }
            }
        }
        return containsCapitals&containsSmallLetters;
    }
}
