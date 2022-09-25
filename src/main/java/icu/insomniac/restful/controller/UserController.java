package icu.insomniac.restful.controller;

import icu.insomniac.restful.main.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //get all
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> showAll(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        user1.setUsername("Kelex");
        user1.setAge(22);
        user2.setUsername("Tina");
        user2.setAge(23);
        users.add(user1);
        users.add(user2);
        System.out.println("Get All:"+users);
        return users;
    }

    //get one
    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    @ResponseBody
    public User getOne(@PathVariable String username){
        User user = new User();
        user.setUsername(username);
        user.setAge(22);
        System.out.println("Get One:"+user);
        return user;
    }

    //add one
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public User addOne(User user){
        System.out.println("Add One:"+user);
        return user;
    }

    //delete one
    @RequestMapping(value = "/user/{username}", method = RequestMethod.DELETE)
    @ResponseBody
    public User deleteOne(@PathVariable String username){
        User user = new User();
        user.setUsername(username);
        user.setAge(22);
        System.out.println("Delete One:"+user);
        return user;
    }

    //update one
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    public User updateOne(@RequestBody User user){
        User oUser = new User();
        oUser.setUsername("Kelex");
        oUser.setAge(22);
        System.out.println("Update One:"+oUser+"===>"+user);
        oUser.setUsername(user.getUsername());
        oUser.setAge(user.getAge());
        return oUser;
    }

}
