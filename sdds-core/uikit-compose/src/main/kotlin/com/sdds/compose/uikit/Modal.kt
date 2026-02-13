package com.sdds.compose.uikit

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Transition
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.rememberTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.window.DialogProperties
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.internal.clickableWithoutIndication
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.modal.EdgeToEdgeDialog
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.shadow.getShadowSafePaddings
import com.sdds.compose.uikit.shadow.shadow

/**
 * Компонент Modal
 *
 * @param show будет ли показан Modal
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне Modal
 * @param modifier модификатор для контента [content]
 * @param style стиль компонента
 * @param dialogProperties свойства [DialogProperties]
 * @param hasClose должна ли показываться иконка закрытия в правом верхнем углу контента [content]
 * @param closeIcon иконка закрытия
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [Modal].
 * @param interactionSource источник взаимодействий
 * @param content контент Modal
 */
@Deprecated("Use Modal with dimBackground instead")
@NonRestartableComposable
@Composable
fun Modal(
    show: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    style: ModalStyle = LocalModalStyle.current,
    dialogProperties: DialogProperties = DefaultDialogProperties,
    hasClose: Boolean = true,
    closeIcon: Painter? = null,
    useNativeBlackout: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable BoxScope.() -> Unit,
) {
    Modal(
        show = show,
        dimBackground = useNativeBlackout,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        style = style,
        dialogProperties = dialogProperties,
        hasClose = hasClose,
        closeIcon = closeIcon,
        useNativeBlackout = useNativeBlackout,
        interactionSource = interactionSource,
        content = content,
    )
}

/**
 * Компонент Modal
 *
 * @param show будет ли показан Modal
 * @param dimBackground нужно ли затемнять фон
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне Modal
 * @param modifier модификатор для контента [content]
 * @param style стиль компонента
 * @param gravity расположение контента в окне
 * @param dialogProperties свойства [DialogProperties]
 * @param hasClose должна ли показываться иконка закрытия в правом верхнем углу контента [content]
 * @param closeIcon иконка закрытия
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [Modal].
 * Работает только при [dimBackground] == true
 * @param interactionSource источник взаимодействий
 * @param animations настройки анимаций модального окна
 * @param content контент Modal
 */
@Composable
fun Modal(
    show: Boolean,
    dimBackground: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    style: ModalStyle = LocalModalStyle.current,
    gravity: ModalGravity = ModalGravity.Center,
    dialogProperties: DialogProperties = DefaultOverlayDialogProperties,
    edgeToEdge: Boolean = true,
    hasClose: Boolean = true,
    closeIcon: Painter? = null,
    useNativeBlackout: Boolean = false,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    animations: ModalAnimations = ModalAnimations(),
    content: @Composable BoxScope.() -> Unit,
) {
    val visibleState = remember { MutableTransitionState(false) }
    visibleState.targetState = show

    if (!show && !visibleState.currentState) return

    EdgeToEdgeDialog(
        onDismissRequest = onDismissRequest,
        dialogProperties = dialogProperties,
        edgeToEdge = edgeToEdge,
        useNativeBlackout = dimBackground && useNativeBlackout,
        blurRadius = style.dimensions.backgroundBlurRadius,
    ) {
        val transition = rememberTransition(visibleState, null)
        OverlayOrBox(
            hasOverlay = dimBackground && !useNativeBlackout,
            style = style,
            dialogProperties = dialogProperties,
            onDismissRequest = onDismissRequest,
            animations = animations,
            transition = transition,
        ) {
            val shadowPaddings = style.shadow.getShadowSafePaddings()
            val shadowOffset = getShadowOffset(shadowPaddings, gravity, useNativeBlackout)
            transition.AnimatedVisibility(
                modifier = Modifier.alignModal(gravity) { shadowOffset },
                visible = { it },
                enter = animations.contentEnterTransition,
                exit = animations.contentExitTransition,
            ) {
                Box(
                    modifier = Modifier
                        .modalShadow(useNativeBlackout, shadowPaddings, style)
                        .then(modifier)
                        .clickable(enabled = false) {}
                        .background(
                            brush = style.colors.backgroundColor.getValue(interactionSource),
                            shape = style.shape,
                        )
                        .padding(
                            start = style.dimensions.paddingStart,
                            end = style.dimensions.paddingEnd,
                            top = style.dimensions.paddingTop,
                            bottom = style.dimensions.paddingBottom,
                        ),
                ) {
                    content.invoke(this)
                    if (hasClose && closeIcon != null) {
                        IconClose(style, onDismissRequest, closeIcon)
                    }
                }
            }
        }
    }
}

/**
 * Расположение контента в модальном окне
 */
enum class ModalGravity(internal val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopCenter(Alignment.TopCenter),
    TopEnd(Alignment.TopEnd),
    CenterStart(Alignment.CenterStart),
    Center(Alignment.Center),
    CenterEnd(Alignment.CenterEnd),
    BottomStart(Alignment.BottomStart),
    BottomCenter(Alignment.BottomCenter),
    BottomEnd(Alignment.BottomEnd),
}

