package com.example.program20;
import java.util.List;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/students") @CrossOrigin
public class StudentController {private final StudentRepository repo;public StudentController(StudentRepository repo){this.repo=repo;}
@GetMapping public List<Student> all(){return repo.findAll();}@PostMapping public Student add(@RequestBody Student s){s.setId(null);return repo.save(s);}
@PutMapping("/{id}") public Student update(@PathVariable String id,@RequestBody Student s){s.setId(id);return repo.save(s);}
@DeleteMapping("/{id}") public void delete(@PathVariable String id){repo.deleteById(id);}}
