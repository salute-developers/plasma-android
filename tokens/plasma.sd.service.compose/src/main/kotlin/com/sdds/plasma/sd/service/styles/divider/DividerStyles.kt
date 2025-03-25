// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.divider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.DividerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDivider : BuilderWrapper<DividerStyle, DividerStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDividerDefault(
    public override val builder: DividerStyleBuilder,
) : WrapperDivider

public val Divider.Default: WrapperDividerDefault
    @Composable
    @JvmName("WrapperDividerDefault")
    get() = DividerStyle.builder(this)
        .shape(CircleShape)
        .color {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            thickness(1.0.dp)
        }
        .wrap(::WrapperDividerDefault)
