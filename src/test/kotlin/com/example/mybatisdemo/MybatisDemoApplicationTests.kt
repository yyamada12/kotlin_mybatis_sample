package com.example.mybatisdemo

import com.example.mybatisdemo.mapper.NoArgUserMapper
import com.example.mybatisdemo.mapper.NormalUserMapper
import com.example.mybatisdemo.mapper.NormalUserSecondaryConstructorMapper
import com.example.mybatisdemo.mapper.UserWithDefaultValuesMapper
import com.example.mybatisdemo.model.UserWithDefaultValues
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MybatisDemoApplicationTests {

    @Autowired
    private lateinit var noArgUserMapper: NoArgUserMapper

    @Autowired
    private lateinit var normalUserMapper: NormalUserMapper

    @Autowired
    private lateinit var normalUserSecondaryConstructorMapper: NormalUserSecondaryConstructorMapper

    @Autowired
    private lateinit var userWithDefaultValuesMapper: UserWithDefaultValuesMapper


    @Test
    fun noArgUserFindAll() {
        // OK
        println(noArgUserMapper.findAll())
    }

    @Test
    fun noArgUserFind2Col() {
        // OK
        println(noArgUserMapper.find2Col())
    }

    @Test
    fun noArgUserFind4Col() {
        // OK
        println(noArgUserMapper.find4Col())
    }

    @Test
    fun noArgUserFindIncorrectOrder() {
        // OK
        println(noArgUserMapper.findIncorrectOrder())
    }

    @Test
    fun noArgUserFindGroupUser() {
        // OK
        println(noArgUserMapper.findByGroupId(1))
    }

    @Test
    fun normalUserFindAll() {
        println(normalUserMapper.findAll())
    }

    @Test
    fun normalUserFind2Col() {
        // error
        println(normalUserMapper.find2Col())
    }

    @Test
    fun normalUserFind4Col() {
        // OK
        println(normalUserMapper.find4Col())
    }

    @Test
    fun normalUserFindIncorrectOrder() {
        // error
        println(normalUserMapper.findIncorrectOrder())
    }

    @Test
    fun normalUserFindGroupUser() {
        println(normalUserMapper.findByGroupId(1))
    }

    @Test
    fun normalUserSecondaryConstructorMapperFindAll() {
        println(normalUserSecondaryConstructorMapper.findAll())
    }

    @Test
    fun normalUserSecondaryConstructorMapperFind2Col() {
        // ok
        println(normalUserSecondaryConstructorMapper.find2Col())
    }

    @Test
    fun normalUserSecondaryConstructorMapperFind4Col() {
        // error
        println(normalUserSecondaryConstructorMapper.find4Col())
    }

    @Test
    fun normalUserSecondaryConstructorMapperFindIncorrectOrder() {
        // error
        println(normalUserSecondaryConstructorMapper.findIncorrectOrder())
    }

    @Test
    fun userWithDefaultValuesFindAll() {
        println(userWithDefaultValuesMapper.findAll())
    }

    @Test
    fun userWithDefaultValuesFind2Col() {
        // OK
        println(userWithDefaultValuesMapper.find2Col())
    }

    @Test
    fun userWithDefaultValuesFind4Col() {
        // OK
        println(userWithDefaultValuesMapper.find4Col())
    }

    @Test
    fun userWithDefaultValuesFindIncorrectOrder() {
        // OK
        println(userWithDefaultValuesMapper.findIncorrectOrder())
    }

    @Test
    fun userWithDefaultValuesFindGroupUser() {
        // OK
        println(userWithDefaultValuesMapper.findByGroupId(1))
    }
}
