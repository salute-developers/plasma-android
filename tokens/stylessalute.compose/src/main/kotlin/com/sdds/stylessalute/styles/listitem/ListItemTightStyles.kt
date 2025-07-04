// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListItemTight : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperListItemTightXl(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperListItemTightL(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListItemTightM(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListItemTightS(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperListItemTightXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemTight

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val ListItemTight.Xl: WrapperListItemTightXl
    @Composable
    @JvmName("WrapperListItemTightXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL)
        .titleStyle(StylesSaluteTheme.typography.bodyLNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(56.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
        }
        .wrap(::WrapperListItemTightXl)

public val ListItemTight.L: WrapperListItemTightL
    @Composable
    @JvmName("WrapperListItemTightL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.bodyLNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(48.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperListItemTightL)

public val ListItemTight.M: WrapperListItemTightM
    @Composable
    @JvmName("WrapperListItemTightM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .titleStyle(StylesSaluteTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(40.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .wrap(::WrapperListItemTightM)

public val ListItemTight.S: WrapperListItemTightS
    @Composable
    @JvmName("WrapperListItemTightS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(StylesSaluteTheme.typography.bodySNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(7.0.dp)
            paddingBottom(7.0.dp)
        }
        .wrap(::WrapperListItemTightS)

public val ListItemTight.Xs: WrapperListItemTightXs
    @Composable
    @JvmName("WrapperListItemTightXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS)
        .titleStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(24.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
        }
        .wrap(::WrapperListItemTightXs)
