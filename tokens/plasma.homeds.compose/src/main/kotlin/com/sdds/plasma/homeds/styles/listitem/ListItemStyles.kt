// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListItem : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListItemS(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

/**
 * Обертка для вариации SHasBackground
 */
@JvmInline
public value class WrapperListItemSHasBackground(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val ListItem.S: WrapperListItemS
    @Composable
    @JvmName("WrapperListItemS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(12.0.dp)
            height(48.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
        }
        .wrap(::WrapperListItemS)

public val WrapperListItemS.HasBackground: WrapperListItemSHasBackground
    @Composable
    @JvmName("WrapperListItemSHasBackground")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundXl)
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
        }
        .wrap(::WrapperListItemSHasBackground)
