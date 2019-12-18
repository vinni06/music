package com.mindtree.kalingamusicstore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String songName;    
    @ManyToOne(cascade =CascadeType.ALL )
    private Artist artists;
    @ManyToOne(cascade = CascadeType.ALL)
    private Album album;

	public Song() {
		super();
	}

	public Song(int songId, String songName, Album album, Artist artists) {
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

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public Artist getArtists() {
		return artists;
	}

	public void setArtists(Artist artists) {
		this.artists = artists;
	}

	
    
}
