package com.mindtree.kalingamusicstore.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mindtree.kalingamusicstore.entity.Album;
import com.mindtree.kalingamusicstore.entity.Artist;

public class SongDto {
	
	private int songId;
	private String songName;
	@JsonIgnoreProperties(value="songs", allowGetters = true, allowSetters = true)
    private AlbumDto album;
    @JsonIgnoreProperties(value="songs", allowGetters = true, allowSetters = true)
    private ArtistDto artists;
	public SongDto() {
		super();
	}
	public SongDto(int songId, String songName, AlbumDto album, ArtistDto artists) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.album = album;
		this.artists = artists;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	@JsonIgnore
	public AlbumDto getAlbum() {
		return album;
	}
	public void setAlbum(AlbumDto album) {
		this.album = album;
	}
	
	public ArtistDto getArtists() {
		return artists;
	}
	public void setArtists(ArtistDto artists) {
		this.artists = artists;
	}
	
    
    

}
