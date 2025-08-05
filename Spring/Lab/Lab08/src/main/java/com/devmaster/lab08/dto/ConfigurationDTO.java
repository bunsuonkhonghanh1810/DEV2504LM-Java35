package com.devmaster.lab08.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ConfigurationDTO {
    Long id;
    String name;
    Boolean isActive;
}
