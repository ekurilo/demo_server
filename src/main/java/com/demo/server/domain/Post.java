package com.demo.server.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Post {
  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String text;
}
