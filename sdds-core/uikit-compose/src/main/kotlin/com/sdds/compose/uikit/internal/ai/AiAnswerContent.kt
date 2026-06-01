package com.sdds.compose.uikit.internal.ai

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import com.sdds.compose.uikit.ButtonGroup
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ChipGroup
import com.sdds.compose.uikit.Note
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Spinner
import com.sdds.compose.uikit.ai.AiAnswerErrorScope
import com.sdds.compose.uikit.ai.AiAnswerLoadingScope
import com.sdds.compose.uikit.ai.AiAnswerState
import com.sdds.compose.uikit.ai.AiAnswerStyle
import com.sdds.compose.uikit.ai.motion.AiAnswerMotionStyle
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.internal.common.FlowRowScope
import com.sdds.compose.uikit.internal.common.LocalFlowRowMaxItemsInEachRow
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState

@Composable
internal fun AiAnswerContent(
    modifier: Modifier,
    state: AiAnswerState,
    title: (@Composable () -> Unit)?,
    content: (@Composable () -> Unit)?,
    actionsStart: (ButtonGroupScope.() -> Unit)?,
    actionsEnd: (ButtonGroupScope.() -> Unit)?,
    suggestions: (@Composable FlowRowScope.() -> Unit)?,
    loading: (@Composable AiAnswerLoadingScope.() -> Unit)?,
    error: (@Composable AiAnswerErrorScope.() -> Unit)?,
    style: AiAnswerStyle,
    motion: Motion<AiAnswerMotionStyle>,
) {
    val background = style.colors.background.getBrushAsState(motion.context, motion.style.background)
    val paddingStart = style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd = style.dimensions.paddingEnd.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop = style.dimensions.paddingTop.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom = style.dimensions.paddingBottom.getDpAsState(motion.context, motion.style.paddingBottom)

    Column(
        modifier = modifier
            .backgroundBrush({ background.value })
            .padding(
                start = paddingStart.value,
                end = paddingEnd.value,
                top = paddingTop.value,
                bottom = paddingBottom.value,
            ),
    ) {
        when (state) {
            AiAnswerState.Default -> AiAnswerDefaultContent(
                title = title,
                content = content,
                actionsStart = actionsStart,
                actionsEnd = actionsEnd,
                suggestions = suggestions,
                style = style,
                motion = motion,
            )

            AiAnswerState.Loading -> {
                val scope = remember(state, style, motion) { DefaultAiAnswerLoadingScope(state, style, motion) }
                loading?.invoke(scope)
            }

            AiAnswerState.Error -> {
                val scope = remember(state, style, motion) { DefaultAiAnswerErrorScope(state, style, motion) }
                error?.invoke(scope)
            }
        }
    }
}

@Composable
private fun AiAnswerDefaultContent(
    title: (@Composable () -> Unit)?,
    content: (@Composable () -> Unit)?,
    actionsStart: (ButtonGroupScope.() -> Unit)?,
    actionsEnd: (ButtonGroupScope.() -> Unit)?,
    suggestions: (@Composable FlowRowScope.() -> Unit)?,
    style: AiAnswerStyle,
    motion: Motion<AiAnswerMotionStyle>,
) {
    val contentGap = style.dimensions.contentGap.getDpAsState(motion.context, motion.style.contentGap)
    val actionsGap = style.dimensions.actionsGap.getDpAsState(motion.context, motion.style.actionsGap)
    val suggestionsGap = style.dimensions.suggestionsGap.getDpAsState(motion.context, motion.style.suggestionsGap)
    val titleColor = style.colors.title.getBrushAsState(motion.context, motion.style.titleColor)
    val titleStyle by style.titleStyle.getTextStyleAsState(motion.context, motion.style.titleStyle)
    val contentColor = style.colors.content.getBrushAsState(motion.context, motion.style.contentColor)
    val contentStyle by style.contentStyle.getTextStyleAsState(motion.context, motion.style.contentStyle)

    Layout(
        measurePolicy = remember(
            contentGap.value,
            actionsGap.value,
            suggestionsGap.value,
        ) {
            AiAnswerDefaultMeasurePolicy(
                contentGap = contentGap.value,
                actionsGap = actionsGap.value,
                suggestionsGap = suggestionsGap.value,
            )
        },
        content = {
            title?.let {
                Box(Modifier.layoutId(AI_ANSWER_TITLE_ID)) {
                    ProvideTextStyle(titleStyle, brush = { titleColor.value }) {
                        it()
                    }
                }
            }
            content?.let {
                Box(Modifier.layoutId(AI_ANSWER_CONTENT_ID)) {
                    ProvideTextStyle(contentStyle, brush = { contentColor.value }) {
                        it()
                    }
                }
            }
            if (actionsStart != null || actionsEnd != null) {
                actionsStart?.let {
                    Box(Modifier.layoutId(AI_ANSWER_ACTIONS_START_ID)) {
                        ButtonGroup(style = style.actionsStartButtonGroupStyle, content = it)
                    }
                }
                actionsEnd?.let {
                    Box(Modifier.layoutId(AI_ANSWER_ACTIONS_END_ID)) {
                        ButtonGroup(style = style.actionsEndButtonGroupStyle, content = it)
                    }
                }
            }
            suggestions?.let {
                CompositionLocalProvider(
                    LocalFlowRowMaxItemsInEachRow provides 1,
                ) {
                    Box(Modifier.layoutId(AI_ANSWER_SUGGESTIONS_ID)) {
                        ChipGroup(style = style.suggestionsChipGroupStyle, content = it)
                    }
                }
            }
        },
    )
}

