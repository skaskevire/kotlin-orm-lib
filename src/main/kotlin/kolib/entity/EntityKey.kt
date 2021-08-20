package kolib.entity

import java.io.Serializable

class EntityKey(private val identifier: Serializable, private val persister: EntityPersister) {
    private val hashCode: Int

    init {
        hashCode = generateHashCode()
    }

    private fun generateHashCode(): Int {
        var result = 17
        val rootEntityName: String = persister.getRootEntityName()
        result = 37 * result + (rootEntityName?.hashCode() ?: 0)
        result = 37 * result + persister.getIdentifierType().getHashCode(identifier, persister.getFactory())
        return result
    }

}