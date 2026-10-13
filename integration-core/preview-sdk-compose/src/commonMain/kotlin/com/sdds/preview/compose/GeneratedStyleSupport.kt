package com.sdds.preview.compose

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.Style
import com.sdds.preview.contract.PreviewComponent
import com.sdds.preview.contract.PreviewPayload
import com.sdds.preview.contract.PreviewPropertySource
import com.sdds.preview.contract.PreviewPropertyValue
import com.sdds.preview.contract.PreviewStyle
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.booleanOrNull
import kotlinx.serialization.json.doubleOrNull
import kotlinx.serialization.json.floatOrNull
import kotlinx.serialization.json.intOrNull

/**
 * Сопоставление имён состояний payload с [ValueState]: интерактивные состояния UIKit (имена точные) и кастомные
 * состояния компонента (имя из конфигурации без учёта регистра, как в Theme Builder).
 */
public class PreviewStateMap(custom: Map<String, ValueState> = emptyMap()) {
    private val custom: Map<String, ValueState> = custom.mapKeys { it.key.lowercase() }

    /** Возвращает набор состояний UIKit либо `null`, если хотя бы одно имя неизвестно. */
    public fun resolve(names: Set<String>): Set<ValueState>? {
        val result = mutableSetOf<ValueState>()
        for (name in names) {
            result += interactive[name] ?: custom[name.lowercase()] ?: return null
        }
        return result
    }

    /** Известно ли имя состояния: интерактивные имена точные, кастомные без учёта регистра. */
    public fun knows(name: String): Boolean = name in interactive || name.lowercase() in custom

    private companion object {
        val interactive: Map<String, ValueState> = mapOf(
            "pressed" to InteractiveState.Pressed,
            "hovered" to InteractiveState.Hovered,
            "focused" to InteractiveState.Focused,
            "activated" to InteractiveState.Activated,
            "selected" to InteractiveState.Selected,
        )
    }
}

/**
 * Собирает [StatefulValue]. UIKit при равном числе состояний выбирает первую подходящую запись, а протокол
 * последнюю, поэтому порядок записей разворачивается; записи с неизвестными состояниями пропускаются.
 */
public fun <R : Any> ResolvedProperty<R>.toStateful(states: PreviewStateMap): StatefulValue<R> {
    val entries = this.states.reversed().mapNotNull { state ->
        states.resolve(state.names)?.let { it to state.value }
    }
    return StatefulValue.from(entries.map { it.first }, entries.map { it.second }, base)
}

/** Собирает [InteractiveColor] с тем же порядком записей, что и [toStateful]. */
@Suppress("SpreadOperator")
public fun ResolvedProperty<Color>.toInteractiveColor(states: PreviewStateMap): InteractiveColor {
    val entries = this.states.reversed().mapNotNull { state ->
        states.resolve(state.names)?.let { it to state.value }
    }
    return base.asInteractive(*entries.toTypedArray())
}

/** Значение в dp с состояниями. */
public fun PreviewPropertyValue.dpValue(theme: PreparedComposeTheme): ResolvedProperty<Dp>? =
    resolveStates({ (it as? JsonPrimitive)?.doubleOrNull?.toFloat()?.let(::Dp) }, theme::dimension)

/** Стиль текста с состояниями. */
public fun PreviewPropertyValue.typographyValue(theme: PreparedComposeTheme): ResolvedProperty<TextStyle>? =
    resolveStates({ null }, theme::typography)

/** Форма с состояниями. */
public fun PreviewPropertyValue.shapeValue(theme: PreparedComposeTheme): ResolvedProperty<RoundedCornerShape>? =
    resolveStates({ null }, theme::shape)

/** Цвет с состояниями; прозрачность источника уже наложена. */
public fun PreviewPropertyValue.colorValue(theme: PreparedComposeTheme): ResolvedProperty<Color>? =
    resolveStates(
        literal = { (it as? JsonPrimitive)?.content?.toComposeColorOrNull() },
        token = theme::color,
        applyAlpha = Color::withAlphaFactor,
    )

