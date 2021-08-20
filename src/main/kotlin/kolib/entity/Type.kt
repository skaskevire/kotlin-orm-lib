package kolib.entity

import kolib.entity.management.KolibEntityManagerFactory


interface Type {
    fun getHashCode( x: Any, factory: KolibEntityManagerFactory): Int
}