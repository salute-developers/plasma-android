package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.internal.tabs.BaseIconTabItem
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.tabs.TabItemMotionStyle
import com.sdds.compose.uikit.motion.components.tabs.rememberTabItemMotion
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Таб (Вкладка). Элемент, предназначенный для использования в [Tabs].
 * Может содержать иконку, кнопку действия, счетчик.
 *
 * @param modifier модификатор
 * @param style стиль компонента [TabItem]
 * @param isSelected выбран ли таб
 * @param icon ресурс иконки
 * @param actionIcon ресурс иконки действия
 * @param onActionClicked обработчик нажатия на иконку действия
 * @param count текст счетчика [Counter]
 * @param interactionSource источник взаимодействий
 */
@Composable
@Deprecated(
    "Use IconTabItem with onClick",
    replaceWith = ReplaceWith("IconTabItem(onClick = {})"),
)
@NonRestartableComposable
fun IconTabItem(
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    @DrawableRes icon: Int? = null,
    @DrawableRes actionIcon: Int? = null,
    onActionClicked: () -> Unit = {},
    count: String? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    BaseIconTabItem(
        modifier = modifier,
        style = style,
        isSelected = isSelected,
        action = actionContent(actionIcon, onActionClicked),
        counter = counterContent(count),
        motion = rememberTabItemMotion(motionContext = rememberMotionContext(interactionSource)),
    ) {
        icon ?: return@BaseIconTabItem
        Icon(
            source = resourceImageSource(icon),
            contentDescription = "",
        )
    }
}

/**
 * Таб (Вкладка). Элемент, предназначенный для использования в [Tabs].
 * Может содержать иконку, кнопку действия, счетчик.
 *
 * @param onClick колбэк нажатия на таб
 * @param modifier модификатор
 * @param style стиль компонента [TabItem]
 * @param isSelected выбран ли таб
 * @param enabled включен ли таб
 * @param action слот для кнопки/иконки действия
 * @param counter слот для счетчика [Counter]
 * @param onClickLabel лейбл обработчика нажатия на таб
 * @param motion источник взаимодействий
 * @param content слот для основной иконки
 */
@Composable
@NonRestartableComposable
fun IconTabItem(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    style: TabItemStyle = LocalTabItemStyle.current,
    isSelected: Boolean = false,
    enabled: Boolean = true,
    action: (@Composable () -> Unit)? = null,
    counter: (@Composable () -> Unit)? = null,
    onClickLabel: String? = null,
    motion: Motion<TabItemMotionStyle> = rememberTabItemMotion(),
    content: @Composable () -> Unit,
) {
    BaseIconTabItem(
        modifier = modifier,
        style = style,
        isSelected = isSelected,
        enabled = enabled,
        action = action,
        counter = counter,
        onClick = onClick,
        onClickLabel = onClickLabel,
        motion = motion,
        content = content,
    )
}

private fun counterContent(
    count: String?,
): (@Composable () -> Unit)? {
    count ?: return null
    return {
        Counter(count = count)
    }
}

private fun actionContent(
    icon: Int?,
    onActionClicked: () -> Unit = {},
): (@Composable () -> Unit)? {
    icon ?: return null
    return {
        Icon(
            modifier = Modifier.clickable(
                indication = null,
                interactionSource = null,
                onClick = onActionClicked,
            ),
            source = resourceImageSource(icon),
            contentDescription = "",
        )
    }
}
