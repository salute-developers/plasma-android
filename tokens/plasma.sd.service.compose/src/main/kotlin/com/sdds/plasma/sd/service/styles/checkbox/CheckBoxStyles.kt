// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.checkbox

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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
            toggleBorderColor(
                SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultTransparentTertiary).asStatefulValue(
                    setOf(
                        InteractiveState.Focused,
                        CheckBoxStates.Checked,
                    ) to SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultAccent),
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to
                        SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultAccent),
                    setOf(InteractiveState.Focused) to
                        SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultAccent),
                    setOf(CheckBoxStates.Checked) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear),
                ),
            )
            toggleColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(CheckBoxStates.Checked)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccent),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccent),
                ),
            )
            toggleIconColor(SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperCheckBoxTerminate)

public val WrapperCheckBoxView.Negative: WrapperCheckBoxTerminate
    @Composable
    get() = builder
        .colorValues {
            toggleBorderColor(
                SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultNegative).asStatefulValue(
                    setOf(
                        InteractiveState.Focused,
                        CheckBoxStates.Checked,
                    ) to
                        SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultNegative),
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to
                        SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultNegative),
                    setOf(InteractiveState.Focused) to
                        SolidColor(PlasmaSdServiceTheme.colors.outlineDefaultNegative),
                    setOf(CheckBoxStates.Checked) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear),
                ),
            )
            toggleColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(CheckBoxStates.Checked)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative),
                ),
            )
            toggleIconColor(SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue())
        }
        .wrap(::WrapperCheckBoxTerminate)

private val CheckBoxStyleBuilder.invariantProps: CheckBoxStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .colorValues {
            labelColor(SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue())
            descriptionColor(SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondary).asStatefulValue())
        }
        .dimensionValues {
            toggleBorderOffset(
                0.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused) to 3.0.dp,
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked) to 3.0.dp,
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to 3.0.dp,
                ),
            )
        }

public val CheckBox.L: WrapperCheckBoxL
    @Composable
    @JvmName("WrapperCheckBoxL")
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            togglePadding(2.0.dp)
            toggleIconHeight(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 6.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to 2.0.dp,
                ),
            )
            toggleIconWidth(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 9.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to 12.0.dp,
                ),
            )
            toggleBorderWidth(
                2.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                        to 1.0.dp,
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to 1.0.dp,
                ),
            )
            textPadding(12.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperCheckBoxL)

public val CheckBox.M: WrapperCheckBoxM
    @Composable
    @JvmName("WrapperCheckBoxM")
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            togglePadding(2.0.dp)
            toggleIconHeight(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 6.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to 2.0.dp,
                ),
            )
            toggleIconWidth(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 9.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to 12.0.dp,
                ),
            )
            toggleBorderWidth(
                2.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                        to 1.0.dp,
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to 1.0.dp,
                ),
            )
            textPadding(12.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperCheckBoxM)

public val CheckBox.S: WrapperCheckBoxS
    @Composable
    @JvmName("WrapperCheckBoxS")
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaSdServiceTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaSdServiceTheme.typography.bodyXsNormal)
        .shape(PlasmaSdServiceTheme.shapes.roundXxs)
        .dimensionValues {
            toggleWidth(16.0.dp)
            toggleHeight(16.0.dp)
            togglePadding(1.0.dp)
            toggleIconHeight(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 4.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to 2.0.dp,
                ),
            )
            toggleIconWidth(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 6.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to 8.0.dp,
                ),
            )
            toggleBorderWidth(
                1.5.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, CheckBoxStates.Checked)
                        to 1.0.dp,
                    setOf(InteractiveState.Focused, CheckBoxStates.Indeterminate) to 1.0.dp,
                ),
            )
            textPadding(8.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperCheckBoxS)
