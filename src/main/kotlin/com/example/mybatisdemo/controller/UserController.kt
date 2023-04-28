package com.example.mybatisdemo.controller

import com.example.mybatisdemo.model.NoArgGroupUser
import com.example.mybatisdemo.model.NoArgUser
import com.example.mybatisdemo.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAll(): List<NoArgUser> = userService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): NoArgUser? = userService.findById(id)

    @PostMapping
    fun insert(@RequestBody noArgUser: NoArgUser): Int = userService.insert(noArgUser)

    @PutMapping
    fun update(@RequestBody noArgUser: NoArgUser): Int = userService.update(noArgUser)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): Int = userService.delete(id)

    @GetMapping("/groups/{id}")
    fun findByGroupId(@PathVariable id: Int): NoArgGroupUser = userService.findByGroupId(id)
}
