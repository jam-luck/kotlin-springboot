package com.example.demo.controller

import com.example.demo.domain.AppUser
import com.example.demo.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/users")
@RestController
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers() : List<AppUser> = userService.getAllUsers()
}