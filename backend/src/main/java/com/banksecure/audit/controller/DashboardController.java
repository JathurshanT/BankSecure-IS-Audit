package com.banksecure.audit.controller;
import com.banksecure.audit.repository.*;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController public class DashboardController {
 private final AssetRepository assets;private final FindingRepository findings;
 public DashboardController(AssetRepository assets,FindingRepository findings){this.assets=assets;this.findings=findings;}
 @GetMapping("/api/dashboard") public Map<String,Object> summary(){
  var all=findings.findAll();return Map.of("assets",assets.count(),"findings",all.size(),"highOrCritical",all.stream().filter(f->f.getRiskScore()>=10).count());
 }
 @GetMapping("/api/health") public Map<String,String> health(){return Map.of("status","ok");}
}
