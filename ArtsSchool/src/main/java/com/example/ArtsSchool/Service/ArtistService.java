package com.example.ArtsSchool.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArtsSchool.Entity.Artist;
import com.example.ArtsSchool.Repository.ArtistRepo;

@Service
public class ArtistService {
	
	@Autowired
	public ArtistRepo artistRepo;

	public Artist addArtistDetails(Artist artist) {
		return artistRepo.save(artist);
		
		
	}

	public List<Artist> getArtistData() {
		// TODO Auto-generated method stub
		return artistRepo.findAll();
	}

	public Artist getArtistDataById(int id) {
		
		return artistRepo.findById(id).orElse(null);
	}

	public Artist updateArtistData(int id, Artist artist) {
	
		
		artistRepo.save(artist);
		return artist;
		
		
	}
	
	
	

}
