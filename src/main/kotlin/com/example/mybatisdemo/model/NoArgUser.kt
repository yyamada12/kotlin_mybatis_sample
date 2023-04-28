package com.example.mybatisdemo.model

import com.example.mybatisdemo.annotation.NoArg

@NoArg
data class NoArgUser(
    val id: Int,
    val name: String,
    val email: String
)

@NoArg
data class NoArgGroupUser(
    val groupId: Int,
    val noArgUsers: List<NoArgUser>
)

class Caaa(
    val groupId: Int,
    val noArgUsers: List<NoArgUser>
)