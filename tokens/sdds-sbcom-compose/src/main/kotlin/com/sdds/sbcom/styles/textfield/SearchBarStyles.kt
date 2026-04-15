// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.textfield

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TextFieldLabelPlacement
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.TextFieldStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSearchBar : BuilderWrapper<TextFieldStyle, TextFieldStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperSearchBarDefault(
    public override val builder: TextFieldStyleBuilder,
) : WrapperSearchBar

public val SearchBar.Default: WrapperSearchBarDefault
    @Composable
    @JvmName("WrapperSearchBarDefault")
    get() = TextFieldStyle.builder(this)
        .singleLine(true)
        .shape(CircleShape)
        .dimensions {
            boxPaddingStart(16.0.dp)
            boxPaddingEnd(16.0.dp)
            boxPaddingTop(16.0.dp)
            boxPaddingBottom(16.0.dp)
            boxMinHeight(56.0.dp)
            alignmentLineHeight(56.0.dp)
            startContentPadding(16.0.dp)
            endContentPadding(16.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
        }
        .valueStyle(SddsSbComTheme.typography.bodyLNormal)
        .placeholderStyle(SddsSbComTheme.typography.bodyLNormal)
        .labelPlacement(TextFieldLabelPlacement.None)
        .colors {
            valueColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            startContentColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(),
            )
            endContentColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
            cursorColor(
                SddsSbComTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperSearchBarDefault)
