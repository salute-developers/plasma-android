// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.checkbox

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCheckBox : BuilderWrapper<CheckBoxStyle, CheckBoxStyleBuilder>

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperCheckBoxTerminate(
    public override val builder: CheckBoxStyleBuilder,
) : WrapperCheckBox

public val CheckBox.VariantDefault: WrapperCheckBoxTerminate
    @Composable
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .colorValues {
            toggleBorderColor(
                SolidColor(SddsSbComTheme.colors.textDefaultParagraph).asStatefulValue(
                    setOf(CheckBoxStates.Checked)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultClear),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(SddsSbComTheme.colors.surfaceDefaultClear),
                ),
            )
            toggleColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(CheckBoxStates.Checked)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent),
                ),
            )
            toggleIconColor(SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue())
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to
                        SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentAccent.multiplyAlpha(0.08f)),
                    setOf(InteractiveState.Focused) to
                        SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentAccent),
                ),
            )
        }
        .wrap(::WrapperCheckBoxTerminate)

public val CheckBox.VariantPoll: WrapperCheckBoxTerminate
    @Composable
    get() = CheckBoxStyle.builder(this)
        .invariantProps
        .colorValues {
            toggleBorderColor(
                SolidColor(SddsSbComTheme.colors.outlineOnLightDefault).asStatefulValue(
                    setOf(CheckBoxStates.Checked)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultClear),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(SddsSbComTheme.colors.surfaceDefaultClear),
                ),
            )
            toggleColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkTransparentTertiary).asStatefulValue(
                    setOf(CheckBoxStates.Checked)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnLightSolidPrimary),
                    setOf(CheckBoxStates.Indeterminate) to
                        SolidColor(SddsSbComTheme.colors.surfaceOnLightSolidPrimary),
                ),
            )
            toggleIconColor(SolidColor(SddsSbComTheme.colors.textOnLightAccent).asStatefulValue())
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnDarkTransparentTertiary),
                    setOf(InteractiveState.Focused) to
                        SolidColor(SddsSbComTheme.colors.surfaceOnDarkTransparentTertiary),
                ),
            )
        }
        .wrap(::WrapperCheckBoxTerminate)

private val CheckBoxStyleBuilder.invariantProps: CheckBoxStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .shape(CircleShape)
        .backgroundShape(CircleShape)
        .colorValues {
            labelColor(SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue())
            descriptionColor(SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue())
        }
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            togglePadding(1.0.dp)
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
            toggleBorderWidth(1.5.dp)
            toggleBorderOffset(0.0.dp)
            paddingStart(9.0.dp)
            paddingTop(9.0.dp)
            paddingEnd(9.0.dp)
            paddingBottom(9.0.dp)
        }
