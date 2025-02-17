package com.sdds.compose.uikit

import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

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
 */
@NonRestartableComposable
@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
) {
    BasicText(
        text = text,
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
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
 */
@NonRestartableComposable
@Composable
fun Text(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    style: TextStyle = LocalTextStyle.current,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
) {
    BasicText(
        text = text,
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        inlineContent = inlineContent,
    )
}

/**
 * CompositionLocal, содержащий предпочтительный [TextStyle], который будет использоваться компонентами [Text] по умолчанию.
 * Чтобы установить значение для этого CompositionLocal, см. [ProvideTextStyle],
 * который объединит все отсутствующие свойства [TextStyle] с существующим [TextStyle], установленным в этом CompositionLocal.
 */
val LocalTextStyle = compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }

/**
 * Функция используется для установки текущего значения LocalTextStyle,
 * объединяя заданный стиль с текущими значениями стиля для любых отсутствующих атрибутов.
 * Любые текстовые компоненты, включенные в содержимое этого компонента,
 * будут стилизованы этим стилем, если они не заданы явно.
 */
@Composable
fun ProvideTextStyle(value: TextStyle, content: @Composable () -> Unit) {
    val mergedStyle = LocalTextStyle.current.merge(value)
    CompositionLocalProvider(LocalTextStyle provides mergedStyle, content = content)
}
