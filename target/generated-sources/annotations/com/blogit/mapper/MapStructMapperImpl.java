package com.blogit.mapper;

import com.blogit.dto.UpdateUserInfoDto;
import com.blogit.entity.User;
import com.blogit.entity.User.UserBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T11:25:45+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class MapStructMapperImpl implements MapStructMapper {

    @Override
    public User userUpdateDtoToUser(UpdateUserInfoDto updateUserInfoDto) {
        if ( updateUserInfoDto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        if ( updateUserInfoDto.getBirthDate() != null ) {
            user.birthDate( updateUserInfoDto.getBirthDate() );
        }
        if ( updateUserInfoDto.getCurrentCity() != null ) {
            user.currentCity( updateUserInfoDto.getCurrentCity() );
        }
        if ( updateUserInfoDto.getEduInstitution() != null ) {
            user.eduInstitution( updateUserInfoDto.getEduInstitution() );
        }
        if ( updateUserInfoDto.getFirstName() != null ) {
            user.firstName( updateUserInfoDto.getFirstName() );
        }
        if ( updateUserInfoDto.getGender() != null ) {
            user.gender( updateUserInfoDto.getGender() );
        }
        if ( updateUserInfoDto.getHometown() != null ) {
            user.hometown( updateUserInfoDto.getHometown() );
        }
        if ( updateUserInfoDto.getIntro() != null ) {
            user.intro( updateUserInfoDto.getIntro() );
        }
        if ( updateUserInfoDto.getLastName() != null ) {
            user.lastName( updateUserInfoDto.getLastName() );
        }
        if ( updateUserInfoDto.getWorkplace() != null ) {
            user.workplace( updateUserInfoDto.getWorkplace() );
        }

        return user.build();
    }
}
