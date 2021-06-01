import kotlin.test.Test
import kotlin.test.assertEquals

internal class WidgetTest {

    @Test
    fun testValuesSavedOnConstructInButtonWidget() {
        val size = Size(100, 10)
        val buttonWidget = ButtonWidget(size, "Click Me!")

        assertEquals(size, buttonWidget.getSize())
        assertEquals("Click Me!", buttonWidget.getMessage())
    }

    @Test
    fun testOnClickButtonWidget() {
        val buttonWidget = ButtonWidget(Size(100, 10), "Click Me!")

        assertEquals("CLICK ME!", buttonWidget.onClick({it.toUpperCase()}))
    }

    @Test
    fun testValuesSavedOnConstructInImageWidget() {
        val size = Size(100, 10)
        val imageWidget = ImageWidget(size)

        assertEquals(size, imageWidget.getSize())
    }

    @Test
    fun testSize() {
        val size = Size(100, 10)

        assertEquals(100, size.width)
        assertEquals(10, size.height)
    }
}
