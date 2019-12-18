package com.mindtree.kalingamusicstore.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class ArtistDto {
	
	private int artistId;
	private String artistName;
	//@JsonIgnoreProperties(value="artists", allowGetters = true, allowSetters = true)
	List<SongDto> songs;
	public ArtistDto() {
		super();
	}
	public ArtistDto(int artistId, String artistName, List<SongDto> songs) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.songs = songs;
	}
	
	
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	@JsonIgnore
	public List<SongDto> getSongs() {
		return songs;
	}
	public void setSongs(List<SongDto> songs) {
		this.songs = songs;
	}
	@Override
	public String toString() {
		return "ArtistDto [artistId=" + artistId + ", artistName=" + artistName + ", songs=" + songs + "]";
	}
	
	


}
