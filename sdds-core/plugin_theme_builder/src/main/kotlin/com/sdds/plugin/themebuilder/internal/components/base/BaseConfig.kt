package com.sdds.plugin.themebuilder.internal.components.base

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Интерфейс сущности со свойствами компонента
 * @author Малышев Александр on 09.12.2024
 */
internal interface PropertyOwner {

    /**
     * Совмещает свойства текущего объекта со свойствами [parent] и возвращает
     * новый [PropertyOwner]
     */
    fun merge(parent: PropertyOwner): PropertyOwner
}

/**
 * Вариации представлений компонента
 */
internal interface ViewVariation<PO : PropertyOwner> {

    /**
     * Свойства вариации
     */
    val props: PO

    /**
     * Совмещает свойства текущего объекта со свойствами [parent] и возвращает
     * новый [ViewVariation]
     */
    fun merge(parent: ViewVariation<PO>): ViewVariation<PO> = this
}

/**
 * Интерфейс базовой вариации компонента
 * @see ViewVariation
 */
internal interface BaseVariation<PO : PropertyOwner> : ViewVariation<PO> {

    /**
     * Вариации представления компонента
     */
    val view: Map<String, ViewVariation<PO>>
}

/**
 * Интерфейс дочерней вариации. Может иметь родителя.
 */
internal interface ChildVariation<PO : PropertyOwner> : BaseVariation<PO> {
    val id: String
    val parent: String?
}

/**
 * Конфигурация компонента
 */
internal interface Config<PO : PropertyOwner> : BaseVariation<PO>, ComponentConfig {

    val variations: List<ChildVariation<PO>>
}

internal sealed interface State<T> {
    val state: List<String>
    val value: T

    fun clone(
        value: T = this.value,
        state: List<String> = this.state,
    ): State<T>
}

@Serializable
internal class StringState(
    override val state: List<String>,
    override val value: String,
) : State<String> {
    override fun clone(value: String, state: List<String>): State<String> {
        return StringState(state, value)
    }
}

@Serializable
internal class FloatState(
    override val state: List<String>,
    override val value: Float,
) : State<Float> {
    override fun clone(value: Float, state: List<String>): State<Float> {
        return FloatState(state, value)
    }
}

@Serializable
internal data class ColorState(
    override val state: List<String>,
    override val value: String,
    val alpha: Float? = null,
) : State<String> {
    override fun clone(value: String, state: List<String>): State<String> {
        return copy(state = state, value = value, alpha = alpha)
    }
}

internal sealed interface Stateful<T, S : State<T>> {
    val value: T
    val states: List<S>?

    fun clone(
        value: T = this.value,
        states: List<S>? = this.states,
    ): Stateful<T, S>
}

@Serializable
internal data class Shape(
    override val value: String,
    val adjustment: Float? = null,
    override val states: List<StringState>? = null,
) : Stateful<String, StringState> {

    override fun clone(value: String, states: List<StringState>?): Stateful<String, StringState> {
        return this.copy(value = value, adjustment = adjustment, states = states)
    }
}

@Serializable
internal data class Typography(
    override val value: String,
    override val states: List<StringState>? = null,
) : Stateful<String, StringState> {

    override fun clone(value: String, states: List<StringState>?): Stateful<String, StringState> {
        return copy(value = value, states = states)
    }
}

@Serializable
internal data class ComponentStyle<PO : PropertyOwner>(
    override val value: String,
    val props: PO? = null,
    override val states: List<StringState>? = null,
) : Stateful<String, StringState> {
    override fun clone(value: String, states: List<StringState>?): Stateful<String, StringState> {
        return copy(value = value, props = props, states = states)
    }
}

@Serializable
internal data class Dimension(
    override val value: Float,
    override val states: List<FloatState>? = null,
) : Stateful<Float, FloatState> {

    override fun clone(value: Float, states: List<FloatState>?): Dimension {
        return copy(value = value, states = states)
    }
}

@Serializable
internal data class FloatValue(
    override val value: Float,
    override val states: List<FloatState>? = null,
) : Stateful<Float, FloatState> {

    override fun clone(value: Float, states: List<FloatState>?): FloatValue {
        return copy(value = value, states = states)
    }
}

@Serializable
internal data class Value(
    override val value: String,
    override val states: List<StringState>? = null,
) : Stateful<String, StringState> {

    override fun clone(value: String, states: List<StringState>?): Value {
        return copy(value = value, states = states)
    }
}

@Serializable
internal sealed interface Color : Stateful<String, ColorState> {
    val default: String
    val alpha: Float?

    override val value: String get() = default

    fun copy(
        default: String = this.default,
        alpha: Float? = this.alpha,
        states: List<ColorState>? = this.states,
    ): Color
}

@Serializable
@SerialName("color")
internal class SolidColor(
    override val default: String,
    override val alpha: Float? = null,
    override val states: List<ColorState>? = null,
) : Color {
    override fun copy(default: String, alpha: Float?, states: List<ColorState>?): Color {
        return SolidColor(default, alpha, states)
    }

    override fun clone(value: String, states: List<ColorState>?): Color {
        return copy(default, alpha, states)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SolidColor

        if (default != other.default) return false
        if (alpha != other.alpha) return false
        if (states != other.states) return false

        return true
    }

    override fun hashCode(): Int {
        var result = default.hashCode()
        result = 31 * result + (alpha?.hashCode() ?: 0)
        result = 31 * result + (states?.hashCode() ?: 0)
        return result
    }
}

@Serializable
@SerialName("gradient")
internal class Gradient(
    override val default: String,
    override val alpha: Float? = null,
    override val states: List<ColorState>? = null,
) : Color {
    override fun copy(default: String, alpha: Float?, states: List<ColorState>?): Color {
        return Gradient(default, alpha, states)
    }

    override fun clone(value: String, states: List<ColorState>?): Color {
        return copy(default, alpha, states)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Gradient

        if (default != other.default) return false
        if (alpha != other.alpha) return false
        if (states != other.states) return false

        return true
    }

    override fun hashCode(): Int {
        var result = default.hashCode()
        result = 31 * result + (alpha?.hashCode() ?: 0)
        result = 31 * result + (states?.hashCode() ?: 0)
        return result
    }
}

internal fun Color.combine(other: Color, withState: String): Color {
    return this.combine(other, withState) {
        ColorState(listOf(withState), other.value, other.alpha)
    }
}

internal fun Dimension.combine(other: Dimension, withState: String): Dimension {
    return this.combine(other, withState) {
        FloatState(listOf(withState), other.value)
    }
}

internal fun FloatValue.combine(other: FloatValue, withState: String): FloatValue {
    return this.combine(other, withState) {
        FloatState(listOf(withState), other.value)
    }
}

@Suppress("UNCHECKED_CAST")
private fun <T, S : State<T>, V : Stateful<T, S>> V.combine(
    other: V?,
    withState: String,
    stateFactory: () -> S,
): V {
    if (other == null) {
        return this
    }
    return this.clone(
        states = mutableListOf<S>().apply {
            addAll(
                other.states?.map {
                    val stateList = mutableListOf<String>().apply {
                        addAll(it.state)
                        add(withState)
                    }
                    it.clone(state = stateList) as S
                }?.toList().orEmpty(),
            )
            add(stateFactory())
            states?.let(::addAll)
        },
    ) as V
}

@Serializable
internal data class Icon(
    val value: String,
)
