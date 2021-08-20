package kolib.event

import javax.persistence.EntityManager

class PersistEvent(entityManager: EntityManager, val obj: Any, val entityName: String?) : Event(entityManager) {
}