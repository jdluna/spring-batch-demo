package com.roytuts.spring.batch.itemprocessor;

import com.roytuts.spring.repository.UserRepository;
import org.springframework.batch.item.ItemProcessor;

import com.roytuts.spring.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserItemProcessor implements ItemProcessor<User, User> {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User process(User user) throws Exception {
        Optional<User> userFromDb = userRepo.findById(user.getUserId());
        if(userFromDb.isPresent()) {
            user.setAccount(user.getAccount().add(userFromDb.get().getAccount()));
        }
        return user;
    }

}
