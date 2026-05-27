package com.sdds.compose.uikit.internal.cell

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.offset
import com.sdds.compose.uikit.CellDimensions
import com.sdds.compose.uikit.CellGravity
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalCellStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalCounterStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTintBrushProducer
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.MotionContext
import com.sdds.compose.uikit.motion.components.cell.CellMotionStyle
import com.sdds.compose.uikit.motion.components.cell.rememberCellMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import kotlin.math.roundToInt

@Composable
internal fun BaseCell(
    modifier: Modifier = Modifier,
    style: CellStyle = LocalCellStyle.current,
    gravity: CellGravity = CellGravity.Center,
    disclosureContent: (@Composable RowScope.() -> Unit)? = null,
    disclosureEnabled: Boolean = false,
    dimensions: CellDimensions = style.dimensions,
    startContent: (@Composable RowScope.() -> Unit)? = null,
    centerContent: (@Composable ColumnScope.() -> Unit)? = null,
    endContent: (@Composable RowScope.() -> Unit)? = null,
    motion: Motion<CellMotionStyle> = rememberCellMotion(),
) {
    CompositionLocalProvider(
        LocalAvatarStyle provides style.avatarStyle,
        LocalIconButtonStyle provides style.iconButtonStyle,
        LocalCheckBoxStyle provides style.checkBoxStyle,
        LocalRadioBoxStyle provides style.radioBoxStyle,
        LocalSwitchStyle provides style.switchStyle,
        LocalCounterStyle provides style.counterStyle,
    ) {
        Layout(
            modifier = modifier,
            measurePolicy = remember(gravity) { BaseCellMeasurePolicy(gravity) },
            content = {
                startContent?.let {
                    Row(
                        modifier = Modifier.layoutId("StartContent"),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        val iconTint = style.colors.titleBrush.getBrushAsState(
                            motion.context,
                            motion.style.titleColor,
                        )
                        CompositionLocalProvider(LocalTintBrushProducer provides { iconTint.value }) {
                            startContent()
                        }

                        if (centerContent != null || endContent != null) {
                            val contentPaddingStart by dimensions.contentPaddingStartValues
                                .getValueAsState(motion.context)
                            Spacer(Modifier.width(contentPaddingStart))
                        }
                    }
                }
                centerContent?.let {
                    Column(
                        modifier = Modifier
                            .layoutId("CenterContent"),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center,
                    ) { centerContent() }
                }
                if (endContent != null || (disclosureEnabled && disclosureContent != null)) {
                    Row(
                        modifier = Modifier.layoutId("EndContent"),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        if (centerContent != null || startContent != null) {
                            val contentPaddingEnd by dimensions.contentPaddingEndValues
                                .getValueAsState(motion.context)
                            Spacer(Modifier.width(contentPaddingEnd))
                        }
                        val iconTint = style.colors.titleBrush.getBrushAsState(
                            motion.context,
                            motion.style.titleColor,
                        )
                        CompositionLocalProvider(LocalTintBrushProducer provides { iconTint.value }) {
                            endContent?.invoke(this)
                        }
                        if (disclosureEnabled && disclosureContent != null) {
                            disclosureContent()
                        }
                    }
                }
            },
        )
    }
}

