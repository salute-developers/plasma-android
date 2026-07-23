package com.sdds.compose.uikit.style

import androidx.compose.runtime.Composable

/**
 * Интерфейс-маркер стиля компонента
 * @author Малышев Александр on 22.10.2024
 */
interface Style

/**
 * Builder стиля компонента
 */
interface StyleBuilder<T : Style> {

    /**
     * Объект, позволяющий идентифицировать получателя стиля
     */
    val receiver: Any?
        get() = null

    /**
     * Возвращает экземпляр [Style]
     */
    fun style(): T
}

/**
 * Применяет [block] кода к [StyleBuilder], если [StyleBuilder.receiver] и [receiver] идентичные объекты
 */
@Composable
fun <T : Style, B : StyleBuilder<T>> B.applyFor(receiver: Any, block: @Composable B.() -> Unit): B =
    if (this.receiver == receiver) apply { block() } else this

/**
 * Применяет [block] кода к [StyleBuilder], если [StyleBuilder.receiver] и [receiver] неидентичные объекты
 */
@Composable
fun <T : Style, B : StyleBuilder<T>> B.applyExclude(receiver: Any, block: @Composable B.() -> Unit): B =
    if (this.receiver != receiver) apply { block() } else this

/**
 * Базовый интерфейс врапперов
 */
interface BuilderWrapper<S : Style, Sb : StyleBuilder<S>> {

    /**
     * Ссылка на билдер стиля [S]
     */
    val builder: Sb
}

/**
 * Оборачивает враппер другим враппером, применяя [block] к [builder]
 */
fun <S : Style, Sb : StyleBuilder<S>> BuilderWrapper<S, Sb>.wrap(
    block: (Sb) -> BuilderWrapper<S, Sb>,
): BuilderWrapper<S, Sb> {
    return block(builder)
}

/**
 * Сконструирует и вернет стиль [S]
 */
fun <S : Style, Sb : StyleBuilder<S>> BuilderWrapper<S, Sb>.style(): S =
    builder.style()

/**
 * Применяет [block] к [builder]
 */
@Composable
fun <S : Style, Sb : StyleBuilder<S>> BuilderWrapper<S, Sb>.modify(
    block: @Composable Sb.() -> Unit,
): BuilderWrapper<S, Sb> {
    builder.block()
    return this
}

/**
 * Оборачивает враппер другим враппером, применяя [block] к билдеру
 */
fun <S : Style, Sb : StyleBuilder<S>, W : BuilderWrapper<S, Sb>> Sb.wrap(block: (Sb) -> W): W {
    return block(this)
}
