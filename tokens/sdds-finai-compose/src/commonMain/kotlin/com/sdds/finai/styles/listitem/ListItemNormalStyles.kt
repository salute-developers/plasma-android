// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.theme.SddsFinAiTheme
import com.sdds.icons.compose.DisclosureRightOutline16
import com.sdds.icons.compose.DisclosureRightOutline24
import com.sdds.icons.compose.SddsIcons
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListItemNormal : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

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
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            titleColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
            subtitleColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            labelColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureIconColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val ListItemNormal.L: WrapperListItemNormalL
    @Composable
    @JvmName("WrapperListItemNormalL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS)
        .titleStyle(SddsFinAiTheme.typography.bodyLNormal)
        .subtitleStyle(SddsFinAiTheme.typography.bodyMNormal)
        .labelStyle(SddsFinAiTheme.typography.bodyMNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            height(56.0.dp)
            contentPaddingStart(8.0.dp)
        }
        .wrap(::WrapperListItemNormalL)

public val ListItemNormal.M: WrapperListItemNormalM
    @Composable
    @JvmName("WrapperListItemNormalM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS.adjustBy(all = -2.0.dp))
        .titleStyle(SddsFinAiTheme.typography.bodyMNormal)
        .subtitleStyle(SddsFinAiTheme.typography.bodySNormal)
        .labelStyle(SddsFinAiTheme.typography.bodySNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
            height(48.0.dp)
            contentPaddingStart(8.0.dp)
        }
        .wrap(::WrapperListItemNormalM)

public val ListItemNormal.S: WrapperListItemNormalS
    @Composable
    @JvmName("WrapperListItemNormalS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(SddsFinAiTheme.typography.bodySNormal)
        .subtitleStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .labelStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(10.0.dp)
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
            height(40.0.dp)
            contentPaddingStart(6.0.dp)
        }
        .wrap(::WrapperListItemNormalS)

public val ListItemNormal.Xs: WrapperListItemNormalXs
    @Composable
    @JvmName("WrapperListItemNormalXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs.adjustBy(all = -2.0.dp))
        .titleStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .labelStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(6.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            height(32.0.dp)
            contentPaddingStart(6.0.dp)
        }
        .wrap(::WrapperListItemNormalXs)
