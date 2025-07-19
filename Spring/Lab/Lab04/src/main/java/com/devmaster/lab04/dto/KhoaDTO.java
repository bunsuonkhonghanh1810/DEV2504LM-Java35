package com.devmaster.lab04.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class KhoaDTO {
    @NotBlank(message = "Ma khoa cannot be blank")
    @Size(min = 2, message = "Ma khoa must be at least 2 characters")
    String maKhoa;

    @NotBlank(message = "Ten khoa cannot be blank")
    @Size(min = 5, max = 25, message = "Ten khoa must be between 5 and 25 characters")
    String tenKhoa;
}
