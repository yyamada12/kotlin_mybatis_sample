package com.example.mybatisdemo.model

import com.example.mybatisdemo.annotation.NoArg

@NoArg
data class User(
    val id: Int,
    val name: String,
    val email: String
)

@NoArg
data class GroupUser(
    val groupId: Int,
    val users: List<User>
)