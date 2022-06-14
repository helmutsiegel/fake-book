package edu.helmutsiegel.fakebook.dal.repository;

import edu.helmutsiegel.fakebook.dal.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<PostEntity, Long> {
}
