package com.example.mybatisdemo.service

import com.example.mybatisdemo.mapper.UserMapper
import com.example.mybatisdemo.model.User
import org.springframework.stereotype.Service

@Service
class UserService(private val userMapper: UserMapper) {

    fun findAll(): List<User> = userMapper.findAll()

    fun findById(id: Int): User? = userMapper.findById(id)

    fun insert(user: User): Int = userMapper.insert(user)

    fun update(user: User): Int = userMapper.update(user)

    fun delete(id: Int): Int = userMapper.delete(id)

    fun findByGroupId(id: Int) = userMapper.findByGroupId(id)
}
