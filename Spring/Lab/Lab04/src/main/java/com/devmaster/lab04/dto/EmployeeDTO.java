package com.devmaster.lab04.dto;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class EmployeeDTO {
    @NotBlank(message = "Full name cannot be blank")
    @Size(min = 3, max = 25, message = "Full name must be between 3 and 25 character")
    String fullName;

    @NotBlank(message = "Gender cannot be blank")
    String gender;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age must not exceed 60")
    int age;

    @Positive(message = "Salary must be greater than zero")
    double salary;
}
