package at.ac.fhcampuswien;

import java.util.HashSet;

public class PasswordValidator {
    public  boolean checkPassword(String pwd){
        if(checkPwdLength(pwd)){
            if(checkCorrectCapitalization(pwd)){
                if(checkPasswordContainsNumbers(pwd)){
                    if(checkNumbersInARow(pwd)){
                        return true;
                    }
                }
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
    private boolean checkPasswordContainsNumbers(String pwd){
        for(int c=0;(c<pwd.length());c++) {
            char curChar = pwd.charAt(c);
            if(Character.isDigit(curChar)){
                if(checkPasswordSpecialCharacters(pwd)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean checkPasswordSpecialCharacters(String pwd) {

        for (int c = 0; (c < pwd.length()); c++) {
            char curChar = pwd.charAt(c);
            if ("()#$?!%/@".indexOf(curChar)!=-1) {
                return true;
            }
        }
        return false;
    }
    private boolean checkNumbersInARow(String pwd){
        int numberCounter=0;
        for (int c = 0; (c < pwd.length()); c++) {
            char curChar = pwd.charAt(c);
            if(Character.isDigit(curChar)){
                numberCounter++;
            }else{
                numberCounter=0;
            }
            if(numberCounter>=3){
                return false;
            }
        }
        return true;
    }

}
