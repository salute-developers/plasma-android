// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.switcher

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSwitch : BuilderWrapper<SwitchStyle, SwitchStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSwitchL(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

/**
 * Обертка для вариации LToggleS
 */
@JvmInline
public value class WrapperSwitchLToggleS(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSwitchM(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

/**
 * Обертка для вариации MToggleS
 */
@JvmInline
public value class WrapperSwitchMToggleS(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSwitchS(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

/**
 * Обертка для вариации SToggleS
 */
@JvmInline
public value class WrapperSwitchSToggleS(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

private val SwitchStyleBuilder.invariantProps: SwitchStyleBuilder
    @Composable
    get() = this
        .toggleTrackShape(CircleShape)
        .toggleThumbShape(CircleShape)
        .colorValues {
            labelColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleTrackColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(SwitchStates.Checked)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleTrackBorderColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultClear.asInteractive(),
            )
            toggleThumbColor(
                PlasmaGigaAppTheme.colors.surfaceInverseSolidDefault.asInteractive(),
            )
        }
        .disableAlpha(0.4f)

public val Switch.L: WrapperSwitchL
    @Composable
    @JvmName("WrapperSwitchL")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .dimensionValues {
            toggleTrackWidth(44.0.dp)
            toggleTrackHeight(28.0.dp)
            toggleThumbWidth(24.0.dp)
            toggleThumbHeight(24.0.dp)
            textPadding(12.0.dp)
            descriptionPadding(4.0.dp)
        }
        .wrap(::WrapperSwitchL)

public val WrapperSwitchL.ToggleS: WrapperSwitchLToggleS
    @Composable
    @JvmName("WrapperSwitchLToggleS")
    get() = builder
        .dimensionValues {
            toggleTrackWidth(32.0.dp)
            toggleTrackHeight(20.0.dp)
            toggleThumbWidth(16.0.dp)
            toggleThumbHeight(16.0.dp)
        }
        .wrap(::WrapperSwitchLToggleS)

public val Switch.M: WrapperSwitchM
    @Composable
    @JvmName("WrapperSwitchM")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .dimensionValues {
            toggleTrackWidth(44.0.dp)
            toggleTrackHeight(28.0.dp)
            toggleThumbWidth(24.0.dp)
            toggleThumbHeight(24.0.dp)
            textPadding(12.0.dp)
            descriptionPadding(4.0.dp)
        }
        .wrap(::WrapperSwitchM)

public val WrapperSwitchM.ToggleS: WrapperSwitchMToggleS
    @Composable
    @JvmName("WrapperSwitchMToggleS")
    get() = builder
        .dimensionValues {
            toggleTrackWidth(32.0.dp)
            toggleTrackHeight(20.0.dp)
            toggleThumbWidth(16.0.dp)
            toggleThumbHeight(16.0.dp)
        }
        .wrap(::WrapperSwitchMToggleS)

public val Switch.S: WrapperSwitchS
    @Composable
    @JvmName("WrapperSwitchS")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleTrackWidth(44.0.dp)
            toggleTrackHeight(28.0.dp)
            toggleThumbWidth(24.0.dp)
            toggleThumbHeight(24.0.dp)
            textPadding(12.0.dp)
            descriptionPadding(4.0.dp)
        }
        .wrap(::WrapperSwitchS)

public val WrapperSwitchS.ToggleS: WrapperSwitchSToggleS
    @Composable
    @JvmName("WrapperSwitchSToggleS")
    get() = builder
        .dimensionValues {
            toggleTrackWidth(32.0.dp)
            toggleTrackHeight(20.0.dp)
            toggleThumbWidth(16.0.dp)
            toggleThumbHeight(16.0.dp)
        }
        .wrap(::WrapperSwitchSToggleS)
