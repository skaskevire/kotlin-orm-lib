package kolib.entity

import kolib.entity.management.KolibEntityManagerFactory

interface EntityPersister {
    fun getRootEntityName(): String
    fun getIdentifierType(): Type
    fun getFactory(): KolibEntityManagerFactory
    fun getEntityEntryFactory(): EntityEntryFactory
}