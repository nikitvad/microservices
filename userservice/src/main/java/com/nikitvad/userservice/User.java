package com.nikitvad.userservice;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class User {
    @Id
    private String id;
    private String username;
    private String firstName;
    private String lastName;
}
