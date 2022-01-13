package com.agnyfonseca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agnyfonseca.dsmovie.entities.Score;
import com.agnyfonseca.dsmovie.entities.ScorePK;

@Repository
public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
