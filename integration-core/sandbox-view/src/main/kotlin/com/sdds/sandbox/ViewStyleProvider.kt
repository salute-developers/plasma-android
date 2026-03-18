package com.sdds.sandbox

import androidx.annotation.StyleRes
import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.Style

/**
 * Ссылка на стиль компонента Android View
 */
typealias AndroidViewStyleReference = ComposeStyleReference<ViewStyle>

/**
 * Стиль компонента Android View
 * @property res идентификатор ресурса стиля
 */
class ViewStyle(@StyleRes val res: Int) : Style

/**
 * Провайдер стилей компонента Android View
 */
@Suppress("UnnecessaryAbstractClass")
abstract class AndroidViewStyleProvider : ComposeStyleProvider<ViewStyle>()

/**
 * Функция, создающая [AndroidViewStyleReference] из идентификатора ресурса [res]
 */
fun viewStyleReference(@StyleRes res: Int) =
    AndroidViewStyleReference { ViewStyle(res) }
