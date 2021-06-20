package nolu04.quizlearn.controller;


import nolu04.quizlearn.entity.User;
import nolu04.quizlearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/user",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> getPerson(){

        List<User> userList = userRepository.findAll();
        return userList;
    }

}
