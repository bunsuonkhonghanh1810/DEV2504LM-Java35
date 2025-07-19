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
public class MonHocDTO {
    @NotBlank(message = "Ma mon hoc cannot be blank")
    @Size(min = 2, max = 2, message = "Ma mon hoc must be only 2 characters")
    String maMonHoc;

    @NotBlank(message = "Ten mon hoc cannot be blank")
    @Size(min = 5, max = 50, message = "Ma mon hoc must be between 5 and 50 characters")
    String tenMonHoc;

    @Min(value = 45, message = "So tiet must be at least 45")
    @Max(value = 75, message = "So tiet must not exceed 75")
    int soTiet;
}
