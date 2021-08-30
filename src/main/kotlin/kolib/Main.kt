package kolib

import kolib.entity.management.KolibEntityManagerFactory
import kolib.entity.management.KolibEntityManagerImpl

fun main(args : Array<String>) {
    val emf = KolibEntityManagerFactory()
    emf.createEntityManager();
    val entityManager = KolibEntityManagerImpl()
    val movie = Movie()
    entityManager.persist(movie)
    entityManager.printAllEntities()
}