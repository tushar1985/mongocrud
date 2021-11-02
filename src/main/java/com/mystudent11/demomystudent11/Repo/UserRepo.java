package com.mystudent11.demomystudent11.Repo;

import com.mystudent11.demomystudent11.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<user, Long> {
}