private class AiAnswerDefaultMeasurePolicy(
    private val contentGap: Dp,
    private val actionsGap: Dp,
    private val suggestionsGap: Dp,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minWidth = 0, minHeight = 0)
        val placeables = measurables.measureAnswerPlaceables(looseConstraints)
        val contentGapPx = contentGap.roundToPx()
        val actionsGapPx = actionsGap.roundToPx()
        val suggestionsGapPx = suggestionsGap.roundToPx()
        val layoutWidth = constraints.constrainWidth(placeables.maxWidth())
        val contentHeight = placeables.contentHeight(
            contentGap = contentGapPx,
            actionsGap = actionsGapPx,
            suggestionsGap = suggestionsGapPx,
        )
        val layoutHeight = constraints.constrainHeight(contentHeight)
        return layout(layoutWidth, layoutHeight) {
            place(
                placeables = placeables,
                layoutWidth = layoutWidth,
                contentGap = contentGapPx,
                actionsGap = actionsGapPx,
                suggestionsGap = suggestionsGapPx,
            )
        }
    }

    private fun List<Measurable>.measureAnswerPlaceables(
        constraints: Constraints,
    ): AiAnswerPlaceables {
        return AiAnswerPlaceables(
            title = findByLayoutId(AI_ANSWER_TITLE_ID)?.measure(constraints),
            content = findByLayoutId(AI_ANSWER_CONTENT_ID)?.measure(constraints),
            actionsStart = findByLayoutId(AI_ANSWER_ACTIONS_START_ID)?.measure(constraints),
            actionsEnd = findByLayoutId(AI_ANSWER_ACTIONS_END_ID)?.measure(constraints),
            suggestions = findByLayoutId(AI_ANSWER_SUGGESTIONS_ID)?.measure(constraints),
        )
    }

    private fun List<Measurable>.findByLayoutId(layoutId: String): Measurable? {
        return find { it.layoutId == layoutId }
    }

    private fun AiAnswerPlaceables.maxWidth(): Int {
        return maxOf(
            title.widthOrZero(),
            content.widthOrZero(),
            actionsWidth,
            suggestions.widthOrZero(),
        )
    }

    private fun AiAnswerPlaceables.contentHeight(
        contentGap: Int,
        actionsGap: Int,
        suggestionsGap: Int,
    ): Int {
        return buildList {
            title?.let { add(AiAnswerContentSection(height = it.height)) }
            content?.let { add(AiAnswerContentSection(height = it.height, gap = contentGap)) }
            if (hasActions) add(AiAnswerContentSection(height = actionsHeight, gap = actionsGap))
            suggestions?.let { add(AiAnswerContentSection(height = it.height, gap = suggestionsGap)) }
        }.totalHeight()
    }

    private fun List<AiAnswerContentSection>.totalHeight(): Int {
        return fold(0) { height, section ->
            height + section.height + section.gap.takeIf { height > 0 }.orEmpty()
        }
    }

    private fun Placeable.PlacementScope.place(
        placeables: AiAnswerPlaceables,
        layoutWidth: Int,
        contentGap: Int,
        actionsGap: Int,
        suggestionsGap: Int,
    ) {
        var y = 0
        y = placeTop(placeables.title, y)
        y = placeTop(placeables.content, y, contentGap)
        y = placeActions(placeables, y, layoutWidth, actionsGap)
        placeTop(placeables.suggestions, y, suggestionsGap)
    }

    private fun Placeable.PlacementScope.placeTop(
        placeable: Placeable?,
        y: Int,
        gap: Int = 0,
    ): Int {
        if (placeable == null) return y
        val placeY = y.withGap(gap)
        placeable.placeRelative(x = 0, y = placeY)
        return placeY + placeable.height
    }

    private fun Placeable.PlacementScope.placeActions(
        placeables: AiAnswerPlaceables,
        y: Int,
        layoutWidth: Int,
        gap: Int,
    ): Int {
        if (!placeables.hasActions) return y
        val placeY = y.withGap(gap)
        placeables.actionsStart?.let { placeActionStart(it, placeY, placeables.actionsHeight) }
        placeables.actionsEnd?.let { placeActionEnd(it, placeY, layoutWidth, placeables.actionsHeight) }
        return placeY + placeables.actionsHeight
    }

    private fun Placeable.PlacementScope.placeActionStart(
        placeable: Placeable,
        y: Int,
        actionsHeight: Int,
    ) {
        placeable.placeRelative(x = 0, y = y + (actionsHeight - placeable.height) / 2)
    }

    private fun Placeable.PlacementScope.placeActionEnd(
        placeable: Placeable,
        y: Int,
        layoutWidth: Int,
        actionsHeight: Int,
    ) {
        placeable.placeRelative(x = layoutWidth - placeable.width, y = y + (actionsHeight - placeable.height) / 2)
    }

    private fun Int.withGap(gap: Int): Int {
        return if (this > 0) this + gap else this
    }

    private fun Int?.orEmpty(): Int = this ?: 0
}

