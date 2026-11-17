package com.banksecure.audit.controller;
import com.banksecure.audit.model.Finding;
import com.banksecure.audit.repository.FindingRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController @RequestMapping("/api/findings") public class FindingController {
 private final FindingRepository repo;
 public FindingController(FindingRepository repo){this.repo=repo;}
 @GetMapping public List<Finding> all(){return repo.findAll();}
 @PostMapping public Finding create(@Valid @RequestBody Finding item){item.id=null;return repo.save(item);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){if(!repo.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND);repo.deleteById(id);}
}
