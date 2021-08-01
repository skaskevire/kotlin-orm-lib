package main.kotlin.kolib

import kolib.AnotherTest
import kolib.KolibEntityManagerImpl
import kolib.Test

val KotlinHelloString : String = "Hello from Kotlin!"

fun main(args : Array<String>) {

    val list = listOf(Test::class.java, AnotherTest::class.java)
    var entityManager = KolibEntityManagerImpl(list)
    entityManager.printAllEntities()
}