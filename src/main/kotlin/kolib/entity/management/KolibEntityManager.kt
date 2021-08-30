package kolib.entity.management

import kolib.entity.EntityKey
import kolib.entity.EntityPersister
import kolib.entity.management.context.PersistenceContext
import java.io.Serializable
import javax.persistence.EntityManager

interface  KolibEntityManager: EntityManager {
    fun checkOpen(): Boolean
    fun getPersistenceContext(): PersistenceContext
    fun getEntityPersister( entityName: String?, obj: Any): EntityPersister
    fun generateEntityKey(id: Serializable?, persister: EntityPersister?): EntityKey
}