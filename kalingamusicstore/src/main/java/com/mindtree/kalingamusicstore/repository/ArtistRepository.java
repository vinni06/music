package com.mindtree.kalingamusicstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingamusicstore.entity.Artist;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
