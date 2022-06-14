package edu.helmutsiegel.fakebook.dal.repository;

import edu.helmutsiegel.fakebook.dal.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
