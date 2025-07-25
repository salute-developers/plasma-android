// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.tabbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.styles.tabbaritem.Accent
import com.sdds.plasma.giga.app.styles.tabbaritem.Default
import com.sdds.plasma.giga.app.styles.tabbaritem.L
import com.sdds.plasma.giga.app.styles.tabbaritem.Label
import com.sdds.plasma.giga.app.styles.tabbaritem.M
import com.sdds.plasma.giga.app.styles.tabbaritem.Secondary
import com.sdds.plasma.giga.app.styles.tabbaritem.TabBarItemClear
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarIslandHasLabelClear : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandHasLabelClearMView : WrapperTabBarIslandHasLabelClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelClearTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelClearM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelClearMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelClearMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelClearMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarIslandHasLabelClearLView : WrapperTabBarIslandHasLabelClear

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelClearL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelClearLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarIslandHasLabelClearLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarIslandHasLabelClearLView

private val TabBarStyleBuilder.invariantProps: TabBarStyleBuilder
    @Composable
    get() = this
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .bottomShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultSolidCard.asInteractive(),
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

public val WrapperTabBarIslandHasLabelClearMView.Default: WrapperTabBarIslandHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Label.Default.style())
        .wrap(::WrapperTabBarIslandHasLabelClearTerminate)

public val WrapperTabBarIslandHasLabelClearMView.Secondary:
    WrapperTabBarIslandHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Label.Secondary.style())
        .wrap(::WrapperTabBarIslandHasLabelClearTerminate)

public val WrapperTabBarIslandHasLabelClearMView.Accent: WrapperTabBarIslandHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Label.Accent.style())
        .wrap(::WrapperTabBarIslandHasLabelClearTerminate)

public val TabBarIslandHasLabelClear.M: WrapperTabBarIslandHasLabelClearM
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandHasLabelClearM)

public val WrapperTabBarIslandHasLabelClearM.Shadow: WrapperTabBarIslandHasLabelClearMShadow
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearMShadow")
    get() = builder
        .shadow(PlasmaGigaAppTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandHasLabelClearMShadow)

public val WrapperTabBarIslandHasLabelClearLView.Default: WrapperTabBarIslandHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Label.Default.style())
        .wrap(::WrapperTabBarIslandHasLabelClearTerminate)

public val WrapperTabBarIslandHasLabelClearLView.Secondary:
    WrapperTabBarIslandHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Label.Secondary.style())
        .wrap(::WrapperTabBarIslandHasLabelClearTerminate)

public val WrapperTabBarIslandHasLabelClearLView.Accent: WrapperTabBarIslandHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Label.Accent.style())
        .wrap(::WrapperTabBarIslandHasLabelClearTerminate)

public val TabBarIslandHasLabelClear.L: WrapperTabBarIslandHasLabelClearL
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarIslandHasLabelClearL)

public val WrapperTabBarIslandHasLabelClearL.Shadow: WrapperTabBarIslandHasLabelClearLShadow
    @Composable
    @JvmName("WrapperTabBarIslandHasLabelClearLShadow")
    get() = builder
        .shadow(PlasmaGigaAppTheme.shadows.downSoftM)
        .wrap(::WrapperTabBarIslandHasLabelClearLShadow)
