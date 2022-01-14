package me.osj4532.websocket.event.publisher

import me.osj4532.websocket.event.model.SendQueueMessageEvent
import me.osj4532.websocket.rabbitmq.model.CustomMessage
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class SendQueueMessagePublisher(
    val publisher: ApplicationEventPublisher
) {
    fun publishSendQueueMessage(message: CustomMessage) {
        publisher.publishEvent(SendQueueMessageEvent(message, this))
    }
}