private data class AiAnswerPlaceables(
    val title: Placeable?,
    val content: Placeable?,
    val actionsStart: Placeable?,
    val actionsEnd: Placeable?,
    val suggestions: Placeable?,
) {
    val actionsWidth: Int = actionsStart.widthOrZero() + actionsEnd.widthOrZero()
    val actionsHeight: Int = maxOf(actionsStart.heightOrZero(), actionsEnd.heightOrZero())
    val hasActions: Boolean = actionsStart != null || actionsEnd != null
}

private data class AiAnswerContentSection(
    val height: Int,
    val gap: Int = 0,
)

@Composable
internal fun AiAnswerError(
    title: @Composable () -> Unit,
    modifier: Modifier,
    text: (@Composable () -> Unit)?,
    style: AiAnswerStyle,
) {
    Note(
        modifier = modifier,
        style = style.noteStyle,
        titleContent = title,
        textContent = text,
    )
}

@Composable
internal fun AiAnswerLoading(
    modifier: Modifier,
    text: (@Composable () -> Unit)?,
    style: AiAnswerStyle,
    motion: Motion<AiAnswerMotionStyle>,
) {
    val loadingGap = style.dimensions.loadingGap.getDpAsState(motion.context, motion.style.loadingGap)
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(loadingGap.value),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spinner(style = style.loadingSpinnerStyle)
        text?.let {
            val loadingTextStyle by style.loadingTextStyle.getTextStyleAsState(
                motion.context,
                motion.style.loadingTextStyle,
            )
            val loadingTextColor = style.colors.loadingText.getBrushAsState(
                motion.context,
                motion.style.loadingTextColor,
            )
            ProvideTextStyle(loadingTextStyle, brush = { loadingTextColor.value }) {
                it()
            }
        }
    }
}

private class DefaultAiAnswerErrorScope(
    override val state: AiAnswerState,
    override val style: AiAnswerStyle,
    override val motion: Motion<AiAnswerMotionStyle>,
) : AiAnswerErrorScope

private class DefaultAiAnswerLoadingScope(
    override val state: AiAnswerState,
    override val style: AiAnswerStyle,
    override val motion: Motion<AiAnswerMotionStyle>,
) : AiAnswerLoadingScope

private const val AI_ANSWER_TITLE_ID = "Title"
private const val AI_ANSWER_CONTENT_ID = "Content"
private const val AI_ANSWER_ACTIONS_START_ID = "ActionsStart"
private const val AI_ANSWER_ACTIONS_END_ID = "ActionsEnd"
private const val AI_ANSWER_SUGGESTIONS_ID = "Suggestions"
