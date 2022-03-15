package com.service.user.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.service.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{

	List<User> findByUserName(String userName);

}
