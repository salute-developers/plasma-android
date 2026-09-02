// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.scrollbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.ScrollBarStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperScrollBar : BuilderWrapper<ScrollBarStyle, ScrollBarStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperScrollBarDefault(
    public override val builder: ScrollBarStyleBuilder,
) : WrapperScrollBar

public val ScrollBar.Default: WrapperScrollBarDefault
    @Composable
    @JvmName("WrapperScrollBarDefault")
    get() = ScrollBarStyle.builder(this)
        .shape(CircleShape)
        .hoverExpandFactor(1.0f)
        .colors {
            thumbColor(SddsFinAiTheme.colors.surfaceDefaultSolidTertiary.asInteractive())
            trackColor(SddsFinAiTheme.colors.surfaceDefaultTransparentPrimary.asInteractive())
        }
        .dimensions {
            width(6.0.dp)
        }
        .wrap(::WrapperScrollBarDefault)
