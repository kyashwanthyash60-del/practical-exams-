package com.example.program17;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
@RestController @RequestMapping("/students")
@CrossOrigin
public class StudentController {
 private final StudentRepository repo;
 public StudentController(StudentRepository repo){this.repo=repo;}
 @GetMapping public List<Student> all(){return repo.findAll();}
 @GetMapping("/{id}") public Student one(@PathVariable Integer id){return repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));}
 @PostMapping public Student add(@RequestBody Student s){s.setId(null);return repo.save(s);}
 @PutMapping("/{id}") public Student update(@PathVariable Integer id,@RequestBody Student s){Student old=one(id);old.setRegNo(s.getRegNo());old.setName(s.getName());old.setBranch(s.getBranch());return repo.save(old);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Integer id){repo.delete(one(id));}
}
