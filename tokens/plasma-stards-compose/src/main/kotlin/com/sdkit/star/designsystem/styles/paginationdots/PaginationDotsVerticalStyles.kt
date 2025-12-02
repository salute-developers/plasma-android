// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.paginationdots

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.PaginationDotsOrientation
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.PaginationDotsStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
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
public interface WrapperPaginationDotsVertical :
    BuilderWrapper<PaginationDotsStyle, PaginationDotsStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperPaginationDotsVerticalM(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsVertical

/**
 * Обертка для вариации MActiveTypeLine
 */
@JvmInline
public value class WrapperPaginationDotsVerticalMActiveTypeLine(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsVertical

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperPaginationDotsVerticalS(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsVertical

/**
 * Обертка для вариации SActiveTypeLine
 */
@JvmInline
public value class WrapperPaginationDotsVerticalSActiveTypeLine(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsVertical

private val PaginationDotsStyleBuilder.invariantProps: PaginationDotsStyleBuilder
    @Composable
    get() = this
        .orientation(PaginationDotsOrientation.Vertical)
        .edgeShrinkFactor(0.3f)
        .colors {
            dotBackgroundColor(
                StarDsTheme.colors.surfaceDefaultTransparentSecondary.asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                ),
            )
        }
        .dimensions {
            gap(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_gap))
        }

public val PaginationDotsVertical.M: WrapperPaginationDotsVerticalM
    @Composable
    @JvmName("WrapperPaginationDotsVerticalM")
    get() = PaginationDotsStyle.builder(this)
        .invariantProps
        .edgeCount(2)
        .dimensions {
            dotWidth(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_dot_width_m))
            dotHeight(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_dot_height_m))
        }
        .wrap(::WrapperPaginationDotsVerticalM)

public val WrapperPaginationDotsVerticalM.ActiveTypeLine:
    WrapperPaginationDotsVerticalMActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsVerticalMActiveTypeLine")
    get() = builder
        .dimensions {
            dotHeight(
                dimensionResource(
                    R.dimen.sdkit_cmp_pagination_dots_vertical_dot_height_m_active_type_line,
                ).asStatefulValue(
                    setOf(InteractiveState.Activated) to
                        dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_dot_height_m_active_type_line_0),
                ),
            )
        }
        .wrap(::WrapperPaginationDotsVerticalMActiveTypeLine)

public val PaginationDotsVertical.S: WrapperPaginationDotsVerticalS
    @Composable
    @JvmName("WrapperPaginationDotsVerticalS")
    get() = PaginationDotsStyle.builder(this)
        .invariantProps
        .edgeCount(1)
        .dimensions {
            dotWidth(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_dot_width_s))
            dotHeight(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_dot_height_s))
        }
        .wrap(::WrapperPaginationDotsVerticalS)

public val WrapperPaginationDotsVerticalS.ActiveTypeLine:
    WrapperPaginationDotsVerticalSActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsVerticalSActiveTypeLine")
    get() = builder
        .dimensions {
            dotHeight(
                dimensionResource(
                    R.dimen.sdkit_cmp_pagination_dots_vertical_dot_height_s_active_type_line,
                ).asStatefulValue(
                    setOf(InteractiveState.Activated) to
                        dimensionResource(R.dimen.sdkit_cmp_pagination_dots_vertical_dot_height_s_active_type_line_0),
                ),
            )
        }
        .wrap(::WrapperPaginationDotsVerticalSActiveTypeLine)
