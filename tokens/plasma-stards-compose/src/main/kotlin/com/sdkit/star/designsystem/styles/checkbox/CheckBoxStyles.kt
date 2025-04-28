// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
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
public interface WrapperCheckBox : BuilderWrapper<CheckBoxStyle, CheckBoxStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperCheckBoxView : WrapperCheckBox

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperCheckBoxTerminate(
    public override val builder: CheckBoxStyleBuilder,
) : WrapperCheckBox

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCheckBoxL(
    public override val builder: CheckBoxStyleBuilder,
) : WrapperCheckBoxView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCheckBoxM(
    public override val builder: CheckBoxStyleBuilder,
) : WrapperCheckBoxView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCheckBoxS(
    public override val builder: CheckBoxStyleBuilder,
) : WrapperCheckBoxView

public val WrapperCheckBoxView.Default: WrapperCheckBoxTerminate
    @Composable
    get() = builder
        .colorValues {
            toggleColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(CheckBoxStates.Checked)
                        to StarDsTheme.colors.surfaceDefaultAccent,
                    setOf(CheckBoxStates.Indeterminate)
                        to StarDsTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleIconColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            toggleBorderColor(
                StarDsTheme.colors.outlineDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                        to StarDsTheme.colors.outlineDefaultAccent,
                    setOf(
                        InteractiveState.Focused,
                        CheckBoxStates.Indeterminate,
                    )
                        to StarDsTheme.colors.outlineDefaultAccent,
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.outlineDefaultAccent,
                    setOf(CheckBoxStates.Checked)
                        to StarDsTheme.colors.outlineDefaultClear,
                    setOf(CheckBoxStates.Indeterminate)
                        to StarDsTheme.colors.outlineDefaultClear,
                ),
            )
        }
        .wrap(::WrapperCheckBoxTerminate)

public val WrapperCheckBoxView.Negative: WrapperCheckBoxTerminate
    @Composable
    get() = builder
        .colorValues {
            toggleColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(CheckBoxStates.Checked)
                        to StarDsTheme.colors.surfaceDefaultNegative,
                    setOf(CheckBoxStates.Indeterminate)
                        to StarDsTheme.colors.surfaceDefaultNegative,
                ),
            )
            toggleIconColor(
                StarDsTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            toggleBorderColor(
                StarDsTheme.colors.outlineDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                        to StarDsTheme.colors.outlineDefaultNegative,
                    setOf(
                        InteractiveState.Focused,
                        CheckBoxStates.Indeterminate,
                    )
                        to StarDsTheme.colors.outlineDefaultNegative,
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.outlineDefaultNegative,
                    setOf(CheckBoxStates.Checked)
                        to StarDsTheme.colors.outlineDefaultClear,
                    setOf(CheckBoxStates.Indeterminate)
                        to StarDsTheme.colors.outlineDefaultClear,
                ),
            )
        }
        .wrap(::WrapperCheckBoxTerminate)

private val CheckBoxStyleBuilder.invariantProps: CheckBoxStyleBuilder
    @Composable
    get() = this
        .colorValues {
            labelColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensionValues {
            toggleBorderOffset(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_offset).asStatefulValue(
                    setOf(InteractiveState.Focused) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_offset_0),
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_offset_1),
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_offset_2),
                ),
            )
        }
        .disableAlpha(0.4f)

public val CheckBox.L: WrapperCheckBoxL
    @Composable
    @JvmName("WrapperCheckBoxL")
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyLNormal)
        .descriptionStyle(StarDsTheme.typography.bodyMNormal)
        .dimensionValues {
            toggleWidth(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_width_l))
            toggleHeight(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_height_l))
            toggleIconHeight(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_l).asStatefulValue(
                    setOf(CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_l_0),
                    setOf(CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_l_1),
                ),
            )
            toggleIconWidth(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_l).asStatefulValue(
                    setOf(CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_l_0),
                    setOf(CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_l_1),
                ),
            )
            toggleBorderWidth(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_l).asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_l_0),
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_l_1),
                ),
            )
            togglePadding(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_padding_l))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_check_box_text_padding_l))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_check_box_description_padding_l))
        }
        .wrap(::WrapperCheckBoxL)

public val CheckBox.M: WrapperCheckBoxM
    @Composable
    @JvmName("WrapperCheckBoxM")
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXs)
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .descriptionStyle(StarDsTheme.typography.bodySNormal)
        .dimensionValues {
            toggleWidth(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_width_m))
            toggleHeight(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_height_m))
            toggleIconHeight(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_m).asStatefulValue(
                    setOf(CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_m_0),
                    setOf(CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_m_1),
                ),
            )
            toggleIconWidth(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_m).asStatefulValue(
                    setOf(CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_m_0),
                    setOf(CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_m_1),
                ),
            )
            toggleBorderWidth(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_m).asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_m_0),
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_m_1),
                ),
            )
            togglePadding(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_padding_m))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_check_box_text_padding_m))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_check_box_description_padding_m))
        }
        .wrap(::WrapperCheckBoxM)

public val CheckBox.S: WrapperCheckBoxS
    @Composable
    @JvmName("WrapperCheckBoxS")
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundXxs)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .descriptionStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleWidth(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_width_s))
            toggleHeight(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_height_s))
            toggleIconHeight(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_s).asStatefulValue(
                    setOf(CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_s_0),
                    setOf(CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_height_s_1),
                ),
            )
            toggleIconWidth(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_s).asStatefulValue(
                    setOf(CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_s_0),
                    setOf(CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_icon_width_s_1),
                ),
            )
            toggleBorderWidth(
                dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_s).asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_s_0),
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to
                        dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_border_width_s_1),
                ),
            )
            togglePadding(dimensionResource(R.dimen.sdkit_cmp_check_box_toggle_padding_s))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_check_box_text_padding_s))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_check_box_description_padding_s))
        }
        .wrap(::WrapperCheckBoxS)
