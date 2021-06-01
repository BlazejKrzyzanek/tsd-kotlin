import kotlin.test.Test
import kotlin.test.assertEquals

internal class PersonTest {

    @Test
    fun testGetPerson() {
        val person = Person("John", "Doe", 21)
        assertEquals("John Doe, age 21", person.getPerson())
    }
}
