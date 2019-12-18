package com.mindtree.kalingamusicstore.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingamusicstore.repository.AlbumRepository;
import com.mindtree.kalingamusicstore.repository.ArtistRepository;
import com.mindtree.kalingamusicstore.repository.SongRepository;
import com.mindtree.kalingamusicstore.service.ArtistService;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	AlbumRepository albumRepositoryObj;
	
	@Autowired
	ArtistRepository artistRepositoryObj;
	
	@Autowired
	SongRepository songRepositoryObj;
}
