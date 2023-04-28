package com.example.mybatisdemo.mapper

import com.example.mybatisdemo.model.NormalUserSecondaryConstructor
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface NormalUserSecondaryConstructorMapper {

    @Select("SELECT * FROM users")
    fun findAll(): List<NormalUserSecondaryConstructor>

    @Select("SELECT id, name FROM users")
    fun find2Col(): List<NormalUserSecondaryConstructor>

    @Select("SELECT id, name, email, 1 FROM users")
    fun find4Col(): List<NormalUserSecondaryConstructor>

    @Select("SELECT name, id, email FROM users")
    fun findIncorrectOrder(): List<NormalUserSecondaryConstructor>

}
