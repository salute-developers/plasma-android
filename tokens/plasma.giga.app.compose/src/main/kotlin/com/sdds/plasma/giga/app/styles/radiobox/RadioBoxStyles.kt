// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.radiobox

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
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
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
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(RadioBoxStates.Checked)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleIconColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
            toggleBorderColor(
                PlasmaGigaAppTheme.colors.outlineDefaultTransparentTertiary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to PlasmaGigaAppTheme.colors.outlineDefaultAccent,
                    setOf(
                        InteractiveState.Focused,
                        RadioBoxStates.Checked,
                    )
                        to PlasmaGigaAppTheme.colors.outlineDefaultAccent,
                    setOf(RadioBoxStates.Checked)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultClear,
                ),
            )
        }
        .dimensionValues {
            toggleBorderOffset(
                0.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused) to 3.0f.dp,
                    setOf(
                        InteractiveState.Focused,
                        RadioBoxStates.Checked,
                    ) to 3.0f.dp,
                ),
            )
        }
        .disableAlpha(0.4f)

public val RadioBox.L: WrapperRadioBoxL
    @Composable
    @JvmName("WrapperRadioBoxL")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(PlasmaGigaAppTheme.typography.bodyLNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .dimensionValues {
            toggleWidth(22.0.dp)
            toggleHeight(22.0.dp)
            toggleIconHeight(10.0.dp)
            toggleIconWidth(10.0.dp)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodyMNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .dimensionValues {
            toggleWidth(22.0.dp)
            toggleHeight(22.0.dp)
            toggleIconHeight(10.0.dp)
            toggleIconWidth(10.0.dp)
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
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .descriptionStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleWidth(16.0.dp)
            toggleHeight(16.0.dp)
            toggleIconHeight(8.0.dp)
            toggleIconWidth(8.0.dp)
            togglePadding(1.0.dp)
            textPadding(8.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperRadioBoxS)
