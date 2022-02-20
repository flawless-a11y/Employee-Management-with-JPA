package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    @Query(value = "select * from user " , nativeQuery = true)
    public List<User> getAllUsers();

}
