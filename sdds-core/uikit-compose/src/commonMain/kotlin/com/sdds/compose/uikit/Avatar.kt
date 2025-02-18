package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
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
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextMeasurer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.internal.AvatarDefaults

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param imageBitmap изображение [ImageBitmap]
 * @param style стиль компонента
 * @param status статус [Avatar.Status]
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
    status: Avatar.Status = Avatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: Avatar.Placeholder? = null,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
    filterQuality: FilterQuality = FilterQuality.Low,
) {
    val bitmapPainter = remember(imageBitmap) { BitmapPainter(imageBitmap, filterQuality = filterQuality) }
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
 * @param status статус [Avatar.Status]
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
    status: Avatar.Status = Avatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: Avatar.Placeholder? = null,
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
 * @param status статус [Avatar.Status]
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
    status: Avatar.Status = Avatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: Avatar.Placeholder? = null,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    Box(
        modifier = modifier.avatar(
            style = style,
            status = status,
            action = action,
            actionEnabled = actionEnabled,
            placeholder = placeholder,
        ),
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
 * @param status текущий статус [Avatar.Status]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 */
@Suppress("ComposableModifierFactory")
@OptIn(ExperimentalTextApi::class)
@Composable
fun Modifier.avatar(
    style: AvatarStyle = LocalAvatarStyle.current,
    status: Avatar.Status = Avatar.Status.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    placeholder: Avatar.Placeholder? = null,
): Modifier = composed {
    val dimensions = style.dimensions
    val colors = style.colors
    val statusColor = colors.statusColor(status)
    val statusModifier = if (status.isEnabled && LocalAvatarGroupStatusEnabled.current) {
        Modifier.status(
            size = dimensions.statusSize,
            color = { statusColor.value },
            offset = dimensions.statusOffset,
        )
    } else {
        Modifier
    }

    val placeholderModifier = if (placeholder != null) {
        Modifier.placeholder(
            text = placeholder.minimize,
            style = style.textStyle.merge(TextStyle(brush = colors.textColor)),
            textMeasurer = rememberTextMeasurer(),
        )
    } else {
        Modifier
    }

    val actionModifier = if (action != null && actionEnabled && LocalAvatarGroupActionEnabled.current) {
        Modifier.action(
            painter = action,
            color = { colors.actionColor },
            scrimColor = { colors.actionScrimColor },
            size = dimensions.actionSize ?: action.intrinsicSize,
        )
    } else {
        Modifier
    }

    val sizeModifier = if (dimensions.size != null) {
        Modifier.size(dimensions.size)
    } else {
        Modifier
    }

    statusModifier
        .clip(style.shape)
        .background(AvatarDefaults.defaultBrush, alpha = AvatarDefaults.BackgroundOpacity)
        .then(this)
        .then(sizeModifier)
        .then(placeholderModifier)
        .then(actionModifier)
}

/**
 * Параметры компонента [Avatar]
 */
object Avatar {

    /**
     * Заглушка для аватара
     */
    sealed class Placeholder {

        /**
         * Текстовая заглушка на основе имени.
         * В этом случае текст-заглушка - это инициалы имени
         * @property fullName полное имя
         */
        data class Name(val fullName: String) : Placeholder() {

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
        data class Text(val value: String) : Placeholder()
    }

    /**
     * Пользовательский статус
     */
    enum class Status {
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
}

private val Avatar.Status.isEnabled: Boolean
    get() = this != Avatar.Status.None

private fun Modifier.status(
    size: Dp,
    color: () -> Color,
    offset: Offset,
) = drawWithContent {
    drawContent()
    val radius = size.toPx() / 2
    drawCircle(
        color(),
        radius = radius,
        center = Offset(
            x = this.size.width - radius - offset.x,
            y = this.size.height - radius - offset.y,
        ),
    )
}

@OptIn(ExperimentalTextApi::class)
private fun Modifier.placeholder(
    text: String,
    style: TextStyle,
    textMeasurer: TextMeasurer,
) = drawWithCache {
    val textLayoutResult = textMeasurer.measure(
        text = AnnotatedString(text),
        style = style,
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

private val Avatar.Placeholder.minimize
    get() = when (this) {
        is Avatar.Placeholder.Name ->
            this.fullName
                .split(' ')
                .mapNotNull { it.firstOrNull()?.toString() }
                .take(2)
                .reduce { acc, s -> acc + s }

        is Avatar.Placeholder.Text -> this.value
    }
