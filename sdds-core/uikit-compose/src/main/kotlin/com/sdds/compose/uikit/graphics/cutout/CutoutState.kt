package com.sdds.compose.uikit.graphics.cutout

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.internal.drawWithLayer

/**
 * Состояние, связывающее источники и цели вырезов в одном composable-поддереве.
 *
 * Один экземпляр [CutoutState] должен быть доступен и целям, на которых нужно
 * вырезать отверстия, и источникам, описывающим геометрию этих вырезов.
 *
 * Обычно состояние создаётся через [rememberCutoutState] и передаётся ниже по дереву
 * с помощью [ProvideCutoutState].
 */
@Stable
interface CutoutState

/**
 * Создаёт и запоминает состояние cutout-реестра.
 *
 * Возвращённый объект используется для обмена данными между [Modifier.cutout]
 * и [Modifier.cutoutTarget].
 */
@Composable
fun rememberCutoutState(): CutoutState = remember { CutoutStateImpl() }

/**
 * Предоставляет [CutoutState] для текущего composable-поддерева.
 *
 * Внутри [content] и источники вырезов, и цели вырезов смогут получить общее состояние
 * через локальный контекст без явной передачи [state] в каждый модификатор.
 *
 * Это особенно полезно, когда цель выреза и элементы overlay расположены в виде sibling-узлов,
 * как, например, в [com.sdds.compose.uikit.Avatar].
 *
 * @param state общее состояние cutout-системы
 * @param content контент, внутри которого доступно состояние
 */
@Composable
fun ProvideCutoutState(
    state: CutoutState = rememberCutoutState(),
    content: @Composable () -> Unit,
) {
    CompositionLocalProvider(
        LocalCutoutState provides state,
        content = content,
    )
}

/**
 * Помечает composable как цель, в которой должны вырезаться зарегистрированные области.
 *
 * Модификатор рисует контент в отдельном слое и затем вырезает из него все области,
 * зарегистрированные ближайшими [Modifier.cutout] в рамках того же [CutoutState].
 *
 * Чаще всего используется на поверхности базового компонента, поверх которой потом
 * рисуются overlay-элементы. Например, на самом аватаре, если нужно вырезать отверстия
 * под badge, counter или другой `extra`-контент.
 *
 * Если [state] не передан явно, будет использовано значение из [ProvideCutoutState].
 * Если состояние недоступно, модификатор не оказывает эффекта.
 *
 * @param enabled включает или выключает применение вырезов
 * @param state состояние cutout-системы; по умолчанию берётся из локального контекста
 */
fun Modifier.cutoutTarget(
    enabled: Boolean = true,
    state: CutoutState? = null,
): Modifier = composed {
    if (!enabled) return@composed this
    val resolvedState = (state ?: LocalCutoutState.current) as? CutoutStateImpl ?: return@composed this
    var coordinates by remember { mutableStateOf<LayoutCoordinates?>(null) }
    val layoutDirection = LocalLayoutDirection.current

    this
        .onGloballyPositioned { coordinates = it }
        .drawWithContent {
            val targetCoordinates = coordinates
            if (targetCoordinates == null || !targetCoordinates.isAttached) {
                drawContent()
                return@drawWithContent
            }
            val registrations = resolvedState.registrations.values.toList()
            if (registrations.isEmpty()) {
                drawContent()
                return@drawWithContent
            }

            drawWithLayer {
                drawContent()
                val targetBounds = targetCoordinates.boundsInRoot()
                registrations.forEach { registration ->
                    val cutoutCoordinates = registration.coordinates
                    if (!cutoutCoordinates.isAttached) return@forEach
                    val cutoutBounds = cutoutCoordinates.boundsInRoot()
                    val paddedBounds = cutoutBounds.toTargetRect(
                        targetBounds = targetBounds,
                        paddingLeft = registration.spec.padding
                            .calculateLeftPadding(layoutDirection)
                            .roundToPx(),
                        paddingTop = registration.spec.padding
                            .calculateTopPadding()
                            .roundToPx(),
                        paddingRight = registration.spec.padding
                            .calculateRightPadding(layoutDirection)
                            .roundToPx(),
                        paddingBottom = registration.spec.padding
                            .calculateBottomPadding()
                            .roundToPx(),
                    )
                    if (paddedBounds.width <= 0f || paddedBounds.height <= 0f) return@forEach

                    val outline = registration.spec.shape.createOutline(
                        size = paddedBounds.size,
                        layoutDirection = layoutDirection,
                        density = this,
                    )
                    withTransform(
                        transformBlock = {
                            translate(
                                left = paddedBounds.left,
                                top = paddedBounds.top,
                            )
                        },
                    ) {
                        drawOutline(
                            outline = outline,
                            color = Color.Transparent,
                            blendMode = BlendMode.Clear,
                        )
                    }
                }
            }
        }
}

