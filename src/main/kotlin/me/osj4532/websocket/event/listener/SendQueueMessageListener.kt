package me.osj4532.websocket.event.listener

import me.osj4532.websocket.db.entity.ChatLog
import me.osj4532.websocket.db.repo.ChatLogRepo
import me.osj4532.websocket.event.model.SendQueueMessageEvent
import me.osj4532.websocket.rabbitmq.model.CustomMessage
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class SendQueueMessageListener(
    val chatLogRepo: ChatLogRepo
): ApplicationListener<SendQueueMessageEvent> {
    private val log = LoggerFactory.getLogger(javaClass)

    override fun onApplicationEvent(event: SendQueueMessageEvent) {
        log.info("Application Event Listener DB Insert : ${event.msg}")
        chatLogRepo.save(convertMsgToEntity(event.msg))
    }

    private fun convertMsgToEntity(msg: CustomMessage): ChatLog {
        return ChatLog(
            userId = msg.userId,
            roomId = msg.roomId,
            chatType = msg.type,
            msg = msg.msg
        )
    }
}