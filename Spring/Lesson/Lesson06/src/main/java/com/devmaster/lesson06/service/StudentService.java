package com.devmaster.lesson06.service;

import com.devmaster.lesson06.dto.StudentDTO;
import com.devmaster.lesson06.entity.Student;
import com.devmaster.lesson06.mapper.StudenetMapper;
import com.devmaster.lesson06.repository.StudentRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudenetMapper studenetMapper;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<StudentDTO> findById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        StudentDTO studentDTO = studenetMapper.toDTO(student);

        return Optional.of(studentDTO);
    }

    public Boolean save(StudentDTO studentDTO) {
        Student student = studenetMapper.toEnity(studentDTO);
        try {
            studentRepository.save(student);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public Student updateStudentById(Long id, StudentDTO studentDTO) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(studentDTO.getName());
                    student.setEmail(studentDTO.getEmail());
                    student.setAge(studentDTO.getAge());
                    return studentRepository.save(student);
                })
                .orElseThrow(() -> new IllegalStateException("Invalid Student ID: " + id));
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
