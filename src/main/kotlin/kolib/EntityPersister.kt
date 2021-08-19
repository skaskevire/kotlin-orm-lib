package kolib

interface EntityPersister {
    fun getRootEntityName(): String
    fun getIdentifierType(): Type
    fun getFactory(): KolibEntityManagerFactory
    fun getEntityEntryFactory(): EntityEntryFactory
}