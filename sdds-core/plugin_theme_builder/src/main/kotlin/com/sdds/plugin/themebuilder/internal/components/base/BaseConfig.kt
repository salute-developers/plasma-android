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

@Serializable
internal data class Shape(
    val value: String,
    val adjustment: Float? = null,
)

@Serializable
internal data class Typography(
    val value: String,
)

@Serializable
internal data class ComponentStyle<PO : PropertyOwner>(
    val value: String,
    val props: PO? = null,
)

@Serializable
internal data class Dimension(
    val value: Float,
)

@Serializable
internal data class FloatValue(
    val value: Float,
)

@Serializable
internal data class Value(
    val value: String,
)

@Serializable
internal sealed interface Color {
    val default: String
    val alpha: Float?
    val states: List<ColorState>?

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

internal fun Color.combine(other: Color?, withState: String): Color {
    if (other == null) {
        return this
    }
    return this.copy(
        states = mutableListOf<ColorState>().apply {
            addAll(
                other.states?.map {
                    val stateList = mutableListOf<String>().apply {
                        addAll(it.state)
                        add(withState)
                    }
                    it.copy(state = stateList)
                }?.toList().orEmpty(),
            )
            add(ColorState(listOf(withState), other.default, other.alpha))
            states?.let(::addAll)
        },
    )
}

@Serializable
internal data class ColorState(
    val state: List<String>,
    val value: String,
    val alpha: Float? = null,
)

@Serializable
internal data class Icon(
    val value: String,
)
