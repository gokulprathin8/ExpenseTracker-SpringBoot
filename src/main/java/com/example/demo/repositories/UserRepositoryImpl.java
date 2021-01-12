package com.example.demo.repositories;

import com.example.demo.domain.User;
import com.example.demo.exceptions.EthAuthException;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EthAuthException {
        return null;
    }

    @Override
    public User findByEmailAddressAndPassword(String email, String password) throws EthAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer userid) {
        return null;
    }
}
