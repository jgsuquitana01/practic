package com.example.demo.controlle

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

    @RestController
    @RequestMapping("/hello")
    class Practice {

        @GetMapping("/{age}")
        fun index(@PathVariable("age") age: Long):String {
            val result= (age)

            return "mi nombre es jose y tengo $age anios "
        }

    }
// aparte
fun indexAge(@PathVariable age:Int): String =
    when (age) {
        in 0..11   -> "niño "
        in 12..17   -> "adolecente"
        in 18..21  -> "Adulto joven"
        in 22..64 -> "Adulto"
        in 65 ..100 ->"tercera edad"

        else -> "Unknown"
    }

// aparte

