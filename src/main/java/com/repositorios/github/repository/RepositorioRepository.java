package com.repositorios.github.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repositorios.github.model.Repositorio;

@Repository
public interface RepositorioRepository extends JpaRepository<Repositorio, Integer> {

}
