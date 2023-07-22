package com.example.ArtsSchool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ArtsSchool.Entity.Artist;

@Repository
public interface ArtistRepo extends JpaRepository<Artist, Integer>{

	
}
