package com.troca.troca;

import java.util.List;
import java.util.ArrayList;

import lombok.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Chat {
  private List<Message> ownership = new ArrayList<>();
}
