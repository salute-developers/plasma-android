// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.radiobox

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
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
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(RadioBoxStates.Checked)
                        to PlasmaHomeDsTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleIconColor(
                PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            toggleBorderColor(
                PlasmaHomeDsTheme.colors.outlineDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to PlasmaHomeDsTheme.colors.outlineDefaultAccent,
                    setOf(
                        InteractiveState.Focused,
                        RadioBoxStates.Checked,
                    )
                        to PlasmaHomeDsTheme.colors.outlineDefaultAccent,
                    setOf(RadioBoxStates.Checked)
                        to PlasmaHomeDsTheme.colors.outlineDefaultClear,
                ),
            )
        }
        .dimensionValues {
            toggleBorderOffset(
                0.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused) to 3.0.dp,
                    setOf(
                        InteractiveState.Focused,
                        RadioBoxStates.Checked,
                    ) to 3.0.dp,
                ),
            )
        }
        .disableAlpha(0.4f)

public val RadioBox.L: WrapperRadioBoxL
    @Composable
    @JvmName("WrapperRadioBoxL")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            toggleIconHeight(10.0.dp)
            toggleIconWidth(10.0.dp)
            toggleBorderWidth(
                2.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.0.dp,
                ),
            )
            togglePadding(1.0.dp)
            textPadding(12.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperRadioBoxL)

public val RadioBox.M: WrapperRadioBoxM
    @Composable
    @JvmName("WrapperRadioBoxM")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            toggleIconHeight(10.0.dp)
            toggleIconWidth(10.0.dp)
            toggleBorderWidth(
                2.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.0.dp,
                ),
            )
            togglePadding(1.0.dp)
            textPadding(10.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperRadioBoxM)

public val RadioBox.S: WrapperRadioBoxS
    @Composable
    @JvmName("WrapperRadioBoxS")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleWidth(18.0.dp)
            toggleHeight(18.0.dp)
            toggleIconHeight(8.0.dp)
            toggleIconWidth(8.0.dp)
            toggleBorderWidth(
                1.5.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.0.dp,
                ),
            )
            togglePadding(1.0.dp)
            textPadding(8.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperRadioBoxS)
