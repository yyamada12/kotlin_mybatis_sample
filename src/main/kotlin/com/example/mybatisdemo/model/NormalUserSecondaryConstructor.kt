package com.example.mybatisdemo.model

data class NormalUserSecondaryConstructor(
    val id: Int,
    val name: String,
    val email: String
) {
    constructor(id: Int, name: String): this(id, name, "")
}

data class NormalGroupUserSecondaryConstructor(
    val groupId: Int,
    val users: List<NormalUserSecondaryConstructor>
)