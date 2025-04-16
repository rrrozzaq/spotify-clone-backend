package fr.rrrozzaq.spotify_clone_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SpotifyCloneBackendApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("postgres_url", dotenv.get("postgres_url"));
		System.setProperty("postgres_db", dotenv.get("postgres_db"));
		System.setProperty("postgres_username", dotenv.get("postgres_username"));
		System.setProperty("postgres_password", dotenv.get("postgres_password"));
		System.setProperty("auth0_client_id", dotenv.get("auth0_client_id"));
		System.setProperty("auth0_client_secret", dotenv.get("auth0_client_secret"));

		SpringApplication.run(SpotifyCloneBackendApplication.class, args);
	}

}
