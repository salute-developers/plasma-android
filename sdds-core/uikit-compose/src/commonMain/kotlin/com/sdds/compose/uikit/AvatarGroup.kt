package com.sdds.compose.uikit

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.internal.AvatarDefaults
import com.sdds.compose.uikit.internal.drawWithLayer
import kotlin.math.max
import kotlin.math.min

/**
 * Скоуп [AvatarGroup]
 * @author Малышев Александр on 22.07.2024
 */
interface AvatarGroupScope {

    /**
     * Добавляет аватар с контентом [content] в [AvatarGroup]
     * @param content аватар
     */
    fun avatar(content: @Composable AvatarGroupItemScope.() -> Unit)

    /**
     * Добавляет несколько аватаров [content] в [AvatarGroup] в кол-ве [count].
     * Для каждого аватара [content] передается его индекс.
     * @param count кол-во аватаров
     * @param content аватар
     */
    fun avatars(count: Int, content: @Composable AvatarGroupItemScope.(Int) -> Unit)

    /**
     * Добавляет счетчик аватаров [content] в [AvatarGroup]
     * @param content счетчик аватаров
     */
    fun counter(content: @Composable AvatarGroupItemScope.(Int) -> Unit)
}

/**
 * Скоуп дочерних элементов [AvatarGroup]
 */
interface AvatarGroupItemScope

/**
 * Контейнер для группы аватаров
 * @param modifier модификатор
 * @param style стиль компонента
 * @param threshold максимальное кол-во отображаемых аватаров
 * @param content контент
 */
@Composable
fun AvatarGroup(
    modifier: Modifier = Modifier,
    style: AvatarGroupStyle = LocalAvatarGroupStyle.current,
    threshold: Int = AvatarDefaults.DefaultThreshold,
    content: AvatarGroupScope.() -> Unit,
) {
    val dimensions = style.dimensions
    val policy = remember(dimensions) {
        avatarGroupMeasurePolicy(dimensions.itemOffset, dimensions.itemSpacing)
    }
    val scope = remember(threshold) { AvatarGroupScopeImpl(threshold) }
    CompositionLocalProvider(
        LocalAvatarGroupStatusEnabled provides false,
        LocalAvatarGroupActionEnabled provides false,
        LocalAvatarStyle provides style.avatarStyle,
    ) {
        Layout(
            modifier = modifier,
            content = {
                scope.content()
                scope.avatars.forEachIndexed { index, avatar ->
                    AvatarContainer(
                        index = index,
                        offset = dimensions.itemOffset.floatPx,
                        shape = style.avatarStyle.shape,
                        clipOut = index < scope.avatars.size - 1 || scope.counter != null,
                        content = avatar.content,
                    )
                }
                val counter = scope.counter
                if (counter != null) {
                    val counterContent = counter.content
                    AvatarGroupItemScopeImpl.counterContent(counter.displayCount)
                }
                scope.reset()
            },
            measurePolicy = policy,
        )
    }
}

/**
 * @param displayCount значение счетчиков
 * @param modifier модификатор
 */
@Composable
@NonRestartableComposable
fun AvatarGroupItemScope.AvatarCounter(
    displayCount: Int,
    modifier: Modifier = Modifier,
) {
    Avatar(
        modifier = modifier,
        painter = null,
        placeholder = AvatarPlaceholder.Text("+$displayCount"),
    )
}

/**
 * Провайдер доступности статуса аватара
 */
internal val LocalAvatarGroupStatusEnabled = compositionLocalOf { true }

/**
 * Провайдер доступности иконки-действия аватара
 */
internal val LocalAvatarGroupActionEnabled = compositionLocalOf { true }

@Composable
private fun AvatarContainer(
    index: Int,
    offset: Float,
    shape: Shape,
    clipOut: Boolean,
    content: (@Composable AvatarGroupItemScope.(Int) -> Unit),
) {
    val density = LocalDensity.current
    Box(
        modifier = Modifier.drawWithLayer {
            drawContent()
            if (clipOut) {
                withTransform({ translate(left = offset) }) {
                    drawOutline(
                        outline = shape.createOutline(size, layoutDirection, density),
                        color = Color.Transparent,
                        blendMode = BlendMode.Clear,
                    )
                }
            }
        },
    ) {
        AvatarGroupItemScopeImpl.content(index)
    }
}

private class AvatarGroupScopeImpl(private val threshold: Int) : AvatarGroupScope {

    val avatars = mutableListOf<Content.Avatar>()
    val counter: Content.Counter?
        get() = _counter.takeIf { itemsCount > threshold }

    private var _counter: Content.Counter? = null
    private var itemsCount: Int = 0

    override fun avatar(content: @Composable AvatarGroupItemScope.() -> Unit) {
        if (avatars.size + 1 <= threshold) {
            avatars.add(Content.Avatar { content() })
        }
        itemsCount++
    }

    override fun avatars(count: Int, content: @Composable (AvatarGroupItemScope.(Int) -> Unit)) {
        repeat(count) {
            if (avatars.size + 1 <= threshold) {
                avatars.add(Content.Avatar(content))
            }
        }
        itemsCount += count
    }

    override fun counter(content: @Composable (AvatarGroupItemScope.(Int) -> Unit)) {
        _counter = Content.Counter(
            displayCount = itemsCount - threshold,
            content = content,
        )
    }

    fun reset() {
        avatars.clear()
        itemsCount = 0
    }

    sealed class Content {
        class Avatar(val content: (@Composable AvatarGroupItemScope.(Int) -> Unit))

        class Counter(
            val displayCount: Int,
            val content: (@Composable AvatarGroupItemScope.(Int) -> Unit),
        )
    }
}

private object AvatarGroupItemScopeImpl : AvatarGroupItemScope

private fun avatarGroupMeasurePolicy(itemOffset: Dp, itemSpacing: Dp) =
    MeasurePolicy { measurables, constraints ->
        var occupiedWidth = 0
        var occupiedHeight = 0
        val offset = itemOffset.roundToPx()
        val spacing = itemSpacing.roundToPx()

        val placeableItems = measurables.mapIndexed { index, child ->
            val maxWidth = constraints.maxWidth
            val placeable = child.measure(
                constraints.copy(
                    minWidth = 0,
                    maxWidth = if (maxWidth == Constraints.Infinity) {
                        Constraints.Infinity
                    } else {
                        maxWidth - occupiedWidth
                    },
                ),
            )
            occupiedHeight = max(placeable.height, occupiedHeight)
            occupiedWidth += if (index < measurables.size - 1) {
                offset + spacing
            } else {
                placeable.width
            }
            placeable
        }

        val desiredWidth = min(constraints.maxWidth, occupiedWidth)
        val desiredHeight = min(constraints.maxHeight, occupiedHeight)
        layout(desiredWidth, desiredHeight) {
            var childLeft = 0
            placeableItems.forEach { placeable ->
                placeable.placeWithLayer(
                    x = childLeft,
                    y = Alignment.CenterVertically.align(placeable.height, desiredHeight),
                ) {
                }
                childLeft += offset + spacing
            }
        }
    }
