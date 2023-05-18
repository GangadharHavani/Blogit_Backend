package com.blogit.mapper;

import com.blogit.dto.UpdateUserInfoDto;
import com.blogit.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-18T11:25:45+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class MapstructMapperUpdateImpl implements MapstructMapperUpdate {

    @Override
    public void updateUserFromUserUpdateDto(UpdateUserInfoDto updateUserInfoDto, User user) {
        if ( updateUserInfoDto == null ) {
            return;
        }

        if ( updateUserInfoDto.getBirthDate() != null ) {
            user.setBirthDate( updateUserInfoDto.getBirthDate() );
        }
        if ( updateUserInfoDto.getCurrentCity() != null ) {
            user.setCurrentCity( updateUserInfoDto.getCurrentCity() );
        }
        if ( updateUserInfoDto.getEduInstitution() != null ) {
            user.setEduInstitution( updateUserInfoDto.getEduInstitution() );
        }
        if ( updateUserInfoDto.getFirstName() != null ) {
            user.setFirstName( updateUserInfoDto.getFirstName() );
        }
        if ( updateUserInfoDto.getGender() != null ) {
            user.setGender( updateUserInfoDto.getGender() );
        }
        if ( updateUserInfoDto.getHometown() != null ) {
            user.setHometown( updateUserInfoDto.getHometown() );
        }
        if ( updateUserInfoDto.getIntro() != null ) {
            user.setIntro( updateUserInfoDto.getIntro() );
        }
        if ( updateUserInfoDto.getLastName() != null ) {
            user.setLastName( updateUserInfoDto.getLastName() );
        }
        if ( updateUserInfoDto.getWorkplace() != null ) {
            user.setWorkplace( updateUserInfoDto.getWorkplace() );
        }
    }
}
