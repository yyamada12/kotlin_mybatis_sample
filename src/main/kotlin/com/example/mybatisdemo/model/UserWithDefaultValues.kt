package com.example.mybatisdemo.model

data class UserWithDefaultValues(
    val id: Int = 10,
    val name: String = "hoge",
    val email: String = "fuga"
)

data class GroupUserWithDefaultValues(
    val groupId: Int = 20,
    val users: List<UserWithDefaultValues> = mutableListOf()
)