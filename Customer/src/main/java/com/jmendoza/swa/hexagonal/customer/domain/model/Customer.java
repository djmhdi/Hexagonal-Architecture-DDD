package com.jmendoza.swa.hexagonal.customer.domain.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class Customer {
    private String id;
    @NonNull
    private String idCard;
    @NonNull
    @Size(min = 3, max = 20)
    private String firstName;
    @NonNull
    @Size(min = 3, max = 20)
    private String lastName;
    @NonNull
    @Email
    private String email;
}