package com.example.mybatisdemo.mapper

import com.example.mybatisdemo.model.NoArgGroupUser
import com.example.mybatisdemo.model.NoArgUser
import org.apache.ibatis.annotations.*

@Mapper
interface NoArgUserMapper {

    @Select("SELECT * FROM users")
    fun findAll(): List<NoArgUser>

    @Select("SELECT id, name FROM users")
    fun find2Col(): List<NoArgUser>

    @Select("SELECT id, name, email, 1 FROM users")
    fun find4Col(): List<NoArgUser>

    @Select("SELECT name, id, email FROM users")
    fun findIncorrectOrder(): List<NoArgUser>

    @Select("SELECT * FROM users WHERE id = #{id}")
    fun findById(id: Int): NoArgUser?

    @Insert("INSERT INTO users(name, email) VALUES(#{name}, #{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    fun insert(noArgUser: NoArgUser): Int

    @Update("UPDATE users SET name=#{name}, email=#{email} WHERE id=#{id}")
    fun update(noArgUser: NoArgUser): Int

    @Delete("DELETE FROM users WHERE id=#{id}")
    fun delete(id: Int): Int

    @Select(
        """
        SELECT gu.group_id, u.* FROM group_users gu
        JOIN users u ON gu.user_id = u.id
        WHERE gu.group_id = #{groupId}
    """
    )
    @ResultMap("groupUser")
    fun findByGroupId(groupId: Int): NoArgGroupUser
}
