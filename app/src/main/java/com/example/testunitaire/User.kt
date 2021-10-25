package com.example.testunitaire

import java.util.regex.Pattern

class User(val email: String, val nom: String, val prenom: String?, val age: Int) {

    fun isNomValid(): Boolean{
        return this.nom != ""
    }

    fun isPrenomValid(): Boolean{
        return this.prenom != ""
    }

    fun isEmailValid(): Boolean {
        return Pattern.compile(
            "^(.+)@(.+)\$"
        ).matcher(this.email).matches()
    }

    fun isAgeValid(): Boolean{
        return this.age > 13
    }

}