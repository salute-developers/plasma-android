package com.sdds.compose.uikit

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.modal.BaseModalBottomSheet
import com.sdds.compose.uikit.internal.modal.BottomSheetState
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.Hidden
import com.sdds.compose.uikit.internal.modal.handle
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.bottomsheet.ModalBottomSheetMotionStyle
import com.sdds.compose.uikit.motion.components.bottomsheet.rememberModalBottomSheetMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.shadow.shadow

/**
 * Компонент ModalBottomSheet
 *
 * @param modifier модификатор
 * @param style стиль компонента [ModalBottomSheetStyle]
 * @param sheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param handlePlacement расположение ручки (handle)
 * @see BottomSheetHandlePlacement
 * @param interactionSource источник взаимодействий
 * @param fitContent ModalBottomSheet открывается по высоте контента
 * @param header заголовок
 * @param footer нижний колонтитул
 * @param edgeToEdge включает отображение ModalBottomSheet в режиме edge-to-edge
 * (компонент рисуется под navBar и под statusBar)
 * ModalBottomSheet. Ожидается значение в пределах 0f..1f, где 0f - полностью спрятан,
 * 1f - полностью открыт.
 * @param body основной контент
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ModalBottomSheet(
    modifier: Modifier = Modifier,
    style: ModalBottomSheetStyle = LocalModalBottomSheetStyle.current,
    sheetState: BottomSheetState = rememberModalBottomSheetState(Hidden),
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    handlePlacement: BottomSheetHandlePlacement = style.handlePlacement,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    fitContent: Boolean,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    edgeToEdge: Boolean = true,
    body: (@Composable () -> Unit),
) {
    ModalBottomSheet(
        modifier = modifier,
        dimBackground = true,
        style = style,
        sheetState = sheetState,
        sheetGesturesEnabled = sheetGesturesEnabled,
        onDismiss = onDismiss,
        handlePlacement = handlePlacement,
        interactionSource = interactionSource,
        useNativeBlackout = true,
        fitContent = fitContent,
        header = header,
        footer = footer,
        edgeToEdge = edgeToEdge,
        body = body,
    )
}

/**
 * Компонент ModalBottomSheet
 *
 * @param dimBackground нужно ли затемнять фон
 * @param fitContent ModalBottomSheet открывается по высоте контента
 * @param modifier модификатор
 * @param style стиль компонента [ModalBottomSheetStyle]
 * @param sheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param handlePlacement расположение ручки (handle)
 * @see BottomSheetHandlePlacement
 * @param interactionSource источник взаимодействий
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [ModalBottomSheet]
 * @param header заголовок
 * @param footer нижний колонтитул
 * @param edgeToEdge включает отображение ModalBottomSheet в режиме edge-to-edge
 * (компонент рисуется под navBar и под statusBar)
 * ModalBottomSheet. Ожидается значение в пределах 0f..1f, где 0f - полностью спрятан,
 * 1f - полностью открыт.
 * @param body основной контент
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ModalBottomSheet(
    dimBackground: Boolean,
    fitContent: Boolean,
    modifier: Modifier = Modifier,
    style: ModalBottomSheetStyle = LocalModalBottomSheetStyle.current,
    sheetState: BottomSheetState = rememberModalBottomSheetState(Hidden),
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    handlePlacement: BottomSheetHandlePlacement = style.handlePlacement,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    useNativeBlackout: Boolean = true,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    edgeToEdge: Boolean = true,
    body: (@Composable () -> Unit),
) {
    val motion = rememberModalBottomSheetMotion(
        motionContext = rememberMotionContext(interactionSource),
    )
    ModalBottomSheet(
        dimBackground = dimBackground,
        fitContent = fitContent,
        motion = motion,
        modifier = modifier,
        style = style,
        sheetState = sheetState,
        sheetGesturesEnabled = sheetGesturesEnabled,
        onDismiss = onDismiss,
        handlePlacement = handlePlacement,
        useNativeBlackout = useNativeBlackout,
        header = header,
        footer = footer,
        body = body,
    )
}

/**
 * Компонент ModalBottomSheet
 *
 * @param dimBackground нужно ли затемнять фон
 * @param fitContent ModalBottomSheet открывается по высоте контента
 * @param motion объект анимаций
 * @param modifier модификатор
 * @param style стиль компонента [ModalBottomSheetStyle]
 * @param sheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param handlePlacement расположение ручки (handle)
 * @see BottomSheetHandlePlacement
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [ModalBottomSheet]
 * @param header заголовок
 * @param footer нижний колонтитул
 * @param body основной контент
 * @param edgeToEdge включает отображение ModalBottomSheet в режиме edge-to-edge
 * (компонент рисуется под navBar и под statusBar)
 * ModalBottomSheet. Ожидается значение в пределах 0f..1f, где 0f - полностью спрятан,
 * 1f - полностью открыт.
 */
