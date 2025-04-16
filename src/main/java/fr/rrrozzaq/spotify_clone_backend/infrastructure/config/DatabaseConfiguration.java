package fr.rrrozzaq.spotify_clone_backend.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({ "fr.rrrozzaq.spotify_clone_backend.usercontext.repository",
        "fr.rrrozzaq.spotify_clone_backend.catalogcontext.repository" })
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}