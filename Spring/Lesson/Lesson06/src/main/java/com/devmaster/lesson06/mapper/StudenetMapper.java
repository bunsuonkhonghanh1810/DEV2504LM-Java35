package com.devmaster.lesson06.mapper;

import com.devmaster.lesson06.dto.StudentDTO;
import com.devmaster.lesson06.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudenetMapper {
    Student toEnity(StudentDTO studentDTO);
    StudentDTO toDTO(Student student);
}
