// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
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
public interface WrapperDropdownMenuItem : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDropdownMenuItemDefault(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItem

public val DropdownMenuItem.Default: WrapperDropdownMenuItemDefault
    @Composable
    @JvmName("WrapperDropdownMenuItemDefault")
    get() = ListItemStyle.builder(this)
        .shape(SddsSbComTheme.shapes.roundXxs)
        .titleStyle(SddsSbComTheme.typography.bodyLNormal)
        .subtitleStyle(SddsSbComTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .colors {
            titleColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentPrimary,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentPrimary,
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            contentPaddingEnd(12.0.dp)
            contentPaddingStart(12.0.dp)
            height(48.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemDefault)
