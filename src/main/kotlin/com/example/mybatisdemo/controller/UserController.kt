package com.example.mybatisdemo.controller

import com.example.mybatisdemo.model.GroupUser
import com.example.mybatisdemo.model.User
import com.example.mybatisdemo.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun findAll(): List<User> = userService.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): User? = userService.findById(id)

    @PostMapping
    fun insert(@RequestBody user: User): Int = userService.insert(user)

    @PutMapping
    fun update(@RequestBody user: User): Int = userService.update(user)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int): Int = userService.delete(id)

    @GetMapping("/groups/{id}")
    fun findByGroupId(@PathVariable id: Int): GroupUser = userService.findByGroupId(id)
}
