package kolib.entity

import kolib.entity.management.context.PersistenceContext
import java.util.*

class EntityEntryContext(val persistenceContext: PersistenceContext) {
    var head: ManagedEntity? = null
    var tail: ManagedEntity? = null
    var nonEnhancedEntityXRef: IdentityHashMap<Any, ManagedEntity> = IdentityHashMap()

    fun addEntityEntry(entity: Any, entityEntry: EntityEntry) {
        var managedEntity: ManagedEntity? = nonEnhancedEntityXRef[entity]
        val alreadyAssociated = managedEntity != null
        if(managedEntity == null) {
            managedEntity = ManagedEntityImpl(entity)
            nonEnhancedEntityXRef[entity] = managedEntity
        }
        if (alreadyAssociated) {
            return
        }
    }

    fun getEntityEntry( entity: Any): EntityEntry? {
        return nonEnhancedEntityXRef[entity]?.getEntityEntry()
    }
}