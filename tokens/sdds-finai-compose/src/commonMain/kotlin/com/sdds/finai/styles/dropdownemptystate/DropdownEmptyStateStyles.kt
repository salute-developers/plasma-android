// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.dropdownemptystate

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.DropdownEmptyStateStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.styles.basicbutton.BasicButton
import com.sdds.finai.styles.basicbutton.Clear
import com.sdds.finai.styles.basicbutton.S
import com.sdds.finai.styles.basicbutton.Xs
import com.sdds.finai.styles.basicbutton.Xxs
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownEmptyState :
    BuilderWrapper<DropdownEmptyStateStyle, DropdownEmptyStateStyleBuilder>

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownEmptyStateXs(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации XsHasButton
 */
@JvmInline
public value class WrapperDropdownEmptyStateXsHasButton(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownEmptyStateS(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации SHasButton
 */
@JvmInline
public value class WrapperDropdownEmptyStateSHasButton(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownEmptyStateM(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации MHasButton
 */
@JvmInline
public value class WrapperDropdownEmptyStateMHasButton(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

private val DropdownEmptyStateStyleBuilder.invariantProps: DropdownEmptyStateStyleBuilder
    @Composable
    get() = this
        .colors {
            iconColor(SddsFinAiTheme.colors.textDefaultPrimary.asInteractive())
            descriptionColor(SddsFinAiTheme.colors.textDefaultPrimary.asInteractive())
        }

public val DropdownEmptyState.Xs: WrapperDropdownEmptyStateXs
    @Composable
    @JvmName("WrapperDropdownEmptyStateXs")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .dimensions {
            descriptionPadding(4.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateXs)

public val WrapperDropdownEmptyStateXs.HasButton: WrapperDropdownEmptyStateXsHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateXsHasButton")
    get() = builder
        .buttonStyle(BasicButton.Xxs.Clear.style())
        .dimensions {
            paddingTop(16.0.dp)
            paddingBottom(9.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateXsHasButton)

public val DropdownEmptyState.S: WrapperDropdownEmptyStateS
    @Composable
    @JvmName("WrapperDropdownEmptyStateS")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsFinAiTheme.typography.bodySNormal)
        .dimensions {
            descriptionPadding(4.0.dp)
            paddingTop(22.0.dp)
            paddingBottom(22.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateS)

public val WrapperDropdownEmptyStateS.HasButton: WrapperDropdownEmptyStateSHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateSHasButton")
    get() = builder
        .buttonStyle(BasicButton.Xs.Clear.style())
        .dimensions {
            paddingTop(22.0.dp)
            paddingBottom(11.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateSHasButton)

public val DropdownEmptyState.M: WrapperDropdownEmptyStateM
    @Composable
    @JvmName("WrapperDropdownEmptyStateM")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsFinAiTheme.typography.bodyMNormal)
        .dimensions {
            descriptionPadding(6.0.dp)
            paddingTop(26.0.dp)
            paddingBottom(26.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateM)

public val WrapperDropdownEmptyStateM.HasButton: WrapperDropdownEmptyStateMHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateMHasButton")
    get() = builder
        .buttonStyle(BasicButton.S.Clear.style())
        .dimensions {
            paddingTop(26.0.dp)
            paddingBottom(14.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateMHasButton)
