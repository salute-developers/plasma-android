// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.switcher

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.SwitchStates
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
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
 * Обертка для вариации LHasBackground
 */
@JvmInline
public value class WrapperSwitchLHasBackground(
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
 * Обертка для вариации MHasBackground
 */
@JvmInline
public value class WrapperSwitchMHasBackground(
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
 * Обертка для вариации SHasBackground
 */
@JvmInline
public value class WrapperSwitchSHasBackground(
    public override val builder: SwitchStyleBuilder,
) : WrapperSwitch

private val SwitchStyleBuilder.invariantProps: SwitchStyleBuilder
    @Composable
    get() = this
        .toggleTrackShape(CircleShape)
        .toggleThumbShape(CircleShape)
        .disableAlpha(0.4f)
        .colorValues {
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInversePrimary),
                ),
            )
            descriptionColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
                ),
            )
            toggleThumbColor(SolidColor(StarDsTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue())
            toggleTrackColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultTransparentTertiary).asStatefulValue(
                    setOf(SwitchStates.Checked)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultAccent),
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceInverseTransparentTertiary),
                ),
            )
            toggleTrackBorderColor(SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue())
        }

public val Switch.L: WrapperSwitchL
    @Composable
    @JvmName("WrapperSwitchL")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(
            StarDsTheme.typography.bodyLNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyLBold,
            ),
        )
        .descriptionStyle(
            StarDsTheme.typography.bodyMNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyMBold,
            ),
        )
        .dimensionValues {
            toggleTrackWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_width_l))
            toggleTrackHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_height_l))
            toggleThumbWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_width_l))
            toggleThumbHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_height_l))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_switch_text_padding_l))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_switch_description_padding_l))
        }
        .wrap(::WrapperSwitchL)

public val WrapperSwitchL.HasBackground: WrapperSwitchLHasBackground
    @Composable
    @JvmName("WrapperSwitchLHasBackground")
    get() = builder
        .shape(StarDsTheme.shapes.roundL)
        .dimensionValues {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_switch_padding_start_l_has_background))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_switch_padding_top_l_has_background))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_switch_padding_end_l_has_background))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_switch_padding_bottom_l_has_background))
        }
        .colorValues {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault),
                ),
            )
        }
        .wrap(::WrapperSwitchLHasBackground)

public val Switch.M: WrapperSwitchM
    @Composable
    @JvmName("WrapperSwitchM")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(
            StarDsTheme.typography.bodyMNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyMBold,
            ),
        )
        .descriptionStyle(
            StarDsTheme.typography.bodySNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodySBold,
            ),
        )
        .dimensionValues {
            toggleTrackWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_width_m))
            toggleTrackHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_height_m))
            toggleThumbWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_width_m))
            toggleThumbHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_height_m))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_switch_text_padding_m))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_switch_description_padding_m))
        }
        .wrap(::WrapperSwitchM)

public val WrapperSwitchM.HasBackground: WrapperSwitchMHasBackground
    @Composable
    @JvmName("WrapperSwitchMHasBackground")
    get() = builder
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_switch_shapeAdjustment_m_has_background),
            ),
        )
        .dimensionValues {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_switch_padding_start_m_has_background))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_switch_padding_top_m_has_background))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_switch_padding_end_m_has_background))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_switch_padding_bottom_m_has_background))
        }
        .colorValues {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault),
                ),
            )
        }
        .wrap(::WrapperSwitchMHasBackground)

public val Switch.S: WrapperSwitchS
    @Composable
    @JvmName("WrapperSwitchS")
    get() = SwitchStyle.builder(this)
        .invariantProps
        .labelStyle(
            StarDsTheme.typography.bodySNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodySBold,
            ),
        )
        .descriptionStyle(
            StarDsTheme.typography.bodyXsNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyXsBold,
            ),
        )
        .dimensionValues {
            toggleTrackWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_width_s))
            toggleTrackHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_track_height_s))
            toggleThumbWidth(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_width_s))
            toggleThumbHeight(dimensionResource(R.dimen.sdkit_cmp_switch_toggle_thumb_height_s))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_switch_text_padding_s))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_switch_description_padding_s))
        }
        .wrap(::WrapperSwitchS)

public val WrapperSwitchS.HasBackground: WrapperSwitchSHasBackground
    @Composable
    @JvmName("WrapperSwitchSHasBackground")
    get() = builder
        .shape(StarDsTheme.shapes.roundM)
        .dimensionValues {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_switch_padding_start_s_has_background))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_switch_padding_top_s_has_background))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_switch_padding_end_s_has_background))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_switch_padding_bottom_s_has_background))
        }
        .colorValues {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault),
                ),
            )
        }
        .wrap(::WrapperSwitchSHasBackground)
