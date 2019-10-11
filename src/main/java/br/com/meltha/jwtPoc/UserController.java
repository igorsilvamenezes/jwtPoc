package br.com.meltha.jwtPoc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/users")
    @ResponseBody
    public String getUsers(){
        return "{\"users\":[" +
                "{\"name\":\"Igor\", \"country\":\"Brazil\"}," +
                "{\"name\":\"Sandra\", \"country\":\"Italy\"}," +
                "{\"name\":\"Melyssa\", \"country\":\"Japan\"}," +
                "{\"name\":\"Maryana\", \"country\":\"France\"}" +
                "]}";
    }
}