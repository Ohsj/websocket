package me.osj4532.websocket.db.entity

import javax.persistence.*

@Entity
@Table(schema = "me_osj4532_websocket", name = "USER")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    val userId: String = "",

    @Column(name = "name")
    val name: String = ""
): BaseEntity()
