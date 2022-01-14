package me.osj4532.websocket.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["me.osj4532.websocket.db.repo"])
class JpaConfig {}