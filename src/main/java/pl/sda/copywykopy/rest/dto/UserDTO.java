package pl.sda.copywykopy.rest.dto;

import lombok.Builder;
import lombok.Getter;
import pl.sda.copywykopy.model.UserProfile;
import pl.sda.copywykopy.model.UserRole;
import pl.sda.copywykopy.model.UserStatus;

@Getter
@Builder
public class UserDTO {
    private long id;
    private String userName;
    private UserRole userRole;
    private UserStatus userStatus;
    private long profileId; //don't load whole profile when we only need username to display next to post/comment
}
