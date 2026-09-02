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
            titleColor(SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

public val WrapperDropdownMenuItemTightView.Negative: WrapperDropdownMenuItemTightTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue())
        }
        .wrap(::WrapperDropdownMenuItemTightTerminate)

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            disclosureIconColor(SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val DropdownMenuItemTight.M: WrapperDropdownMenuItemTightM
    @Composable
    @JvmName("WrapperDropdownMenuItemTightM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS.adjustBy(all = -2.0.dp))
        .titleStyle(SddsFinAiTheme.typography.bodyMNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline24))
        .dimensions {
            contentPaddingEnd(8.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            height(40.0.dp)
            contentPaddingStart(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightM)

public val DropdownMenuItemTight.S: WrapperDropdownMenuItemTightS
    @Composable
    @JvmName("WrapperDropdownMenuItemTightS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs)
        .titleStyle(SddsFinAiTheme.typography.bodySNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
            height(32.0.dp)
            contentPaddingStart(6.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightS)

public val DropdownMenuItemTight.Xs: WrapperDropdownMenuItemTightXs
    @Composable
    @JvmName("WrapperDropdownMenuItemTightXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs.adjustBy(all = -2.0.dp))
        .titleStyle(SddsFinAiTheme.typography.bodyXsNormal)
        .disclosureIcon(imageVectorSource(SddsIcons.DisclosureRightOutline16))
        .dimensions {
            contentPaddingEnd(6.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            height(24.0.dp)
            contentPaddingStart(6.0.dp)
        }
        .wrap(::WrapperDropdownMenuItemTightXs)
