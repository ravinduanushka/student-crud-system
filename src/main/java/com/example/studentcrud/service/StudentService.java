
package com.example.studentcrud.service;

import com.example.studentcrud.dto.StudentRequestDTO;
import com.example.studentcrud.dto.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    StudentResponseDTO createStudent(StudentRequestDTO requestDTO);
    StudentResponseDTO getStudentById(Long id);
    List<StudentResponseDTO> getAllStudents();
    StudentResponseDTO updateStudent(Long id, StudentRequestDTO requestDTO);
    void deleteStudent(Long id);
}
