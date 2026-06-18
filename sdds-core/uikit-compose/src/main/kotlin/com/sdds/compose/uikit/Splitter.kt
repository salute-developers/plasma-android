package com.sdds.compose.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.interactions.setExclusiveEnum
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.splitter.SplitterMotionStyle
import com.sdds.compose.uikit.motion.components.splitter.rememberSplitterMotion

/**
 * Компонент Splitter - используется для визуального разделения контента
 *
 * @param hasHandle отображение ручки
 * @param modifier модификатор
 * @param style стиль компонента
 * @param orientation расположение компонента
 * @param motion объект анимаций
 */
@Composable
fun Splitter(
    hasHandle: Boolean,
    modifier: Modifier = Modifier,
    style: SplitterStyle = LocalSplitterStyle.current,
    orientation: SplitterOrientation = LocalSplitterOrientation.current,
    motion: Motion<SplitterMotionStyle> = rememberSplitterMotion(),
) {
    SideEffect {
        motion.context.semanticStateSource.setExclusiveEnum(orientation)
    }

    val newModifier = modifier.then(
        Modifier.clickable(
            interactionSource = motion.context.interactionSource,
            indication = null,
            onClick = {},
        ),
    )

    val dividerStyle =
        DividerStyle.builder()
            .shape(style.dividerShape)
            .color { backgroundColor(style.color.dividerColor) }
            .dimensions { thickness(style.dimensions.dividerThickness) }
            .style()

    if (!hasHandle) {
        Divider(
            modifier = newModifier,
            orientation = orientation.toDividerOrientation(),
            style = dividerStyle,
            motion = motion,
        )
    } else {
        val handleStyle = DividerStyle.builder()
            .shape(style.handleShape)
            .color { backgroundColor(style.color.handleColor) }
            .dimensions { thickness(style.dimensions.handleThickness) }
            .style()
        when (orientation) {
            SplitterOrientation.Horizontal -> HorizontalSplitter(
                newModifier,
                dividerStyle,
                handleStyle,
                style,
                motion,
            )

            else -> VerticalSplitter(
                newModifier,
                dividerStyle,
                handleStyle,
                style,
                motion,
            )
        }
    }
}

/**
 * Ориентация [Splitter]
 */
enum class SplitterOrientation : ValueState {
    /**
     * Горизонтальная
     */
    Horizontal,

    /**
     * Вертикальная
     */
    Vertical,
}

/**
 * CompositionLocal для [SplitterOrientation]
 */
val LocalSplitterOrientation = compositionLocalOf { SplitterOrientation.Vertical }

@Composable
private fun HorizontalSplitter(
    modifier: Modifier,
    dividerStyle: DividerStyle,
    handleStyle: DividerStyle,
    splitterStyle: SplitterStyle,
    motion: Motion<SplitterMotionStyle>,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Divider(
            modifier = Modifier.weight(1f),
            style = dividerStyle,
            fillAvailableLength = false,
            motion = motion,
        )
        HorizontalHandle(
            splitterStyle = splitterStyle,
            handleStyle = handleStyle,
            motion = motion,
        )
        Divider(
            modifier = Modifier.weight(1f),
            style = dividerStyle,
            fillAvailableLength = false,
            motion = motion,
        )
    }
}

@Composable
private fun VerticalSplitter(
    modifier: Modifier,
    dividerStyle: DividerStyle,
    handleStyle: DividerStyle,
    splitterStyle: SplitterStyle,
    motion: Motion<SplitterMotionStyle>,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Divider(
            modifier = Modifier.weight(1f),
            style = dividerStyle,
            orientation = DividerOrientation.Vertical,
            fillAvailableLength = false,
            motion = motion,
        )
        VerticalHandle(
            splitterStyle = splitterStyle,
            handleStyle = handleStyle,
            motion = motion,
        )
        Divider(
            modifier = Modifier.weight(1f),
            style = dividerStyle,
            orientation = DividerOrientation.Vertical,
            fillAvailableLength = false,
            motion = motion,
        )
    }
}

@Composable
private fun HorizontalHandle(
    splitterStyle: SplitterStyle,
    handleStyle: DividerStyle,
    motion: Motion<SplitterMotionStyle>,
) {
    val gap by splitterStyle.dimensions.gap.getValueAsState(motion.context)
    val space by splitterStyle.dimensions.handleSpacer.getValueAsState(motion.context)
    Box(
        modifier = Modifier
            .width(gap),
        contentAlignment = Alignment.Center,
    ) {
        Column(
            modifier = Modifier
                .padding(splitterStyle.dimensions.getPaddings(motion)),
            verticalArrangement = Arrangement.spacedBy(space),
        ) {
            Divider(
                style = handleStyle,
                motion = motion,
            )
            Divider(
                style = handleStyle,
                motion = motion,
            )
        }
    }
}

@Composable
private fun VerticalHandle(
    splitterStyle: SplitterStyle,
    handleStyle: DividerStyle,
    motion: Motion<SplitterMotionStyle>,
) {
    val gap by splitterStyle.dimensions.gap.getValueAsState(motion.context)
    val space by splitterStyle.dimensions.handleSpacer.getValueAsState(motion.context)
    Box(
        modifier = Modifier
            .height(gap),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier
                .padding(splitterStyle.dimensions.getPaddings(motion)),
            horizontalArrangement = Arrangement.spacedBy(space),
        ) {
            Divider(
                style = handleStyle,
                orientation = DividerOrientation.Vertical,
                motion = motion,
            )
            Divider(
                style = handleStyle,
                orientation = DividerOrientation.Vertical,
                motion = motion,
            )
        }
    }
}

@Composable
private fun SplitterDimensions.getPaddings(
    motion: Motion<SplitterMotionStyle>,
) = PaddingValues(
    handleStartPadding.getValueAsState(motion.context).value,
    handleTopPadding.getValueAsState(motion.context).value,
    handleEndPadding.getValueAsState(motion.context).value,
    handleBottomPadding.getValueAsState(motion.context).value,
)

private fun SplitterOrientation.toDividerOrientation() =
    when (this) {
        SplitterOrientation.Vertical -> DividerOrientation.Vertical
        else -> DividerOrientation.Horizontal
    }

@Preview
@Composable
private fun HorizontalSplitterPreview() {
    HorizontalSplitter(
        modifier = Modifier.width(200.dp),
        splitterStyle = LocalSplitterStyle.current,
        handleStyle = LocalDividerStyle.current,
        dividerStyle = LocalDividerStyle.current,
        motion = rememberSplitterMotion(),
    )
}
