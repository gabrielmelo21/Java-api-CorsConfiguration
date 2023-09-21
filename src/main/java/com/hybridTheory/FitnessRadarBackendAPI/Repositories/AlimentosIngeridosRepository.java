package com.hybridTheory.FitnessRadarBackendAPI.Repositories;


import com.hybridTheory.FitnessRadarBackendAPI.Models.AlimentosIngeridos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentosIngeridosRepository extends JpaRepository<AlimentosIngeridos, Long> {
    /**
     * Repository: O padrão Repository é comumente usado no Spring Boot
     * para encapsular a interação com o banco de dados.
     * Ele fornece métodos para criar, ler, atualizar e excluir
     * registros no banco de dados relacionado à entidade correspondente.
     * Esses métodos são usados pelos serviços para persistência e recuperação de dados.
     * **/
}
