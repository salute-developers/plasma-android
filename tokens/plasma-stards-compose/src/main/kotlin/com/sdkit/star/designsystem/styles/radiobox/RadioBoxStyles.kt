// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.radiobox

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
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
public interface WrapperRadioBox : BuilderWrapper<RadioBoxStyle, RadioBoxStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperRadioBoxL(
    public override val builder: RadioBoxStyleBuilder,
) : WrapperRadioBox

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperRadioBoxM(
    public override val builder: RadioBoxStyleBuilder,
) : WrapperRadioBox

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperRadioBoxS(
    public override val builder: RadioBoxStyleBuilder,
) : WrapperRadioBox

private val RadioBoxStyleBuilder.invariantProps: RadioBoxStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .colorValues {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(RadioBoxStates.Checked)
                        to StarDsTheme.colors.surfaceDefaultAccentMain,
                ),
            )
            toggleIconColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            toggleBorderColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.outlineDefaultAccentMain,
                    setOf(
                        InteractiveState.Focused,
                        RadioBoxStates.Checked,
                    )
                        to StarDsTheme.colors.outlineDefaultAccentMain,
                    setOf(RadioBoxStates.Checked)
                        to StarDsTheme.colors.outlineDefaultClear,
                ),
            )
        }
        .dimensionValues {
            toggleBorderOffset(
                dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_offset).asStatefulValue(
                    setOf(InteractiveState.Focused) to
                        dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_offset_0),
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_offset_1),
                ),
            )
        }
        .disableAlpha(0.4f)

public val RadioBox.L: WrapperRadioBoxL
    @Composable
    @JvmName("WrapperRadioBoxL")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .descriptionStyle(StarDsTheme.typography.bodyMNormal)
        .dimensionValues {
            toggleWidth(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_width_l))
            toggleHeight(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_height_l))
            toggleIconHeight(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_icon_height_l))
            toggleIconWidth(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_icon_width_l))
            toggleBorderWidth(
                dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_width_l).asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_width_l_0),
                ),
            )
            togglePadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_padding_l))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_text_padding_l))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_description_padding_l))
        }
        .wrap(::WrapperRadioBoxL)

public val RadioBox.M: WrapperRadioBoxM
    @Composable
    @JvmName("WrapperRadioBoxM")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .descriptionStyle(StarDsTheme.typography.bodySNormal)
        .dimensionValues {
            toggleWidth(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_width_m))
            toggleHeight(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_height_m))
            toggleIconHeight(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_icon_height_m))
            toggleIconWidth(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_icon_width_m))
            toggleBorderWidth(
                dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_width_m).asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_width_m_0),
                ),
            )
            togglePadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_padding_m))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_text_padding_m))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_description_padding_m))
        }
        .wrap(::WrapperRadioBoxM)

public val RadioBox.S: WrapperRadioBoxS
    @Composable
    @JvmName("WrapperRadioBoxS")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .descriptionStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleWidth(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_width_s))
            toggleHeight(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_height_s))
            toggleIconHeight(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_icon_height_s))
            toggleIconWidth(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_icon_width_s))
            toggleBorderWidth(
                dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_width_s).asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_border_width_s_0),
                ),
            )
            togglePadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_toggle_padding_s))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_text_padding_s))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_radio_box_description_padding_s))
        }
        .wrap(::WrapperRadioBoxS)
