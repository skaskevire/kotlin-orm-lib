package kolib

interface ManagedEntity {
    fun getEntityInstance(): Any?
    fun getEntityEntry(): EntityEntry?
    fun setEntityEntry(entityEntry: EntityEntry?)
    fun getPreviousManagedEntity(): ManagedEntity?
    fun setPreviousManagedEntity(previous: ManagedEntity?)
    fun getNextManagedEntity(): ManagedEntity?
    fun setNextManagedEntity(next: ManagedEntity?)
}