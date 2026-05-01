package com.cesde.cityscooterapp.infrastructure.out.mapper;

import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.infrastructure.out.entities.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toDomain(UserEntity userEntity);
    UserEntity toEntity(User user);

    List <User> toDomainList(List <UserEntity> userEntities);

}
