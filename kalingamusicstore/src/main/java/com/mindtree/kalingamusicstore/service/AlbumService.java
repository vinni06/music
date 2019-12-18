package com.mindtree.kalingamusicstore.service;

import com.mindtree.kalingamusicstore.dto.AlbumDto;

public interface AlbumService {

	public String addAlbum(AlbumDto albumDto);

	public int getNoOfSongs(int albumId);

}
