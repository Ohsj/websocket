package me.osj4532.websocket.db.repo

import me.osj4532.websocket.db.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo: JpaRepository<User, String> {}