package main.kotlin.kolib

import kolib.*

val KotlinHelloString : String = "Hello from Kotlin!"

fun main(args : Array<String>) {
    val emf : KolibEntityManagerFactory = KolibEntityManagerFactory()
    //val list = listOf(Test::class.java, AnotherTest::class.java)
    emf.createEntityManager();
    var entityManager = KolibEntityManagerImpl()
    val movie: Movie = Movie()
    entityManager.persist(movie)
    entityManager.printAllEntities()
}