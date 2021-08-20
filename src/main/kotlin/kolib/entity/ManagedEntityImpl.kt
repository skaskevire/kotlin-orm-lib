package kolib.entity

class ManagedEntityImpl(private val entity: Any) : ManagedEntity {
    private var entityEntry: EntityEntry? = null
    private var previous: ManagedEntity? = null
    private var next: ManagedEntity? = null
    override fun getEntityInstance(): Any {
        return entity
    }

    override fun getEntityEntry(): EntityEntry? {
        return entityEntry
    }

    override fun setEntityEntry(entityEntry: EntityEntry?) {
        this.entityEntry = entityEntry
    }

    override fun getPreviousManagedEntity(): ManagedEntity? {
        return previous
    }

    override fun setPreviousManagedEntity(previous: ManagedEntity?) {
        this.previous = previous
    }

    override fun getNextManagedEntity(): ManagedEntity? {
        return next
    }

    override fun setNextManagedEntity(next: ManagedEntity?) {
        this.next = next
    }
}