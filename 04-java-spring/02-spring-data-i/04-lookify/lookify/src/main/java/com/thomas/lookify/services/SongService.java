package com.thomas.lookify.services;
import com.thomas.lookify.repositories.SongRepository;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thomas.lookify.models.Song;

@Service
public class SongService {
	private final SongRepository songRepo;
	public SongService(SongRepository repo) {
		this.songRepo = repo;
	}
	
	public List<Song> allSongs() {
		return songRepo.findAll();
	}
	public Song findSong(Long id) {
		return songRepo.findById(id).orElse(null);
	}
	public List<Song> topTenByRating() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
	public List<Song> songsContainingArtist(String artist) {
		return songRepo.findByArtistContaining(artist);
	}
	public Song createSong(Song song) {
		return songRepo.save(song);
	}
	public Song updateSong(Song song) {
		return songRepo.save(song);
	}
	public void deleteSong(Long id) {
		songRepo.deleteById(id);
	}
	
}