// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.drawer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CloseIconPlacement
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDrawerCloseNone : BuilderWrapper<DrawerStyle, DrawerStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDrawerCloseNoneM(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawerCloseNone

/**
 * Обертка для вариации MHasShadow
 */
@JvmInline
public value class WrapperDrawerCloseNoneMHasShadow(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawerCloseNone

private val DrawerStyleBuilder.invariantProps: DrawerStyleBuilder
    @Composable
    get() = this
        .colors {
            background(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeIconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .closeIconRes(com.sdds.icons.R.drawable.ic_close_24)
        .closeIconPlacement(CloseIconPlacement.None)

public val DrawerCloseNone.M: WrapperDrawerCloseNoneM
    @Composable
    @JvmName("WrapperDrawerCloseNoneM")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(24.0.dp)
            closeIconHeaderPadding(0.0.dp)
            closeIconOffsetX(0.0.dp)
            closeIconOffsetY(0.0.dp)
        }
        .wrap(::WrapperDrawerCloseNoneM)

public val WrapperDrawerCloseNoneM.HasShadow: WrapperDrawerCloseNoneMHasShadow
    @Composable
    @JvmName("WrapperDrawerCloseNoneMHasShadow")
    get() = builder
        .shadow(SddsServTheme.shadows.downSoftL)
        .wrap(::WrapperDrawerCloseNoneMHasShadow)
