package com.debyam.lukotlin.demospring

import com.debyam.lukotlin.demospring.models.Maire
import com.debyam.lukotlin.demospring.models.Ville
import com.debyam.lukotlin.demospring.repository.MaireRepository
import com.debyam.lukotlin.demospring.repository.VilleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class DemoSpringApplication {

}

fun main(args: Array<String>) {
    runApplication<DemoSpringApplication>(*args)
}

@Controller
class Deb {

    @Autowired
    private lateinit var maireRepo: MaireRepository

    @GetMapping("/index")
    @ResponseBody
    fun debo(): String {
        return "index"
    }
}
