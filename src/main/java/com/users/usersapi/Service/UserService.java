package com.users.usersapi.Service;

import com.users.usersapi.Model.User;
import com.users.usersapi.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void agregarUsuario(User user) {
        userRepository.save(user);
    }

    public List<User> traerTodosLosUsuarios() {
        return userRepository.findAll();
    }

    public void borrarUsuarioPorid(Long id) {
        userRepository.deleteById(id);
    }

    public void actualizarUsuario(User user) {
        userRepository.findById(user.getId()).orElse(null);
        userRepository.save(user);
    }
}
