package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.common.background

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param imageBitmap изображение [ImageBitmap]
 * @param style стиль компонента
 * @param status статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 * @param contentDescription описание контента для accessibility
 * @param contentScale тип масштабирования
 * @param filterQuality фильтр качества
 */
@Composable
@NonRestartableComposable
fun Avatar(
    imageBitmap: ImageBitmap,
    modifier: Modifier = Modifier,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: AvatarPlaceholder? = null,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
    filterQuality: FilterQuality = FilterQuality.Low,
) {
    val bitmapPainter =
        remember(imageBitmap) { BitmapPainter(imageBitmap, filterQuality = filterQuality) }
    Avatar(
        modifier = modifier,
        painter = bitmapPainter,
        style = style,
        status = status,
        action = action,
        actionEnabled = actionEnabled,
        placeholder = placeholder,
        contentDescription = contentDescription,
        contentScale = contentScale,
    )
}

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param imageVector изображение [ImageVector]
 * @param style стиль компонента
 * @param status статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 * @param contentDescription описание контента для accessibility
 * @param contentScale тип масштабирования
 */
@Composable
@NonRestartableComposable
fun Avatar(
    imageVector: ImageVector,
    modifier: Modifier = Modifier,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: AvatarPlaceholder? = null,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    Avatar(
        modifier = modifier,
        painter = rememberVectorPainter(image = imageVector),
        style = style,
        status = status,
        action = action,
        actionEnabled = actionEnabled,
        placeholder = placeholder,
        contentDescription = contentDescription,
        contentScale = contentScale,
    )
}

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param painter изображение [Painter]
 * @param style стиль компонента
 * @param status статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 * @param contentDescription описание контента для accessibility
 * @param contentScale тип масштабирования
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    painter: Painter? = null,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: AvatarPlaceholder? = null,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    Avatar(
        modifier = modifier,
        style = style,
        status = status,
        action = action,
        actionEnabled = actionEnabled,
        placeholder = placeholder,
    ) {
        if (painter != null) {
            Image(
                modifier = Modifier.matchParentSize(),
                painter = painter,
                contentDescription = contentDescription,
                contentScale = contentScale,
            )
        }
    }
}

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param painter изображение [Painter]
 * @param style стиль компонента
 * @param status статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 * @param extra обвесы аватара
 * @param interactionSource источник взаимодействий
 * @param content контент аватара (изображеине)
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: AvatarPlaceholder? = null,
    extra: (@Composable BoxScope.() -> Unit)? = null,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    content: @Composable BoxScope.() -> Unit,
) {
    Box(modifier) {
        Box(
            modifier = Modifier
                .avatar(
                    interactionSource = interactionSource,
                    style = style,
                    status = status,
                    action = action,
                    actionEnabled = actionEnabled,
                    placeholder = placeholder,
                ),
            contentAlignment = Alignment.Center,
            propagateMinConstraints = false,
            content = content,
        )
        ProvideExtraStyle(
            style.badgeStyle,
            style.counterStyle,
        ) {
            extra?.invoke(this@Box)
        }
    }
}

/**
 * Модификатор, который декорирует компонент как аватар.
 * Его можно использовать в ситуациях, когда [Avatar] использовать не удается.
 * Например, когда используются собственная или библиотечная реализация: GlideImage() библиотеки Glide Compose
 * или AsyncImage библиотеки coil.
 * ```kotlin
 * AsyncImage(
 *      modifier = Modifier.avatar(
 *          shape: Shape = RoundedCornerShape(50),
 *          statusColor: Color = Color.DarkGray,
 *          statusSize: Dp = 8.dp,
 *          statusOffset: Offset = Offset.Zero,
 *      ),
 *      model = "https://cdn.example.com/test.png",
 *      ...
 * )
 * ```
 * @param style стиль компонента
 * @param status текущий статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 */
@Deprecated("Use Modifier.avatar(...) with interactionSource")
@Suppress("ComposableModifierFactory")
@Composable
fun Modifier.avatar(
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    placeholder: AvatarPlaceholder? = null,
): Modifier = avatar(
    interactionSource = remember { MutableInteractionSource() },
    style = style,
    status = status,
    action = action,
    actionEnabled = actionEnabled,
    placeholder = placeholder,
)

/**
 * Модификатор, который декорирует компонент как аватар.
 * Его можно использовать в ситуациях, когда [Avatar] использовать не удается.
 * Например, когда используются собственная или библиотечная реализация: GlideImage() библиотеки Glide Compose
 * или AsyncImage библиотеки coil.
 * ```kotlin
 * AsyncImage(
 *      modifier = Modifier.avatar(
 *          shape: Shape = RoundedCornerShape(50),
 *          statusColor: Color = Color.DarkGray,
 *          statusSize: Dp = 8.dp,
 *          statusOffset: Offset = Offset.Zero,
 *      ),
 *      model = "https://cdn.example.com/test.png",
 *      ...
 * )
 * ```
 * @param interactionSource источник взаимодействий
 * @param style стиль компонента
 * @param status текущий статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 */
