package com.mindtree.kalingamusicstore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Artist {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int artistId;
	private String artistName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "artists")
	List<Song> songs;

	public Artist() {
		super();
	}

	public Artist(int artistId, String artistName, List<Song> songs) {
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

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	
}
