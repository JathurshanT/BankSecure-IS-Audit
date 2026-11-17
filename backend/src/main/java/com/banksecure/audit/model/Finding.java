package com.banksecure.audit.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity public class Finding {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
 @NotBlank public String title;
 @NotBlank public String description;
 @Min(1) @Max(5) public int likelihood;
 @Min(1) @Max(5) public int impact;
 @NotBlank public String status;
 public int getRiskScore(){return likelihood*impact;}
 public String getRiskLevel(){int s=getRiskScore();return s>=17?"Critical":s>=10?"High":s>=5?"Medium":"Low";}
 public Finding(){}
}
