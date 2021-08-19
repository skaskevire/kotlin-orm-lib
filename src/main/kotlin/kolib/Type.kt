package kolib



interface Type {
    fun getHashCode( x: Any, factory: KolibEntityManagerFactory): Int
}