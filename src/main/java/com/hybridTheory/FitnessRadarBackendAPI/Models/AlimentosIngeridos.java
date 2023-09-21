package com.hybridTheory.FitnessRadarBackendAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name = "alimentos_ingeridos")
public class AlimentosIngeridos  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "alimento", length = 40, nullable = false)
    private String alimento;

    @Column(name = "calorias", length = 10, nullable = false)
    private Long calorias;

    @Column(name = "quantidade", length = 10, nullable = false)
    private Integer quantidade;


}
