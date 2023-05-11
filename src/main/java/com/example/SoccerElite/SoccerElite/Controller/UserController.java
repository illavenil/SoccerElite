package com.example.SoccerElite.SoccerElite.Controller;

import com.example.SoccerElite.SoccerElite.Model.User;
import com.example.SoccerElite.SoccerElite.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;


@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserRepository userRepository;



    @PostMapping("/register")
    public @ResponseBody String registerUser(@RequestBody User request){
        // Check if Username already exists
        if (userRepository.findByUsername(request.getUsername()) != null ) return "Username already Exists try something else";

        // To Check if email is Valid
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(request.getEmail()).matches() == false) return "Invalid email";

        userRepository.save(request);

        return  "Welcome";
    }

    @PostMapping("/login")
    public @ResponseBody String login(@RequestBody User request){
        User user = userRepository.findByUsername(request.getUsername());
        //If Username is not in the Database
        if (user == null) return  "This Username is not Registered yet, Register Account";

        if (!user.getPassword().equals(request.getPassword())) return  "Invalid Password";
        return  "Logged in";
    }
}
