package me.osj4532.websocket.db.repo

import me.osj4532.websocket.db.entity.ChatLog
import org.springframework.data.jpa.repository.JpaRepository

interface ChatLogRepo: JpaRepository<ChatLog, String> {}