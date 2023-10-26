package com.module.shared.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Role Entity for Database Schema, use in Backend module
 */
@Entity
@Table(name = "roles")
public class RoleEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 40, nullable = false, unique = true)
  private String name;

  @Column(length = 150, nullable = false)
  private String description;

  // Constructors, create parameters for RoleEntity object
  // Pass args for the params when creating object instances
  // empty one is required by hibernate
  public RoleEntity() {
  }

  public RoleEntity(String name) {
    this.name = name;
  }

  public RoleEntity(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // Getter & Setter methods, accessible by object instances
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
