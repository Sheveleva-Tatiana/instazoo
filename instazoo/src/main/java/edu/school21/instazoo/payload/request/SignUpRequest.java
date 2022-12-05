package edu.school21.instazoo.payload.request;

import lombok.Data;

@Data
public class SignUpRequest {
private String email;
private String firstname;
private String lastname;
    private String username;
    private String password;
    private String confirmepassword;



}
