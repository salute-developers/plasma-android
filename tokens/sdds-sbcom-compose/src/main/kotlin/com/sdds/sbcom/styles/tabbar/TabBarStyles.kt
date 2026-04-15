// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.tabbar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabBarStyle
import com.sdds.compose.uikit.TabBarStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.tabbaritem.Default
import com.sdds.sbcom.styles.tabbaritem.TabBarItem
import com.sdds.sbcom.theme.SddsSbComTheme
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
        .topShape(CircleShape)
        .bottomShape(CircleShape)
        .shadow(SddsSbComTheme.shadows.upSoftM)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultSolidPrimary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            contentPaddingStart(4.0.dp)
            contentPaddingEnd(4.0.dp)
            contentPaddingTop(4.0.dp)
            contentPaddingBottom(4.0.dp)
            itemSpacing(0.0.dp)
        }
        .tabBarItemStyle(TabBarItem.Default.style())
        .wrap(::WrapperTabBarDefault)
