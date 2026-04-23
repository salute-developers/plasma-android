// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.counter

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabItemFolderCounter : BuilderWrapper<CounterStyle, CounterStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTabItemFolderCounterDefault(
    public override val builder: CounterStyleBuilder,
) : WrapperTabItemFolderCounter

public val TabItemFolderCounter.Default: WrapperTabItemFolderCounterDefault
    @Composable
    @JvmName("WrapperTabItemFolderCounterDefault")
    get() = CounterStyle.builder(this)
        .shape(CircleShape)
        .textStyle(SddsSbComTheme.typography.bodySNormal)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.textDefaultParagraph.asInteractive(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.surfaceDefaultAccent,
                ),
            )
            textColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .dimensions {
            minHeight(18.0.dp)
            minWidth(18.0.dp)
            paddingStart(5.0.dp)
            paddingEnd(5.0.dp)
        }
        .wrap(::WrapperTabItemFolderCounterDefault)
