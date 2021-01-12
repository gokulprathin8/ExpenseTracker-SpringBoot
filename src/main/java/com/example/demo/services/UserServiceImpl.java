package com.example.demo.services;

import com.example.demo.domain.User;
import com.example.demo.exceptions.EthAuthException;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EthAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EthAuthException {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        if (email != null) {
            email = email.toLowerCase();
        }
        if (!pattern.matcher(email).matches()) {
            throw new EthAuthException("Invalid email format");
        }
    }
}
