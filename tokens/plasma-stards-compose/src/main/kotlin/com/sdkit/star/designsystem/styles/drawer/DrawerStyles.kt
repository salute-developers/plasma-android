// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.drawer

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.CloseIconPlacement
import com.sdds.compose.uikit.DrawerStyle
import com.sdds.compose.uikit.DrawerStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDrawer : BuilderWrapper<DrawerStyle, DrawerStyleBuilder>

/**
 * Обертка для вариации HasBackground
 */
@JvmInline
public value class WrapperDrawerHasBackground(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawer

/**
 * Обертка для вариации NoBackground
 */
@JvmInline
public value class WrapperDrawerNoBackground(
    public override val builder: DrawerStyleBuilder,
) : WrapperDrawer

private val DrawerStyleBuilder.invariantProps: DrawerStyleBuilder
    @Composable
    get() = this
        .dimensions {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_drawer_padding_start))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_drawer_padding_end))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_drawer_padding_top))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_drawer_padding_bottom))
        }
        .closeIconPlacement(CloseIconPlacement.None)

public val Drawer.HasBackground: WrapperDrawerHasBackground
    @Composable
    @JvmName("WrapperDrawerHasBackground")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundXl.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_drawer_shapeAdjustment_has_background),
            ),
        )
        .colors {
            background(
                SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(),
            )
        }
        .dimensions {
            strokeWidth(dimensionResource(R.dimen.sdkit_cmp_drawer_stroke_width_has_background))
        }
        .wrap(::WrapperDrawerHasBackground)

public val Drawer.NoBackground: WrapperDrawerNoBackground
    @Composable
    @JvmName("WrapperDrawerNoBackground")
    get() = DrawerStyle.builder(this)
        .invariantProps
        .colors {
            background(
                SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue(),
            )
        }
        .wrap(::WrapperDrawerNoBackground)
