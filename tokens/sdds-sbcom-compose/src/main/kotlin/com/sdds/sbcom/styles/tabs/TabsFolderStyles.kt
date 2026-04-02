// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.tabs

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TabsStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.tabitem.Default
import com.sdds.sbcom.styles.tabitem.TabItemFolder
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabsFolder : BuilderWrapper<TabsStyle, TabsStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTabsFolderDefault(
    public override val builder: TabsStyleBuilder,
) : WrapperTabsFolder

public val TabsFolder.Default: WrapperTabsFolderDefault
    @Composable
    @JvmName("WrapperTabsFolderDefault")
    get() = TabsStyle.builder(this)
        .shape(CircleShape)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultSolidCard.asInteractive(),
            )
            indicatorColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentAccent.asInteractive(),
            )
        }
        .dimensions {
            indicatorThickness(Dp.Unspecified)
            minSpacing(10.0.dp)
            contentPaddingStart(3.0.dp)
            contentPaddingEnd(3.0.dp)
            contentPaddingTop(3.0.dp)
            contentPaddingBottom(3.0.dp)
        }
        .indicatorShape(CircleShape)
        .tabItemStyle(TabItemFolder.Default.style())
        .dividerEnabled(false)
        .indicatorEnabled(true)
        .wrap(::WrapperTabsFolderDefault)
