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
import com.sdds.plasma.giga.styles.tabbaritem.Label
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
public interface WrapperTabBarIslandHasLabelSolid : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandHasLabelSolidMView : WrapperTabBarIslandHasLabelSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelSolidTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelSolidM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelSolidMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelSolidMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelSolidMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandHasLabelSolidLView : WrapperTabBarIslandHasLabelSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelSolidL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelSolidLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelSolidLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelSolidLView

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

public val WrapperTabBarIslandHasLabelSolidMView.Default: WrapperTabBarIslandHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Label.Default.style())
        .wrap(::WrapperTabBarIslandHasLabelSolidTerminate)

public val WrapperTabBarIslandHasLabelSolidMView.Secondary:
    WrapperTabBarIslandHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Label.Secondary.style())
        .wrap(::WrapperTabBarIslandHasLabelSolidTerminate)

public val WrapperTabBarIslandHasLabelSolidMView.Accent: WrapperTabBarIslandHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Label.Accent.style())
        .wrap(::WrapperTabBarIslandHasLabelSolidTerminate)

public val TabBarIslandHasLabelSolid.M: WrapperTabBarIslandHasLabelSolidM
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandHasLabelSolidM)

public val WrapperTabBarIslandHasLabelSolidM.Shadow: WrapperTabBarIslandHasLabelSolidMShadow
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidMShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandHasLabelSolidMShadow)

public val WrapperTabBarIslandHasLabelSolidLView.Default: WrapperTabBarIslandHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Label.Default.style())
        .wrap(::WrapperTabBarIslandHasLabelSolidTerminate)

public val WrapperTabBarIslandHasLabelSolidLView.Secondary:
    WrapperTabBarIslandHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Label.Secondary.style())
        .wrap(::WrapperTabBarIslandHasLabelSolidTerminate)

public val WrapperTabBarIslandHasLabelSolidLView.Accent: WrapperTabBarIslandHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Label.Accent.style())
        .wrap(::WrapperTabBarIslandHasLabelSolidTerminate)

public val TabBarIslandHasLabelSolid.L: WrapperTabBarIslandHasLabelSolidL
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandHasLabelSolidL)

public val WrapperTabBarIslandHasLabelSolidL.Shadow: WrapperTabBarIslandHasLabelSolidLShadow
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelSolidLShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandHasLabelSolidLShadow)
