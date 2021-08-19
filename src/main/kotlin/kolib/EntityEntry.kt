package kolib

interface EntityEntry {
    fun getStatus(): Status
    fun setStatus(status: Status)
}