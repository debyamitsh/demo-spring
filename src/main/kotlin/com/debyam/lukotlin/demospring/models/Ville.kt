package com.debyam.lukotlin.demospring.models

import javax.persistence.*

@Entity
data class Ville(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id : Long? = null,
    val name : String = "",
    @OneToOne
    val maire : Maire? = null
)