package com.mindtree.kalingamusicstore.service.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingamusicstore.dto.AlbumDto;
import com.mindtree.kalingamusicstore.entity.Album;
import com.mindtree.kalingamusicstore.entity.Artist;
import com.mindtree.kalingamusicstore.entity.Song;
import com.mindtree.kalingamusicstore.repository.AlbumRepository;
import com.mindtree.kalingamusicstore.repository.ArtistRepository;
import com.mindtree.kalingamusicstore.repository.SongRepository;
import com.mindtree.kalingamusicstore.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
	AlbumRepository albumRepositoryObj;
	
	@Autowired
	ArtistRepository artistRepositoryObj;
	
	@Autowired
	SongRepository songRepositoryObj;
	
	ModelMapper mapper=new ModelMapper();

	@Override
	public String addAlbum(AlbumDto albumDto) {
		
		Album albums=mapper.map(albumDto, Album.class);
		Artist artists=new Artist();
		List<Song> song=albums.getSongs();
		for(Song s:song)
		{
	    s.setArtists(s.getArtists());
	    s.getArtists().setSongs(albums.getSongs());
		s.setAlbum(albums);
		
		}
		albumRepositoryObj.saveAndFlush(albums);
		return "inserted successfully";
	}

	@Override
	public int getNoOfSongs(int albumId) {
		Album album=albumRepositoryObj.findById(albumId).get();
		List<Song> songsList=album.getSongs();
		int count=0;
		for (Song song : songsList) {
			count++;
			
		}
		return count;
	}

	

}
