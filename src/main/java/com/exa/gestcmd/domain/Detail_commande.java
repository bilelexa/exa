package com.exa.gestcmd.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

@Data
@Entity
public class Detail_commande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idarticle;
    @DecimalMin(value = "0")
    private Double qtcom;
    @ManyToOne
    @JsonIgnoreProperties("")
    private Commande commande;
}
