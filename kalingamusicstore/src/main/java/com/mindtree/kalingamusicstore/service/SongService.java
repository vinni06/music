package com.mindtree.kalingamusicstore.service;

import java.util.List;

import com.mindtree.kalingamusicstore.dto.SongDto;
import com.mindtree.kalingamusicstore.entity.Artist;
import com.mindtree.kalingamusicstore.entity.Song;

public interface SongService {

	public List<SongDto> getBySongId(int songId);

}
