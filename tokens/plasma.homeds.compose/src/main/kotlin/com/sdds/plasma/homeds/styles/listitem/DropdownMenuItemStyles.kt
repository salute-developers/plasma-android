// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuItem : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperDropdownMenuItemTerminate(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItem

public val DropdownMenuItem.Default: WrapperDropdownMenuItemTerminate
    @Composable
    get() = ListItemStyle.builder(this)
        .invariantProps
        .colors {
            titleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            contentStartColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTerminate)

public val DropdownMenuItem.Positive: WrapperDropdownMenuItemTerminate
    @Composable
    get() = ListItemStyle.builder(this)
        .invariantProps
        .colors {
            titleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPositive).asStatefulValue())
            contentStartColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPositive).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTerminate)

public val DropdownMenuItem.Negative: WrapperDropdownMenuItemTerminate
    @Composable
    get() = ListItemStyle.builder(this)
        .invariantProps
        .colors {
            titleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultNegative).asStatefulValue())
            contentStartColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTerminate)

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .shape(PlasmaHomeDsTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
        }
        .dimensions {
            contentPaddingEnd(12.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(9.0.dp)
            paddingBottom(9.0.dp)
            height(48.0.dp)
            contentPaddingStart(12.0.dp)
        }
