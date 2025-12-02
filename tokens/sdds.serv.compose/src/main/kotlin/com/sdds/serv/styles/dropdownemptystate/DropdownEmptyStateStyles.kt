// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.dropdownemptystate

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownEmptyStateStyle
import com.sdds.compose.uikit.DropdownEmptyStateStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Clear
import com.sdds.serv.styles.basicbutton.L
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.basicbutton.S
import com.sdds.serv.styles.basicbutton.Xl
import com.sdds.serv.styles.basicbutton.Xs
import com.sdds.serv.theme.SddsServTheme
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

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownEmptyStateL(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации LHasButton
 */
@JvmInline
public value class WrapperDropdownEmptyStateLHasButton(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownEmptyStateXl(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

/**
 * Обертка для вариации XlHasButton
 */
@JvmInline
public value class WrapperDropdownEmptyStateXlHasButton(
    public override val builder: DropdownEmptyStateStyleBuilder,
) : WrapperDropdownEmptyState

private val DropdownEmptyStateStyleBuilder.invariantProps: DropdownEmptyStateStyleBuilder
    @Composable
    get() = this
        .colors {
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            descriptionColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }

public val DropdownEmptyState.Xs: WrapperDropdownEmptyStateXs
    @Composable
    @JvmName("WrapperDropdownEmptyStateXs")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsServTheme.typography.bodyXsNormal)
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            descriptionPadding(4.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateXs)

public val WrapperDropdownEmptyStateXs.HasButton: WrapperDropdownEmptyStateXsHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateXsHasButton")
    get() = builder
        .dimensions {
            paddingTop(16.0.dp)
            paddingBottom(9.0.dp)
        }
        .buttonStyle(BasicButton.Xs.Clear.style())
        .wrap(::WrapperDropdownEmptyStateXsHasButton)

public val DropdownEmptyState.S: WrapperDropdownEmptyStateS
    @Composable
    @JvmName("WrapperDropdownEmptyStateS")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsServTheme.typography.bodySNormal)
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(22.0.dp)
            paddingBottom(22.0.dp)
            descriptionPadding(4.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateS)

public val WrapperDropdownEmptyStateS.HasButton: WrapperDropdownEmptyStateSHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateSHasButton")
    get() = builder
        .dimensions {
            paddingTop(22.0.dp)
            paddingBottom(11.0.dp)
        }
        .buttonStyle(BasicButton.S.Clear.style())
        .wrap(::WrapperDropdownEmptyStateSHasButton)

public val DropdownEmptyState.M: WrapperDropdownEmptyStateM
    @Composable
    @JvmName("WrapperDropdownEmptyStateM")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsServTheme.typography.bodyMNormal)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(26.0.dp)
            paddingBottom(26.0.dp)
            descriptionPadding(6.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateM)

public val WrapperDropdownEmptyStateM.HasButton: WrapperDropdownEmptyStateMHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateMHasButton")
    get() = builder
        .dimensions {
            paddingTop(26.0.dp)
            paddingBottom(14.0.dp)
        }
        .buttonStyle(BasicButton.M.Clear.style())
        .wrap(::WrapperDropdownEmptyStateMHasButton)

public val DropdownEmptyState.L: WrapperDropdownEmptyStateL
    @Composable
    @JvmName("WrapperDropdownEmptyStateL")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsServTheme.typography.bodyLNormal)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(32.0.dp)
            paddingBottom(32.0.dp)
            descriptionPadding(8.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateL)

public val WrapperDropdownEmptyStateL.HasButton: WrapperDropdownEmptyStateLHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateLHasButton")
    get() = builder
        .dimensions {
            paddingTop(32.0.dp)
            paddingBottom(17.0.dp)
        }
        .buttonStyle(BasicButton.L.Clear.style())
        .wrap(::WrapperDropdownEmptyStateLHasButton)

public val DropdownEmptyState.Xl: WrapperDropdownEmptyStateXl
    @Composable
    @JvmName("WrapperDropdownEmptyStateXl")
    get() = DropdownEmptyStateStyle.builder(this)
        .invariantProps
        .descriptionStyle(SddsServTheme.typography.bodyLNormal)
        .dimensions {
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(32.0.dp)
            paddingBottom(32.0.dp)
            descriptionPadding(12.0.dp)
        }
        .wrap(::WrapperDropdownEmptyStateXl)

public val WrapperDropdownEmptyStateXl.HasButton: WrapperDropdownEmptyStateXlHasButton
    @Composable
    @JvmName("WrapperDropdownEmptyStateXlHasButton")
    get() = builder
        .dimensions {
            paddingTop(32.0.dp)
            paddingBottom(12.0.dp)
        }
        .buttonStyle(BasicButton.Xl.Clear.style())
        .wrap(::WrapperDropdownEmptyStateXlHasButton)
