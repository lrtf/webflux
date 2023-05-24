package com.lr.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lr.webflux.document.Playlist;
import com.lr.webflux.services.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PlaylistController {

	@Autowired
	PlaylistService playlistService;

	@GetMapping(value = "/playlist")
	public Flux<Playlist> getPlaylist() {
		return this.playlistService.findAll();
	}

	@GetMapping(value = "/playlist/{id}")
	public Mono<Playlist> getPlaylistId(@PathVariable String id) {
		return this.playlistService.findById(id);
	}

	@PostMapping(value = "/playlist")
	public Mono<Playlist> save(@RequestBody Playlist playlist) {
		return this.playlistService.save(playlist);
	}

}
