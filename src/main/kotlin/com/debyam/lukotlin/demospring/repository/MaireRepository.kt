package com.debyam.lukotlin.demospring.repository

import com.debyam.lukotlin.demospring.models.Maire
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.webmvc.RepositoryRestController

@RepositoryRestController
interface MaireRepository : CrudRepository<Maire, Long> {

}

