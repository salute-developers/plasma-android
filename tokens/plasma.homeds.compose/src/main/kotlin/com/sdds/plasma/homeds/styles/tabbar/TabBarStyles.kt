// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.tabbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.tabbaritem.Default
import com.sdds.plasma.homeds.styles.tabbaritem.TabBarItem
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBar : BuilderWrapper<TabBarStyle, TabBarStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTabBarDefault(
    public override val builder: TabBarStyleBuilder,
) : WrapperTabBar

public val TabBar.Default: WrapperTabBarDefault
    @Composable
    @JvmName("WrapperTabBarDefault")
    get() = TabBarStyle.builder(this)
        .topShape(PlasmaHomeDsTheme.shapes.roundXxl)
        .bottomShape(PlasmaHomeDsTheme.shapes.roundXxl)
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(48.0.dp)
            paddingEnd(48.0.dp)
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
            contentPaddingTop(2.0.dp)
            contentPaddingBottom(2.0.dp)
            itemSpacing(8.0.dp)
        }
        .tabBarItemStyle(TabBarItem.Default.style())
        .wrap(::WrapperTabBarDefault)
