package com.sdds.plasma.homeds.components.bubble

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.toSize
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.rememberMotionContext
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.icons.R
import com.sdds.plasma.homeds.motion.bubble.rememberBubbleMotion
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

/**
 * Триггер апсейл-бабла на карточке устройства.
 *
 * Кладётся внутрь карточки как обычный дочерний composable. Требует смонтированного выше по дереву
 * [BubbleHost] (см. [LocalBubbleHostState]) — развёрнутый бабл рисуется хостом поверх сетки, а не
 * внутри самого триггера. Без хоста триггер остаётся обычной свёрнутой иконкой и не показывает
 * overlay-body даже при `expanded = true`.
 *
 * Наличие всего Bubble управляется монтированием компонента, а состояние body полностью задаётся
 * controlled-параметром [expanded]. Callback-и только сообщают о действиях пользователя и не
 * меняют состояние самостоятельно.
 *
 * @param onExpandedClick колбэк клика по телу развёрнутого бабла (переход на экран апсейла)
 * @param expanded раскрыто ли тело бабла
 * @param modifier модификатор
 * @param placement с какой стороны от триггера появляется тело бабла, см. [BubblePlacement].
 * [BubblePlacement.Auto] перекладывает выбор на компонент
 * @param alignment выравнивание тела вдоль оси, перпендикулярной [placement], см. [BubbleAlignment].
 * Игнорируется при [BubblePlacement.Auto]
 * @param style стиль компонента
 * @param onDismissRequest запрос на закрытие по клику на крестик; состояние меняет вызывающая сторона
 * @param onTriggerClick колбэк клика по свёрнутому триггеру; состояние меняет вызывающая сторона
 * @param onTriggerVisibilityChange вызывается только при изменении полной видимости триггера в
 * границах Host; после `true` сообщает `false` также при отсоединении или удалении триггера
 * @param contentDescription описание для доступности на кликабельной иконке-триггере
 * @param content содержимое развёрнутого бабла — произвольный слот вызывающей стороны
 */
