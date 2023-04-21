package net.walecode.springboot.controller;


import lombok.AllArgsConstructor;
import net.walecode.springboot.entity.User;
import net.walecode.springboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {

    private UserService userService;


    //writing implementation for create User REST API
    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user){
       User savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //Implementation to get user by id REST API
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //Implementation to get All users REST API
    @GetMapping
    public ResponseEntity<List<User>>getAllUsers(){
        List<User>users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    //Implementation to Update user REST API

    @PutMapping("{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
                                           @RequestBody User user){

       user.setId(userId);
       User updatedUser = userService.updateUser(user);
       return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    //Implementation to DELETE User REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }

}
