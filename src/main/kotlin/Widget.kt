abstract class Widget(private val size: Size) {
    fun getSize() = size
}

data class Size(val width: Int, val height: Int)

class ImageWidget(size: Size) : Widget(size)

class ButtonWidget(size: Size, private val message: String) : Widget(size), OnClickInterface{
    override fun onClick(lambda: (msg: String) -> String): String = lambda(getMessage())
    fun getMessage() = message
}

interface OnClickInterface {
    fun onClick(lambda: (m: String) -> String): String
}