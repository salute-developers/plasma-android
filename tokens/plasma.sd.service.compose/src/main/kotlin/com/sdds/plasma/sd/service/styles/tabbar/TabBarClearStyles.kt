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
public interface WrapperTabBarClear : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarClearMView : WrapperTabBarClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarClearTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarClearM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearMView

/**
 * Обертка для вариации MRounded
 */
@JvmInline
public value class WrapperTabBarClearMRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarClearMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearMView

/**
 * Обертка для вариации MShadowRounded
 */
@JvmInline
public value class WrapperTabBarClearMShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearMView

/**
 * Обертка для вариации MDivider
 */
@JvmInline
public value class WrapperTabBarClearMDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearMView

/**
 * Обертка для вариации MDividerRounded
 */
@JvmInline
public value class WrapperTabBarClearMDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarClearLView : WrapperTabBarClear

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarClearL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearLView

/**
 * Обертка для вариации LRounded
 */
@JvmInline
public value class WrapperTabBarClearLRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarClearLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearLView

/**
 * Обертка для вариации LShadowRounded
 */
@JvmInline
public value class WrapperTabBarClearLShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearLView

/**
 * Обертка для вариации LDivider
 */
@JvmInline
public value class WrapperTabBarClearLDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearLView

/**
 * Обертка для вариации LDividerRounded
 */
@JvmInline
public value class WrapperTabBarClearLDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarClearLView

private val TabBarStyleBuilder.invariantProps: TabBarStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }
        .dimensions {
            contentPaddingStart(2.0.dp)
            contentPaddingEnd(2.0.dp)
            contentPaddingTop(2.0.dp)
            contentPaddingBottom(2.0.dp)
            itemSpacing(2.0.dp)
        }

public val WrapperTabBarClearMView.Default: WrapperTabBarClearTerminate
    @Composable
    @JvmName("WrapperTabBarClearMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Default.style())
        .wrap(::WrapperTabBarClearTerminate)

public val WrapperTabBarClearMView.Secondary: WrapperTabBarClearTerminate
    @Composable
    @JvmName("WrapperTabBarClearMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Secondary.style())
        .wrap(::WrapperTabBarClearTerminate)

public val WrapperTabBarClearMView.Accent: WrapperTabBarClearTerminate
    @Composable
    @JvmName("WrapperTabBarClearMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Accent.style())
        .wrap(::WrapperTabBarClearTerminate)

public val TabBarClear.M: WrapperTabBarClearM
    @Composable
    @JvmName("WrapperTabBarClearM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarClearM)

public val WrapperTabBarClearM.Rounded: WrapperTabBarClearMRounded
    @Composable
    @JvmName("WrapperTabBarClearMRounded")
    get() = builder
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarClearMRounded)

public val WrapperTabBarClearM.Shadow: WrapperTabBarClearMShadow
    @Composable
    @JvmName("WrapperTabBarClearMShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarClearMShadow)

public val WrapperTabBarClearMShadow.Rounded: WrapperTabBarClearMShadowRounded
    @Composable
    @JvmName("WrapperTabBarClearMShadowRounded")
    get() = builder
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarClearMShadowRounded)

public val WrapperTabBarClearM.Divider: WrapperTabBarClearMDivider
    @Composable
    @JvmName("WrapperTabBarClearMDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarClearMDivider)

public val WrapperTabBarClearMDivider.Rounded: WrapperTabBarClearMDividerRounded
    @Composable
    @JvmName("WrapperTabBarClearMDividerRounded")
    get() = builder
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarClearMDividerRounded)

public val WrapperTabBarClearLView.Default: WrapperTabBarClearTerminate
    @Composable
    @JvmName("WrapperTabBarClearLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Default.style())
        .wrap(::WrapperTabBarClearTerminate)

public val WrapperTabBarClearLView.Secondary: WrapperTabBarClearTerminate
    @Composable
    @JvmName("WrapperTabBarClearLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Secondary.style())
        .wrap(::WrapperTabBarClearTerminate)

public val WrapperTabBarClearLView.Accent: WrapperTabBarClearTerminate
    @Composable
    @JvmName("WrapperTabBarClearLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Accent.style())
        .wrap(::WrapperTabBarClearTerminate)

public val TabBarClear.L: WrapperTabBarClearL
    @Composable
    @JvmName("WrapperTabBarClearL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarClearL)

public val WrapperTabBarClearL.Rounded: WrapperTabBarClearLRounded
    @Composable
    @JvmName("WrapperTabBarClearLRounded")
    get() = builder
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarClearLRounded)

public val WrapperTabBarClearL.Shadow: WrapperTabBarClearLShadow
    @Composable
    @JvmName("WrapperTabBarClearLShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarClearLShadow)

public val WrapperTabBarClearLShadow.Rounded: WrapperTabBarClearLShadowRounded
    @Composable
    @JvmName("WrapperTabBarClearLShadowRounded")
    get() = builder
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarClearLShadowRounded)

public val WrapperTabBarClearL.Divider: WrapperTabBarClearLDivider
    @Composable
    @JvmName("WrapperTabBarClearLDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarClearLDivider)

public val WrapperTabBarClearLDivider.Rounded: WrapperTabBarClearLDividerRounded
    @Composable
    @JvmName("WrapperTabBarClearLDividerRounded")
    get() = builder
        .topShape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarClearLDividerRounded)
