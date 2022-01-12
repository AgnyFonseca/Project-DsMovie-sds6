package com.agnyfonseca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agnyfonseca.dsmovie.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
