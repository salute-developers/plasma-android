package com.sdds.compose.uikit

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.modal.BaseModalBottomSheet
import com.sdds.compose.uikit.internal.modal.BottomSheetState
import com.sdds.compose.uikit.internal.modal.BottomSheetValue.Hidden
import com.sdds.compose.uikit.internal.modal.handle
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
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
@Suppress("LongMethod")
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
 * @param modifier модификатор
 * @param dimBackground нужно ли затемнять фон
 * @param style стиль компонента [ModalBottomSheetStyle]
 * @param sheetState состояние ModalBottomSheet
 * @see [BottomSheetState]
 * @param sheetGesturesEnabled обработка жестов
 * @param onDismiss действие при закрытиии ModalBottomSheet
 * @param handlePlacement расположение ручки (handle)
 * @see BottomSheetHandlePlacement
 * @param interactionSource источник взаимодействий
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [ModalBottomSheet]
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
@Suppress("LongMethod")
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
    val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
    val handleColor = style.colors.handleColor.colorForInteraction(interactionSource)
    val newShape = style.shape.copy(
        bottomEnd = ZeroCornerSize,
        bottomStart = ZeroCornerSize,
    )
    val draggableAreaHeight = style.dimensions.handleHeight + style.dimensions.handleOffset
    val layoutState = remember { BottomSheetLayoutState() }
    val measurePolicy = remember(fitContent) { BottomSheetMeasurePolicy(fitContent, layoutState) }
    val shadow = style.shadow?.let {
        Modifier.shadow(it, newShape)
    } ?: Modifier
    val shadowModifier = if (useNativeBlackout) Modifier else shadow
    BaseModalBottomSheet(
        modifier = modifier
            .handle(
                handleShape = style.handleShape,
                handleColor = handleColor,
                handleWidth = style.dimensions.handleWidth,
                handleHeight = style.dimensions.handleHeight,
                handleOffset = style.dimensions.handleOffset,
                progressProvider = { (sheetState.progressFromHalfExpandedToExpanded) },
                handlePlacement = handlePlacement,
            )
            .background(
                backgroundColor,
                newShape,
            )
            .then(shadowModifier)
            .padding(
                start = style.dimensions.paddingStart,
                end = style.dimensions.paddingEnd,
                top = style.dimensions.paddingTop,
                bottom = style.dimensions.paddingBottom,
            ),
        sheetGesturesEnabled = sheetGesturesEnabled,
        bottomSheetState = sheetState,
        onDismiss = onDismiss,
        hasHandle = handlePlacement != BottomSheetHandlePlacement.None,
        draggableAreaHeight = draggableAreaHeight,
        edgeToEdge = edgeToEdge,
        dimBackground = dimBackground,
        useNativeBlackout = useNativeBlackout,
        overlayStyle = style.overlayStyle,
        blurRadius = style.dimensions.backgroundBlurRadius,
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
                                        topPadding = style.dimensions.paddingTop.roundToPx(),
                                        bottomPadding = style.dimensions.paddingBottom.roundToPx(),
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

private const val FOOTER = "footer"
private const val HEADER = "header"
private const val BODY = "body"
