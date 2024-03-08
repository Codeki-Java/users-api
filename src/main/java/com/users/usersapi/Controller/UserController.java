package com.users.usersapi.Controller;

import com.users.usersapi.Model.User;
import com.users.usersapi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.traerTodosLosUsuarios();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.traerUsuarioPorId(id);
    }

    @PostMapping("/add")
    public void createUser(@RequestBody User user){
        userService.agregarUsuario(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.borrarUsuarioPorid(id);

    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user){
        userService.actualizarUsuario(user);

    }

}
