// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.drawer

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
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDrawerCloseOuter : BuilderWrapper<DrawerStyle, DrawerStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDrawerCloseOuterM(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawerCloseOuter

/**
 * Обертка для вариации MHasShadow
 */
@JvmInline
public value class WrapperDrawerCloseOuterMHasShadow(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawerCloseOuter

private val DrawerStyleBuilder.invariantProps: DrawerStyleBuilder
    @Composable
    get() = this
        .colors {
            background(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeIconColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }
        .closeIconRes(com.sdds.icons.R.drawable.ic_close_24)
        .closeIconPlacement(CloseIconPlacement.Outer)

public val DrawerCloseOuter.M: WrapperDrawerCloseOuterM
    @Composable
    @JvmName("WrapperDrawerCloseOuterM")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .dimensions {
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            paddingTop(24.0.dp)
            paddingBottom(24.0.dp)
            closeIconHeaderPadding(8.0.dp)
            closeIconOffsetX(24.0.dp)
            closeIconOffsetY(24.0.dp)
        }
        .wrap(::WrapperDrawerCloseOuterM)

public val WrapperDrawerCloseOuterM.HasShadow: WrapperDrawerCloseOuterMHasShadow
    @Composable
    @JvmName("WrapperDrawerCloseOuterMHasShadow")
    get() = builder
        .shadow(PlasmaGigaTheme.shadows.downSoftL)
        .wrap(::WrapperDrawerCloseOuterMHasShadow)
