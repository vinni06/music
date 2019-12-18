package com.mindtree.kalingamusicstore.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingamusicstore.dto.AlbumDto;
import com.mindtree.kalingamusicstore.dto.ArtistDto;
import com.mindtree.kalingamusicstore.dto.SongDto;
import com.mindtree.kalingamusicstore.entity.Artist;
import com.mindtree.kalingamusicstore.entity.Song;
import com.mindtree.kalingamusicstore.repository.AlbumRepository;
import com.mindtree.kalingamusicstore.repository.ArtistRepository;
import com.mindtree.kalingamusicstore.repository.SongRepository;
import com.mindtree.kalingamusicstore.service.SongService;

@Service
public class SongServiceImpl implements SongService {
	
	@Autowired
	AlbumRepository albumRepositoryObj;
	
	@Autowired
	ArtistRepository artistRepositoryObj;
	
	@Autowired
	SongRepository songRepositoryObj;
	
	ModelMapper mapper=new ModelMapper();

	@Override
	public List<SongDto> getBySongId(int songId) {
		Song songs=songRepositoryObj.findById(songId).get();
		
//		int artistId=songs.getArtists().getArtistId();
//		List<Song savedSongs=artistRepositoryObj.findById(artistId).get().getSongs().get(0);
//		return mapper.map(savedSongs, SongDto.class);
		
		int artistId=songs.getArtists().getArtistId();
       List<Song> songsList= artistRepositoryObj.findById(artistId).get().getSongs();
       List<SongDto> songsDto=new ArrayList<SongDto>();
       for (Song song : songsList) {
    	   SongDto songDto=mapper.map(song, SongDto.class);
    	   songsDto.add(songDto);
		
	}
//       List<SongDto> newSongs = new ArrayList<SongDto>();
//       for(int i =0;i<songsList.size();i++ ) {
//    	   
//    	   SongDto songDto = mapper.map(songsList.get(i), SongDto.class);
//    	   newSongs.add(songDto);
//    	   
//       }
//		 List<SongDto> songDto=new ArrayList<SongDto>();
//		//return mapper.map(songsList, );
//		for (Song i : songsList) {
//			
//			songDto.add(new SongDto(i.getSongId(),i.getSongName(),new AlbumDto(i.getAlbum().getAlbumId(), i.getAlbum().getAlbumName()),new ArtistDto(i.getArtists().getArtistId(), i.getArtists().getArtistName())));
//		}
      
       
		return songsDto;
		
	}

	

}