/**
 * Настройки анимации модального окна [Modal]
 *
 * @property contentEnterTransition анимация появления контента модального окна
 * @property contentExitTransition анимация исчезновения контента модального окна
 * @property overlayEnterSpec спецификация анимации альфы при появлении [Overlay] модального окна
 * @property overlayExitSpec спецификация анимации альфы при исчезновении [Overlay] модального окна
 */
@Immutable
data class ModalAnimations(
    val contentEnterTransition: EnterTransition = fadeIn(),
    val contentExitTransition: ExitTransition = ExitTransition.None,
    val overlayEnterSpec: FiniteAnimationSpec<Float> = tween(),
    val overlayExitSpec: FiniteAnimationSpec<Float> = tween(0),
)

private fun Modifier.alignModal(gravity: ModalGravity, shadowOffset: () -> IntOffset): Modifier {
    return this.layout { measurable, constraints ->
        val placeable = measurable.measure(
            constraints.copy(
                minWidth = 0,
                minHeight = 0,
                maxWidth = Constraints.Infinity,
                maxHeight = Constraints.Infinity,
            ),
        )
        val width = constraints.constrainWidth(placeable.widthOrZero())
        val height = constraints.constrainHeight(placeable.heightOrZero())
        layout(width, height) {
            val position = gravity.alignment.align(
                size = IntSize(placeable.width, placeable.height),
                space = IntSize(constraints.maxWidth, constraints.maxHeight),
                layoutDirection = layoutDirection,
            )
            placeable.placeRelative(position + shadowOffset.invoke())
        }
    }
}

private fun Modifier.modalShadow(
    useNativeBlackout: Boolean,
    shadowPaddings: PaddingValues,
    style: ModalStyle,
): Modifier {
    return if (useNativeBlackout) {
        this
    } else {
        this
            .padding(shadowPaddings)
            .shadow(style.shadow, style.shape)
    }
}

@Composable
private fun getShadowOffset(
    shadowPaddings: PaddingValues,
    gravity: ModalGravity,
    useNativeBlackout: Boolean,
): IntOffset {
    if (useNativeBlackout) return IntOffset.Zero
    val layoutDirection = LocalLayoutDirection.current
    return with(LocalDensity.current) {
        val topPadding = shadowPaddings.calculateTopPadding().roundToPx()
        val bottomPadding = shadowPaddings.calculateBottomPadding().roundToPx()
        val startPadding = shadowPaddings.calculateStartPadding(layoutDirection).roundToPx()
        val endPadding = shadowPaddings.calculateEndPadding(layoutDirection).roundToPx()
        val verticalOffset = when (gravity) {
            ModalGravity.TopEnd, ModalGravity.TopCenter, ModalGravity.TopStart -> -topPadding
            ModalGravity.BottomEnd, ModalGravity.BottomCenter, ModalGravity.BottomStart -> bottomPadding
            else -> (bottomPadding - topPadding) / 2
        }
        val horizontalOffset = when (gravity) {
            ModalGravity.TopStart, ModalGravity.CenterStart, ModalGravity.BottomStart -> -startPadding
            ModalGravity.TopEnd, ModalGravity.CenterEnd, ModalGravity.BottomEnd -> endPadding
            else -> (endPadding - startPadding) / 2
        }
        IntOffset(horizontalOffset, verticalOffset)
    }
}

@Composable
private fun OverlayOrBox(
    hasOverlay: Boolean,
    style: ModalStyle,
    dialogProperties: DialogProperties,
    onDismissRequest: () -> Unit,
    transition: Transition<Boolean>,
    animations: ModalAnimations,
    modalContent: @Composable BoxScope.() -> Unit,
) {
    val outsideClickableModifier = if (dialogProperties.dismissOnClickOutside) {
        Modifier.clickableWithoutIndication { onDismissRequest.invoke() }
    } else {
        Modifier
    }
    val containerModifier = Modifier
        .fillMaxSize()
        .then(outsideClickableModifier)
    if (hasOverlay) {
        val overlayAlpha by transition.animateFloat(
            transitionSpec = {
                if (targetState) {
                    animations.overlayEnterSpec
                } else {
                    animations.overlayExitSpec
                }
            },
        ) { visible -> if (visible) 1f else 0f }
        Overlay(
            modifier = containerModifier
                .graphicsLayer { this.alpha = overlayAlpha },
            style = style.overlayStyle,
            content = modalContent,
        )
    } else {
        Box(
            modifier = containerModifier,
            content = modalContent,
        )
    }
}

@Composable
private fun BoxScope.IconClose(
    style: ModalStyle,
    onDismissRequest: () -> Unit,
    closeIcon: Painter,
) {
    val size = style.dimensions.closeSize
    val closeInteractionSource = remember { MutableInteractionSource() }
    Icon(
        modifier = Modifier
            .size(size)
            .defaultMinSize(size, size)
            .align(Alignment.TopEnd)
            .clickable(
                indication = null,
                interactionSource = closeInteractionSource,
            ) { onDismissRequest.invoke() },
        painter = closeIcon,
        contentDescription = "",
        tint = style.colors.closeColor.colorForInteraction(closeInteractionSource),
    )
}

private val DefaultDialogProperties = DialogProperties()

private val DefaultOverlayDialogProperties = DialogProperties(
    usePlatformDefaultWidth = true,
    decorFitsSystemWindows = false,
)
