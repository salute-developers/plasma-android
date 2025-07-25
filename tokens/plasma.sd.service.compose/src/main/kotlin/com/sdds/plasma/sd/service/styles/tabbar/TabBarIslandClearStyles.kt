// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.tabbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.tabbaritem.Accent
import com.sdds.plasma.sd.service.styles.tabbaritem.Default
import com.sdds.plasma.sd.service.styles.tabbaritem.L
import com.sdds.plasma.sd.service.styles.tabbaritem.M
import com.sdds.plasma.sd.service.styles.tabbaritem.Secondary
import com.sdds.plasma.sd.service.styles.tabbaritem.TabBarItemClear
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarIslandClear : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandClearMView : WrapperTabBarIslandClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarIslandClearTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarIslandClearM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandClearMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarIslandClearMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandClearMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandClearLView : WrapperTabBarIslandClear

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarIslandClearL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandClearLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarIslandClearLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandClearLView

private val TabBarStyleBuilder.invariantProps: TabBarStyleBuilder
    @Composable
    get() = this
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .bottomShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard.asInteractive(),
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

public val WrapperTabBarIslandClearMView.Default: WrapperTabBarIslandClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandClearMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Default.style())
        .wrap(::WrapperTabBarIslandClearTerminate)

public val WrapperTabBarIslandClearMView.Secondary: WrapperTabBarIslandClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandClearMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Secondary.style())
        .wrap(::WrapperTabBarIslandClearTerminate)

public val WrapperTabBarIslandClearMView.Accent: WrapperTabBarIslandClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandClearMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Accent.style())
        .wrap(::WrapperTabBarIslandClearTerminate)

public val TabBarIslandClear.M: WrapperTabBarIslandClearM
    @Composable
    @JvmName("WrapperTabBarIslandClearM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandClearM)

public val WrapperTabBarIslandClearM.Shadow: WrapperTabBarIslandClearMShadow
    @Composable
    @JvmName("WrapperTabBarIslandClearMShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandClearMShadow)

public val WrapperTabBarIslandClearLView.Default: WrapperTabBarIslandClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandClearLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Default.style())
        .wrap(::WrapperTabBarIslandClearTerminate)

public val WrapperTabBarIslandClearLView.Secondary: WrapperTabBarIslandClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandClearLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Secondary.style())
        .wrap(::WrapperTabBarIslandClearTerminate)

public val WrapperTabBarIslandClearLView.Accent: WrapperTabBarIslandClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandClearLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Accent.style())
        .wrap(::WrapperTabBarIslandClearTerminate)

public val TabBarIslandClear.L: WrapperTabBarIslandClearL
    @Composable
    @JvmName("WrapperTabBarIslandClearL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandClearL)

public val WrapperTabBarIslandClearL.Shadow: WrapperTabBarIslandClearLShadow
    @Composable
    @JvmName("WrapperTabBarIslandClearLShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandClearLShadow)
