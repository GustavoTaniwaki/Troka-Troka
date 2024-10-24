package com.troca.troca;

import java.util.ArrayList;
import java.util.List;

import lombok.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Report {
    @Id
    private User reportingClient;
    private User reportedClient;
    private Trade trade;
    private List<Message> mensagensReportadas = new ArrayList<>();
    private Chat chatReportado;
}
