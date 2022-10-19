package pl.sda.copywykopy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Column(name = "user_name")
    private String userName;

    @Setter
    private String password;

    @Setter
    @Column(name = "user_role")
    private UserRole userRole;

    @Setter
    @Column(name = "user_status")
    @Enumerated
    private UserStatus userStatus;

    @Setter
    @Column(name = "profile_id")
    @OneToOne
    private UserProfile userProfile;
}
