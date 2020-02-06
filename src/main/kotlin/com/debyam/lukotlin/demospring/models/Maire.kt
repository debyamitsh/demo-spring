package com.debyam.lukotlin.demospring.models

import javax.persistence.*

@Entity
data class Maire(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val name: String = ""
)

