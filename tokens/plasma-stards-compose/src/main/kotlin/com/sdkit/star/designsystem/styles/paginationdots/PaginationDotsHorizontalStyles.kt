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
public interface WrapperPaginationDotsHorizontal :
    BuilderWrapper<PaginationDotsStyle, PaginationDotsStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperPaginationDotsHorizontalM(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsHorizontal

/**
 * Обертка для вариации MActiveTypeLine
 */
@JvmInline
public value class WrapperPaginationDotsHorizontalMActiveTypeLine(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsHorizontal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperPaginationDotsHorizontalS(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsHorizontal

/**
 * Обертка для вариации SActiveTypeLine
 */
@JvmInline
public value class WrapperPaginationDotsHorizontalSActiveTypeLine(
    public override val builder: PaginationDotsStyleBuilder,
) : WrapperPaginationDotsHorizontal

private val PaginationDotsStyleBuilder.invariantProps: PaginationDotsStyleBuilder
    @Composable
    get() = this
        .orientation(PaginationDotsOrientation.Horizontal)
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
            gap(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_gap))
        }

public val PaginationDotsHorizontal.M: WrapperPaginationDotsHorizontalM
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalM")
    get() = PaginationDotsStyle.builder(this)
        .invariantProps
        .edgeCount(2)
        .dimensions {
            dotWidth(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_width_m))
            dotHeight(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_height_m))
        }
        .wrap(::WrapperPaginationDotsHorizontalM)

public val WrapperPaginationDotsHorizontalM.ActiveTypeLine:
    WrapperPaginationDotsHorizontalMActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalMActiveTypeLine")
    get() = builder
        .dimensions {
            dotWidth(
                dimensionResource(
                    R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_width_m_active_type_line,
                ).asStatefulValue(
                    setOf(InteractiveState.Activated) to
                        dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_width_m_active_type_line_0),
                ),
            )
        }
        .wrap(::WrapperPaginationDotsHorizontalMActiveTypeLine)

public val PaginationDotsHorizontal.S: WrapperPaginationDotsHorizontalS
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalS")
    get() = PaginationDotsStyle.builder(this)
        .invariantProps
        .edgeCount(1)
        .dimensions {
            dotWidth(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_width_s))
            dotHeight(dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_height_s))
        }
        .wrap(::WrapperPaginationDotsHorizontalS)

public val WrapperPaginationDotsHorizontalS.ActiveTypeLine:
    WrapperPaginationDotsHorizontalSActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalSActiveTypeLine")
    get() = builder
        .dimensions {
            dotWidth(
                dimensionResource(
                    R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_width_s_active_type_line,
                ).asStatefulValue(
                    setOf(InteractiveState.Activated) to
                        dimensionResource(R.dimen.sdkit_cmp_pagination_dots_horizontal_dot_width_s_active_type_line_0),
                ),
            )
        }
        .wrap(::WrapperPaginationDotsHorizontalSActiveTypeLine)
