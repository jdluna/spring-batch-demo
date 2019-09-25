package com.roytuts.spring.batch.writer;

import com.roytuts.spring.repository.UserRepository;
import com.roytuts.spring.vo.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private UserRepository repo;

    @Override
    @Transactional
    public void write(List<? extends User> users) throws Exception {
        repo.saveAll(users);
    }

}
