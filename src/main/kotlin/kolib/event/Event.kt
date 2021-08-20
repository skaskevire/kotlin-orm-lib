package kolib.event

import javax.persistence.EntityManager

open class Event(private val entityManager: EntityManager) {
    fun getEntityManager(): EntityManager {
        return entityManager
    }
}