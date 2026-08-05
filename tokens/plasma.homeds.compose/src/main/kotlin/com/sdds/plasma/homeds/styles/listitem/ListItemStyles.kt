// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.resourceImageSource
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

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListItemM(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

/**
 * Обертка для вариации MHasBackground
 */
@JvmInline
public value class WrapperListItemMHasBackground(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            subtitleColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            labelColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureIconColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureTextColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
            contentStartColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
            contentEndColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val ListItem.S: WrapperListItemS
    @Composable
    @JvmName("WrapperListItemS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .disclosureTextStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .dimensions {
            contentPaddingEnd(12.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            height(48.0.dp)
            contentPaddingStart(12.0.dp)
        }
        .wrap(::WrapperListItemS)

public val WrapperListItemS.HasBackground: WrapperListItemSHasBackground
    @Composable
    @JvmName("WrapperListItemSHasBackground")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundXl)
        .colors {
            backgroundColor(SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPrimary).asStatefulValue())
        }
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperListItemSHasBackground)

public val ListItem.M: WrapperListItemM
    @Composable
    @JvmName("WrapperListItemM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .subtitleStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .labelStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .disclosureTextStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .dimensions {
            contentPaddingEnd(12.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            height(48.0.dp)
            contentPaddingStart(12.0.dp)
        }
        .wrap(::WrapperListItemM)

public val WrapperListItemM.HasBackground: WrapperListItemMHasBackground
    @Composable
    @JvmName("WrapperListItemMHasBackground")
    get() = builder
        .shape(PlasmaHomeDsTheme.shapes.roundXl)
        .colors {
            backgroundColor(SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPrimary).asStatefulValue())
        }
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperListItemMHasBackground)
