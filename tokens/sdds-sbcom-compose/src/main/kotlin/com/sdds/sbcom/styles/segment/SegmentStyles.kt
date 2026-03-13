// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.segment

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.SegmentStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider
import com.sdds.sbcom.styles.segmentitem.Default
import com.sdds.sbcom.styles.segmentitem.SegmentItem
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSegment : BuilderWrapper<SegmentStyle, SegmentStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperSegmentDefault(
    public override val builder: SegmentStyleBuilder,
) : WrapperSegment

public val Segment.Default: WrapperSegmentDefault
    @Composable
    @JvmName("WrapperSegmentDefault")
    get() = SegmentStyle.builder(this)
        .shape(CircleShape)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            gap(0.0.dp)
            dividerPaddingStart(0.0.dp)
            dividerPaddingEnd(0.0.dp)
        }
        .segmentItemStyle(SegmentItem.Default.style())
        .dividerStyle(Divider.Default.style())
        .wrap(::WrapperSegmentDefault)
