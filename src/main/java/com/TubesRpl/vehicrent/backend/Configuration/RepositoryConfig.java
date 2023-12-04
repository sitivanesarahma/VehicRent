package com.TubesRpl.vehicrent.backend.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.TubesRpl.repository")
public class RepositoryConfig {

    // Mengkonfigurasi bean untuk UserRepository
    // @Bean
    // public UserRepository userRepository() {
    //     return new UserRepository();
    // }
}