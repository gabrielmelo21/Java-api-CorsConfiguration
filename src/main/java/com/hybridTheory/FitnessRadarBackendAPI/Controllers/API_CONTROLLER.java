package com.hybridTheory.FitnessRadarBackendAPI.Controllers;

import com.hybridTheory.FitnessRadarBackendAPI.DTO.AlimentosIngeridosDTO;
import com.hybridTheory.FitnessRadarBackendAPI.Models.AlimentosIngeridos;
import com.hybridTheory.FitnessRadarBackendAPI.Repositories.AlimentosIngeridosRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class API_CONTROLLER {
    @Autowired
    public final AlimentosIngeridosRepository alimentosIngeridosRepository;

 @GetMapping("/listarAlimentosIngeridos")
    public List<AlimentosIngeridos> list(){
     return alimentosIngeridosRepository.findAll();
 }
 @PostMapping("/addAlimentosIngeridos")
 public ResponseEntity<AlimentosIngeridos> save(@RequestBody @Valid AlimentosIngeridosDTO dto){
     var alimentos = new AlimentosIngeridos();
     BeanUtils.copyProperties(dto, alimentos);
     return ResponseEntity.status(HttpStatus.CREATED).body(alimentosIngeridosRepository.save(alimentos));
 }
 @DeleteMapping("/deletarAlimentosIngeridos/{id}")
 public ResponseEntity<Object> delete(@PathVariable(value = "id") Long id){
     Optional<AlimentosIngeridos> alimentoSelected = alimentosIngeridosRepository.findById(id);
     alimentosIngeridosRepository.delete(alimentoSelected.get());
     return ResponseEntity.status(HttpStatus.OK).body("Alimento Deletado com sucesso!");
 }




}
