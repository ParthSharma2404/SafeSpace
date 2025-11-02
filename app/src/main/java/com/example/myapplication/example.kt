package com.example.myapplication

class Example {
    fun call(){
        val i= sum()
        println("the return value is " + i)
        println("The return value is $i")
    }

    fun sum():Int{
        return 10 + 10
    }
}