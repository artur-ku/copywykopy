package pl.sda.copywykopy.rest.mapper;

import pl.sda.copywykopy.model.User;
import pl.sda.copywykopy.rest.dto.UserDTO;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        return UserDTO.builder().
                id(user.getId()).
                userName(user.getUserName()).
                userRole(user.getUserRole()).
                userStatus(user.getUserStatus()).
                profileId(user.getUserProfile().getId()).
                build();
    }

}
