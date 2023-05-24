package com.lr.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.lr.webflux.document.Playlist;

public interface PlaylistRepository
		extends ReactiveMongoRepository<Playlist, String> {

}
