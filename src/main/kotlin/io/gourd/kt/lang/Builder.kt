package io.gourd.kt.lang


/**
 * 构造模式
 * @author Li.Wei by 2023/6/2
 */

// 类型安全的构造器
class Car(
    val model: String?,
    val year: Int
) {
    companion object {
        /**
         * 带接收者的函数类型,这意味着我们需要向函数传递一个Builder类型的实例
         */
        inline fun build(block: Builder.() -> Unit) = Builder().apply(block).build()
    }

    class Builder {
        var model: String? = null
        var year: Int = -1

        fun build() = Car(model, year)
    }
}

val car = Car.build {
    model = "名字"
    year = 2017
}

// 通用多样化控件的构建

class Dialog private constructor(
    val title: String,
    val text: String?,
    val onAccept: (() -> Unit)?
) {
    class Builder(private val title: String) {
        private var text: String? = null
        private var onAccept: (() -> Unit)? = null
        fun setText(text: String?): Builder {
            this.text = text
            return this
        }

        fun setOnAccept(onAccept: (() -> Unit)?): Builder {
            this.onAccept = onAccept
            return this
        }

        fun build() = Dialog(title, text, onAccept)
    }
}

val dialog1 = Dialog.Builder("Some title")
    .setText("Great dialog")
    .setOnAccept { println("tag I was clicked") }
    .build()
val dialog2 = Dialog.Builder("Another dialog")
    .setText("I have no buttons")
    .build()
val dialog3 = Dialog.Builder("Dialog with just a title").build()
