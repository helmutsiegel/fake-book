package edu.helmutsiegel.fakebook.listener;

import edu.helmutsiegel.fakebook.dal.model.UserEntity;
import edu.helmutsiegel.fakebook.dal.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class FakeBookApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        createUsers();
    }

    private void createUsers() {
        UserEntity mark = new UserEntity("Mark", "Zuckerberg", "marl.zuckerberg@fakebook.com");
        userJpaRepository.saveAndFlush(mark);

        UserEntity bill = new UserEntity("Bill", "Gates", "bill.gates@fakebook.com");
        userJpaRepository.saveAndFlush(bill);
    }
}
