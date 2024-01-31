package com.bankingsystem.user;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class ValidateUser {
    public void emailValidator(String email){
        try{
            InternetAddress internetAddress = new InternetAddress(email);
            internetAddress.validate();
        }catch (AddressException e){
            System.out.println("The email you enter is invalid");
        }
    }
}
