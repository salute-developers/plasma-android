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
import com.sdds.compose.uikit.ai.AnswerErrorScope
import com.sdds.compose.uikit.ai.AnswerLoadingScope
import com.sdds.compose.uikit.ai.AnswerState
import com.sdds.compose.uikit.ai.AnswerStyle
import com.sdds.compose.uikit.ai.motion.AnswerMotionStyle
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
internal fun AnswerContent(
    modifier: Modifier,
    state: AnswerState,
    title: (@Composable () -> Unit)?,
    content: (@Composable () -> Unit)?,
    actionsStart: (ButtonGroupScope.() -> Unit)?,
    actionsEnd: (ButtonGroupScope.() -> Unit)?,
    suggestions: (@Composable FlowRowScope.() -> Unit)?,
    loading: (@Composable AnswerLoadingScope.() -> Unit)?,
    error: (@Composable AnswerErrorScope.() -> Unit)?,
    style: AnswerStyle,
    motion: Motion<AnswerMotionStyle>,
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
            AnswerState.Default -> AnswerDefaultContent(
                title = title,
                content = content,
                actionsStart = actionsStart,
                actionsEnd = actionsEnd,
                suggestions = suggestions,
                style = style,
                motion = motion,
            )

            AnswerState.Loading -> {
                val scope = remember(state, style, motion) { DefaultAnswerLoadingScope(state, style, motion) }
                loading?.invoke(scope)
            }

            AnswerState.Error -> {
                val scope = remember(state, style, motion) { DefaultAnswerErrorScope(state, style, motion) }
                error?.invoke(scope)
            }
        }
    }
}

@Composable
private fun AnswerDefaultContent(
    title: (@Composable () -> Unit)?,
    content: (@Composable () -> Unit)?,
    actionsStart: (ButtonGroupScope.() -> Unit)?,
    actionsEnd: (ButtonGroupScope.() -> Unit)?,
    suggestions: (@Composable FlowRowScope.() -> Unit)?,
    style: AnswerStyle,
    motion: Motion<AnswerMotionStyle>,
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
            AnswerDefaultMeasurePolicy(
                contentGap = contentGap.value,
                actionsGap = actionsGap.value,
                suggestionsGap = suggestionsGap.value,
            )
        },
        content = {
            title?.let {
                Box(Modifier.layoutId(ANSWER_TITLE_ID)) {
                    ProvideTextStyle(titleStyle, brush = { titleColor.value }) {
                        it()
                    }
                }
            }
            content?.let {
                Box(Modifier.layoutId(ANSWER_CONTENT_ID)) {
                    ProvideTextStyle(contentStyle, brush = { contentColor.value }) {
                        it()
                    }
                }
            }
            if (actionsStart != null || actionsEnd != null) {
                actionsStart?.let {
                    Box(Modifier.layoutId(ANSWER_ACTIONS_START_ID)) {
                        ButtonGroup(style = style.actionsStartButtonGroupStyle, content = it)
                    }
                }
                actionsEnd?.let {
                    Box(Modifier.layoutId(ANSWER_ACTIONS_END_ID)) {
                        ButtonGroup(style = style.actionsEndButtonGroupStyle, content = it)
                    }
                }
            }
            suggestions?.let {
                CompositionLocalProvider(
                    LocalFlowRowMaxItemsInEachRow provides 1,
                ) {
                    Box(Modifier.layoutId(ANSWER_SUGGESTIONS_ID)) {
                        ChipGroup(style = style.suggestionsChipGroupStyle, content = it)
                    }
                }
            }
        },
    )
}

private class AnswerDefaultMeasurePolicy(
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
    ): AnswerPlaceables {
        return AnswerPlaceables(
            title = findByLayoutId(ANSWER_TITLE_ID)?.measure(constraints),
            content = findByLayoutId(ANSWER_CONTENT_ID)?.measure(constraints),
            actionsStart = findByLayoutId(ANSWER_ACTIONS_START_ID)?.measure(constraints),
            actionsEnd = findByLayoutId(ANSWER_ACTIONS_END_ID)?.measure(constraints),
            suggestions = findByLayoutId(ANSWER_SUGGESTIONS_ID)?.measure(constraints),
        )
    }

    private fun List<Measurable>.findByLayoutId(layoutId: String): Measurable? {
        return find { it.layoutId == layoutId }
    }

    private fun AnswerPlaceables.maxWidth(): Int {
        return maxOf(
            title.widthOrZero(),
            content.widthOrZero(),
            actionsWidth,
            suggestions.widthOrZero(),
        )
    }

    private fun AnswerPlaceables.contentHeight(
        contentGap: Int,
        actionsGap: Int,
        suggestionsGap: Int,
    ): Int {
        return buildList {
            title?.let { add(AnswerContentSection(height = it.height)) }
            content?.let { add(AnswerContentSection(height = it.height, gap = contentGap)) }
            if (hasActions) add(AnswerContentSection(height = actionsHeight, gap = actionsGap))
            suggestions?.let { add(AnswerContentSection(height = it.height, gap = suggestionsGap)) }
        }.totalHeight()
    }

    private fun List<AnswerContentSection>.totalHeight(): Int {
        return fold(0) { height, section ->
            height + section.height + section.gap.takeIf { height > 0 }.orEmpty()
        }
    }

    private fun Placeable.PlacementScope.place(
        placeables: AnswerPlaceables,
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
        placeables: AnswerPlaceables,
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

private data class AnswerPlaceables(
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

private data class AnswerContentSection(
    val height: Int,
    val gap: Int = 0,
)

@Composable
internal fun AnswerError(
    title: @Composable () -> Unit,
    modifier: Modifier,
    text: (@Composable () -> Unit)?,
    style: AnswerStyle,
) {
    Note(
        modifier = modifier,
        style = style.noteStyle,
        titleContent = title,
        textContent = text,
    )
}

@Composable
internal fun AnswerLoading(
    modifier: Modifier,
    text: (@Composable () -> Unit)?,
    style: AnswerStyle,
    motion: Motion<AnswerMotionStyle>,
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

private class DefaultAnswerErrorScope(
    override val state: AnswerState,
    override val style: AnswerStyle,
    override val motion: Motion<AnswerMotionStyle>,
) : AnswerErrorScope

private class DefaultAnswerLoadingScope(
    override val state: AnswerState,
    override val style: AnswerStyle,
    override val motion: Motion<AnswerMotionStyle>,
) : AnswerLoadingScope

private const val ANSWER_TITLE_ID = "Title"
private const val ANSWER_CONTENT_ID = "Content"
private const val ANSWER_ACTIONS_START_ID = "ActionsStart"
private const val ANSWER_ACTIONS_END_ID = "ActionsEnd"
private const val ANSWER_SUGGESTIONS_ID = "Suggestions"
