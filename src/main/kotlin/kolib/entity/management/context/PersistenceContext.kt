package kolib.entity.management.context

import kolib.entity.EntityEntry
import kolib.entity.EntityKey
import kolib.entity.EntityPersister

interface PersistenceContext {
    fun addEntity(key: EntityKey, entity: Any)
    fun getEntity(key: EntityKey): Any?
    fun containsEntity(key: EntityKey): Boolean
    fun removeEntity(key: EntityKey): Any?
    fun clear()
    fun getEntry(entity: Any): EntityEntry?
    fun addEntry(key: EntityKey, entity: Any, entityPersister: EntityPersister)
}