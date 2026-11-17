package com.banksecure.audit.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity public class Asset {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
 @NotBlank public String name;
 @NotBlank public String type;
 @NotBlank public String owner;
 @NotBlank public String criticality;
 public Asset(){}
}
