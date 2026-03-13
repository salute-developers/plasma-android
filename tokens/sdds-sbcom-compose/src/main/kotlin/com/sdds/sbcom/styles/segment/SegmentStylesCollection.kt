// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.segment

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Segment
 */
public enum class SegmentStyles(
    public val key: String,
) {
    SegmentDefault("Segment.Default"),
}

/**
 * Возвращает [SegmentStyle] для [SegmentStyles]
 */
@Composable
public fun SegmentStyles.style(modifyAction: @Composable SegmentStyleBuilder.() -> Unit = {}): SegmentStyle {
    val builder = when (this) {
        SegmentStyles.SegmentDefault -> Segment.Default
    }
    return builder.modify(modifyAction).style()
}
