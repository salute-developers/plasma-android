// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.tabitem

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.counter.Default
import com.sdds.sbcom.styles.counter.TabItemFolderCounter
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabItemFolder : BuilderWrapper<TabItemStyle, TabItemStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTabItemFolderDefault(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemFolder

public val TabItemFolder.Default: WrapperTabItemFolderDefault
    @Composable
    @JvmName("WrapperTabItemFolderDefault")
    get() = TabItemStyle.builder(this)
        .shape(CircleShape)
        .labelStyle(
            SddsSbComTheme.typography.bodyMNormal.asStatefulValue(
                setOf(InteractiveState.Selected) to SddsSbComTheme.typography.bodyMMedium,
            ),
        )
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asStatefulValue(),
            )
            labelColor(
                SddsSbComTheme.colors.textDefaultParagraph.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
            startContentColor(
                SddsSbComTheme.colors.textDefaultParagraph.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
            endContentColor(
                SddsSbComTheme.colors.textDefaultParagraph.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
        }
        .dimensions {
            minHeight(26.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            counterPadding(4.0.dp)
        }
        .counterStyle(TabItemFolderCounter.Default.style())
        .disableAlpha(0.4f)
        .wrap(::WrapperTabItemFolderDefault)
