package ua.mainacademy.model;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private String login;
    private String password;
    private String firstName;
    private String lastName;

}
