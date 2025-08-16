package org.example.tasks.task_5_4_ClickListener
interface ClickListener {
    fun onClick(elementId: String): String
}

class ClickProcessor {
    private val clickListeners = mutableMapOf<String, ClickListener>()

    fun registerClickListener(elementId: String, listener: ClickListener) {
        clickListeners[elementId] = listener
    }

    fun processClick(elementId: String): String {
        val listener = clickListeners[elementId]
        return listener?.onClick(elementId) ?: "No listener registered for $elementId"
    }
}

// Реализуйте метод setupClickListeners
fun setupClickListeners(clickProcessor: ClickProcessor) {
    // TODO: Зарегистрируйте слушателей для "button1", "button2" и "button3" с помощью анонимных классов.
    clickProcessor.registerClickListener("button1", object :ClickListener{
        override fun onClick(elementId: String): String {
            return "Button 1 clicked!"
        }
    })
    clickProcessor.registerClickListener("button2", object :ClickListener{
        override fun onClick(elementId: String): String {
            return "Button 2 clicked!"
        }
    })
    clickProcessor.registerClickListener("button3", object :ClickListener{
        override fun onClick(elementId: String): String {
            return "Button 3 clicked!"
        }
    })
    clickProcessor.processClick("button1")

}
fun main() {
    setupClickListeners(ClickProcessor())
}