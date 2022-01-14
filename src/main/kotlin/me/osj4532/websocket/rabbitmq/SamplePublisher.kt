package me.osj4532.websocket.rabbitmq

import me.osj4532.websocket.db.entity.enum.ChatType
import me.osj4532.websocket.event.publisher.SendQueueMessagePublisher
import me.osj4532.websocket.rabbitmq.model.CustomMessage
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class SamplePublisher(
    val rabbitTemplate: RabbitTemplate,
    val sendQueueMsgPublisher: SendQueueMessagePublisher
): CommandLineRunner {

    private val log = LoggerFactory.getLogger(javaClass)
    val topicExchange = "me.osj4532.websocket"

    override fun run(vararg args: String?) {
        log.info("Sending message...")
        val roomId = UUID.randomUUID().toString()
        val msg = CustomMessage("1", roomId, "Hello", ChatType.TEXT)
        sendQueueMsgPublisher.publishSendQueueMessage(msg)
        rabbitTemplate.convertAndSend(topicExchange, "me.osj4532.websocket.ttt", msg)
    }
}