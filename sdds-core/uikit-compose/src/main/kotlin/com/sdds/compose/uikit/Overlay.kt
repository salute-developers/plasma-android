package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.interactions.getValue

/**
 * Компонент Overlay.
 * Представляет собой стилизованный контейнер.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param interactionSource источник взаимодействий
 * @param content контент
 */
@Composable
fun Overlay(
    modifier: Modifier = Modifier,
    style: OverlayStyle = LocalOverlayStyle.current,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable BoxScope.() -> Unit = {},
) {
    Box(
        modifier = modifier
            .background(style.colors.backgroundColor.getValue(interactionSource)),
        content = content,
    )
}
