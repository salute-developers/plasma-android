// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.scrollbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.ScrollBarStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
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
        .hoverExpandFactor(1.0f)
        .shape(CircleShape)
        .colors {
            thumbColor(
                SddsSbComTheme.colors.outlineDefaultTransparentPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.outlineDefaultTransparentPrimaryActive,
                ),
            )
            trackColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .dimensions {
            width(4.0.dp)
        }
        .wrap(::WrapperScrollBarDefault)
