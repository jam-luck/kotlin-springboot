package com.example.demo.service

import com.example.demo.domain.AppUser
import com.example.demo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository){
    fun getAllUsers(): List<AppUser> = userRepository.findAll().toList()
}