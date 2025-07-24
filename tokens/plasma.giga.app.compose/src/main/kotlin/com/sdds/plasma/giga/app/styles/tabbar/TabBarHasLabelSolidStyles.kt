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
import com.sdds.plasma.giga.app.styles.tabbaritem.TabBarItemSolid
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarHasLabelSolid : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации m
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarHasLabelSolidMView : WrapperTabBarHasLabelSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidTerminate(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidM(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidMView

/**
 * Обертка для вариации MRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidMRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidMView

/**
 * Обертка для вариации MShadow
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidMShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidMView

/**
 * Обертка для вариации MShadowRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidMShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidMView

/**
 * Обертка для вариации MDivider
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidMDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidMView

/**
 * Обертка для вариации MDividerRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidMDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidMView

/**
 * Интерфейс, который реализуют все обертки вариации l
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarHasLabelSolidLView : WrapperTabBarHasLabelSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidL(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidLView

/**
 * Обертка для вариации LRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidLRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidLView

/**
 * Обертка для вариации LShadow
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidLShadow(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidLView

/**
 * Обертка для вариации LShadowRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidLShadowRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidLView

/**
 * Обертка для вариации LDivider
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidLDivider(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidLView

/**
 * Обертка для вариации LDividerRounded
 */
@JvmInline
public value class WrapperTabBarHasLabelSolidLDividerRounded(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBarHasLabelSolidLView

private val TabBarStyleBuilder.invariantProps: TabBarStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
        }
        .dimensions {
            contentPaddingStart(2.0.dp)
            contentPaddingEnd(2.0.dp)
            contentPaddingTop(2.0.dp)
            contentPaddingBottom(2.0.dp)
            itemSpacing(2.0.dp)
        }

public val WrapperTabBarHasLabelSolidMView.Default: WrapperTabBarHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Label.Default.style())
        .wrap(::WrapperTabBarHasLabelSolidTerminate)

public val WrapperTabBarHasLabelSolidMView.Secondary: WrapperTabBarHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Label.Secondary.style())
        .wrap(::WrapperTabBarHasLabelSolidTerminate)

public val WrapperTabBarHasLabelSolidMView.Accent: WrapperTabBarHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.M.Label.Accent.style())
        .wrap(::WrapperTabBarHasLabelSolidTerminate)

public val TabBarHasLabelSolid.M: WrapperTabBarHasLabelSolidM
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidM")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarHasLabelSolidM)

public val WrapperTabBarHasLabelSolidM.Rounded: WrapperTabBarHasLabelSolidMRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMRounded")
    get() = builder
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelSolidMRounded)

public val WrapperTabBarHasLabelSolidM.Shadow: WrapperTabBarHasLabelSolidMShadow
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMShadow")
    get() = builder
        .shadow(PlasmaGigaAppTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarHasLabelSolidMShadow)

public val WrapperTabBarHasLabelSolidMShadow.Rounded: WrapperTabBarHasLabelSolidMShadowRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMShadowRounded")
    get() = builder
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelSolidMShadowRounded)

public val WrapperTabBarHasLabelSolidM.Divider: WrapperTabBarHasLabelSolidMDivider
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarHasLabelSolidMDivider)

public val WrapperTabBarHasLabelSolidMDivider.Rounded: WrapperTabBarHasLabelSolidMDividerRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidMDividerRounded")
    get() = builder
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelSolidMDividerRounded)

public val WrapperTabBarHasLabelSolidLView.Default: WrapperTabBarHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLViewDefault")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Label.Default.style())
        .wrap(::WrapperTabBarHasLabelSolidTerminate)

public val WrapperTabBarHasLabelSolidLView.Secondary: WrapperTabBarHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLViewSecondary")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Label.Secondary.style())
        .wrap(::WrapperTabBarHasLabelSolidTerminate)

public val WrapperTabBarHasLabelSolidLView.Accent: WrapperTabBarHasLabelSolidTerminate
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLViewAccent")
    get() = builder
        .tabBarItemStyle(TabBarItemSolid.L.Label.Accent.style())
        .wrap(::WrapperTabBarHasLabelSolidTerminate)

public val TabBarHasLabelSolid.L: WrapperTabBarHasLabelSolidL
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidL")
    get() = TabBarStyle.builder(this)
        .invariantProps
        .wrap(::WrapperTabBarHasLabelSolidL)

public val WrapperTabBarHasLabelSolidL.Rounded: WrapperTabBarHasLabelSolidLRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLRounded")
    get() = builder
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelSolidLRounded)

public val WrapperTabBarHasLabelSolidL.Shadow: WrapperTabBarHasLabelSolidLShadow
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLShadow")
    get() = builder
        .shadow(PlasmaGigaAppTheme.shadows.upSoftM)
        .wrap(::WrapperTabBarHasLabelSolidLShadow)

public val WrapperTabBarHasLabelSolidLShadow.Rounded: WrapperTabBarHasLabelSolidLShadowRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLShadowRounded")
    get() = builder
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelSolidLShadowRounded)

public val WrapperTabBarHasLabelSolidL.Divider: WrapperTabBarHasLabelSolidLDivider
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLDivider")
    get() = builder
        .colors {
            dividerColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultTransparentTertiary.asInteractive(),
            )
        }
        .dimensions {
            dividerThickness(1.0.dp)
        }
        .wrap(::WrapperTabBarHasLabelSolidLDivider)

public val WrapperTabBarHasLabelSolidLDivider.Rounded: WrapperTabBarHasLabelSolidLDividerRounded
    @Composable
    @JvmName("WrapperTabBarHasLabelSolidLDividerRounded")
    get() = builder
        .topShape(PlasmaGigaAppTheme.shapes.roundL.adjustBy(all = 2.0.dp))
        .wrap(::WrapperTabBarHasLabelSolidLDividerRounded)
