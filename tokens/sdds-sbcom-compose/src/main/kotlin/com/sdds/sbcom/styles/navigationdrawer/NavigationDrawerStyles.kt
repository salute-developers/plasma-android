// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.navigationdrawer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.NavigationDrawerStyle
import com.sdds.compose.uikit.NavigationDrawerStyleBuilder
import com.sdds.compose.uikit.NavigationDrawerValue
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.navigationdraweritem.Default
import com.sdds.sbcom.styles.navigationdraweritem.NavigationDrawerItem
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNavigationDrawer :
    BuilderWrapper<NavigationDrawerStyle, NavigationDrawerStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperNavigationDrawerDefault(
    public override val builder: NavigationDrawerStyleBuilder,
) : WrapperNavigationDrawer

public val NavigationDrawer.Default: WrapperNavigationDrawerDefault
    @Composable
    @JvmName("WrapperNavigationDrawerDefault")
    get() = NavigationDrawerStyle.builder(this)
        .shape(SddsSbComTheme.shapes.roundXl)
        .shadow(SddsSbComTheme.shadows.downSoftS)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(),
            )
            selectorColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentAccent).asStatefulValue(),
            )
        }
        .dimensions {
            width(
                80.0.dp.asStatefulValue(
                    setOf(NavigationDrawerValue.Expanded) to 200.0.dp,
                ),
            )
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(10.0.dp)
            paddingBottom(10.0.dp)
            itemSpacing(16.0.dp)
            headerSpacing(10.0.dp)
            footerSpacing(10.0.dp)
        }
        .itemStyle(NavigationDrawerItem.Default.style())
        .wrap(::WrapperNavigationDrawerDefault)
