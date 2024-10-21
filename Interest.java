package com.troca.troca;

import java.io.Serializable;
import java.util.List;

import lombok.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Interest {
  @Id
  private Serializable id;
  private Float value;
  private String category;
  private String conservationState;
  private String addres;
  private List<String> keyworlds = new List<>();
  private User user;
}
