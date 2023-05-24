package com.lr.webflux;

//@Component
//public class DumyData implements CommandLineRunner {
//
//	private final PlaylistRepository playlistRepository;
//
//	public DumyData(PlaylistRepository playlistRepository) {
//		this.playlistRepository = playlistRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		playlistRepository.deleteAll().thenMany(Flux
//				.just("Programação", "Steam Linux", "Linux Games",
//						"Banco de Dados", "Linux Tutoriais")
//				.map(nome -> new Playlist(UUID.randomUUID().toString(), nome))
//				.flatMap(playlistRepository::save))
//				.subscribe(System.out::println);
//
//	}
//
//}
