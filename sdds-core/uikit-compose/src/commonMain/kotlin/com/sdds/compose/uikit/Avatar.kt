package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Paint
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.graphics.cutout.ProvideCutoutState
import com.sdds.compose.uikit.graphics.cutout.cutoutTarget
import com.sdds.compose.uikit.graphics.cutout.rememberCutoutState
import com.sdds.compose.uikit.interactions.MutableSemanticStateSource
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.setExclusiveEnum
import com.sdds.compose.uikit.internal.common.background
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.avatar.AvatarMotionStyle
import com.sdds.compose.uikit.motion.components.avatar.rememberAvatarMotion
import com.sdds.compose.uikit.motion.components.indicator.rememberIndicatorMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

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
 * @param motion объект анимаций
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
    motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(
        motionContext = rememberMotionContext(
            semanticStateSource = rememberAvatarSemanticStateSource(status),
        ),
    ),
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
        motion = motion,
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
 * @param motion объект анимаций
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
    motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(
        motionContext = rememberMotionContext(
            semanticStateSource = rememberAvatarSemanticStateSource(status),
        ),
    ),
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
        motion = motion,
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
 * @param motion объект анимаций
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
    motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(
        motionContext = rememberMotionContext(
            semanticStateSource = rememberAvatarSemanticStateSource(status),
        ),
    ),
) {
    Avatar(
        modifier = modifier,
        style = style,
        status = status,
        action = action,
        actionEnabled = actionEnabled,
        placeholder = placeholder,
        motion = motion,
        content = {
            if (painter != null) {
                Image(
                    modifier = Modifier.matchParentSize(),
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = contentScale,
                )
            }
        },
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
    Avatar(
        modifier = modifier,
        style = style,
        status = status,
        action = action,
        actionEnabled = actionEnabled,
        placeholder = placeholder,
        extra = extra,
        motion = rememberAvatarMotion(
            motionContext = rememberMotionContext(
                semanticStateSource = rememberAvatarSemanticStateSource(status),
                interactionSource = interactionSource as? MutableInteractionSource
                    ?: remember { MutableInteractionSource() },
            ),
        ),
        content = content,
    )
}

/**
 * Компонент [Avatar] предназначен для отрисовки пользовательских аватаров.
 * Умеет отображать статус, текст-заглушку, а также иконку действия.
 *
 * @param modifier модификатор
 * @param style стиль компонента
 * @param status статус [AvatarStatus]
 * @param action иконка действия [Painter]
 * @param actionEnabled включена ли иконка действия
 * @param placeholder текст-заглушка
 * @param extra обвесы аватара
 * @param motion объект анимаций. Взаимодействия берутся из [Motion.context]
 * @param content контент аватара (изображеине)
 */
@Composable
fun Avatar(
    motion: Motion<AvatarMotionStyle>,
    content: @Composable BoxScope.() -> Unit,
    modifier: Modifier = Modifier,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = LocalAvatarGroupActionEnabled.current,
    placeholder: AvatarPlaceholder? = null,
    extra: (@Composable BoxScope.() -> Unit)? = null,
) {
    val cutoutState = rememberCutoutState()
    val context = motion.context
    val dimensions = style.dimensionValues
    val width by dimensions.widthValues.getValueAsState(context)
    val height by dimensions.heightValues.getValueAsState(context)
    Box(modifier.requiredSize(width, height)) {
        ProvideCutoutState(cutoutState) {
            Box(
                modifier = Modifier
                    .cutoutTarget(enabled = style.statusCutoutEnabled)
                    .avatar(
                        interactionSource = context.interactionSource,
                        style = style,
                        status = status,
                        action = action,
                        actionEnabled = actionEnabled,
                        placeholder = placeholder,
                        statusCutoutEnabled = style.statusCutoutEnabled,
                        statusCutoutPadding = dimensions.statusCutoutPaddingValues
                            .getValueAsState(context)
                            .value,
                        motion = motion,
                    ),
                contentAlignment = Alignment.Center,
                propagateMinConstraints = false,
                content = content,
            )
            ProvideExtraStyle(
                style.badgeStyle,
                style.iconBadgeStyle,
                style.counterStyle,
            ) {
                extra?.invoke(this@Box)
            }
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
 *          ...
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
 *         ...
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
 * @param statusCutoutEnabled включен ли вырез под индикатор статуса
 * @param statusCutoutPadding внутренний отступ выреза индикатора статуса
 * @param motion объект анимаций. Взаимодействия берутся из [Motion.context]
 */
@Suppress("ComposableModifierFactory", "LongParameterList", "DEPRECATION")
@Composable
fun Modifier.avatar(
    interactionSource: InteractionSource,
    style: AvatarStyle = LocalAvatarStyle.current,
    status: AvatarStatus = AvatarStatus.None,
    action: Painter? = null,
    actionEnabled: Boolean = false,
    placeholder: AvatarPlaceholder? = null,
    statusCutoutEnabled: Boolean = style.statusCutoutEnabled,
    statusCutoutPadding: Dp = 3.dp,
    motion: Motion<AvatarMotionStyle> = rememberAvatarMotion(
        motionContext = rememberMotionContext(
            semanticStateSource = rememberAvatarSemanticStateSource(status),
            interactionSource = interactionSource as? MutableInteractionSource
                ?: remember { MutableInteractionSource() },
        ),
    ),
): Modifier = composed {
    val context = motion.context
    val motionInteractionSource = context.interactionSource
    val dimensions = style.dimensionValues
    val colors = style.colors
    val stateSet: Set<ValueState> = remember(status) { setOf(status) }

    SideEffect {
        context.semanticStateSource.setExclusiveEnum(status)
    }

    val statusModifier = if (status.isEnabled && LocalAvatarGroupStatusEnabled.current) {
        val indicatorMotion = rememberIndicatorMotion(motionContext = context)
        Modifier.indicator(
            motion = indicatorMotion,
            alignment = Alignment.BottomEnd,
            style = style.statusStyle ?: LocalIndicatorStyle.current,
            horizontalPadding = dimensions.statusOffsetXValues.getValue(motionInteractionSource, stateSet),
            verticalPadding = dimensions.statusOffsetYValues.getValue(motionInteractionSource, stateSet),
            stateSet = stateSet,
            cutoutEnabled = statusCutoutEnabled,
            cutoutPadding = statusCutoutPadding,
        )
    } else {
        Modifier
    }

    val placeholderModifier = if (placeholder != null) {
        val textBrushes = colors.textBrushes?.getBrushAsState(context, motion.style.textColor)
        val textColors = colors.textColors?.takeIf { textBrushes == null }
            ?.colorForInteractionAsState(motionInteractionSource, stateSet)
        val textStyle = style.textStyles
            .getTextStyleAsState(context, motion.style.textStyle)
            .value
        Modifier.placeholder(
            text = placeholder.minimize,
            style = textStyle,
            textMeasurer = rememberTextMeasurer(),
            textBrushProvider = { textBrushes?.value },
            textColorProvider = { textColors?.value },
        )
    } else {
        Modifier
    }

    val actionModifier =
        if (action != null && actionEnabled && LocalAvatarGroupActionEnabled.current) {
            val actionBrush = colors.actionBrushes.getBrushAsState(context, motion.style.actionColor)
            val actionScrimBrush = colors.actionScrimBrushes
                .getBrushAsState(context, motion.style.actionScrimColor)
            Modifier.action(
                painter = action,
                color = { actionBrush.value },
                scrimColor = { actionScrimBrush.value },
                size = action.intrinsicSize,
            )
        } else {
            Modifier
        }

    val sizeModifier = Modifier
        .width(dimensions.widthValues.getValue(motionInteractionSource, stateSet))
        .height(dimensions.heightValues.getValue(motionInteractionSource, stateSet))

    val backgroundBrush = colors.backgroundBrushes
        ?.getBrushAsState(context, motion.style.backgroundColor)
        ?.value
    val backgroundColors = colors.backgroundColors?.takeIf { backgroundBrush == null }
        ?.colorForInteraction(motionInteractionSource, stateSet)

    statusModifier
        .clip(style.shapes.getValue(motionInteractionSource, stateSet))
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
@ApiStateSet(components = ["Avatar", "Indicator", "Badge", "Counter"])
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
    iconBadgeStyle: BadgeStyle?,
    counterStyle: CounterStyle?,
    content: @Composable () -> Unit,
) {
    if (badgeStyle != null || iconBadgeStyle != null || counterStyle != null) {
        CompositionLocalProvider(
            LocalBadgeStyle provides (badgeStyle ?: LocalBadgeStyle.current),
            LocalIconBadgeStyle provides (iconBadgeStyle ?: LocalIconBadgeStyle.current),
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
    color: BrushProducer,
    scrimColor: BrushProducer,
    size: Size,
): Modifier = this
    .drawWithContent {
        drawContent()
        drawRect(brush = scrimColor())

        val topLeft = this.size.center - size.center
        translate(topLeft.x, topLeft.y) {
            drawContext.canvas.saveLayer(
                Rect(Offset.Zero, size),
                Paint(),
            )
            try {
                with(painter) {
                    draw(size = size)
                }
                drawRect(
                    brush = color(),
                    size = size,
                    blendMode = BlendMode.SrcIn,
                )
            } finally {
                drawContext.canvas.restore()
            }
        }
    }

@Composable
private fun rememberAvatarSemanticStateSource(status: AvatarStatus): MutableSemanticStateSource {
    return remember {
        MutableSemanticStateSource().apply {
            setExclusiveEnum(status)
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