private class BaseCellMeasurePolicy(
    private val gravity: CellGravity,
) : MeasurePolicy {

    override fun MeasureScope.measure(
        measurables: List<Measurable>,
        constraints: Constraints,
    ): MeasureResult {
        val looseConstraints = constraints.copy(minHeight = 0, minWidth = 0)
        val startContent = measurables
            .firstOrNull { it.layoutId == "StartContent" }
            ?.measure(looseConstraints.copy(minWidth = 0))

        val endContent = measurables
            .firstOrNull { it.layoutId == "EndContent" }
            ?.measure(looseConstraints.offset(horizontal = -startContent.widthOrZero()))

        val centerContent = measurables
            .firstOrNull { it.layoutId == "CenterContent" }
            ?.measure(looseConstraints.offset(-startContent.widthOrZero() - endContent.widthOrZero()))

        val height = constraints.constrainHeight(
            maxOf(
                startContent.heightOrZero(),
                centerContent.heightOrZero(),
                endContent.heightOrZero(),
            ),
        )

        val width = constraints.constrainWidth(
            startContent.widthOrZero() + centerContent.widthOrZero() + endContent.widthOrZero(),
        )

        return layout(width, height) {
            startContent?.let {
                it.placeRelative(
                    x = 0,
                    y = calculateVerticalPosition(
                        containerHeight = height,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
            centerContent?.let {
                it.placeRelative(
                    x = startContent.widthOrZero(),
                    y = calculateVerticalPosition(
                        containerHeight = height,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
            endContent?.let {
                it.placeRelative(
                    x = width - it.widthOrZero(),
                    y = calculateVerticalPosition(
                        containerHeight = height,
                        elementHeight = it.heightOrZero(),
                    ),
                )
            }
        }
    }

    private fun calculateVerticalPosition(
        containerHeight: Int,
        elementHeight: Int,
    ): Int {
        return when (gravity) {
            CellGravity.Top -> 0
            CellGravity.Center -> ((containerHeight - elementHeight) / 2f).roundToInt()
            CellGravity.Bottom -> containerHeight - elementHeight
        }
    }
}

@Composable
internal fun ColumnScope.CellCenterContent(
    title: AnnotatedString = AnnotatedString(""),
    label: AnnotatedString = AnnotatedString(""),
    subtitle: AnnotatedString = AnnotatedString(""),
    style: CellStyle,
    motionContext: MotionContext,
    motionStyle: CellMotionStyle,
) {
    val labelStyle by style.labelStyles.getTextStyleAsState(motionContext, motionStyle.labelStyle)
    val titleStyle by style.titleStyles.getTextStyleAsState(motionContext, motionStyle.titleStyle)
    val subtitleStyle by style.subtitleStyles.getTextStyleAsState(motionContext, motionStyle.subtitleStyle)
    val labelBrush = style.colors.labelBrush.getBrushAsState(motionContext, motionStyle.labelColor)
    val titleBrush = style.colors.titleBrush.getBrushAsState(motionContext, motionStyle.titleColor)
    val subTitleBrush = style.colors.subtitleBrush.getBrushAsState(motionContext, motionStyle.subtitleColor)

    if (label.isNotEmpty()) {
        Text(
            text = label,
            style = labelStyle,
            brush = { labelBrush.value },
        )
    }
    if (title.isNotEmpty()) {
        Text(
            text = title,
            style = titleStyle,
            brush = { titleBrush.value },
        )
    }
    if (subtitle.isNotEmpty()) {
        Text(
            text = subtitle,
            style = subtitleStyle,
            brush = { subTitleBrush.value },
        )
    }
}

@Composable
internal fun ColumnScope.CellCenterContent(
    style: CellStyle,
    motionContext: MotionContext,
    motionStyle: CellMotionStyle,
    titleContent: (@Composable () -> Unit)? = null,
    labelContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
) {
    val colors = style.colors
    if (labelContent != null) {
        val labelStyle by style.labelStyles.getTextStyleAsState(motionContext, motionStyle.labelStyle)
        val labelBrush = colors.labelBrush.getBrushAsState(motionContext, motionStyle.labelColor)
        ProvideTextStyle(
            labelStyle,
            brush = { labelBrush.value },
            labelContent,
        )
    }

    if (titleContent != null) {
        val titleStyle by style.titleStyles.getTextStyleAsState(motionContext, motionStyle.titleStyle)
        val titleBrush = colors.titleBrush.getBrushAsState(motionContext, motionStyle.titleColor)
        ProvideTextStyle(
            titleStyle,
            brush = { titleBrush.value },
            titleContent,
        )
    }

    if (subtitleContent != null) {
        val subtitleStyle by style.subtitleStyles.getTextStyleAsState(motionContext, motionStyle.subtitleStyle)
        val subtitleBrush = colors.subtitleBrush.getBrushAsState(motionContext, motionStyle.subtitleColor)
        ProvideTextStyle(
            subtitleStyle,
            brush = { subtitleBrush.value },
            subtitleContent,
        )
    }
}
