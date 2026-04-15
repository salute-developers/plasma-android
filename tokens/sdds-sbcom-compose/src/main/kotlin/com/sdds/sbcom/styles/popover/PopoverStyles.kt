// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.popover

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.PopoverStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperPopover : BuilderWrapper<PopoverStyle, PopoverStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperPopoverDefault(
    public override val builder: PopoverStyleBuilder,
) : WrapperPopover

public val Popover.Default: WrapperPopoverDefault
    @Composable
    @JvmName("WrapperPopoverDefault")
    get() = PopoverStyle.builder(this)
        .shape(SddsSbComTheme.shapes.roundM)
        .shadow(SddsSbComTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(),
            )
        }
        .dimensions {
            width(182.0.dp)
            offset(8.0.dp)
            tailWidth(20.0.dp)
            tailHeight(8.0.dp)
            tailPadding(16.0.dp)
        }
        .wrap(::WrapperPopoverDefault)
