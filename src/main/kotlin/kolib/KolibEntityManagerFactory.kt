package kolib

import javax.persistence.*
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.metamodel.Metamodel

class KolibEntityManagerFactory: EntityManagerFactory {
    override fun getCriteriaBuilder(): CriteriaBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMetamodel(): Metamodel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProperties(): MutableMap<String, Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createEntityManager(): EntityManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createEntityManager(p0: MutableMap<Any?, Any?>?): EntityManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createEntityManager(p0: SynchronizationType?): EntityManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createEntityManager(p0: SynchronizationType?, p1: MutableMap<Any?, Any?>?): EntityManager {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addNamedQuery(p0: String?, p1: Query?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isOpen(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCache(): Cache {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> addNamedEntityGraph(p0: String?, p1: EntityGraph<T>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPersistenceUnitUtil(): PersistenceUnitUtil {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}