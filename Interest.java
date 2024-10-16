package com.troca.troca;

import java.io.Serializable;
import java.util.List;

public class Interest {
  private Serializable id;
  private Float value;
  private String category;
  private String conservationState;
  private String addres;
  private List<String> keyworlds = new List<>();
  private User user;
}
