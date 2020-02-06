package com.debyam.lukotlin.demospring.repository

import com.debyam.lukotlin.demospring.models.Etudiant
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.webmvc.RepositoryRestController

@RepositoryRestController
interface EtudiantRepository : CrudRepository<Etudiant, Long> {
}