package com.sdds.compose.uikit.internal.textfield.common

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.internal.heightOrZero
import com.sdds.compose.uikit.internal.widthOrZero

internal fun Placeable.PlacementScope.placeDotBadge(
    badgePlaceable: Placeable?,
    dotBadge: TextField.DotBadge?,
    labelType: TextField.LabelType,
    hasLabel: Boolean,
    outerLabelPlaceable: Placeable?,
    width: Int,
) {
    dotBadge?.let {
        when (it.position) {
            TextField.DotBadge.Position.Start -> {
                when {
                    labelType == TextField.LabelType.Outer && hasLabel -> badgePlaceable?.placeRelative(
                        0,
                        Alignment.CenterVertically.align(
                            size = badgePlaceable.height,
                            space = outerLabelPlaceable.heightOrZero(),
                        ),
                    )
                    else -> badgePlaceable?.placeRelative(0, 0)
                }
            }

            TextField.DotBadge.Position.End -> {
                when {
                    labelType == TextField.LabelType.Outer && hasLabel -> badgePlaceable?.placeRelative(
                        outerLabelPlaceable.widthOrZero(),
                        0,
                    )

                    else -> badgePlaceable?.placeRelative(
                        width - badgePlaceable.widthOrZero(),
                        0,
                    )
                }
            }
        }
    }
}

internal fun Modifier.textFieldStartPadding(
    fieldType: TextField.FieldType?,
    labelType: TextField.LabelType,
    keepDotBadgeStartPadding: Dp?,
): Modifier {
    return this.padding(
        start = if (fieldType !is TextField.FieldType.Required &&
            keepDotBadgeStartPadding != null &&
            labelType == TextField.LabelType.Outer
        ) {
            keepDotBadgeStartPadding
        } else {
            0.dp
        },
    )
}