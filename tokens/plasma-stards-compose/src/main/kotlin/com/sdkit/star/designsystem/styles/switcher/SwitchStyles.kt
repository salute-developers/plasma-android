// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.switcher

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
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
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSwitchM(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSwitchS(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

private val SwitchStyleBuilder.invariantProps: SwitchStyleBuilder
    @Composable
    get() = this
        .toggleTrackShape(CircleShape)
        .toggleThumbShape(CircleShape)
        .colorValues {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleTrackColor(
                StarDsTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(
                    setOf(SwitchStates.Checked)
                        to StarDsTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleTrackBorderColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(),
            )
            toggleThumbColor(
                StarDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
        }
        .disableAlpha(0.4f)

public val Switch.L: WrapperSwitchL
    @Composable
    @JvmName("WrapperSwitchL")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .descriptionStyle(StarDsTheme.typography.bodyMNormal)
        .dimensionValues {
            toggleTrackWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_width_l))
            toggleTrackHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_height_l))
            toggleThumbWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_width_l))
            toggleThumbHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_height_l))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_switch_text_padding_l))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_switch_description_padding_l))
        }
        .wrap(::WrapperSwitchL)

public val Switch.M: WrapperSwitchM
    @Composable
    @JvmName("WrapperSwitchM")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .descriptionStyle(StarDsTheme.typography.bodySNormal)
        .dimensionValues {
            toggleTrackWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_width_m))
            toggleTrackHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_height_m))
            toggleThumbWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_width_m))
            toggleThumbHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_height_m))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_switch_text_padding_m))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_switch_description_padding_m))
        }
        .wrap(::WrapperSwitchM)

public val Switch.S: WrapperSwitchS
    @Composable
    @JvmName("WrapperSwitchS")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .descriptionStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleTrackWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_width_s))
            toggleTrackHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_height_s))
            toggleThumbWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_width_s))
            toggleThumbHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_height_s))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_switch_text_padding_s))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_switch_description_padding_s))
        }
        .wrap(::WrapperSwitchS)
