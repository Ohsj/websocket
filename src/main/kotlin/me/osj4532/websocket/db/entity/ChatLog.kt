package me.osj4532.websocket.db.entity

import me.osj4532.websocket.db.entity.enum.ChatType
import me.osj4532.websocket.db.entity.enum.ChatTypeConverter
import javax.persistence.*

@Entity
@Table(schema = "me_osj4532_websocket", name = "chat_log")
data class ChatLog(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    var logId: String = "",
    @Column(name = "room_id")
    var roomId: String = "",
    @Column(name = "user_id")
    var userId: String = "",
    @Column(name = "chat_type")
    @Convert(converter = ChatTypeConverter::class)
    var chatType: ChatType = ChatType.UNKNOWN,
    @Column(name = "msg")
    var msg: String? = null,
    @Column(name = "path")
    var path: String? = null
): BaseEntity()