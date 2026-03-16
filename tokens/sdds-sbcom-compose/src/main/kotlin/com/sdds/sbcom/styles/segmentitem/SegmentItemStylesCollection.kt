// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.segmentitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.SegmentItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента SegmentItem
 */
public enum class SegmentItemStyles(
    public val key: String,
) {
    SegmentItemDefault("SegmentItem.Default"),
}

/**
 * Возвращает [SegmentItemStyle] для [SegmentItemStyles]
 */
@Composable
public fun SegmentItemStyles.style(
    modifyAction: @Composable SegmentItemStyleBuilder.() -> Unit =
        {},
): SegmentItemStyle {
    val builder = when (this) {
        SegmentItemStyles.SegmentItemDefault -> SegmentItem.Default
    }
    return builder.modify(modifyAction).style()
}
