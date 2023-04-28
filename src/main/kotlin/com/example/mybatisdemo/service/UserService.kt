package com.example.mybatisdemo.service

import com.example.mybatisdemo.mapper.NoArgUserMapper
import com.example.mybatisdemo.model.NoArgUser
import org.springframework.stereotype.Service

@Service
class UserService(private val noArgUserMapper: NoArgUserMapper) {

    fun findAll(): List<NoArgUser> = noArgUserMapper.findAll()

    fun findById(id: Int): NoArgUser? = noArgUserMapper.findById(id)

    fun insert(noArgUser: NoArgUser): Int = noArgUserMapper.insert(noArgUser)

    fun update(noArgUser: NoArgUser): Int = noArgUserMapper.update(noArgUser)

    fun delete(id: Int): Int = noArgUserMapper.delete(id)

    fun findByGroupId(id: Int) = noArgUserMapper.findByGroupId(id)
}
