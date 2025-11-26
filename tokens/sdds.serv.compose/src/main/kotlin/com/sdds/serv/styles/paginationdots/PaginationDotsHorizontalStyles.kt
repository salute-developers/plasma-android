// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.paginationdots

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.PaginationDotsOrientation
import com.sdds.compose.uikit.PaginationDotsStyle
import com.sdds.compose.uikit.PaginationDotsStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
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
                SddsServTheme.colors.surfaceDefaultTransparentSecondary.asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultSolidDefault,
                ),
            )
        }
        .dimensions {
            gap(8.0.dp)
        }

public val PaginationDotsHorizontal.M: WrapperPaginationDotsHorizontalM
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalM")
    get() = PaginationDotsStyle.builder(this)
        .invariantProps
        .edgeCount(2)
        .dimensions {
            dotWidth(12.0.dp)
            dotHeight(12.0.dp)
        }
        .wrap(::WrapperPaginationDotsHorizontalM)

public val WrapperPaginationDotsHorizontalM.ActiveTypeLine:
    WrapperPaginationDotsHorizontalMActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalMActiveTypeLine")
    get() = builder
        .dimensions {
            dotWidth(
                12.0.dp.asStatefulValue(
                    setOf(InteractiveState.Activated) to 48.0.dp,
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
            dotWidth(8.0.dp)
            dotHeight(8.0.dp)
        }
        .wrap(::WrapperPaginationDotsHorizontalS)

public val WrapperPaginationDotsHorizontalS.ActiveTypeLine:
    WrapperPaginationDotsHorizontalSActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsHorizontalSActiveTypeLine")
    get() = builder
        .dimensions {
            dotWidth(
                8.0.dp.asStatefulValue(
                    setOf(InteractiveState.Activated) to 32.0.dp,
                ),
            )
        }
        .wrap(::WrapperPaginationDotsHorizontalSActiveTypeLine)
