package com.example.ArtsSchool.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ArtsSchool.Entity.Artist;
import com.example.ArtsSchool.Service.ArtistService;

@RestController
public class ArtistContoller {
	
	@Autowired
	
	public ArtistService artistService;
	
	@PostMapping("/addArtistDetails")
	public String addDetails(@RequestBody Artist artist) {
		artistService.addArtistDetails(artist);
		
		return "Artist Details are updated";
		
	}
	
	
	@GetMapping("/allArtistData")
	public List<Artist> getmethod() {
		return artistService.getArtistData();
		
	}
	
	@GetMapping("allArtistDataById/{id}")
	public Artist getMethodById(@PathVariable int id) {
		return artistService.getArtistDataById(id);
		}
	

	@PutMapping ("updateArtistData/{id}")
	public Artist postMethod(@RequestBody Artist  artist, @PathVariable int id) {
		return artistService.updateArtistData(id,artist);
		
	}
	
}
