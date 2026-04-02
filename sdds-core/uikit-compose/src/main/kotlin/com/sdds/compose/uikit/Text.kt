package com.sdds.compose.uikit

import android.util.Log
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorProducer
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

/**
 * CompositionLocal для [TextBehaviour]
 */
val LocalTextBehaviour = compositionLocalOf { TextBehaviour() }

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
) {
    BasicText(
        text = text,
        modifier = modifier,
        style = style,
        onTextLayout = onTextLayout,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        color = color,
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
    overflow: TextOverflow = LocalTextBehaviour.current.overflow,
    softWrap: Boolean = LocalTextBehaviour.current.softWrap,
    maxLines: Int = LocalTextBehaviour.current.maxLines,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    color: ColorProducer? = LocalTextColorProducer.current,
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
        color = color,
    )
}

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
    CompositionLocalProvider(
        LocalTextStyle provides mergedStyle.also { Log.e("Text", "ProvideTextStyle: textStyle $it", ) },
        LocalTextColorProducer provides color.also { Log.e("Text", "ProvideTextStyle: color producer $it", ) },
    ) {
        content()
        SideEffect {
            Log.e("Text", "ProvideTextStyle: recompose", )
        }
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
