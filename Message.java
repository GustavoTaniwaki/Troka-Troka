package com.troca.troca;

import java.util.Date;

import lombok.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Message {
  @Id
  private User user;
  private String message;
  private Date dateM;
}
