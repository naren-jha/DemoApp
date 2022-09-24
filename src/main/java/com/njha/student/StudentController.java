package com.njha.student;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<String> registerStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return ResponseEntity.ok("Student created successfully!");
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentService.getStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Long studentId) {
        Student student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.ok("Student deleted successfully!");
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<String> updateStudent(@PathVariable("studentId") Long studentId,
                                             @RequestParam(required = false) String name,
                                             @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
        return ResponseEntity.ok("Student updated successfully!");
    }
}
