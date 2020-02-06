package com.debyam.lukotlin.demospring.repository

import com.debyam.lukotlin.demospring.models.Promotion
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.webmvc.RepositoryRestController

@RepositoryRestController
interface PromotionRepository : CrudRepository<Promotion, Long> {
}