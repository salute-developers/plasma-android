package com.sdds.playground.sandbox.avatar

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarGroupItemScope
import com.sdds.compose.uikit.AvatarGroupScope
import com.sdds.compose.uikit.avatar
import com.sdds.compose.uikit.floatPx
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.ScrimColor
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.Threshold
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.colorFor
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.getDimensionsFor
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.getGroupDimensions
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.textStyleFor

/**
 * Компонент [Avatar] из песочницы
 * @see Avatar
 */
@Composable
internal fun SandboxAvatar(
    modifier: Modifier = Modifier,
    size: SandboxAvatar.Size = SandboxAvatar.Size.M,
    status: SandboxAvatar.Status = SandboxAvatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    placeholder: Avatar.Placeholder? = null,
    contentDescription: String = "Avatar",
    image: Painter? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    val dimensions = getDimensionsFor(size)
    Avatar(
        modifier = modifier.size(size.value),
        statusEnabled = true,
        statusColor = colorFor(status = status),
        statusOffset = Offset(dimensions.statusOffsetX.floatPx, dimensions.statusOffsetY.floatPx),
        statusSize = dimensions.statusSize,
        placeholder = placeholder,
        textStyle = textStyleFor(size = size),
        action = action,
        actionEnabled = actionEnabled,
        actionSize = Size(dimensions.actionSize.floatPx, dimensions.actionSize.floatPx),
        actionScrimColor = ScrimColor,
        contentDescription = contentDescription,
        painter = image,
        contentScale = contentScale,
    )
}

/**
 * Группа аватаров
 * @param size размер аватаров
 * @param threshold максимальное кол-во отображаемых аватаров
 * @param content содержимое группы
 */
@Composable
internal fun SandboxAvatarGroup(
    size: SandboxAvatar.Size = SandboxAvatar.Size.XXL,
    threshold: Int = Threshold,
    content: @Composable AvatarGroupScope.() -> Unit,
) {
    val dimensions = getGroupDimensions(size = size)
    AvatarGroup(
        content = content,
        itemTextStyle = textStyleFor(size = size),
        itemOffset = dimensions.itemOffset,
        itemSpacing = dimensions.itemSpacing,
        threshold = threshold,
    )
}

/**
 * Счетчик аватаров в группе
 * @param displayCount значение счетчика
 * @param modifier модификатор
 * @param size размер счетчика
 */
@Composable
internal fun AvatarGroupItemScope.SandboxAvatarCounter(
    displayCount: Int,
    modifier: Modifier = Modifier,
    size: SandboxAvatar.Size = SandboxAvatar.Size.XXL,
) {
    AvatarCounter(
        modifier = modifier.size(size.value),
        displayCount = displayCount,
        textStyle = textStyleFor(size = size),
    )
}

/**
 * Модификатор аватара
 * @see Modifier.avatar
 */
internal fun Modifier.avatar(
    size: SandboxAvatar.Size = SandboxAvatar.Size.M,
    status: SandboxAvatar.Status = SandboxAvatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    placeholder: Avatar.Placeholder? = null,
): Modifier = this
    .size(size.value)
    .composed {
        val dimensions = getDimensionsFor(size)
        avatar(
            statusEnabled = true,
            statusColor = colorFor(status = status),
            statusOffset = Offset(dimensions.statusOffsetX.floatPx, dimensions.statusOffsetY.floatPx),
            statusSize = dimensions.statusSize,
            placeholder = placeholder,
            textStyle = textStyleFor(size = size),
            action = action,
            actionEnabled = actionEnabled,
            actionSize = Size(dimensions.actionSize.floatPx, dimensions.actionSize.floatPx),
            actionScrimColor = ScrimColor,
        )
    }

/**
 * Параметры компонента [SandboxAvatar]
 */
internal object SandboxAvatar {

    /**
     * Отступы и смещения компонента
     */
    @Immutable
    data class Dimensions(
        val actionSize: Dp,
        val statusSize: Dp,
        val statusOffsetX: Dp,
        val statusOffsetY: Dp,
    )

    /**
     * Размер компонента
     */
    enum class Size(val value: Dp) {
        XXL(88.dp),
        L(48.dp),
        M(36.dp),
        S(24.dp),
    }

    enum class Status {
        None, Active, Inactive
    }
}

/**
 * Параметры компонента  [SandboxAvatarGroup]
 */
object SandboxAvatarGroup {

    /**
     * Отступы и смещения компонента
     * @param itemOffset смещение элементов относительно друг друга
     * @param itemSpacing отступ между элементами (влияет на размеры вырезов)
     */
    @Immutable
    data class Dimensions(
        val itemOffset: Dp,
        val itemSpacing: Dp,
    )
}

/**
 * Превью [SandboxAvatar]
 */
@Composable
@Preview(showBackground = true)
fun SandboxAvatarPreview() {
    SandboxTheme {
        SandboxAvatar(
            image = painterResource(id = R.drawable.il_avatar_test),
        )
    }
}
