package me.osj4532.websocket.rabbitmq

import me.osj4532.websocket.rabbitmq.model.CustomMessage
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class SampleListener {

    private val log = LoggerFactory.getLogger(javaClass)

    @RabbitListener(queues = ["me.osj4532.websocket"])
    fun receiveMessage(message: CustomMessage) {
        log.info("RabbitMQ Listener $message")
    }
}