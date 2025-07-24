// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.tabbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.tabbaritem.Accent
import com.sdds.plasma.giga.styles.tabbaritem.Default
import com.sdds.plasma.giga.styles.tabbaritem.L
import com.sdds.plasma.giga.styles.tabbaritem.M
import com.sdds.plasma.giga.styles.tabbaritem.Secondary
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemSolid
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarIslandSolid : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandSolidMView : WrapperTabBarIslandSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarIslandSolidTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarIslandSolidM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandSolidMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarIslandSolidMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandSolidMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandSolidLView : WrapperTabBarIslandSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarIslandSolidL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandSolidLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarIslandSolidLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandSolidLView

private val TabBarStyleBuilder.invariantProps: TabBarStyleBuilder
    @Composable
    get() = this
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .bottomShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            contentPaddingStart(2.0.dp)
            contentPaddingEnd(2.0.dp)
            contentPaddingTop(2.0.dp)
            contentPaddingBottom(2.0.dp)
            itemSpacing(2.0.dp)
        }

public val WrapperTabBarIslandSolidMView.Default: WrapperTabBarIslandSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandSolidMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Default.style())
        .wrap(::WrapperTabBarIslandSolidTerminate)

public val WrapperTabBarIslandSolidMView.Secondary: WrapperTabBarIslandSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandSolidMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Secondary.style())
        .wrap(::WrapperTabBarIslandSolidTerminate)

public val WrapperTabBarIslandSolidMView.Accent: WrapperTabBarIslandSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandSolidMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Accent.style())
        .wrap(::WrapperTabBarIslandSolidTerminate)

public val TabBarIslandSolid.M: WrapperTabBarIslandSolidM
    @Composable
    @JvmName("WrapperTabBarIslandSolidM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandSolidM)

public val WrapperTabBarIslandSolidM.Shadow: WrapperTabBarIslandSolidMShadow
    @Composable
    @JvmName("WrapperTabBarIslandSolidMShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandSolidMShadow)

public val WrapperTabBarIslandSolidLView.Default: WrapperTabBarIslandSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandSolidLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Default.style())
        .wrap(::WrapperTabBarIslandSolidTerminate)

public val WrapperTabBarIslandSolidLView.Secondary: WrapperTabBarIslandSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandSolidLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Secondary.style())
        .wrap(::WrapperTabBarIslandSolidTerminate)

public val WrapperTabBarIslandSolidLView.Accent: WrapperTabBarIslandSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandSolidLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Accent.style())
        .wrap(::WrapperTabBarIslandSolidTerminate)

public val TabBarIslandSolid.L: WrapperTabBarIslandSolidL
    @Composable
    @JvmName("WrapperTabBarIslandSolidL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandSolidL)

public val WrapperTabBarIslandSolidL.Shadow: WrapperTabBarIslandSolidLShadow
    @Composable
    @JvmName("WrapperTabBarIslandSolidLShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandSolidLShadow)
