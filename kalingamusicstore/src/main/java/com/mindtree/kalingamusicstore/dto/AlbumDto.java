package com.mindtree.kalingamusicstore.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



public class AlbumDto {
	
	private int albumId;
	private String albumName;
    @JsonIgnoreProperties(value="album", allowGetters = true, allowSetters = true)
	private List<SongDto> songs;
	public AlbumDto() {
		super();
	}
	public AlbumDto(int albumId, String albumName, List<SongDto> songs) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.songs = songs;
	}
	
	
	public AlbumDto(int albumId, String albumName) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
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
		return "AlbumDto [albumId=" + albumId + ", albumName=" + albumName + ", songs=" + songs + "]";
	}
	
	

}
