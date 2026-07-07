package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import com.sdds.compose.uikit.annotations.StringRes

/**
 * Создает [TextSource] на основе строкового ресурса.
 *
 * @param id идентификатор строкового ресурса
 * @param args аргументы для форматирования строки
 */
@Composable
fun resourceTextSource(@StringRes id: Int, vararg args: Any = emptyArray()): TextSource {
    val text = stringResource(id, *args)
    return TextSource { AnnotatedString(text) }
}
