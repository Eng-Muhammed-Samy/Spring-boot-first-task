package com.fawry.ecommerceapp.mapper;

import com.fawry.ecommerceapp.entity.User;
import com.fawry.ecommerceapp.model.UserModel;

public interface UserMapper {

    UserModel toDto(User user);

    User toEntity(UserModel userModel);
}
