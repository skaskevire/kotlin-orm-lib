package kolib.entity

import kolib.entity.management.KolibEntityManager
import java.io.Serializable

interface IdentifierGenerator {
    fun generate( kolibEntityManager: KolibEntityManager, obj: Any): Serializable?
}