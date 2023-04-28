package com.example.mybatisdemo.model

data class NormalUser(
    val id: Int,
    val name: String,
    val email: String
)

data class NormalGroupUser(
    val groupId: Int,
    val users: List<NormalUser>
)