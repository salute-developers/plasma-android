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
import com.sdds.plasma.giga.styles.tabbaritem.TabBarItemClear
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarHasLabelClear : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarHasLabelClearMView : WrapperTabBarHasLabelClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarHasLabelClearTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarHasLabelClearM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearMView

/**
 * Обертка для вариации MRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelClearMRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarHasLabelClearMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearMView

/**
 * Обертка для вариации MShadowRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelClearMShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearMView

/**
 * Обертка для вариации MDivider
 */
@JvmInline
public value class WrapperTabBarHasLabelClearMDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearMView

/**
 * Обертка для вариации MDividerRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelClearMDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarHasLabelClearLView : WrapperTabBarHasLabelClear

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarHasLabelClearL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearLView

/**
 * Обертка для вариации LRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelClearLRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarHasLabelClearLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearLView

/**
 * Обертка для вариации LShadowRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelClearLShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearLView

/**
 * Обертка для вариации LDivider
 */
@JvmInline
public value class WrapperTabBarHasLabelClearLDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearLView

/**
 * Обертка для вариации LDividerRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelClearLDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelClearLView

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

public val WrapperTabBarHasLabelClearMView.Default: WrapperTabBarHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Label.Default.style())
        .wrap(::WrapperTabBarHasLabelClearTerminate)

public val WrapperTabBarHasLabelClearMView.Secondary: WrapperTabBarHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Label.Secondary.style())
        .wrap(::WrapperTabBarHasLabelClearTerminate)

public val WrapperTabBarHasLabelClearMView.Accent: WrapperTabBarHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.M.Label.Accent.style())
        .wrap(::WrapperTabBarHasLabelClearTerminate)

public val TabBarHasLabelClear.M: WrapperTabBarHasLabelClearM
    @Composable
    @JvmName("WrapperTabBarHasLabelClearM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarHasLabelClearM)

public val WrapperTabBarHasLabelClearM.Rounded: WrapperTabBarHasLabelClearMRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelClearMRounded)

public val WrapperTabBarHasLabelClearM.Shadow: WrapperTabBarHasLabelClearMShadow
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarHasLabelClearMShadow)

public val WrapperTabBarHasLabelClearMShadow.Rounded: WrapperTabBarHasLabelClearMShadowRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMShadowRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelClearMShadowRounded)

public val WrapperTabBarHasLabelClearM.Divider: WrapperTabBarHasLabelClearMDivider
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarHasLabelClearMDivider)

public val WrapperTabBarHasLabelClearMDivider.Rounded: WrapperTabBarHasLabelClearMDividerRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelClearMDividerRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelClearMDividerRounded)

public val WrapperTabBarHasLabelClearLView.Default: WrapperTabBarHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Label.Default.style())
        .wrap(::WrapperTabBarHasLabelClearTerminate)

public val WrapperTabBarHasLabelClearLView.Secondary: WrapperTabBarHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Label.Secondary.style())
        .wrap(::WrapperTabBarHasLabelClearTerminate)

public val WrapperTabBarHasLabelClearLView.Accent: WrapperTabBarHasLabelClearTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemClear.L.Label.Accent.style())
        .wrap(::WrapperTabBarHasLabelClearTerminate)

public val TabBarHasLabelClear.L: WrapperTabBarHasLabelClearL
    @Composable
    @JvmName("WrapperTabBarHasLabelClearL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarHasLabelClearL)

public val WrapperTabBarHasLabelClearL.Rounded: WrapperTabBarHasLabelClearLRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelClearLRounded)

public val WrapperTabBarHasLabelClearL.Shadow: WrapperTabBarHasLabelClearLShadow
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarHasLabelClearLShadow)

public val WrapperTabBarHasLabelClearLShadow.Rounded: WrapperTabBarHasLabelClearLShadowRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLShadowRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelClearLShadowRounded)

public val WrapperTabBarHasLabelClearL.Divider: WrapperTabBarHasLabelClearLDivider
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarHasLabelClearLDivider)

public val WrapperTabBarHasLabelClearLDivider.Rounded: WrapperTabBarHasLabelClearLDividerRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelClearLDividerRounded")
    get() = builder
        .topShape(PlasmaGigaTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelClearLDividerRounded)
