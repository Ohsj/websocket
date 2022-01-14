package me.osj4532.websocket.db.entity.enum

enum class ChatType(val code: String, val value: String) {
    TEXT("T", "평문"),
    FILE("F", "파일"),
    PHOTO("P", "사진"),
    VIDEO("V", "비디오"),
    UNKNOWN("U", "알수없음");
}