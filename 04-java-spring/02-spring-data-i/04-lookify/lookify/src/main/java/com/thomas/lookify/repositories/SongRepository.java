package com.thomas.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thomas.lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findTop10ByOrderByRatingDesc();
	List<Song> findByArtistContaining(String artist);
	Object findById(Long id);
	Song save(Song song);
	void deleteById(Long id);
}