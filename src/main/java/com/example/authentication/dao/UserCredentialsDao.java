package com.example.authentication.dao;

import com.example.authentication.enitity.UserCredentialsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserCredentialsDao extends MongoRepository<UserCredentialsEntity, Integer> {
    public Optional<UserCredentialsEntity> findByName(String name);

}
