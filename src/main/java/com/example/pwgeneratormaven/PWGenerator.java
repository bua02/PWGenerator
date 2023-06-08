package com.example.pwgeneratormaven;

import java.util.Random;

public class PWGenerator {
    public String generatePW(int numberOfCharacters, String allowedAlphabet){
        String password = null;
        Random r = new Random();

        for(int i = 0; i<=numberOfCharacters && i <= 10; i++){
            char c = allowedAlphabet.charAt(r.nextInt(allowedAlphabet.length()));
            password = password += c;
        }
        return password;
    }
}
