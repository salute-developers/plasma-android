package com.sdds.compose.uikit

import androidx.annotation.StringRes
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorProducer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.graphics.brush.asBrush
import com.sdds.compose.uikit.internal.text.BaseText

/**
 * CompositionLocal для [TextBehaviour]
 */
val LocalTextBehaviour = compositionLocalOf { TextBehaviour() }

/**
 * CompositionLocal, содержащий предпочтительный [TextStyle], который будет использоваться компонентами [Text] по умолчанию.
 * Чтобы установить значение для этого CompositionLocal, см. [ProvideTextStyle],
 * который объединит все отсутствующие свойства [TextStyle] с существующим [TextStyle], установленным в этом CompositionLocal.
 */
val LocalTextStyle = compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }

/**
 * CompositionLocal, содержащий [ColorProducer] для [Text]
 */
val LocalTextColorProducer = compositionLocalOf<ColorProducer?>(structuralEqualityPolicy()) { null }

/**
 * CompositionLocal, содержащий [BrushProducer] для [Text]
 */
val LocalTextBrushProducer = compositionLocalOf<BrushProducer?>(structuralEqualityPolicy()) { null }

/**
 * Текст
 *
 * @param text текст
 * @param modifier модификатор текста
 * @param style стиль текста
 * @param onTextLayout колбэк, сообщающий о том, что новый лэйаут текста расчитан
 * @param overflow режим переполнения текста
 * @param softWrap должен ли текст разрываться при мягких разрывах строк
 * @param maxLines максимальное количество строк
 * @param color цвет текста
 * @param brush кисть для текста (приоритетней над [color])
 */
@NonRestartableComposable
@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = LocalTextBehaviour.current.overflow,
    softWrap: Boolean = LocalTextBehaviour.current.softWrap,
    maxLines: Int = LocalTextBehaviour.current.maxLines,
    color: ColorProducer? = LocalTextColorProducer.current,
    brush: BrushProducer? = LocalTextBrushProducer.current,
) {
    Text(
        source = stringSource(text),
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        brush = brush ?: color?.let { BrushProducer { color.invoke().asBrush() } },
    )
}

/**
 * Текст
 *
 * @param text текст
 * @param modifier модификатор текста
 * @param style стиль текста
 * @param onTextLayout колбэк, сообщающий о том, что новый лэйаут текста расчитан
 * @param overflow режим переполнения текста
 * @param softWrap должен ли текст разрываться при мягких разрывах строк
 * @param maxLines максимальное количество строк
 * @param inlineContent словарь хранит composables, которые заменяют определенные диапазоны текста.
 * Он используется для вставки composables в текстовый layout. См. [InlineTextContent]
 * @param color цвет текста
 * @param brush кисть для текста (приоритетней над [color])
 */
@NonRestartableComposable
@Composable
fun Text(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = LocalTextBehaviour.current.overflow,
    softWrap: Boolean = LocalTextBehaviour.current.softWrap,
    maxLines: Int = LocalTextBehaviour.current.maxLines,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    color: ColorProducer? = LocalTextColorProducer.current,
    brush: BrushProducer? = LocalTextBrushProducer.current,
) {
    Text(
        source = annotatedStringSource(text),
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        inlineContent = inlineContent,
        brush = brush ?: color?.let { BrushProducer { color.invoke().asBrush() } },
    )
}

/**
 * Текст
 *
 * @param source источник текст
 * @param modifier модификатор текста
 * @param style стиль текста
 * @param onTextLayout колбэк, сообщающий о том, что новый лэйаут текста расчитан
 * @param overflow режим переполнения текста
 * @param softWrap должен ли текст разрываться при мягких разрывах строк
 * @param maxLines максимальное количество строк
 * @param inlineContent словарь хранит composables, которые заменяют определенные диапазоны текста.
 * Он используется для вставки composables в текстовый layout. См. [InlineTextContent]
 * @param brush провайдер кисти для текста
 */
@NonRestartableComposable
@Composable
fun Text(
    source: TextSource,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = LocalTextBehaviour.current.overflow,
    softWrap: Boolean = LocalTextBehaviour.current.softWrap,
    maxLines: Int = LocalTextBehaviour.current.maxLines,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    brush: BrushProducer? = LocalTextBrushProducer.current,
) {
    BaseText(
        source = source,
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        inlineContent = inlineContent,
        brushProducer = brush,
    )
}

