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
public interface WrapperTabBarSolid : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarSolidMView : WrapperTabBarSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarSolidTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarSolidM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidMView

/**
 * Обертка для вариации MRounded
 */
@JvmInline
public value class WrapperTabBarSolidMRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarSolidMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidMView

/**
 * Обертка для вариации MShadowRounded
 */
@JvmInline
public value class WrapperTabBarSolidMShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidMView

/**
 * Обертка для вариации MDivider
 */
@JvmInline
public value class WrapperTabBarSolidMDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidMView

/**
 * Обертка для вариации MDividerRounded
 */
@JvmInline
public value class WrapperTabBarSolidMDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarSolidLView : WrapperTabBarSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarSolidL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidLView

/**
 * Обертка для вариации LRounded
 */
@JvmInline
public value class WrapperTabBarSolidLRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarSolidLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidLView

/**
 * Обертка для вариации LShadowRounded
 */
@JvmInline
public value class WrapperTabBarSolidLShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidLView

/**
 * Обертка для вариации LDivider
 */
@JvmInline
public value class WrapperTabBarSolidLDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidLView

/**
 * Обертка для вариации LDividerRounded
 */
@JvmInline
public value class WrapperTabBarSolidLDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarSolidLView

private val TabBarStyleBuilder.invariantProps: TabBarStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }
        .dimensions {
            contentPaddingStart(2.0.dp)
            contentPaddingEnd(2.0.dp)
            contentPaddingTop(2.0.dp)
            contentPaddingBottom(2.0.dp)
            itemSpacing(2.0.dp)
        }

public val WrapperTabBarSolidMView.Default: WrapperTabBarSolidTerminate
    @Composable
    @JvmName("WrapperTabBarSolidMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Default.style())
        .wrap(::WrapperTabBarSolidTerminate)

public val WrapperTabBarSolidMView.Secondary: WrapperTabBarSolidTerminate
    @Composable
    @JvmName("WrapperTabBarSolidMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Secondary.style())
        .wrap(::WrapperTabBarSolidTerminate)

public val WrapperTabBarSolidMView.Accent: WrapperTabBarSolidTerminate
    @Composable
    @JvmName("WrapperTabBarSolidMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Accent.style())
        .wrap(::WrapperTabBarSolidTerminate)

public val TabBarSolid.M: WrapperTabBarSolidM
    @Composable
    @JvmName("WrapperTabBarSolidM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarSolidM)

public val WrapperTabBarSolidM.Rounded: WrapperTabBarSolidMRounded
    @Composable
    @JvmName("WrapperTabBarSolidMRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarSolidMRounded)

public val WrapperTabBarSolidM.Shadow: WrapperTabBarSolidMShadow
    @Composable
    @JvmName("WrapperTabBarSolidMShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarSolidMShadow)

public val WrapperTabBarSolidMShadow.Rounded: WrapperTabBarSolidMShadowRounded
    @Composable
    @JvmName("WrapperTabBarSolidMShadowRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarSolidMShadowRounded)

public val WrapperTabBarSolidM.Divider: WrapperTabBarSolidMDivider
    @Composable
    @JvmName("WrapperTabBarSolidMDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarSolidMDivider)

public val WrapperTabBarSolidMDivider.Rounded: WrapperTabBarSolidMDividerRounded
    @Composable
    @JvmName("WrapperTabBarSolidMDividerRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarSolidMDividerRounded)

public val WrapperTabBarSolidLView.Default: WrapperTabBarSolidTerminate
    @Composable
    @JvmName("WrapperTabBarSolidLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Default.style())
        .wrap(::WrapperTabBarSolidTerminate)

public val WrapperTabBarSolidLView.Secondary: WrapperTabBarSolidTerminate
    @Composable
    @JvmName("WrapperTabBarSolidLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Secondary.style())
        .wrap(::WrapperTabBarSolidTerminate)

public val WrapperTabBarSolidLView.Accent: WrapperTabBarSolidTerminate
    @Composable
    @JvmName("WrapperTabBarSolidLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Accent.style())
        .wrap(::WrapperTabBarSolidTerminate)

public val TabBarSolid.L: WrapperTabBarSolidL
    @Composable
    @JvmName("WrapperTabBarSolidL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarSolidL)

public val WrapperTabBarSolidL.Rounded: WrapperTabBarSolidLRounded
    @Composable
    @JvmName("WrapperTabBarSolidLRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarSolidLRounded)

public val WrapperTabBarSolidL.Shadow: WrapperTabBarSolidLShadow
    @Composable
    @JvmName("WrapperTabBarSolidLShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarSolidLShadow)

public val WrapperTabBarSolidLShadow.Rounded: WrapperTabBarSolidLShadowRounded
    @Composable
    @JvmName("WrapperTabBarSolidLShadowRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarSolidLShadowRounded)

public val WrapperTabBarSolidL.Divider: WrapperTabBarSolidLDivider
    @Composable
    @JvmName("WrapperTabBarSolidLDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarSolidLDivider)

public val WrapperTabBarSolidLDivider.Rounded: WrapperTabBarSolidLDividerRounded
    @Composable
    @JvmName("WrapperTabBarSolidLDividerRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarSolidLDividerRounded)
