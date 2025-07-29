package com.devmaster.lab06.dto;

import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class CustomerDTO {
    Long id;
    String userName;
    String password;
    String fullName;
    String address;
    String phone;
    String email;
    LocalDate birthDay;
    boolean status;
}
