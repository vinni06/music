package com.mindtree.kalingamusicstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingamusicstore.entity.Album;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {

	@Query(value="select * from album where album_name='telugu'",nativeQuery=true)
	public List<Album> getbyName(String name);
}
