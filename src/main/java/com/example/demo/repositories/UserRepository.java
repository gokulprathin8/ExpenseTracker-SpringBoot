package com.example.demo.repositories;

import com.example.demo.domain.User;
import com.example.demo.exceptions.EthAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EthAuthException;

    User findByEmailAddressAndPassword(String email, String password) throws EthAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userid);

}
