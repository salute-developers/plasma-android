// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListItemNormal : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperListItemNormalXl(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperListItemNormalL(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListItemNormalM(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListItemNormalS(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperListItemNormalXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItemNormal

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val ListItemNormal.Xl: WrapperListItemNormalXl
    @Composable
    @JvmName("WrapperListItemNormalXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL)
        .titleStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(64.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(20.0.dp)
            paddingBottom(20.0.dp)
        }
        .wrap(::WrapperListItemNormalXl)

public val ListItemNormal.L: WrapperListItemNormalL
    @Composable
    @JvmName("WrapperListItemNormalL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaGigaTheme.typography.bodyLNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(56.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
        }
        .wrap(::WrapperListItemNormalL)

public val ListItemNormal.M: WrapperListItemNormalM
    @Composable
    @JvmName("WrapperListItemNormalM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM)
        .titleStyle(PlasmaGigaTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(8.0.dp)
            height(48.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperListItemNormalM)

public val ListItemNormal.S: WrapperListItemNormalS
    @Composable
    @JvmName("WrapperListItemNormalS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(PlasmaGigaTheme.typography.bodySNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(40.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
        }
        .wrap(::WrapperListItemNormalS)

public val ListItemNormal.Xs: WrapperListItemNormalXs
    @Composable
    @JvmName("WrapperListItemNormalXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundS)
        .titleStyle(PlasmaGigaTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(6.0.dp)
            height(32.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .wrap(::WrapperListItemNormalXs)
