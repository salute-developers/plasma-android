// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.radiobox

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.RadioBoxStates
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
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
public interface WrapperRadioBox : BuilderWrapper<RadioBoxStyle, RadioBoxStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperRadioBoxDefault(
    public override val builder: RadioBoxStyleBuilder,
) : WrapperRadioBox

public val RadioBox.Default: WrapperRadioBoxDefault
    @Composable
    @JvmName("WrapperRadioBoxDefault")
    get() = RadioBoxStyle.builder(this)
        .shape(CircleShape)
        .backgroundShape(CircleShape)
        .colorValues {
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
            toggleColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
            toggleIconColor(
                SddsSbComTheme.colors.surfaceDefaultAccentPrimary.asInteractive(),
            )
            toggleBorderColor(
                SddsSbComTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .dimensionValues {
            toggleWidth(24.0.dp)
            toggleHeight(24.0.dp)
            toggleIconHeight(10.0.dp)
            toggleIconWidth(10.0.dp)
            toggleBorderOffset(0.0.dp)
            toggleBorderWidth(
                2.0.dp.asStatefulValue(
                    setOf(InteractiveState.Focused, RadioBoxStates.Checked) to 1.0.dp,
                ),
            )
            togglePadding(2.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
        }
        .disableAlpha(0.4f)
        .wrap(::WrapperRadioBoxDefault)
