package com.hybridTheory.FitnessRadarBackendAPI.DTO;

import jakarta.validation.constraints.NotBlank;



public record AlimentosIngeridosDTO(@NotBlank String alimento, @NotBlank Long calorias, @NotBlank Integer quantidade) {
}
