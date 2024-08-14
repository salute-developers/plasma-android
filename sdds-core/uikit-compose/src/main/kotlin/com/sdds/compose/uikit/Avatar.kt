package com.sdds.compose.uikit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
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
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.AvatarDefaults

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param imageBitmap изображение [ImageBitmap]
 * @param shape форма аватара
 * @param statusColor цвет статуса
 * @param statusSize размера статуса
 * @param statusOffset смещение статуса относительно нижнего правого угла
 * @param statusEnabled включен ли статус
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param actionSize размер иконки действия
 * @param actionColor цвет иконки действия
 * @param actionScrimColor цвет фона иконки действия
 * @param placeholder текст-заглушка
 * @param textStyle стиль текста-заглушки
 * @param textBrush [Brush] текста-заглушки
 * @param contentDescription описание контента для accessibility
 * @param contentScale тип масштабирования
 * @param filterQuality фильтр качества
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    imageBitmap: ImageBitmap? = null,
    shape: Shape = RoundedCornerShape(50),
    statusColor: Color = Color.DarkGray,
    statusSize: Dp = 8.dp,
    statusOffset: Offset = Offset.Zero,
    statusEnabled: Boolean = LocalAvatarGroupStatusEnabled.current,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    actionSize: Size? = null,
    actionColor: Color = Color.White,
    actionScrimColor: Color = Color.Black,
    placeholder: Avatar.Placeholder? = null,
    textStyle: TextStyle = LocalTextStyle.current,
    textBrush: Brush = AvatarDefaults.defaultBrush,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
    filterQuality: FilterQuality = FilterQuality.Low,
) {
    val bitmapPainter = if (imageBitmap != null) {
        remember(imageBitmap) { BitmapPainter(imageBitmap, filterQuality = filterQuality) }
    } else {
        null
    }
    Avatar(
        modifier = modifier,
        painter = bitmapPainter,
        shape = shape,
        statusColor = statusColor,
        statusSize = statusSize,
        statusOffset = statusOffset,
        statusEnabled = statusEnabled,
        action = action,
        actionEnabled = actionEnabled,
        actionSize = actionSize,
        actionColor = actionColor,
        actionScrimColor = actionScrimColor,
        placeholder = placeholder,
        textStyle = textStyle,
        textBrush = textBrush,
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
 * @param shape форма аватара
 * @param statusColor цвет статуса
 * @param statusSize размера статуса
 * @param statusOffset смещение статуса относительно нижнего правого угла
 * @param statusEnabled включен ли статус
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param actionSize размер иконки действия
 * @param actionColor цвет иконки действия
 * @param actionScrimColor цвет фона иконки действия
 * @param placeholder текст-заглушка
 * @param textStyle стиль текста-заглушки
 * @param textBrush [Brush] текста-заглушки
 * @param contentDescription описание контента для accessibility
 * @param contentScale тип масштабирования
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    imageVector: ImageVector? = null,
    shape: Shape = RoundedCornerShape(50),
    statusColor: Color = Color.DarkGray,
    statusSize: Dp = 8.dp,
    statusOffset: Offset = Offset.Zero,
    statusEnabled: Boolean = LocalAvatarGroupStatusEnabled.current,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    actionSize: Size? = null,
    actionColor: Color = Color.White,
    actionScrimColor: Color = Color.Black,
    placeholder: Avatar.Placeholder? = null,
    textStyle: TextStyle = LocalTextStyle.current,
    textBrush: Brush = AvatarDefaults.defaultBrush,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    Avatar(
        modifier = modifier,
        painter = if (imageVector != null) rememberVectorPainter(image = imageVector) else null,
        shape = shape,
        statusColor = statusColor,
        statusSize = statusSize,
        statusOffset = statusOffset,
        statusEnabled = statusEnabled,
        action = action,
        actionEnabled = actionEnabled,
        actionSize = actionSize,
        actionColor = actionColor,
        actionScrimColor = actionScrimColor,
        placeholder = placeholder,
        textStyle = textStyle,
        textBrush = textBrush,
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
 * @param shape форма аватара
 * @param statusColor цвет статуса
 * @param statusSize размера статуса
 * @param statusOffset смещение статуса относительно нижнего правого угла
 * @param statusEnabled включен ли статус
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param actionSize размер иконки действия
 * @param actionColor цвет иконки действия
 * @param actionScrimColor цвет фона иконки действия
 * @param placeholder текст-заглушка
 * @param textStyle стиль текста-заглушки
 * @param textBrush [Brush] текста-заглушки
 * @param contentDescription описание контента для accessibility
 * @param contentScale тип масштабирования
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    painter: Painter? = null,
    shape: Shape = RoundedCornerShape(50),
    statusColor: Color = Color.DarkGray,
    statusSize: Dp = 8.dp,
    statusOffset: Offset = Offset.Zero,
    statusEnabled: Boolean = LocalAvatarGroupStatusEnabled.current,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    actionSize: Size? = null,
    actionColor: Color = Color.White,
    actionScrimColor: Color = Color.Black,
    placeholder: Avatar.Placeholder? = null,
    textStyle: TextStyle = LocalTextStyle.current,
    textBrush: Brush = AvatarDefaults.defaultBrush,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.None,
) {
    Box(
        modifier = modifier.avatar(
            shape = shape,
            statusColor = statusColor,
            statusSize = statusSize,
            statusOffset = statusOffset,
            statusEnabled = statusEnabled,
            action = action,
            actionEnabled = actionEnabled,
            actionSize = actionSize,
            actionColor = actionColor,
            actionScrimColor = actionScrimColor,
            placeholder = placeholder,
            textStyle = textStyle,
            textBrush = textBrush,
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
 *
 * @param shape форма аватара
 * @param statusColor цвет статуса
 * @param statusSize размера статуса
 * @param statusOffset смещение статуса относительно нижнего правого угла
 * @param statusEnabled включен ли статус
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param actionSize размер иконки действия
 * @param actionColor цвет иконки действия
 * @param actionScrimColor цвет фона иконки действия
 * @param placeholder текст-заглушка
 * @param textStyle стиль текста-заглушки
 * @param textBrush [Brush] текста-заглушки
 */
@OptIn(ExperimentalTextApi::class)
fun Modifier.avatar(
    shape: Shape = RoundedCornerShape(50),
    statusColor: Color = Color.DarkGray,
    statusSize: Dp = 8.dp,
    statusOffset: Offset = Offset.Zero,
    statusEnabled: Boolean = false,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    actionSize: Size? = null,
    actionColor: Color = Color.White,
    actionScrimColor: Color = Color.Black,
    placeholder: Avatar.Placeholder? = null,
    textStyle: TextStyle = TextStyle.Default,
    textBrush: Brush = AvatarDefaults.defaultBrush,
): Modifier = composed {
    val statusModifier = if (statusEnabled && LocalAvatarGroupStatusEnabled.current) {
        Modifier.status(
            size = statusSize,
            color = statusColor,
            offset = statusOffset,
        )
    } else {
        Modifier
    }

    val placeholderModifier = if (placeholder != null) {
        Modifier.placeholder(
            text = placeholder.minimize,
            style = textStyle.merge(TextStyle(brush = textBrush)),
            textMeasurer = rememberTextMeasurer(),
        )
    } else {
        Modifier
    }

    val actionModifier = if (action != null && actionEnabled && LocalAvatarGroupActionEnabled.current) {
        Modifier.action(
            painter = action,
            color = actionColor,
            scrimColor = actionScrimColor,
            size = actionSize ?: action.intrinsicSize,
        )
    } else {
        Modifier
    }

    statusModifier
        .clip(LocalAvatarGroupShape.current ?: shape)
        .background(AvatarDefaults.defaultBrush, alpha = AvatarDefaults.BackgroundOpacity)
        .then(this)
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
}

private fun Modifier.status(
    size: Dp,
    color: Color,
    offset: Offset,
) = drawWithContent {
    drawContent()
    val radius = size.toPx() / 2
    drawCircle(
        color,
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
) = drawBehind {
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
    drawText(
        textLayoutResult = textLayoutResult,
        topLeft = Offset(
            x = center.x - textLayoutResult.size.width / 2,
            y = center.y - textLayoutResult.size.height / 2,
        ),
    )
}

private fun Modifier.action(
    painter: Painter,
    color: Color,
    scrimColor: Color,
    size: Size,
): Modifier = this
    .drawWithContent {
        drawContent()
        drawRect(scrimColor)

        val topLeft = this.size.center - size.center
        translate(topLeft.x, topLeft.y) {
            with(painter) {
                draw(
                    size = size,
                    colorFilter = ColorFilter.tint(color),
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
