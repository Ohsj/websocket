package me.osj4532.websocket.rabbitmq.model

import me.osj4532.websocket.db.entity.enum.ChatType

data class CustomMessage(
    var userId: String = "",
    var roomId: String = "",
    var msg: String? = null,
    var type: ChatType = ChatType.UNKNOWN
)
