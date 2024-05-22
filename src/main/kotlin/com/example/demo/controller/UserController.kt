package com.example.demo.controller

import com.example.demo.service.UserService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/v1/users")
@RestController
class UserController(private val userService: UserService) {

}