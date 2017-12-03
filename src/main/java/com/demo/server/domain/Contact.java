package com.demo.server.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Contact
{
  @Id
  @GeneratedValue
  private Long id;
  private String firstName;
  private String lastName;
  private String phone;
}
