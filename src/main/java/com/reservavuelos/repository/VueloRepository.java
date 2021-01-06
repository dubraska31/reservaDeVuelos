package com.reservavuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.reservavuelos.model.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {}
