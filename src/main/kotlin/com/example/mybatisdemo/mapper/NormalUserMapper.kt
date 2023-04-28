package com.example.mybatisdemo.mapper

import com.example.mybatisdemo.model.NormalGroupUser
import com.example.mybatisdemo.model.NormalUser
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Select

@Mapper
interface NormalUserMapper {

    @Select("SELECT id, name, email FROM users")
    fun findAll(): List<NormalUser>

    @Select("SELECT id, name FROM users")
    fun find2Col(): List<NormalUser>

    @Select("SELECT id, name, email, 1 FROM users")
    fun find4Col(): List<NormalUser>

    @Select("SELECT name, id, email FROM users")
    fun findIncorrectOrder(): List<NormalUser>

    @Select(
        """
        SELECT gu.group_id, u.* FROM group_users gu
        JOIN users u ON gu.user_id = u.id
        WHERE gu.group_id = #{groupId}
    """
    )
    @ResultMap("groupUser")
    fun findByGroupId(groupId: Int): NormalGroupUser
}
