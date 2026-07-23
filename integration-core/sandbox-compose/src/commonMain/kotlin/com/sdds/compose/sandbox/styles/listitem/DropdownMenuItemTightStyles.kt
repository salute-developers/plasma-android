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
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.icons.compose.DisclosureRightOutline16
import com.sdds.icons.compose.DisclosureRightOutline24
import com.sdds.icons.compose.SddsIcons
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuItemTight : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperDropdownMenuItemTightView : WrapperDropdownMenuItemTight

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperDropdownMenuItemTightTerminate(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTight

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuItemTightXl(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuItemTightL(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuItemTightM(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuItemTightS(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuItemTightXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemTightView

public val WrapperDropdownMenuItemTightView.Default: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

public val WrapperDropdownMenuItemTightView.Positive: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(SolidColor(SddsSandboxTheme.colors.textDefaultPositive).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

public val WrapperDropdownMenuItemTightView.Negative: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(SolidColor(SddsSandboxTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            disclosureIconColor(SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val DropdownMenuItemTight.Xl: WrapperDropdownMenuItemTightXl
    @Composable
    @JvmName("WrapperDropdownMenuItemTightXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL)
        .titleStyle(SddsSandboxTheme.typography.bodyLNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            height(56.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightXl)

public val DropdownMenuItemTight.L: WrapperDropdownMenuItemTightL
    @Composable
    @JvmName("WrapperDropdownMenuItemTightL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .titleStyle(SddsSandboxTheme.typography.bodyLNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            height(48.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightL)

public val DropdownMenuItemTight.M: WrapperDropdownMenuItemTightM
    @Composable
    @JvmName("WrapperDropdownMenuItemTightM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM)
        .titleStyle(SddsSandboxTheme.typography.bodyMNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            height(40.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightM)

public val DropdownMenuItemTight.S: WrapperDropdownMenuItemTightS
    @Composable
    @JvmName("WrapperDropdownMenuItemTightS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .titleStyle(SddsSandboxTheme.typography.bodySNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(7.0.dp)
            paddingBottom(7.0.dp)
            height(32.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightS)

public val DropdownMenuItemTight.Xs: WrapperDropdownMenuItemTightXs
    @Composable
    @JvmName("WrapperDropdownMenuItemTightXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundS)
        .titleStyle(SddsSandboxTheme.typography.bodyXsNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            height(24.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightXs)
