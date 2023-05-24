package com.lr.webflux;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lr.webflux.document.Playlist;
import com.lr.webflux.repository.PlaylistRepository;

import reactor.core.publisher.Flux;

@Component
public class DumyData implements CommandLineRunner {

	private final PlaylistRepository playlistRepository;

	public DumyData(PlaylistRepository playlistRepository) {
		this.playlistRepository = playlistRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		playlistRepository.deleteAll().thenMany(Flux
				.just("Programação", "Steam Linux", "Linux Games",
						"Banco de Dados", "Linux Tutoriais")
				.map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
				.flatMap(playlistRepository::save))
				.subscribe(System.out::println);

	}

}
