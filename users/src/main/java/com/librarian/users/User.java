package com.librarian.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Integer userId;

    private String fullName;
    private String contactNo;
    private String email;

    @JsonIgnoreProperties
    private boolean status;

    @JsonIgnoreProperties
    private String joinedOn;
}