@Suppress("CyclomaticComplexMethod")
@Composable
public fun BubbleTrigger(
    onExpandedClick: () -> Unit,
    expanded: Boolean,
    modifier: Modifier = Modifier,
    placement: BubblePlacement = BubblePlacement.Top,
    alignment: BubbleAlignment = BubbleAlignment.End,
    style: BubbleStyle = LocalBubbleStyle.current,
    onDismissRequest: (() -> Unit)? = null,
    onTriggerClick: (() -> Unit)? = null,
    onTriggerVisibilityChange: ((Boolean) -> Unit)? = null,
    contentDescription: String? = null,
    content: @Composable () -> Unit,
) {
    val hostState = LocalBubbleHostState.current
    val key = remember { Any() }
    val badgeInteractionSource = remember { MutableInteractionSource() }
    val badgeMotion = rememberBubbleMotion(motionContext = rememberMotionContext(badgeInteractionSource))
    val circleSize by style.dimensions.circleSize.getDpAsState(badgeMotion.context, badgeMotion.style.circleSize)

    val expandProgress = remember { Animatable(0f) }
    val iconMorph = remember { Animatable(0f) }
    val rotationProgress = remember { Animatable(0f) }
    val bounceProgress = remember { Animatable(0f) }
    var anchorPosition by remember { mutableStateOf(Offset.Zero) }
    val triggerCoordinatesRef = remember { MutableRef<LayoutCoordinates?>(null) }
    var triggerVisible by remember { mutableStateOf(false) }

    LaunchedEffect(expanded) {
        animateBubbleExpansion(
            expanded = expanded,
            expandProgress = expandProgress,
            iconMorph = iconMorph,
            rotationProgress = rotationProgress,
            bounceProgress = bounceProgress,
            expandDurationMillis = style.expandDurationMillis,
            collapseDurationMillis = style.collapseDurationMillis,
        )
    }

    val currentExpanded = rememberUpdatedState(expanded)
    val currentPlacement = rememberUpdatedState(placement)
    val currentAlignment = rememberUpdatedState(alignment)
    val currentStyle = rememberUpdatedState(style)
    val currentContent = rememberUpdatedState(content)
    val currentOnExpandedClick = rememberUpdatedState(onExpandedClick)
    val currentOnDismissRequest = rememberUpdatedState(onDismissRequest)
    val currentOnTriggerVisibilityChange = rememberUpdatedState(onTriggerVisibilityChange)
    val currentDensity = rememberUpdatedState(LocalDensity.current)
    val currentLayoutDirection = rememberUpdatedState(LocalLayoutDirection.current)
    val rootCoordinates = hostState?.rootCoordinates

    fun updateTriggerVisibility(coordinates: LayoutCoordinates?) {
        val visible = coordinates.isFullyVisibleIn(rootCoordinates)
        if (visible != triggerVisible) {
            triggerVisible = visible
            currentOnTriggerVisibilityChange.value?.invoke(visible)
        }
    }

    // Ключ только rootCoordinates (меняется редко — поворот/инсеты/ресайз хоста): onGloballyPositioned
    // ниже и так синхронно пересчитывает видимость при каждом изменении позиции самого триггера,
    // а triggerCoordinates — новый объект на каждый layout-проход (в т.ч. каждый кадр скролла сетки),
    // поэтому не должен быть ключом/Snapshot-state — иначе пересоздание корутины и рекомпозиция
    // BubbleTrigger на каждый кадр скролла для каждого триггера в списке.
    LaunchedEffect(rootCoordinates) {
        updateTriggerVisibility(triggerCoordinatesRef.value)
    }

    DisposableEffect(hostState, key) {
        onDispose {
            hostState?.unregister(key)
            if (triggerVisible) {
                triggerVisible = false
                currentOnTriggerVisibilityChange.value?.invoke(false)
            }
        }
    }

    if (hostState != null) {
        LaunchedEffect(hostState, key) {
            snapshotFlow { currentExpanded.value || expandProgress.value > 0f }
                .distinctUntilChanged()
                .collect { visible ->
                    if (visible) {
                        val (resolvedPlacement, resolvedAlignment) = if (
                            currentPlacement.value == BubblePlacement.Auto
                        ) {
                            resolveAutoBubblePlacement(
                                hostSize = hostState.rootCoordinates?.size?.toSize() ?: Size.Zero,
                                anchorPosition = anchorPosition,
                                circleDiameterPx = with(currentDensity.value) { circleSize.toPx() },
                                layoutDirection = currentLayoutDirection.value,
                            )
                        } else {
                            currentPlacement.value to currentAlignment.value
                        }
                        hostState.register(
                            BubbleOverlayEntry(
                                key = key,
                                anchorPosition = { anchorPosition },
                                expandProgress = { expandProgress.value },
                                iconMorphProgress = { iconMorph.value },
                                rotationProgress = { rotationProgress.value },
                                bounceProgress = { bounceProgress.value },
                                placement = resolvedPlacement,
                                alignment = resolvedAlignment,
                                style = currentStyle.value,
                                onBodyClick = { currentOnExpandedClick.value() },
                                onCloseClick = { currentOnDismissRequest.value?.invoke() },
                                content = { currentContent.value() },
                            ),
                        )
                    } else {
                        hostState.unregister(key)
                    }
                }
        }
    }

    Box(
        modifier = modifier
            .size(circleSize)
            .onGloballyPositioned { coordinates ->
                triggerCoordinatesRef.value = coordinates
                val root = hostState?.rootCoordinates
                if (root != null && root.isAttached) {
                    anchorPosition = root.localPositionOf(coordinates, Offset.Zero)
                }
                updateTriggerVisibility(coordinates)
            },
    ) {
        val bodyBrush by style.colors.bodyBrush.getBrushAsState(badgeMotion.context, badgeMotion.style.bodyColor)
        val iconBrush by style.colors.iconBrush.getBrushAsState(badgeMotion.context, badgeMotion.style.iconColor)
        val borderBrush by style.colors.borderBrush.getBrushAsState(badgeMotion.context, badgeMotion.style.borderColor)
        val iconSize by style.dimensions.iconSize.getDpAsState(badgeMotion.context, badgeMotion.style.iconSize)
        val glowLayer = style.innerGlowLayer(badgeInteractionSource)
        Box(
            modifier = Modifier
                .size(circleSize)
                .graphicsLayer {
                    alpha = if (expanded) 0f else 1f
                }
                .then(
                    if (contentDescription != null) {
                        Modifier.semantics { this.contentDescription = contentDescription }
                    } else {
                        Modifier
                    },
                )
                .clickable(
                    interactionSource = badgeInteractionSource,
                    indication = null,
                    onClick = {
                        if (!expanded) {
                            onTriggerClick?.invoke()
                        }
                    },
                )
                .drawWithCache {
                    val outline = BubbleStarFourShape.createOutline(size, layoutDirection, this)
                    val path = (outline as Outline.Generic).path
                    val glowRadiusPx = glowLayer?.blurRadius?.toPx() ?: 0f
                    val glowPainter = createBubbleInnerGlowPainter(size)
                    onDrawBehind {
                        drawPath(path, bodyBrush)
                        if (glowLayer != null) {
                            with(glowPainter) { draw(path, glowLayer.color, glowRadiusPx) }
                        }
                    }
                },
            contentAlignment = Alignment.Center,
        ) {
            BubbleTriggerIcon(
                morphProgress = { 0f },
                rotationProgress = { 0f },
                sizeScale = { 1f },
                tint = iconBrush,
                starIcon = style.starIcon,
                closeIcon = style.closeIcon,
                backgroundBrush = bodyBrush,
                borderBrush = borderBrush,
                borderSize = circleSize,
                glowLayer = glowLayer,
                modifier = Modifier.size(iconSize),
            )
        }
    }
}

