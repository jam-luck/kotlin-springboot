package com.example.demo.controller

import com.example.demo.domain.AppUser
import com.example.demo.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/users")
@RestController
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers() : List<AppUser> = userService.getAllUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id : Long) : ResponseEntity<AppUser> {
        val user = userService.getUserById(id)
        return if( user != null){
            ResponseEntity.ok(user)
        } else {
            ResponseEntity.ok().build()
        }
    }
}