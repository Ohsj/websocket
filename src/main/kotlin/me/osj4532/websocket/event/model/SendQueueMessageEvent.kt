package me.osj4532.websocket.event.model

import me.osj4532.websocket.rabbitmq.model.CustomMessage
import org.springframework.context.ApplicationEvent

open class SendQueueMessageEvent(
    var msg: CustomMessage,
    source: Any
): ApplicationEvent(source)