@Suppress("ComposableModifierFactory")
@Composable
fun Modifier.avatar(
    interactionSource: InteractionSource,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    placeholder: AvatarPlaceholder? = null,
): Modifier = composed {
    val dimensions = style.dimensionValues
    val colors = style.colors
    val stateSet = remember(status) { setOf(status) }
    val statusModifier = if (status.isEnabled && LocalAvatarGroupStatusEnabled.current) {
        Modifier.indicator(
            alignment = Alignment.BottomEnd,
            style = style.statusStyle ?: LocalIndicatorStyle.current,
            horizontalPadding = dimensions.statusOffsetX,
            verticalPadding = dimensions.statusOffsetY,
            stateSet = stateSet,
        )
    } else {
        Modifier
    }

    val placeholderModifier = if (placeholder != null) {
        val textBrushes = colors.textBrushes?.getValueAsState(interactionSource, stateSet)
        val textColors = colors.textColors?.takeIf { textBrushes == null }
            ?.colorForInteractionAsState(interactionSource, stateSet)
        Modifier.placeholder(
            text = placeholder.minimize,
            style = style.textStyle.merge(TextStyle(brush = colors.textColor)),
            textMeasurer = rememberTextMeasurer(),
            textBrushProvider = { textBrushes?.value },
            textColorProvider = { textColors?.value },
        )
    } else {
        Modifier
    }

    val actionModifier =
        if (action != null && actionEnabled && LocalAvatarGroupActionEnabled.current) {
            Modifier.action(
                painter = action,
                color = { colors.actionColor },
                scrimColor = { colors.actionScrimColor },
                size = action.intrinsicSize,
            )
        } else {
            Modifier
        }

    val sizeModifier = Modifier
        .width(dimensions.width)
        .height(dimensions.height)

    val backgroundBrush = style.colors.backgroundBrushes?.getValue(interactionSource, stateSet)
    val backgroundColors = style.colors.backgroundColors?.takeIf { backgroundBrush == null }
        ?.colorForInteraction(interactionSource, stateSet)

    statusModifier
        .clip(style.shape)
        .background(backgroundBrush, backgroundColors)
        .then(this)
        .then(sizeModifier)
        .then(placeholderModifier)
        .then(actionModifier)
}

/**
 * Заглушка для аватара
 */
sealed class AvatarPlaceholder {

    /**
     * Текстовая заглушка на основе имени.
     * В этом случае текст-заглушка - это инициалы имени
     * @property fullName полное имя
     */
    data class Name(val fullName: String) : AvatarPlaceholder() {

        /**
         * @param firstName имя
         * @param lastName фамилия
         */
        constructor(firstName: String, lastName: String) : this("$firstName $lastName")
    }

    /**
     * Обычная текстовая заглушка
     * @property value текстовое значение заглушки
     */
    data class Text(val value: String) : AvatarPlaceholder()
}

/**
 * Пользовательский статус
 */
enum class AvatarStatus : ValueState {
    /**
     * Статус не отображается
     */
    None,

    /**
     * Активный статус (онлайн, в сети и т.д.)
     */
    Active,

    /**
     * Неактивный статус
     */
    Inactive,
}

@Composable
private fun ProvideExtraStyle(
    badgeStyle: BadgeStyle?,
    counterStyle: CounterStyle?,
    content: @Composable () -> Unit,
) {
    if (badgeStyle != null || counterStyle != null) {
        CompositionLocalProvider(
            LocalBadgeStyle provides (badgeStyle ?: LocalBadgeStyle.current),
            LocalCounterStyle provides (counterStyle ?: LocalCounterStyle.current),
            content = content,
        )
    } else {
        content()
    }
}

private val AvatarStatus.isEnabled: Boolean
    get() = this != AvatarStatus.None

private fun Modifier.placeholder(
    text: String,
    style: TextStyle,
    textBrushProvider: () -> Brush? = { null },
    textColorProvider: () -> Color? = { null },
    textMeasurer: TextMeasurer,
) = drawWithCache {
    val textBrush = textBrushProvider()
    val textColor = textColorProvider()
    val coloredStyle = when {
        textBrush != null -> style.merge(TextStyle(brush = textBrush))
        textColor != null -> style.merge(color = textColor)
        else -> style
    }
    val textLayoutResult = textMeasurer.measure(
        text = AnnotatedString(text),
        style = coloredStyle,
        overflow = TextOverflow.Clip,
        softWrap = true,
        maxLines = 1,
        constraints = Constraints(maxWidth = size.width.toInt(), maxHeight = size.height.toInt()),
        layoutDirection = layoutDirection,
        density = this,
    )
    onDrawBehind {
        drawText(
            textLayoutResult = textLayoutResult,
            topLeft = Offset(
                x = center.x - textLayoutResult.size.width / 2,
                y = center.y - textLayoutResult.size.height / 2,
            ),
        )
    }
}

private fun Modifier.action(
    painter: Painter,
    color: () -> Color,
    scrimColor: () -> Color,
    size: Size,
): Modifier = this
    .drawWithContent {
        drawContent()
        drawRect(scrimColor())

        val topLeft = this.size.center - size.center
        translate(topLeft.x, topLeft.y) {
            with(painter) {
                draw(
                    size = size,
                    colorFilter = ColorFilter.tint(color()),
                )
            }
        }
    }

private val AvatarPlaceholder.minimize
    get() = when (this) {
        is AvatarPlaceholder.Name ->
            this.fullName
                .split(' ')
                .mapNotNull { it.firstOrNull()?.toString() }
                .take(2)
                .reduce { acc, s -> acc + s }

        is AvatarPlaceholder.Text -> this.value
    }
