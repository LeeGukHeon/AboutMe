package com.guk.sangdamgo.service;

import com.guk.sangdamgo.entity.UsersEntity;
import com.guk.sangdamgo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService{

    @Autowired
    UsersRepository usersRepository;
    @Override
    public List<UsersEntity> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public UsersEntity saveUser(UsersEntity user) {
        return usersRepository.save(user);
    }

    @Override
    public boolean getUserOne(Long idx) {
        return false;
    }

    @Override
    public boolean deleteUser(Long idx) {
        return false;
    }

    @Override
    public boolean updateUser(UsersEntity user) {
        return false;
    }
}
