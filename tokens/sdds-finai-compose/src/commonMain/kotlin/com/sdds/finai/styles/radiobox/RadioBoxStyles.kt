// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.radiobox

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperRadioBox : BuilderWrapper<RadioBoxStyle, RadioBoxStyleBuilder>

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
        .disableAlpha(0.4f)
        .shape(CircleShape)
        .colorValues {
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
            descriptionColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            toggleBorderColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultAccent),
                    setOf(RadioBoxStates.Checked) to
                        SolidColor(SddsFinAiTheme.colors.outlineDefaultClear),
                ),
            )
            toggleColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(RadioBoxStates.Checked)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccent),
                ),
            )
            toggleIconColor(SolidColor(SddsFinAiTheme.colors.backgroundDefaultPrimary).asStatefulValue())
        }
        .dimensionValues {
            toggleBorderOffset(
                0.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused) to 3.0.dp,
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 3.0.dp,
                ),
            )
        }

public val RadioBox.M: WrapperRadioBoxM
    @Composable
    @JvmName("WrapperRadioBoxM")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(SddsFinAiTheme.typography.bodyMNormal)
        .descriptionStyle(SddsFinAiTheme.typography.bodySNormal)
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            togglePadding(1.0.dp)
            toggleIconHeight(0.0.dp.asStatefulValue(setOf(RadioBoxStates.Checked) to 10.0.dp))
            toggleIconWidth(0.0.dp.asStatefulValue(setOf(RadioBoxStates.Checked) to 10.0.dp))
            toggleBorderWidth(
                2.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked)
                        to 1.0.dp,
                ),
            )
            textPadding(10.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperRadioBoxM)

public val RadioBox.S: WrapperRadioBoxS
    @Composable
    @JvmName("WrapperRadioBoxS")
    get() = RadioBoxStyle.builder(this)
        .invariantProps
        .labelStyle(SddsFinAiTheme.typography.bodySNormal)
        .descriptionStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .dimensionValues {
            toggleWidth(16.0.dp)
            toggleHeight(16.0.dp)
            togglePadding(1.0.dp)
            toggleIconHeight(0.0.dp.asStatefulValue(setOf(RadioBoxStates.Checked) to 8.0.dp))
            toggleIconWidth(0.0.dp.asStatefulValue(setOf(RadioBoxStates.Checked) to 8.0.dp))
            toggleBorderWidth(
                1.5.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked)
                        to 1.0.dp,
                ),
            )
            textPadding(8.0.dp)
            descriptionPadding(2.0.dp)
        }
        .wrap(::WrapperRadioBoxS)