/**
 * Перегрузка [BubbleTrigger] без произвольного content-слота: текст + иконка-шеврон + прогресс-бар.
 * Делегирует основной перегрузке.
 *
 * @param onExpandedClick см. основную перегрузку
 * @param expanded см. основную перегрузку
 * @param text текст содержимого развёрнутого бабла
 * @param progress прогресс `0f..1f` (значения вне диапазона — зажимаются), отображается прогресс-баром
 * под текстом — см. [BubbleProgress]. Не читается, если `hasProgress = false`
 * @param hasProgress показывать ли прогресс-бар
 * @param modifier см. основную перегрузку
 * @param placement см. основную перегрузку
 * @param alignment см. основную перегрузку
 * @param style см. основную перегрузку
 * @param onDismissRequest см. основную перегрузку
 * @param onTriggerClick см. основную перегрузку
 * @param onTriggerVisibilityChange см. основную перегрузку
 * @param contentDescription см. основную перегрузку
 * @param chevronIcon иконка-шеврон справа от текста
 */
@Composable
public fun BubbleTrigger(
    onExpandedClick: () -> Unit,
    expanded: Boolean,
    text: String,
    progress: Float,
    modifier: Modifier = Modifier,
    hasProgress: Boolean = true,
    placement: BubblePlacement = BubblePlacement.Top,
    alignment: BubbleAlignment = BubbleAlignment.End,
    style: BubbleStyle = LocalBubbleStyle.current,
    onDismissRequest: (() -> Unit)? = null,
    onTriggerClick: (() -> Unit)? = null,
    onTriggerVisibilityChange: ((Boolean) -> Unit)? = null,
    contentDescription: String? = null,
    @DrawableRes chevronIcon: Int = R.drawable.ic_disclosure_right_outline_16,
) {
    BubbleTrigger(
        onExpandedClick = onExpandedClick,
        expanded = expanded,
        modifier = modifier,
        placement = placement,
        alignment = alignment,
        style = style,
        onDismissRequest = onDismissRequest,
        onTriggerClick = onTriggerClick,
        onTriggerVisibilityChange = onTriggerVisibilityChange,
        contentDescription = contentDescription,
    ) {
        BubbleTriggerTextContent(
            text = text,
            progress = progress,
            hasProgress = hasProgress,
            chevronIcon = chevronIcon,
            style = style,
        )
    }
}

