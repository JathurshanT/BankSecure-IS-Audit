package com.banksecure.audit.controller;
import com.banksecure.audit.model.Asset;
import com.banksecure.audit.repository.AssetRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;
@RestController @RequestMapping("/api/assets") public class AssetController {
 private final AssetRepository repo;
 public AssetController(AssetRepository repo){this.repo=repo;}
 @GetMapping public List<Asset> all(){return repo.findAll();}
 @PostMapping public Asset create(@Valid @RequestBody Asset item){item.id=null;return repo.save(item);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){if(!repo.existsById(id))throw new ResponseStatusException(HttpStatus.NOT_FOUND);repo.deleteById(id);}
}
