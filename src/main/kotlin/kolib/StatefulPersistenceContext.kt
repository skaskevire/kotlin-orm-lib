package kolib


class StatefulPersistenceContext : PersistenceContext {
    val entityByKey: MutableMap<EntityKey, Any> = HashMap()
    var entityEntryContext: EntityEntryContext? = null
    override fun addEntity(key: EntityKey, entity: Any) {
        entityByKey.put(key, entity)
    }

    override fun getEntity(key: EntityKey): Any? {
       return entityByKey[key]
    }

    override fun containsEntity(key: EntityKey): Boolean {
        return entityByKey.containsKey(key)
    }

    override fun removeEntity(key: EntityKey): Any? {
        return entityByKey.remove(key)
    }

    override fun clear() {
        entityByKey.clear()
    }

    override fun getEntry(entity: Any): EntityEntry? {
        return entityEntryContext?.getEntityEntry(entity)
    }

    override fun addEntry(key: EntityKey, entity: Any, entityPersister: EntityPersister) {
        addEntity(key, entity)
        val entityEntry: EntityEntry = entityPersister.getEntityEntryFactory().createEntityEntry()
        entityEntryContext?.addEntityEntry(entity, entityEntry)
    }
}