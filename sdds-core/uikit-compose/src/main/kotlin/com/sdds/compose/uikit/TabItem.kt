package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.components.tabs.LocalTabItemMotionStyle
import com.sdds.compose.uikit.components.tabs.TabItemMotionStyle
import com.sdds.compose.uikit.internal.tabs.BaseTabItem
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.rememberMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Таб (Вкладка). Элемент, предназначенный для использования в [Tabs].
 * Может содержать контент в начале и в конце, основной текст, дополнительный текст, кнопку действия, счетчик.
 *
 * @param modifier модификатор
 * @param style стиль компонента [TabItem]
 * @param isSelected выбран ли таб
 * @param label основной текст
 * @param helpText дополнительный текст
 * @param count текст счетчика [Counter]
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param actionIcon ресурс иконки действия
 * @param onActionClicked обработчик нажатия на иконку действия
 * @param interactionSource источник взаимодействий [InteractionSource]
 */
@Composable
fun TabItem(
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    helperContent: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    action: (@Composable () -> Unit)? = null,
    motion: Motion<TabItemMotionStyle> = rememberMotion(LocalTabItemMotionStyle.current)
) {
    BaseTabItem(
        modifier = modifier,
        style = style,
        isSelected = isSelected,
        labelContent = content,
        helperContent = helperContent,
        counter = counter,
        startContent = startContent,
        endContent = endContent,
        action = action,
        motion = motion,
    )
}

/**
 * Таб (Вкладка). Элемент, предназначенный для использования в [Tabs].
 * Может содержать контент в начале и в конце, основной текст, дополнительный текст, кнопку действия, счетчик.
 *
 * @param modifier модификатор
 * @param style стиль компонента [TabItem]
 * @param isSelected выбран ли таб
 * @param label основной текст
 * @param helpText дополнительный текст
 * @param count текст счетчика [Counter]
 * @param startContent контент в начале
 * @param endContent контент в конце
 * @param actionIcon ресурс иконки действия
 * @param onActionClicked обработчик нажатия на иконку действия
 * @param interactionSource источник взаимодействий [InteractionSource]
 */
@Composable
fun TabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    label: String? = null,
    helpText: String? = null,
    count: String? = null,
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    @DrawableRes actionIcon: Int? = null,
    onActionClicked: () -> Unit = {},
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseTabItem(
        modifier = modifier,
        style = style,
        isSelected = isSelected,
        labelContent = if (!label.isNullOrEmpty()) {
            { Text(label) }
        } else null,
        helperContent = if (!helpText.isNullOrEmpty()) {
            { Text(helpText) }
        } else null,
        counter = if (!count.isNullOrEmpty()) {
            { Counter(count = count) }
        } else null,
        startContent = startContent,
        endContent = endContent,
        action = if (actionIcon != null) {
            {
                Icon(
                    painter = painterResource(id = actionIcon),
                    contentDescription = "",
                    modifier = Modifier.clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() },
                        onClick = onActionClicked,
                    )
                )
            }
        } else null,
        motion = rememberMotion(
            LocalTabItemMotionStyle.current,
            rememberMotionContext(interactionSource)
        )
    )
}

@Composable
@Preview(showBackground = true)
private fun TabItemPreview() {
    TabItem(
        style = TabItemStyle.builder()
            .style(),
        label = "Label",
        helpText = "HelpText",
        startContent = {
            Box(
                Modifier
                    .size(24.dp)
                    .background(Color.Gray),
            )
        },
        endContent = {
            Box(
                Modifier
                    .size(24.dp)
                    .background(Color.LightGray),
            )
        },
        count = "2",
        isSelected = true,
    )
}
