package com.librarian.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserQueryResponse {
    private Integer userId;
    private String fullName;
    private boolean status;
    private String joinedOn;
}