@OptIn(ExperimentalFoundationApi::class)
@Suppress("LongMethod")
@Composable
fun ModalBottomSheet(
    dimBackground: Boolean,
    fitContent: Boolean,
    motion: Motion<ModalBottomSheetMotionStyle>,
    modifier: Modifier = Modifier,
    style: ModalBottomSheetStyle = LocalModalBottomSheetStyle.current,
    sheetState: BottomSheetState = rememberModalBottomSheetState(Hidden),
    sheetGesturesEnabled: Boolean = true,
    onDismiss: () -> Unit = {},
    handlePlacement: BottomSheetHandlePlacement = style.handlePlacement,
    useNativeBlackout: Boolean = true,
    header: (@Composable () -> Unit)? = null,
    footer: (@Composable () -> Unit)? = null,
    body: (@Composable () -> Unit),
    edgeToEdge: Boolean = true,
) {
    val backgroundColor = style.colors.backgroundBrush.getBrushAsState(motion.context, motion.style.backgroundColor)
    val handleColor = style.colors.handleBrush.getBrushAsState(motion.context, motion.style.handleColor)
    val handleShape = style.handleShapes.getValueAsState(motion.context)
    val handleOffset = style.dimensions.handleOffsetValues.getValueAsState(motion.context)
    val handleWidth = style.dimensions.handleWidthValues.getValueAsState(motion.context)
    val handleHeight = style.dimensions.handleHeightValues.getValueAsState(motion.context)
    val blurRadius = style.dimensions.backgroundBlurRadiusValues.getValueAsState(motion.context)
    val topShape by style.topShape.getValueAsState(motion.context)
    val bottomShape by style.bottomShape.getValueAsState(motion.context)
    val newShape = remember(topShape, bottomShape) { resolveShape(topShape, bottomShape) }
    val start by style.dimensions.paddingStartValues.getValueAsState(motion.context)
    val top by style.dimensions.paddingTopValues.getValueAsState(motion.context)
    val end by style.dimensions.paddingEndValues.getValueAsState(motion.context)
    val bottom by style.dimensions.paddingBottomValues.getValueAsState(motion.context)
    val layoutState = remember { BottomSheetLayoutState() }
    val measurePolicy = remember(fitContent) { BottomSheetMeasurePolicy(fitContent, layoutState) }
    val shadow = style.shadow?.let {
        Modifier.shadow(it, newShape)
    } ?: Modifier
    val shadowModifier = if (useNativeBlackout) Modifier else shadow
    BaseModalBottomSheet(
        modifier = modifier
            .handle(
                handleShape = handleShape,
                handleColor = { handleColor.value },
                handleWidth = handleWidth,
                handleHeight = handleHeight,
                handleOffset = handleOffset,
                progressProvider = { (sheetState.progressFromHalfExpandedToExpanded) },
                handlePlacement = handlePlacement,
            )
            .clip(newShape)
            .backgroundBrush(
                { backgroundColor.value },
                newShape,
            )
            .then(shadowModifier)
            .padding(PaddingValues(start, top, end, bottom)),
        sheetGesturesEnabled = sheetGesturesEnabled,
        bottomSheetState = sheetState,
        onDismiss = onDismiss,
        hasHandle = handlePlacement != BottomSheetHandlePlacement.None,
        handleHeight = handleHeight,
        handleOffset = handleOffset,
        edgeToEdge = edgeToEdge,
        dimBackground = dimBackground,
        useNativeBlackout = useNativeBlackout,
        overlayStyle = style.overlayStyle,
        blurRadius = blurRadius,
    ) {
        Layout(
            measurePolicy = measurePolicy,
            content = {
                header?.let {
                    Box(
                        modifier = Modifier
                            .layoutId(HEADER)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center,
                    ) {
                        header()
                    }
                }
                Box(
                    modifier = Modifier
                        .layoutId(BODY)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.Center,
                ) {
                    body()
                }
                footer?.let {
                    Box(
                        modifier = Modifier
                            .layoutId(FOOTER)
                            .fillMaxWidth()
                            .graphicsLayer {
                                val anchors = sheetState.anchoredDraggableState.anchors
                                if (anchors.size > 0) {
                                    translationY = layoutState.footerTranslation(
                                        sheetTop = sheetState.requireOffset(),
                                        expandedTop = anchors.minPosition(),
                                        hiddenTop = anchors.positionOf(Hidden),
                                        topPadding = bottom.roundToPx(),
                                        bottomPadding = top.roundToPx(),
                                    )
                                }
                            },
                        contentAlignment = Alignment.Center,
                    ) {
                        footer()
                    }
                }
            },
        )
    }
}