/**
 * Функция используется для установки текущего значения LocalTextStyle,
 * объединяя заданный стиль с текущими значениями стиля для любых отсутствующих атрибутов.
 * Любые текстовые компоненты, включенные в содержимое этого компонента,
 * будут стилизованы этим стилем, если они не заданы явно.
 */
@Composable
fun ProvideTextStyle(value: TextStyle, content: @Composable () -> Unit) {
    ProvideTextStyle(value, color = null, content)
}

/**
 * Функция используется для установки текущего значения LocalTextStyle,
 * объединяя заданный стиль с текущими значениями стиля для любых отсутствующих атрибутов.
 * Любые текстовые компоненты, включенные в содержимое этого компонента,
 * будут стилизованы этим стилем, если они не заданы явно.
 */
@Composable
fun ProvideTextStyle(value: TextStyle, color: Color? = null, content: @Composable () -> Unit) {
    val mergedStyle = LocalTextStyle.current.merge(value).let { style ->
        if (color != null) style.copy(color = color) else style
    }
    CompositionLocalProvider(LocalTextStyle provides mergedStyle, content = content)
}

/**
 * Функция используется для установки текущего значения LocalTextStyle,
 * объединяя заданный стиль с текущими значениями стиля для любых отсутствующих атрибутов.
 * Любые текстовые компоненты, включенные в содержимое этого компонента,
 * будут стилизованы этим стилем, если они не заданы явно.
 */
@Composable
fun ProvideTextStyle(value: TextStyle, color: ColorProducer, content: @Composable () -> Unit) {
    val mergedStyle = LocalTextStyle.current.merge(value)
    val fallbackBrushProducer = remember(color) { BrushProducer { color.invoke().asBrush() } }
    CompositionLocalProvider(
        LocalTextStyle provides mergedStyle,
        LocalTextColorProducer provides color,
        LocalTextBrushProducer provides fallbackBrushProducer,
        content = content,
    )
}

/**
 * Функция используется для установки текущего значения LocalTextStyle,
 * объединяя заданный стиль с текущими значениями стиля для любых отсутствующих атрибутов.
 * Любые текстовые компоненты, включенные в содержимое этого компонента,
 * будут стилизованы этим стилем, если они не заданы явно.
 */
@Composable
fun ProvideTextStyle(value: TextStyle, brush: BrushProducer, content: @Composable () -> Unit) {
    val mergedStyle = LocalTextStyle.current.merge(value)
    CompositionLocalProvider(
        LocalTextStyle provides mergedStyle,
        LocalTextBrushProducer provides brush,
    ) {
        content()
    }
}

/**
 * Функция используется для установки текущего значения [LocalTextBehaviour]
 */
@Composable
fun ProvideTextBehaviour(behaviour: TextBehaviour, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalTextBehaviour provides behaviour,
        content = content,
    )
}

/**
 * Поведение компонента [Text]
 * @property overflow режим переполнения текста
 * @property softWrap должен ли текст разрываться при мягких разрывах строк
 * @property maxLines максимальное количество строк
 */
data class TextBehaviour(
    val overflow: TextOverflow = TextOverflow.Clip,
    val softWrap: Boolean = true,
    val maxLines: Int = Int.MAX_VALUE,
)

/**
 * Источник текста для компонента [Text].
 *
 * Позволяет унифицировать работу со строковыми и аннотированными значениями текста.
 */
@Stable
fun interface TextSource {

    /**
     * Возвращает текст в виде [AnnotatedString].
     */
    fun text(): AnnotatedString
}

/**
 * Создает [TextSource] на основе строкового ресурса.
 *
 * @param id идентификатор строкового ресурса
 * @param args аргументы для форматирования строки
 */
@Composable
fun resourceTextSource(@StringRes id: Int, vararg args: String = emptyArray()): TextSource {
    val text = stringResource(id, *args)
    return TextSource { AnnotatedString(text) }
}

/**
 * Создает [TextSource] на основе [AnnotatedString].
 *
 * @param string аннотированная строка
 */
fun annotatedStringSource(string: AnnotatedString): TextSource {
    return TextSource { string }
}

/**
 * Создает [TextSource] на основе обычной строки.
 *
 * @param string строковое значение текста
 */
fun stringSource(string: String): TextSource {
    return TextSource { AnnotatedString(string) }
}
