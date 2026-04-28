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
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider
import com.sdds.plasma.homeds.styles.listitem.HasBackground
import com.sdds.plasma.homeds.styles.listitem.ListItem
import com.sdds.plasma.homeds.styles.listitem.M
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

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListM(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации MNoBackground
 */
@JvmInline
public value class WrapperListMNoBackground(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации MNoBackgroundHasItemBackground
 */
@JvmInline
public value class WrapperListMNoBackgroundHasItemBackground(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации MHasBackground
 */
@JvmInline
public value class WrapperListMHasBackground(
    public override val builder: ListStyleBuilder,
) : WrapperList

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())

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

public val List.M: WrapperListM
    @Composable
    @JvmName("WrapperListM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.M.style())
        .dimensions {
            gap(8.0.dp)
        }
        .wrap(::WrapperListM)

public val WrapperListM.NoBackground: WrapperListMNoBackground
    @Composable
    @JvmName("WrapperListMNoBackground")
    get() = builder
        .wrap(::WrapperListMNoBackground)

public val WrapperListMNoBackground.HasItemBackground: WrapperListMNoBackgroundHasItemBackground
    @Composable
    @JvmName("WrapperListMNoBackgroundHasItemBackground")
    get() = builder
        .listItemStyle(ListItem.M.HasBackground.style())
        .wrap(::WrapperListMNoBackgroundHasItemBackground)

public val WrapperListM.HasBackground: WrapperListMHasBackground
    @Composable
    @JvmName("WrapperListMHasBackground")
    get() = builder
        .listItemStyle(ListItem.M.style())
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
        .wrap(::WrapperListMHasBackground)
