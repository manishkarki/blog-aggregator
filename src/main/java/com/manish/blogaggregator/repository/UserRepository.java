package com.manish.blogaggregator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manish.blogaggregator.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
