package edu.helmutsiegel.fakebook.dal.repository;

import edu.helmutsiegel.fakebook.dal.model.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UserJpaRepositoryTest {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Test
    void findByFirstNameContains() {
        List<UserEntity> bill = userJpaRepository.findByFirstNameContains("Bill");

        assertEquals(1, bill.size());
        assertEquals("Bill", bill.get(0).getFirstName());
        assertEquals("Gates", bill.get(0).getLastName());
    }

    @Test
    void findByFirstNameAndLastName() {
        List<UserEntity> mark = userJpaRepository.findByFirstNameAndLastName("Mark", "Zuckerberg");

        assertEquals(1, mark.size());
        assertEquals("Mark", mark.get(0).getFirstName());
        assertEquals("Zuckerberg", mark.get(0).getLastName());

        List<UserEntity> notFound = userJpaRepository.findByFirstNameAndLastName("Mark", "Incorrect Last Name");

        assertEquals(0, notFound.size());
    }

    @Test
    void findByFirstNameOrLastName() {
        List<UserEntity> mark = userJpaRepository.findByFirstNameOrLastName("Mark", "Incorrect Last Name");

        assertEquals(1, mark.size());
        assertEquals("Mark", mark.get(0).getFirstName());
        assertEquals("Zuckerberg", mark.get(0).getLastName());

        List<UserEntity> alsoMarc = userJpaRepository.findByFirstNameOrLastName("Incorrect First Name", "Zuckerberg");

        assertEquals(1, alsoMarc.size());
        assertEquals("Mark", alsoMarc.get(0).getFirstName());
        assertEquals("Zuckerberg", alsoMarc.get(0).getLastName());
    }

}