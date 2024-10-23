package com.troca.troca;

import java.util.List;
import java.util.ArrayList;

import lombok.persistence.Entity;
import lombok.Data;

@Entity
@Data

public class Chat extends Message{
  private List<Message> ownership = new ArrayList<>();
}
