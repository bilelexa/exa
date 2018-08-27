package com.exa.gestcmd.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Commande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String datcom;
    @DecimalMin(value = "0")
    private Double total;
    private Long client_id;
    @OneToMany(mappedBy = "commande")
    @JsonIgnore()
    private Set<Detail_commande> detail_commandes = new HashSet<>();
}
