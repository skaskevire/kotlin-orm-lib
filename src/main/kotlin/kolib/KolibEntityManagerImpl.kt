package kolib

import java.lang.IllegalStateException
import javax.persistence.*
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaDelete
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.CriteriaUpdate
import javax.persistence.metamodel.Metamodel

class KolibEntityManagerImpl(
    private val entities: List<Class<out Any>>,
    private val entityManagerFactory: KolibEntityManagerFactory
) : KolibEntityManager {
    private var closed: Boolean = false

    constructor() : this(ArrayList<Class<out Any>>(), KolibEntityManagerFactory())

    fun printAllEntities() {
        entities.forEach { print(it) }
    }

    override fun checkOpen(): Boolean = !closed

    override fun contains(p0: Any?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clear() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createNativeQuery(p0: String?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createNativeQuery(p0: String?, p1: Class<*>?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createNativeQuery(p0: String?, p1: String?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getReference(p0: Class<T>?, p1: Any?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun persist(p0: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun flush() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> merge(p0: T): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createNamedQuery(p0: String?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> createNamedQuery(p0: String?, p1: Class<T>?): TypedQuery<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createNamedStoredProcedureQuery(p0: String?): StoredProcedureQuery {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getProperties(): MutableMap<String, Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lock(p0: Any?, p1: LockModeType?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun lock(p0: Any?, p1: LockModeType?, p2: MutableMap<String, Any>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun detach(p0: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isOpen(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isJoinedToTransaction(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refresh(p0: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refresh(p0: Any?, p1: MutableMap<String, Any>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refresh(p0: Any?, p1: LockModeType?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun refresh(p0: Any?, p1: LockModeType?, p2: MutableMap<String, Any>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFlushMode(p0: FlushModeType?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEntityManagerFactory(): EntityManagerFactory {
        return if (checkOpen()) entityManagerFactory else throw IllegalStateException("Session/EntityManager is closed")
    }

    override fun getLockMode(p0: Any?): LockModeType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setProperty(p0: String?, p1: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCriteriaBuilder(): CriteriaBuilder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMetamodel(): Metamodel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> getEntityGraphs(p0: Class<T>?): MutableList<EntityGraph<in T>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(p0: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> find(p0: Class<T>?, p1: Any?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> find(p0: Class<T>?, p1: Any?, p2: MutableMap<String, Any>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> find(p0: Class<T>?, p1: Any?, p2: LockModeType?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> find(p0: Class<T>?, p1: Any?, p2: LockModeType?, p3: MutableMap<String, Any>?): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFlushMode(): FlushModeType {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createStoredProcedureQuery(p0: String?): StoredProcedureQuery {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createStoredProcedureQuery(p0: String?, vararg p1: Class<*>?): StoredProcedureQuery {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createStoredProcedureQuery(p0: String?, vararg p1: String?): StoredProcedureQuery {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTransaction(): EntityTransaction {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> createEntityGraph(p0: Class<T>?): EntityGraph<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createEntityGraph(p0: String?): EntityGraph<*> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDelegate(): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getEntityGraph(p0: String?): EntityGraph<*> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createQuery(p0: String?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> createQuery(p0: CriteriaQuery<T>?): TypedQuery<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createQuery(p0: CriteriaUpdate<*>?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createQuery(p0: CriteriaDelete<*>?): Query {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <T : Any?> createQuery(p0: String?, p1: Class<T>?): TypedQuery<T> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun joinTransaction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}