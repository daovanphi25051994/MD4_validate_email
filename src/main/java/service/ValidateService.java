package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {
    public static final String EMAIL_REGEX = "^[A-Za-z][A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    Pattern pattern;
    Matcher matcher;
    public boolean validateEmail(String string){
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
