package com.example.demo.repository

import com.example.demo.domain.AppUser
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<AppUser,Long>