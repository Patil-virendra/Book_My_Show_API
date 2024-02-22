package com.api.entitites;

import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class REQUESTjwt {
    private String email;
    private String password;
}
