package com.example.testunitaire

import org.junit.Test

import org.junit.Assert.*
import java.util.regex.Pattern

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}

class UnitTest{

    @Test
    fun isEmailValidTest(){
        var user = User("abc@gmail.com","Marco","Polo", 25)
        assertEquals(true, user.isEmailValid())
    }

    @Test
    fun isNomValidTest(){
        var user = User("abc@gmail.com","Marco","Polo", 25)
        assertEquals(true, user.isNomValid())
    }

    @Test
    fun isPrenomValidTest(){
        var user = User("abc@gmail.com","Marco","Polo", 25)
        assertEquals(true, user.isPrenomValid())
    }

    @Test
    fun isAgeValidTest(){
        var user = User("abc@gmail.com","Marco","Polo", 25)
        assertEquals(true, user.isAgeValid())
    }

    @Test
    fun isEmailInvalidTest(){
        var user = User("abc@","Marco","Polo", 25)
        assertEquals(false, user.isEmailValid())
    }

    @Test
    fun isNomInvalidTest(){
        var user = User("abc@gmail.com","","Polo", 25)
        assertEquals(false, user.isNomValid())
    }

    @Test
    fun isPrenomInvalidTest(){
        var user = User("abc@gmail.com","Marco", "",25)
        assertEquals(false, user.isPrenomValid())
    }

    @Test
    fun isAgeInvalidTest(){
        var user = User("abc@gmail.com","Marco","Polo", 10)
        assertEquals(false, user.isAgeValid())
    }
}

