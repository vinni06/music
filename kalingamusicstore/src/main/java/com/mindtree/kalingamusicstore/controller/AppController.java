package com.mindtree.kalingamusicstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kalingamusicstore.dto.AlbumDto;
import com.mindtree.kalingamusicstore.dto.SongDto;
import com.mindtree.kalingamusicstore.entity.Album;
import com.mindtree.kalingamusicstore.repository.AlbumRepository;
import com.mindtree.kalingamusicstore.service.AlbumService;
import com.mindtree.kalingamusicstore.service.ArtistService;
import com.mindtree.kalingamusicstore.service.SongService;

@RestController
public class AppController {
	
	@Autowired
	AlbumService albumServiceImpl;
	
	@Autowired
	ArtistService artistServiceImpl;
	
	@Autowired
	SongService songServiceImpl;
	
	@Autowired
	AlbumRepository ar;
	
	@PostMapping("/addAlbum")
	public String addAlbum(@RequestBody AlbumDto albumDto)
	{
		return albumServiceImpl.addAlbum(albumDto);
		
	}
    @GetMapping("/getBySongId/{songId}")
    public List<SongDto> getBySongId(@PathVariable int songId)
    {
		return songServiceImpl.getBySongId(songId);
    	
    }
    @GetMapping("/getSongs/{albumId}")
    public int getNoOfSongs(@PathVariable int albumId)
    {
		return albumServiceImpl.getNoOfSongs(albumId);
    	
    }
    
    ModelMapper mapper = new ModelMapper();
    
    @GetMapping("/getalbums/{albumName}")
    public List<AlbumDto> getNoOfSongs(@PathVariable String albumName)
    {
		List<Album> albums=  ar.getbyName(albumName);
		List<AlbumDto> albumsdto = new ArrayList<AlbumDto>();
		for (Album song : albums) {
			AlbumDto songDto=mapper.map(song, AlbumDto.class);
	    	   albumsdto.add(songDto);
			
		}
		return albumsdto;
    	
    }
    
    
    
}
