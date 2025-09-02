// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.drawer

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
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDrawerCloseInner : BuilderWrapper<DrawerStyle, DrawerStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDrawerCloseInnerM(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawerCloseInner

/**
 * Обертка для вариации MHasShadow
 */
@JvmInline
public value class WrapperDrawerCloseInnerMHasShadow(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawerCloseInner

private val DrawerStyleBuilder.invariantProps: DrawerStyleBuilder
    @Composable
    get() = this
        .colors {
            background(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeIconColor(
                PlasmaSdServiceTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .closeIconRes(com.sdds.icons.R.drawable.ic_close_24)
        .closeIconPlacement(CloseIconPlacement.Inner)

public val DrawerCloseInner.M: WrapperDrawerCloseInnerM
    @Composable
    @JvmName("WrapperDrawerCloseInnerM")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(24.0.dp)
            closeIconHeaderPadding(8.0.dp)
            closeIconOffsetX(0.0.dp)
            closeIconOffsetY(0.0.dp)
        }
        .wrap(::WrapperDrawerCloseInnerM)

public val WrapperDrawerCloseInnerM.HasShadow: WrapperDrawerCloseInnerMHasShadow
    @Composable
    @JvmName("WrapperDrawerCloseInnerMHasShadow")
    get() = builder
        .shadow(PlasmaSdServiceTheme.shadows.downSoftL)
        .wrap(::WrapperDrawerCloseInnerMHasShadow)
