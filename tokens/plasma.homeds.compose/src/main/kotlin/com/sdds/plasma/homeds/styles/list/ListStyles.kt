// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.listitem.HasBackground
import com.sdds.plasma.homeds.styles.listitem.ListItem
import com.sdds.plasma.homeds.styles.listitem.S
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperList : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListS(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации SNoBackground
 */
@JvmInline
public value class WrapperListSNoBackground(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации SNoBackgroundHasItemBackground
 */
@JvmInline
public value class WrapperListSNoBackgroundHasItemBackground(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации SHasBackground
 */
@JvmInline
public value class WrapperListSHasBackground(
    public override val builder: ListStyleBuilder,
) : WrapperList

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this

public val List.S: WrapperListS
    @Composable
    @JvmName("WrapperListS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.S.style())
        .dimensions {
            gap(8.0.dp)
        }
        .wrap(::WrapperListS)

public val WrapperListS.NoBackground: WrapperListSNoBackground
    @Composable
    @JvmName("WrapperListSNoBackground")
    get() = builder
        .wrap(::WrapperListSNoBackground)

public val WrapperListSNoBackground.HasItemBackground: WrapperListSNoBackgroundHasItemBackground
    @Composable
    @JvmName("WrapperListSNoBackgroundHasItemBackground")
    get() = builder
        .listItemStyle(ListItem.S.HasBackground.style())
        .wrap(::WrapperListSNoBackgroundHasItemBackground)

public val WrapperListS.HasBackground: WrapperListSHasBackground
    @Composable
    @JvmName("WrapperListSHasBackground")
    get() = builder
        .listItemStyle(ListItem.S.style())
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
        }
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentPrimary.asInteractive(),
            )
        }
        .shape(PlasmaHomeDsTheme.shapes.roundXxl.adjustBy(all = -4.0.dp))
        .wrap(::WrapperListSHasBackground)
