package kolib.event.listener

import kolib.event.PersistEvent
import kolib.exception.KolibException
import java.io.Serializable

interface PersistEventListener : Serializable {

    @Throws(KolibException::class)
    fun onPersist(event: PersistEvent?)
}
