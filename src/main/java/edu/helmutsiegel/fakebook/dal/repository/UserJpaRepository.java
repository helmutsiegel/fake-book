package edu.helmutsiegel.fakebook.dal.repository;

import edu.helmutsiegel.fakebook.dal.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByFirstNameContains(@NotNull String firstName);

    List<UserEntity> findByFirstNameAndLastName(@NotNull String firstName, @NotNull String lastName);

    List<UserEntity> findByFirstNameOrLastName(@NotNull String firstName, @NotNull String lastName);


}
