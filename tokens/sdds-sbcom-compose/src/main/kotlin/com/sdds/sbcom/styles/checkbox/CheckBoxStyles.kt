// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.checkbox

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CheckBoxStates
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.multiplyAlpha
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCheckBox : BuilderWrapper<CheckBoxStyle, CheckBoxStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperCheckBoxDefault(
    public override val builder: CheckBoxStyleBuilder,
) : WrapperCheckBox

public val CheckBox.Default: WrapperCheckBoxDefault
    @Composable
    @JvmName("WrapperCheckBoxDefault")
    get() = CheckBoxStyle.builder(this)
        .shape(CircleShape)
        .backgroundShape(CircleShape)
        .colorValues {
            labelColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccent.multiplyAlpha(0.08f),
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccent,
                    setOf(InteractiveState.Focused)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccent,
                ),
            )
            descriptionColor(
                SddsSbComTheme.colors.textDefaultSecondary.asInteractive(),
            )
            toggleColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(CheckBoxStates.Checked)
                        to SddsSbComTheme.colors.surfaceDefaultAccent,
                    setOf(CheckBoxStates.Indeterminate)
                        to SddsSbComTheme.colors.surfaceDefaultAccent,
                ),
            )
            toggleIconColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            toggleBorderColor(
                SddsSbComTheme.colors.textDefaultParagraph.asInteractive(
                    setOf(CheckBoxStates.Checked)
                        to SddsSbComTheme.colors.surfaceDefaultClear,
                    setOf(CheckBoxStates.Indeterminate)
                        to SddsSbComTheme.colors.surfaceDefaultClear,
                ),
            )
        }
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            toggleIconHeight(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 6.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to
                        2.0.dp,
                ),
            )
            toggleIconWidth(
                0.0.dp.asStatefulValue(
                    setOf(CheckBoxStates.Checked) to 9.0.dp,
                    setOf(CheckBoxStates.Indeterminate) to
                        12.0.dp,
                ),
            )
            toggleBorderOffset(0.0.dp)
            toggleBorderWidth(1.5.dp)
            togglePadding(1.0.dp)
            paddingStart(9.0.dp)
            paddingEnd(9.0.dp)
            paddingTop(9.0.dp)
            paddingBottom(9.0.dp)
        }
        .disableAlpha(0.4f)
        .wrap(::WrapperCheckBoxDefault)
