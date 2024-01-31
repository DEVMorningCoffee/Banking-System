package com.bankingsystem.user;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class ValidateUser {
    public void emailValidator(String email){
        try{
            InternetAddress internetAddress = new InternetAddress(email);
            internetAddress.validate();
        }catch (AddressException e){
            System.out.println("The email you enter is invalid");
        }
    }

    public void passwordValidator(String password){
        try{
            final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

            Matcher matcher = pattern.matcher(password);
            if(!matcher.matches()){
                throw new PatternSyntaxException("A correct password must be 8 to 20 characters long and include at least one digit, " +
                        "one lowercase letter, one uppercase letter, and one special character like ! @ # & ( ).", PASSWORD_PATTERN, -1);
            }
        }catch(PatternSyntaxException e){
            System.out.println(e.getDescription());
        }
    }
}
