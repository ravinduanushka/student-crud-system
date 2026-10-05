package com.example.studentcrud;

import com.example.studentcrud.entity.Student;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private List<Student> students = new ArrayList<>();

    // 1. READ ALL (GET)
    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    // 2. READ ONE BY ID (GET)
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // 3. CREATE (POST)
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

    // 4. UPDATE (PUT)
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedData) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(updatedData.getName());
                s.setCourse(updatedData.getCourse());
                return s;
            }
        }
        return null;
    }

    // 5. DELETE (DELETE)
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            return "Student removed successfully!";
        }
        return "Student not found!";
    }
}
