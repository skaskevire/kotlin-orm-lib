package kolib.entity

interface EntityEntry {
    fun getStatus(): Status
    fun setStatus(status: Status)
}