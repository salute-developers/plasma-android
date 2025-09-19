package com.sdds.compose.uikit.internal.cell

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
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
import com.sdds.compose.uikit.CellDimensions
import com.sdds.compose.uikit.CellGravity
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalCellStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.internal.common.StyledText
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero
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
) {
    CompositionLocalProvider(
        LocalAvatarStyle provides style.avatarStyle,
        LocalIconButtonStyle provides style.iconButtonStyle,
        LocalCheckBoxStyle provides style.checkBoxStyle,
        LocalRadioBoxStyle provides style.radioBoxStyle,
        LocalSwitchStyle provides style.switchStyle,
    ) {
        Layout(
            modifier = modifier,
            measurePolicy = remember(gravity) { BaseCellMeasurePolicy(gravity) },
            content = {
                startContent?.let {
                    Row(
                        modifier = Modifier
                            .layoutId("StartContent")
                            .padding(end = dimensions.contentPaddingStart),
                        verticalAlignment = Alignment.CenterVertically,
                    ) { startContent() }
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
                        modifier = Modifier
                            .padding(start = dimensions.contentPaddingEnd)
                            .layoutId("EndContent"),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        endContent?.invoke(this)
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
        val startContent = measurables
            .firstOrNull { it.layoutId == "StartContent" }
            ?.measure(constraints.copy(minWidth = 0))

        val endContent = measurables
            .firstOrNull { it.layoutId == "EndContent" }
            ?.measure(
                constraints
                    .copy(
                        minWidth = 0,
                        maxWidth = (constraints.maxWidth - startContent.widthOrZero())
                            .coerceAtLeast(0),
                    ),
            )

        val centerMaxWidth =
            (constraints.maxWidth - startContent.widthOrZero() - endContent.widthOrZero())
                .coerceAtLeast(0)
        val centerContent = measurables
            .firstOrNull { it.layoutId == "CenterContent" }
            ?.measure(constraints.copy(minWidth = 0, maxWidth = centerMaxWidth))

        val height = maxOf(
            startContent.heightOrZero(),
            centerContent.heightOrZero(),
            endContent.heightOrZero(),
        )

        val width = maxOf(
            startContent.widthOrZero() + centerContent.widthOrZero() + endContent.widthOrZero(),
            constraints.minWidth,
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

private fun CellGravity.toVerticalAlignment(): Alignment.Vertical {
    return when (this) {
        CellGravity.Top -> Alignment.Top
        CellGravity.Center -> Alignment.CenterVertically
        CellGravity.Bottom -> Alignment.Bottom
    }
}

@Composable
internal fun ColumnScope.CellCenterContent(
    title: AnnotatedString = AnnotatedString(""),
    label: AnnotatedString = AnnotatedString(""),
    subtitle: AnnotatedString = AnnotatedString(""),
    style: CellStyle,
    interactionSource: InteractionSource,
) {
    val colors = style.colors
    StyledText(
        text = label,
        textStyle = style.labelStyle,
        textColor = colors.labelColor.colorForInteraction(interactionSource),
    )
    StyledText(
        text = title,
        textStyle = style.titleStyle,
        textColor = colors.titleColor.colorForInteraction(interactionSource),
    )
    StyledText(
        text = subtitle,
        textStyle = style.subtitleStyle,
        textColor = colors.subtitleColor.colorForInteraction(interactionSource),
    )
}
