package com.api.entitites;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RESPONSEjwt
{
    private String jwtToken;
    private String username;

}