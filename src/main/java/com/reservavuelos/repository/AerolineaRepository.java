package com.reservavuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservavuelos.model.Aerolinea;

@Repository
public interface AerolineaRepository extends JpaRepository<Aerolinea, Long> {}
