// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.drawer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDrawer : BuilderWrapper<DrawerStyle, DrawerStyleBuilder>

/**
 * Обертка для вариации NoShadow
 */
@JvmInline
public value class WrapperDrawerNoShadow(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawer

/**
 * Обертка для вариации HasShadow
 */
@JvmInline
public value class WrapperDrawerHasShadow(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawer

private val DrawerStyleBuilder.invariantProps: DrawerStyleBuilder
    @Composable
    get() = this
        .colors {
            background(
                SolidColor(PlasmaGigaAppTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeIconColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(24.0.dp)
            closeIconPadding(8.0.dp)
        }
        .closeIconRes(com.sdds.icons.R.drawable.ic_close_24)

public val Drawer.NoShadow: WrapperDrawerNoShadow
    @Composable
    @JvmName("WrapperDrawerNoShadow")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .wrap(::WrapperDrawerNoShadow)

public val Drawer.HasShadow: WrapperDrawerHasShadow
    @Composable
    @JvmName("WrapperDrawerHasShadow")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .shadow(PlasmaGigaAppTheme.shadows.downSoftL)
        .wrap(::WrapperDrawerHasShadow)
