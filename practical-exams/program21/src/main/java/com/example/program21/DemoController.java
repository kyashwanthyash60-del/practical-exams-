package com.example.program21;import org.springframework.web.bind.annotation.*;
@RestController public class DemoController{@GetMapping("/public") public String pub(){return "This endpoint is public.";}@GetMapping("/secure") public String secure(){return "You are authenticated.";} }