/**
 * Регистрирует composable как источник выреза для ближайшей cutout-цели.
 *
 * Модификатор отслеживает фактические координаты composable после layout и передаёт их
 * в общее [CutoutState]. Цель, отмеченная [Modifier.cutoutTarget], использует эти данные,
 * чтобы вырезать отверстие точно по текущим bounds элемента.
 *
 * Типичный сценарий использования:
 * - базовый компонент рисуется с [Modifier.cutoutTarget]
 * - overlay-элемент рисуется поверх него
 * - overlay-элемент получает [Modifier.cutout], чтобы его границы превратились в вырез
 *
 * Параметр [shape] определяет форму отверстия, а [padding] позволяет сделать вырез
 * чуть больше самого overlay-элемента.
 *
 * Если [state] не передан явно, будет использовано значение из [ProvideCutoutState].
 * Если состояние недоступно, модификатор не оказывает эффекта.
 *
 * @param shape форма вырезаемой области
 * @param padding дополнительное расширение выреза по горизонтали и вертикали
 * @param enabled включает или выключает регистрацию выреза
 * @param state состояние cutout-системы; по умолчанию берётся из локального контекста
 */
fun Modifier.cutout(
    shape: Shape = CircleShape,
    padding: PaddingValues = PaddingValues(horizontal = 3.dp, vertical = 3.dp),
    enabled: Boolean = true,
    state: CutoutState? = null,
): Modifier = composed {
    if (!enabled) return@composed this
    val resolvedState = (state ?: LocalCutoutState.current) as? CutoutStateImpl ?: return@composed this
    val registrationId = remember { Any() }
    var coordinates by remember { mutableStateOf<LayoutCoordinates?>(null) }
    val spec = remember(shape, padding) { CutoutSpec(shape = shape, padding = padding) }

    androidx.compose.runtime.DisposableEffect(resolvedState, registrationId) {
        onDispose {
            resolvedState.remove(registrationId)
        }
    }

    androidx.compose.runtime.SideEffect {
        coordinates?.let { resolvedState.upsert(registrationId, it, spec) }
    }

    this.onGloballyPositioned {
        coordinates = it
        resolvedState.upsert(registrationId, it, spec)
    }
}

private val LocalCutoutState = androidx.compose.runtime.compositionLocalOf<CutoutState?> { null }

private data class CutoutSpec(
    val shape: Shape,
    val padding: PaddingValues,
)

private data class CutoutRegistration(
    val coordinates: LayoutCoordinates,
    val spec: CutoutSpec,
)

private class CutoutStateImpl : CutoutState {
    val registrations = mutableStateMapOf<Any, CutoutRegistration>()

    fun upsert(
        id: Any,
        coordinates: LayoutCoordinates,
        spec: CutoutSpec,
    ) {
        registrations[id] = CutoutRegistration(
            coordinates = coordinates,
            spec = spec,
        )
    }

    fun remove(id: Any) {
        registrations.remove(id)
    }
}

private fun Rect.toTargetRect(
    targetBounds: Rect,
    paddingLeft: Int,
    paddingTop: Int,
    paddingRight: Int,
    paddingBottom: Int,
): Rect = Rect(
    left = left - targetBounds.left - paddingLeft,
    top = top - targetBounds.top - paddingTop,
    right = right - targetBounds.left + paddingRight,
    bottom = bottom - targetBounds.top + paddingBottom,
)
