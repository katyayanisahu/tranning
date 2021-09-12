package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
 Optional<User> findByUsernameAndPassword(String username,String password.get());
  //UserDto userDto=new UserDto(user.getName(),;
  
}
