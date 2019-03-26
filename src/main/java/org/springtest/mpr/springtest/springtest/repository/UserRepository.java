package org.springtest.mpr.springtest.springtest.repository;

import org.springtest.mpr.springtest.springtest.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
