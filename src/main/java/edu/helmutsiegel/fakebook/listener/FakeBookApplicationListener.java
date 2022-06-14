package edu.helmutsiegel.fakebook.listener;

import edu.helmutsiegel.fakebook.dal.model.PostEntity;
import edu.helmutsiegel.fakebook.dal.model.UserEntity;
import edu.helmutsiegel.fakebook.dal.repository.PostJpaRepository;
import edu.helmutsiegel.fakebook.dal.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class FakeBookApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private PostJpaRepository postJpaRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        createData();
    }

    private void createData() {
        UserEntity mark = new UserEntity("Mark", "Zuckerberg", "marl.zuckerberg@fakebook.com");
        userJpaRepository.saveAndFlush(mark);

        UserEntity bill = new UserEntity("Bill", "Gates", "bill.gates@fakebook.com");
        userJpaRepository.saveAndFlush(bill);

        UserEntity elon = new UserEntity("Elon", "Musk", "elon.musk@fakebook.com");
        userJpaRepository.saveAndFlush(elon);

        PostEntity billsPost1 = new PostEntity("Is Microsoft better than Apple?", "Yes!", bill);
        postJpaRepository.saveAndFlush(billsPost1);
    }
}
