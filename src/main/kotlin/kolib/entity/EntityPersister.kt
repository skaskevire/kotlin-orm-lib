package kolib.entity

import kolib.entity.management.KolibEntityManagerFactory

interface EntityPersister {
    fun getRootEntityName(): String
    fun getIdentifierType(): Type
    fun getIdentifierGenerator(): IdentifierGenerator
    fun getFactory(): KolibEntityManagerFactory
    fun getEntityEntryFactory(): EntityEntryFactory
}