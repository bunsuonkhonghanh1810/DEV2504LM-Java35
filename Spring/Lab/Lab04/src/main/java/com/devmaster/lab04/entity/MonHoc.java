package com.devmaster.lab04.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class MonHoc {
    @Id
    String maMonHoc;
    String tenMonHoc;
    int soTiet;
}
