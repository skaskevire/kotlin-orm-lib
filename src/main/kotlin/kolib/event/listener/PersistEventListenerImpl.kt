package kolib.event.listener

import kolib.entity.EntityEntry
import kolib.entity.EntityKey
import kolib.entity.EntityState
import kolib.entity.Status
import kolib.entity.management.KolibEntityManager
import kolib.event.PersistEvent
import kolib.exception.KolibException

class PersistEventListenerImpl : PersistEventListener {
    override fun onPersist(event: PersistEvent?) {
        event ?: throw KolibException("Persist Event empty")
        val entityManager: KolibEntityManager? = event.getEntityManager() as KolibEntityManager?
        val entityEntry: EntityEntry? = entityManager?.getPersistenceContext()?.getEntry(event.obj)
        val entityState = resolveEntityState(event.obj, entityEntry)
        when(entityState) {
            EntityState.TRANSIENT -> entityIsTransient(event)
            EntityState.PERSISTENT -> entityIsPersistent()
            EntityState.DELETED -> entityIsDeleted()
            else -> {
                throw KolibException("Unexpected entity state provied")
            }
        }
    }

    private fun entityIsTransient(event: PersistEvent) {
        val entityManager = event.getEntityManager() as KolibEntityManager
        val entityPersister = entityManager.getEntityPersister(null, event.obj)
        val id = entityPersister.getIdentifierGenerator().generate(entityManager, event.obj) ?: throw KolibException("id was not generated")


    }

    private fun entityIsPersistent() {

    }

    private fun entityIsDeleted() {

    }

    private fun resolveEntityState(obj: Any?, entry: EntityEntry?): EntityState {
        if(entry != null)  {
            if (entry.getStatus() != Status.DELETED) {
                return EntityState.PERSISTENT
            }

            return EntityState.DELETED
        }

       return EntityState.TRANSIENT
        // TODO: Detached state
    }
}