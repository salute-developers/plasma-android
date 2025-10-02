// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
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
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val ListItemTight.Xl: WrapperListItemTightXl
    @Composable
    @JvmName("WrapperListItemTightXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .labelStyle(SddsServTheme.typography.bodyMNormal)
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
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .labelStyle(SddsServTheme.typography.bodyMNormal)
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
        .shape(SddsServTheme.shapes.roundM)
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .subtitleStyle(SddsServTheme.typography.bodySNormal)
        .labelStyle(SddsServTheme.typography.bodySNormal)
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
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
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
        .shape(SddsServTheme.shapes.roundS)
        .titleStyle(SddsServTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
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