/**
 * Режимы размещения handle относительно границы ModalBottomSheet
 */
enum class BottomSheetHandlePlacement {

    /**
     * Режим размещения, при котором изначально handle находится
     * снаружи, но по мере выдвижения ModalBottomSheet - смещается
     * во внутрь
     */
    Auto,

    /**
     * Режим размещения handle внутри ModalBottomSheet
     */
    Inner,

    /**
     * Режим размещения handle снаружи ModalBottomSheet
     */
    Outer,

    /**
     * Отображение handle отключено
     */
    None,
}

private class BottomSheetMeasurePolicy(
    val fitContent: Boolean,
    val layoutInfo: BottomSheetLayoutState,
) : MeasurePolicy {
    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)

        val header = measurables.find { it.layoutId == HEADER }
        val footer = measurables.find { it.layoutId == FOOTER }
        val body = measurables.find { it.layoutId == BODY }

        val footerPlaceable = footer?.measure(looseConstraints)
        val headerPlaceable = header?.measure(looseConstraints)

        val headerHeight = headerPlaceable.heightOrZero()
        val footerHeight = footerPlaceable.heightOrZero()
        val bodyConstraints = looseConstraints.offset(vertical = -headerHeight - footerHeight)

        val bodyPlaceable = body?.measure(bodyConstraints)
        val bodyHeight = bodyPlaceable.heightOrZero()
        val layoutHeight = if (fitContent) {
            (bodyHeight + headerHeight + footerHeight).coerceAtMost(constraints.maxHeight)
        } else {
            constraints.maxHeight
        }
        layoutInfo.update(layoutHeight, footerHeight)
        return layout(
            width = constraints.maxWidth,
            height = layoutHeight,
        ) {
            headerPlaceable?.placeRelative(0, 0)
            bodyPlaceable?.placeRelative(0, headerHeight)
            footerPlaceable?.placeRelative(0, layoutHeight - footerHeight)
        }
    }
}

@Stable
private class BottomSheetLayoutState {

    /**
     * Фактическая высота footer после измерения
     */
    var footerHeight by mutableIntStateOf(0)
        private set

    /**
     * Фактическая высота BottomSheet после измерения
     */
    var layoutHeight by mutableIntStateOf(0)
        private set

    fun update(
        layoutHeight: Int,
        footerHeight: Int,
    ) {
        if (this.footerHeight != footerHeight) this.footerHeight = footerHeight
        if (this.layoutHeight != layoutHeight) this.layoutHeight = layoutHeight
    }

    /**
     * Вычисляет смещение footer
     */
    fun footerTranslation(
        sheetTop: Float,
        expandedTop: Float,
        hiddenTop: Float,
        topPadding: Int,
        bottomPadding: Int,
    ): Float {
        // максимальное смещение, после которого footer начинает двигаться вместе с BottomSheet
        val maxTranslation = (layoutHeight - footerHeight).toFloat()
        // позиция верхней границы footer на экране, когда BottomSheet раскрыт
        val footerTopWhenExpanded = expandedTop + maxTranslation
        // позиция, в котрой footer должен быть зафиксирован
        val desireFooterTop = hiddenTop - footerHeight - topPadding - bottomPadding
        // базовая компенсация, необходимая для фиксации footer
        val baseTranslation = desireFooterTop - footerTopWhenExpanded
        // на сколько BottomSheet сместился относительно expanded
        val dragDelta = sheetTop - expandedTop
        return (baseTranslation - dragDelta).coerceIn(-maxTranslation, baseTranslation)
    }
}

private fun resolveShape(
    topShape: CornerBasedShape,
    bottomShape: CornerBasedShape,
) = topShape.copy(
    bottomEnd = bottomShape.bottomEnd,
    bottomStart = bottomShape.bottomStart,
)

private const val FOOTER = "footer"
private const val HEADER = "header"
private const val BODY = "body"
