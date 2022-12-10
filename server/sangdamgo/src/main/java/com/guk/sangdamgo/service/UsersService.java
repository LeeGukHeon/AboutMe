package com.guk.sangdamgo.service;

import com.guk.sangdamgo.entity.UsersEntity;

import java.util.List;

public interface UsersService {

    //전체 가져오기
    public List<UsersEntity> getUsers();

    //저장하기
    public UsersEntity saveUser(UsersEntity user);

    //한명만 가져오기
    public boolean getUserOne(Long idx);

    //삭제하기

    public boolean deleteUser(Long idx);

    //수정하기
    public boolean updateUser(UsersEntity user);
}
