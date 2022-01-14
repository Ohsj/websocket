package me.osj4532.websocket.db.entity.enum

import java.lang.IllegalArgumentException
import java.util.*
import javax.persistence.AttributeConverter

class ChatTypeConverter: AttributeConverter<ChatType, String> {
    override fun convertToDatabaseColumn(attribute: ChatType): String {
        return attribute.code
    }

    override fun convertToEntityAttribute(dbData: String): ChatType {
        return EnumSet.allOf(ChatType::class.java).stream()
            .filter{ e -> e.code == dbData }
            .findAny()
            .orElseThrow { IllegalArgumentException("잘못된 타입 저장됨") }
    }
}