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
                SddsServTheme.colors.surfaceDefaultTransparentSecondary.asStatefulValue(
                    setOf(InteractiveState.Activated)
                        to SddsServTheme.colors.surfaceDefaultSolidDefault,
                ),
            )
        }
        .dimensions {
            gap(8.0.dp)
        }

public val PaginationDotsVertical.M: WrapperPaginationDotsVerticalM
    @Composable
    @JvmName("WrapperPaginationDotsVerticalM")
    get() = PaginationDotsStyle.builder(this)
        .invariantProps
        .edgeCount(2)
        .dimensions {
            dotWidth(12.0.dp)
            dotHeight(12.0.dp)
        }
        .wrap(::WrapperPaginationDotsVerticalM)

public val WrapperPaginationDotsVerticalM.ActiveTypeLine:
    WrapperPaginationDotsVerticalMActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsVerticalMActiveTypeLine")
    get() = builder
        .dimensions {
            dotHeight(
                12.0.dp.asStatefulValue(
                    setOf(InteractiveState.Activated) to 48.0.dp,
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
            dotWidth(8.0.dp)
            dotHeight(8.0.dp)
        }
        .wrap(::WrapperPaginationDotsVerticalS)

public val WrapperPaginationDotsVerticalS.ActiveTypeLine:
    WrapperPaginationDotsVerticalSActiveTypeLine
    @Composable
    @JvmName("WrapperPaginationDotsVerticalSActiveTypeLine")
    get() = builder
        .dimensions {
            dotHeight(
                8.0.dp.asStatefulValue(
                    setOf(InteractiveState.Activated) to 32.0.dp,
                ),
            )
        }
        .wrap(::WrapperPaginationDotsVerticalSActiveTypeLine)
