// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.splitter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SplitterOrientation
import com.sdds.compose.uikit.SplitterStyle
import com.sdds.compose.uikit.SplitterStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSplitter : BuilderWrapper<SplitterStyle, SplitterStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperSplitterDefault(
    public override val builder: SplitterStyleBuilder,
) : WrapperSplitter

public val Splitter.Default: WrapperSplitterDefault
    @Composable
    @JvmName("WrapperSplitterDefault")
    get() = SplitterStyle.builder(this)
        .handleShape(CircleShape)
        .color {
            dividerColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultAccent),
                ),
            )
            handleColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultAccent),
                ),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp.asStatefulValue(setOf(InteractiveState.Pressed) to 2.0.dp))
            handleThickness(1.0.dp)
            gap(22.0.dp)
            handleStartPadding(3.0.dp.asStatefulValue(setOf(SplitterOrientation.Vertical) to 3.5.dp))
            handleTopPadding(3.5.dp.asStatefulValue(setOf(SplitterOrientation.Vertical) to 3.0.dp))
            handleEndPadding(3.0.dp.asStatefulValue(setOf(SplitterOrientation.Vertical) to 3.5.dp))
            handleBottomPadding(3.5.dp.asStatefulValue(setOf(SplitterOrientation.Vertical) to 3.0.dp))
            handleSpacer(5.0.dp)
        }
        .wrap(::WrapperSplitterDefault)
