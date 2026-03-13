// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.switcher

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
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
public interface WrapperSwitch : BuilderWrapper<SwitchStyle, SwitchStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperSwitchDefault(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

public val Switch.Default: WrapperSwitchDefault
    @Composable
    @JvmName("WrapperSwitchDefault")
    get() = SwitchStyle.builder(this)
        .toggleTrackShape(CircleShape)
        .toggleThumbShape(CircleShape)
        .colorValues {
            labelColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleTrackColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(SwitchStates.Checked)
                        to SddsSbComTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleTrackBorderColor(
                SddsSbComTheme.colors.outlineDefaultTransparentPrimary.asInteractive(
                    setOf(SwitchStates.Checked)
                        to SddsSbComTheme.colors.outlineDefaultClear,
                ),
            )
            toggleThumbColor(
                SddsSbComTheme.colors.outlineDefaultTransparentPrimary.asInteractive(
                    setOf(SwitchStates.Checked)
                        to SddsSbComTheme.colors.surfaceOnDarkSolidDefault,
                ),
            )
        }
        .dimensionValues {
            toggleTrackWidth(52.0.dp)
            toggleTrackHeight(32.0.dp)
            toggleThumbWidth(24.0.dp)
            toggleThumbHeight(24.0.dp)
            toggleThumbPadding(4.0.dp)
            textPadding(12.0.dp)
            descriptionPadding(4.0.dp)
        }
        .disableAlpha(0.4f)
        .wrap(::WrapperSwitchDefault)
