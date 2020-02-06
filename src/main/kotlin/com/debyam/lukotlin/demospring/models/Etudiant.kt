package com.debyam.lukotlin.demospring.models

import javax.persistence.*

@Entity
data class Etudiant(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long? = null,
        val name : String = "",
        val matricule : String? = null
        
)