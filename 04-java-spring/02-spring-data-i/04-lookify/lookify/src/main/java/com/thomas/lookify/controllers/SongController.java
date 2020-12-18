package com.thomas.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thomas.lookify.models.Song;
import com.thomas.lookify.services.SongService;

@Controller
public class SongController {
	private final SongService songService;
	public SongController(SongService service) {
		this.songService = service;
	}
	@RequestMapping("/")
	public String Index() {
		return "/index.jsp";
	}
	@RequestMapping("/songs")
	public String Songs(Model model) {
		model.addAttribute("songs", songService.allSongs());
		return "/songs.jsp";
	}
	@RequestMapping("/songs/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", songService.findSong(id));
		return "/show.jsp";
	}
	@RequestMapping("/songs/search")
	public String Search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("songs",	songService.songsContainingArtist(artist));
		model.addAttribute("artist", artist);
		return "/searched.jsp";
	}
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "/new.jsp";
	}
	@RequestMapping(value="/songs", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors())
			return "/songs/new.jsp";
		songService.createSong(song);
		return "redirect:/songs";
	}
	@RequestMapping("/songs/topTen")
	public String TopTen(Model model) {
		model.addAttribute("songs", songService.topTenByRating());
		return "/TopTen.jsp";
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String Delete(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/songs";
	}
	
}