/**
 * Стандартное содержимое перегрузки [BubbleTrigger] с `text`/`progress`: текст с иконкой-шевроном,
 * встроенной в поток текста как inline-контент, плюс опциональный прогресс-бар под ним.
 */
@Composable
private fun BubbleTriggerTextContent(
    text: String,
    progress: Float,
    hasProgress: Boolean,
    @DrawableRes chevronIcon: Int,
    style: BubbleStyle,
) {
    val density = LocalDensity.current
    val chevronOverlap = style.dimensions.chevronTextOverlap.getDefaultValue()
    val chevronIconSize = style.dimensions.chevronIconSize.getDefaultValue()
    val annotatedText = remember(text) {
        buildAnnotatedString {
            append(text)
            appendInlineContent(CHEVRON_INLINE_CONTENT_ID)
        }
    }
    val inlineContent = remember(chevronIcon, density, chevronOverlap, chevronIconSize) {
        val chevronSizeSp = with(density) { chevronIconSize.toSp() }
        mapOf(
            CHEVRON_INLINE_CONTENT_ID to InlineTextContent(
                placeholder = Placeholder(
                    width = chevronSizeSp,
                    height = chevronSizeSp,
                    placeholderVerticalAlign = PlaceholderVerticalAlign.Center,
                ),
                children = {
                    Icon(
                        source = resourceImageSource(chevronIcon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(chevronIconSize)
                            .offset(x = -chevronOverlap),
                    )
                },
            ),
        )
    }
    Column(modifier = Modifier.width(style.dimensions.width.getDefaultValue())) {
        Text(text = annotatedText, inlineContent = inlineContent)
        if (hasProgress) {
            Spacer(modifier = Modifier.height(style.dimensions.progressSpacing.getDefaultValue()))
            BubbleProgress(
                progress = progress,
                style = style,
                modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

/**
 * Параллельно анимирует все четыре таймлайна разворота/сворачивания тела бабла к состоянию
 * [expanded].
 */
private suspend fun animateBubbleExpansion(
    expanded: Boolean,
    expandProgress: Animatable<Float, AnimationVector1D>,
    iconMorph: Animatable<Float, AnimationVector1D>,
    rotationProgress: Animatable<Float, AnimationVector1D>,
    bounceProgress: Animatable<Float, AnimationVector1D>,
    expandDurationMillis: Int,
    collapseDurationMillis: Int,
) {
    val target = if (expanded) 1f else 0f
    val durationMs = if (expanded) expandDurationMillis else collapseDurationMillis
    coroutineScope {
        launch { expandProgress.animateTo(target, tween(durationMs, easing = LinearOutSlowInEasing)) }
        launch { iconMorph.animateTo(target, tween(durationMs, easing = LinearOutSlowInEasing)) }
        launch { rotationProgress.animateTo(target, tween(durationMs, easing = BubbleRotationOvershootEasing)) }
        launch { bounceProgress.animateTo(target, tween(durationMs, easing = BubbleBounceEasing)) }
    }
}

private const val CHEVRON_INLINE_CONTENT_ID = "bubbleChevron"

private fun LayoutCoordinates?.isFullyVisibleIn(hostCoordinates: LayoutCoordinates?): Boolean {
    if (this == null || hostCoordinates == null) return false
    if (!isAttached || !hostCoordinates.isAttached) return false
    val bounds = hostCoordinates.localBoundingBoxOf(this, clipBounds = false)
    val hasArea = bounds.width > 0f && bounds.height > 0f
    val isHorizontallyInside = bounds.left >= 0f && bounds.right <= hostCoordinates.size.width
    val isVerticallyInside = bounds.top >= 0f && bounds.bottom <= hostCoordinates.size.height
    return hasArea && isHorizontallyInside && isVerticallyInside
}

/**
 * Обычный (не Snapshot-state) изменяемый холдер — для значений, которые должны переживать
 * рекомпозицию, но не обязаны сами её вызывать при записи.
 */
private class MutableRef<T>(var value: T)
