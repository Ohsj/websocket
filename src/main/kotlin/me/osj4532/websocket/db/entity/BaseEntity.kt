package me.osj4532.websocket.db.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.MappedSuperclass
import javax.persistence.Temporal
import javax.persistence.TemporalType

@MappedSuperclass
open class BaseEntity(
    @Column(name = "create_dt")
    @Temporal(TemporalType.TIMESTAMP)
    val createDt: Date = Date(),

    @Column(name = "update_dt")
    @Temporal(TemporalType.TIMESTAMP)
    val updateDt: Date? = null
)