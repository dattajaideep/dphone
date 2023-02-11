package com.bajaj.dphone.controller;
import java.security.SecureRandom;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bajaj.dphone.entity.UserEntity;
import com.bajaj.dphone.repository.UserDao;
import com.bajaj.dphone.util.PasswordEncoder;

@RestController
public class UserController {
    public String createRandomCode(int codeLength){   
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
           StringBuilder sb = new StringBuilder();
           Random random = new SecureRandom();
           for (int i = 0; i < codeLength; i++) {
               char c = chars[random.nextInt(chars.length)];
               sb.append(c);
           }
           String output = sb.toString();
           System.out.println(output);
           return output ;
       }
    @Autowired
    private UserDao userDao;
    @GetMapping("/")
    public String home(){
        return "hello home page on port ";
    }
    @PostMapping("/register")
    public String registerUser(@RequestBody UserEntity newUser){
        try{
            newUser.setCode(createRandomCode(8));
            String password = newUser.getPassword();
            PasswordEncoder encoder = new PasswordEncoder();
            String encodedPassword = encoder.passwordEncoder().encode(password);
            newUser.setPassword(encodedPassword);
            userDao.save(newUser);
            
            return "user register successflly";
        }catch(Exception e){
            System.out.println(e);
            return e.toString();
        }
    }
    @GetMapping("/private")
    public ResponseEntity<String> privatePage(){
        return ResponseEntity.ok("this is private page");
    }

    @GetMapping("/public")
    public ResponseEntity<String> publicPage(){
        return ResponseEntity.ok("this is Public page");
    }
}
