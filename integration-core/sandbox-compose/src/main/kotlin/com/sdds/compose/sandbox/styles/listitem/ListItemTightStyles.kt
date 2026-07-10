// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
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
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            titleColor(SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue())
            subtitleColor(SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue())
            labelColor(SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureIconColor(SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val ListItemTight.Xl: WrapperListItemTightXl
    @Composable
    @JvmName("WrapperListItemTightXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL)
        .titleStyle(SddsSandboxTheme.typography.bodyLNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .labelStyle(SddsSandboxTheme.typography.bodyMNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            height(56.0.dp)
        }
        .wrap(::WrapperListItemTightXl)

public val ListItemTight.L: WrapperListItemTightL
    @Composable
    @JvmName("WrapperListItemTightL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(SddsSandboxTheme.typography.bodyLNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .labelStyle(SddsSandboxTheme.typography.bodyMNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            height(48.0.dp)
        }
        .wrap(::WrapperListItemTightL)

public val ListItemTight.M: WrapperListItemTightM
    @Composable
    @JvmName("WrapperListItemTightM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM)
        .titleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodySNormal)
        .labelStyle(SddsSandboxTheme.typography.bodySNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            height(40.0.dp)
        }
        .wrap(::WrapperListItemTightM)

public val ListItemTight.S: WrapperListItemTightS
    @Composable
    @JvmName("WrapperListItemTightS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(SddsSandboxTheme.typography.bodySNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(7.0.dp)
            paddingBottom(7.0.dp)
            height(32.0.dp)
        }
        .wrap(::WrapperListItemTightS)

public val ListItemTight.Xs: WrapperListItemTightXs
    @Composable
    @JvmName("WrapperListItemTightXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundS)
        .titleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            height(24.0.dp)
        }
        .wrap(::WrapperListItemTightXs)
