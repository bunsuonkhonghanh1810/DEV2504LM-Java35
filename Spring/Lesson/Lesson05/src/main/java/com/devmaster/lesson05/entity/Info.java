package com.devmaster.lesson05.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Info {
    private String name;
    private String nickName;
    @Id
    private String email;
    private String website;
}