/** Кисть с состояниями: градиентный токен либо сплошной цвет. */
public fun PreviewPropertyValue.brushValue(theme: PreparedComposeTheme): ResolvedProperty<Brush>? =
    resolveStates<Brush>(
        literal = { element -> (element as? JsonPrimitive)?.content?.toComposeColorOrNull()?.let(::SolidColor) },
        token = { id -> theme.gradient(id) ?: theme.color(id)?.let(::SolidColor) },
        applyAlpha = { brush, alpha ->
            if (brush is SolidColor) SolidColor(brush.value.withAlphaFactor(alpha)) else brush
        },
    )

/** `true`, если база или любое состояние ссылаются на градиентный токен (тогда нужна перегрузка с `Brush`). */
public fun PreviewPropertyValue.hasGradient(theme: PreparedComposeTheme): Boolean =
    sources().any { it is PreviewPropertySource.TokenReference && theme.gradient(it.tokenId) != null }

/** Базовое literal-значение с плавающей точкой. */
public fun PreviewPropertyValue.floatValue(): Float? = (literalPrimitive())?.floatOrNull

/** Базовое literal-значение целого типа. */
public fun PreviewPropertyValue.intValue(): Int? = (literalPrimitive())?.intOrNull

/** Базовое literal-значение логического типа. */
public fun PreviewPropertyValue.booleanValue(): Boolean? = (literalPrimitive())?.booleanOrNull

/** Базовое literal-значение строкой (имя константы enum). */
public fun PreviewPropertyValue.stringValue(): String? = literalPrimitive()?.content

private fun PreviewPropertyValue.literalPrimitive(): JsonPrimitive? =
    ((base as? PreviewPropertySource.Literal)?.value as? JsonPrimitive)

/** Вложенные стили payload и фабрики для их построения. */
public class PreviewStyleContext(
    /** Вложенные стили по идентификаторам. */ public val styles: Map<String, PreviewStyle>,
    /** Фабрики по `componentId` компонента, которому принадлежит стиль. */
    public val factories: Map<String, GeneratedStyleFactory<*>>,
) {
    public companion object {
        /** Контекст без вложенных стилей. */
        public val EMPTY: PreviewStyleContext = PreviewStyleContext(emptyMap(), emptyMap())
    }
}

/** Сгенерированная фабрика стиля, умеющая строить стиль из свойств (и вложенных стилей). */
public interface GeneratedStyleFactory<S : Style> : ComposePreviewStyleFactory<S> {
    /** Идентификатор компонента меты. */
    public val componentName: String

    /** Сопоставление имён состояний (интерактивные и кастомные состояния компонента). */
    public val states: PreviewStateMap

    override fun supportsState(name: String): Boolean = states.knows(name)

    /** Идентификаторы свойств, которые фабрика пропускает (иконки и тени): для предупреждения `unsupported_property`. */
    public val unsupportedProperties: Set<String>
        get() = emptySet()

    /** Строит стиль из [properties]; вложенные стили берутся из [context]. */
    @Composable
    public fun build(
        properties: Map<String, PreviewPropertyValue>,
        theme: PreparedComposeTheme,
        context: PreviewStyleContext,
    ): S

    @Composable
    override fun create(component: PreviewComponent, theme: PreparedComposeTheme): S =
        build(component.properties, theme, PreviewStyleContext.EMPTY)
}

/** Строит вложенный стиль по `styleRef`; `null`, если ссылки нет, стиль неизвестен или тип не совпал. */
@Composable
public inline fun <reified S : Style> PreviewPropertyValue.nestedStyle(
    theme: PreparedComposeTheme,
    context: PreviewStyleContext,
): S? {
    val style = (base as? PreviewPropertySource.StyleReference)?.let { context.styles[it.styleId] }
    val factory = style?.let { context.factories[it.component] }
    return if (style != null && factory != null) factory.build(style.properties, theme, context) as? S else null
}

/** Создаёт [PreviewStyleContext] для payload из реестра фабрик. */
public fun PreviewPayload.styleContext(factories: Map<String, GeneratedStyleFactory<*>>): PreviewStyleContext =
    PreviewStyleContext(styles, factories)
