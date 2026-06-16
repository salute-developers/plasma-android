// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.navigationdraweritem

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.NavigationDrawerItemStyle
import com.sdds.compose.uikit.NavigationDrawerItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.counter.Counter
import com.sdds.sbcom.styles.counter.Danger
import com.sdds.sbcom.styles.counter.MuteNo
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNavigationDrawerItem :
    BuilderWrapper<NavigationDrawerItemStyle, NavigationDrawerItemStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperNavigationDrawerItemDefault(
    public override val builder: NavigationDrawerItemStyleBuilder,
) : WrapperNavigationDrawerItem

public val NavigationDrawerItem.Default: WrapperNavigationDrawerItemDefault
    @Composable
    @JvmName("WrapperNavigationDrawerItemDefault")
    get() = NavigationDrawerItemStyle.builder(this)
        .titleStyle(SddsSbComTheme.typography.bodyMNormal)
        .counterStyle(Counter.Danger.MuteNo.style())
        .shape(SddsSbComTheme.shapes.roundXxl.adjustBy(all = -4.0.dp))
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            titleColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SolidColor(SddsSbComTheme.colors.textDefaultAccent),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SolidColor(SddsSbComTheme.colors.textDefaultAccent),
                ),
            )
        }
        .dimensions {
            minHeight(32.0.dp)
            iconSize(24.0.dp)
            indicatorOffsetX(28.0.dp)
            indicatorOffsetY(2.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(0.0.dp)
            paddingBottom(0.0.dp)
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .wrap(::WrapperNavigationDrawerItemDefault)
