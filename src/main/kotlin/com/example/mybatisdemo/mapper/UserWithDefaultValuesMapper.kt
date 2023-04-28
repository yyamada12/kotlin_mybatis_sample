package com.example.mybatisdemo.mapper

import com.example.mybatisdemo.model.GroupUserWithDefaultValues
import com.example.mybatisdemo.model.UserWithDefaultValues
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Select

@Mapper
interface UserWithDefaultValuesMapper {

    @Select("SELECT * FROM users")
    fun findAll(): List<UserWithDefaultValues>

    @Select("SELECT id, name FROM users")
    fun find2Col(): List<UserWithDefaultValues>

    @Select("SELECT id, name, email, 1 FROM users")
    fun find4Col(): List<UserWithDefaultValues>

    @Select("SELECT name, id, email FROM users")
    fun findIncorrectOrder(): List<UserWithDefaultValues>

    @Select(
        """
        SELECT gu.group_id, u.* FROM group_users gu
        JOIN users u ON gu.user_id = u.id
        WHERE gu.group_id = #{groupId}
    """
    )
    @ResultMap("groupUser")
    fun findByGroupId(groupId: Int): GroupUserWithDefaultValues

}
