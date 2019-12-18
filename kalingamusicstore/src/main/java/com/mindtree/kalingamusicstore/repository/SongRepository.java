package com.mindtree.kalingamusicstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingamusicstore.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

}
