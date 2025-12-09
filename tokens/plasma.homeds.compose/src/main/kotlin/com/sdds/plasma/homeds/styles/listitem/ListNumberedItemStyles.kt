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
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.counter.Counter
import com.sdds.plasma.homeds.styles.counter.Secondary
import com.sdds.plasma.homeds.styles.counter.Xs
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListNumberedItem : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListNumberedItemS(
    public override val builder: ListItemStyleBuilder,
) : WrapperListNumberedItem

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }

public val ListNumberedItem.S: WrapperListNumberedItemS
    @Composable
    @JvmName("WrapperListNumberedItemS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .titleStyle(PlasmaHomeDsTheme.typography.bodySNormal)
        .dimensions {
            contentPaddingStart(6.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
        }
        .counterStyle(Counter.Xs.Secondary.style())
        .wrap(::WrapperListNumberedItemS)
