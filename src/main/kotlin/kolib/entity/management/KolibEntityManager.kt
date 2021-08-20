package kolib.entity.management

import kolib.entity.management.context.PersistenceContext
import kolib.entity.EntityPersister
import javax.persistence.EntityManager

interface KolibEntityManager: EntityManager {
    fun checkOpen(): Boolean
    fun getPersistenceContext(): PersistenceContext
    fun getEntityPersister( entityName: String, obj: Any): EntityPersister
}