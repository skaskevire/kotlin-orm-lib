package kolib

import javax.persistence.EntityManager

interface KolibEntityManager: EntityManager {
    fun checkOpen(): Boolean
}