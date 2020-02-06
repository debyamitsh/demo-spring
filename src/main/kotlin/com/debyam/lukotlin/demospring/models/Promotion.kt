package com.debyam.lukotlin.demospring.models

import javax.persistence.*

@Entity
data class Promotion(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long? = null,
        val name : String = "",
        @OneToMany
        val etudaiant : List<Etudiant> = listOf()
)