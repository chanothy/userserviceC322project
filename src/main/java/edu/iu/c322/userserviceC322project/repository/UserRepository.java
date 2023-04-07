package edu.iu.c322.userserviceC322project.repository;

import edu.iu.c322.userserviceC322project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
