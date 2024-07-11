@file:Suppress("LongParameterList")

package com.sdds.playground.sandbox.core.components

import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

/**
 * Компонент для отображения текста
 * @param text строка текста для отображения
 * @param modifier модификатор
 * @param color цвет текста
 * @param fontSize размер шрифта
 * @param fontStyle стиль шрифта (например, курсив)
 * @param fontWeight толщина шрифта (например, жирный)
 * @param fontFamily семейство шрифтов
 * @param letterSpacing расстояние между буквами
 * @param textDecoration оформление текста (например, подчеркивание)
 * @param textAlign выравнивание текста по строкам абзаца
 * @param lineHeight высота линии
 * @param overflow поведение при переполнении текста
 * @param softWrap разрыв текста при soft line breaks
 * @param maxLines максимальное кол-во линий текста
 * @param inlineContent composable объекты, которые заменяют определенные диапазоны текста
 * @param onTextLayout колбэк, который вызывается при пересчете положения текста
 * @param style стиль текста
 */
@Composable
fun SandboxText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        inlineContent = inlineContent,
        onTextLayout = onTextLayout,
        style = style,
    )
}

/**
 * Компонент для отображения текста
 * @param text строка текста для отображения
 * @param modifier модификатор
 * @param color цвет текста
 * @param fontSize размер шрифта
 * @param fontStyle стиль шрифта (например, курсив)
 * @param fontWeight толщина шрифта (например, жирный)
 * @param fontFamily семейство шрифтов
 * @param letterSpacing расстояние между буквами
 * @param textDecoration оформление текста (например, подчеркивание)
 * @param textAlign выравнивание текста по строкам абзаца
 * @param lineHeight высота линии
 * @param overflow поведение при переполнении текста
 * @param softWrap разрыв текста при soft line breaks
 * @param maxLines максимальное кол-во линий текста
 * @param onTextLayout колбэк, который вызывается при пересчете положения текста
 * @param style стиль текста
 */
@Composable
fun SandboxText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    Text(
        text = text,
        modifier = modifier,
        color = color,
        fontSize = fontSize,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        lineHeight = lineHeight,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
        style = style,
    )
}
