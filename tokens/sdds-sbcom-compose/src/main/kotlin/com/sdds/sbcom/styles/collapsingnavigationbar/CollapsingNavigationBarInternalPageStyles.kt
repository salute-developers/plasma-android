// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.collapsingnavigationbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CollapsingNavigationBarStates
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.CollapsingNavigationBarStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.iconbutton.Accent
import com.sdds.sbcom.styles.iconbutton.IconButtonClear
import com.sdds.sbcom.styles.iconbutton.M
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCollapsingNavigationBarInternalPage :
    BuilderWrapper<CollapsingNavigationBarStyle, CollapsingNavigationBarStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperCollapsingNavigationBarInternalPageDefault(
    public override val builder: CollapsingNavigationBarStyleBuilder,
) : WrapperCollapsingNavigationBarInternalPage

public val CollapsingNavigationBarInternalPage.Default:
    WrapperCollapsingNavigationBarInternalPageDefault
    @Composable
    @JvmName("WrapperCollapsingNavigationBarInternalPageDefault")
    get() = CollapsingNavigationBarStyle.builder(this)
        .titleStyle(
            SddsSbComTheme.typography.headerH1Normal.asStatefulValue(
                setOf(CollapsingNavigationBarStates.Collapsed) to
                    SddsSbComTheme.typography.headerH2Medium,
            ),
        )
        .descriptionStyle(
            SddsSbComTheme.typography.bodyMNormal.asStatefulValue(
                setOf(CollapsingNavigationBarStates.Collapsed) to
                    SddsSbComTheme.typography.bodyXsMedium,
            ),
        )
        .backIcon(com.sdds.icons.R.drawable.ic_arrow_left_24)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultSolidPrimary.asStatefulValue(),
            )
            backIconColor(
                SddsSbComTheme.colors.textDefaultAccent.asStatefulValue(),
            )
            titleColor(
                SddsSbComTheme.colors.textDefaultPrimary.asStatefulValue(),
            )
            descriptionColor(
                SddsSbComTheme.colors.textDefaultSecondary.asStatefulValue(),
            )
            actionStartColor(
                SddsSbComTheme.colors.textDefaultAccent.asStatefulValue(),
            )
            actionEndColor(
                SddsSbComTheme.colors.textDefaultAccent.asStatefulValue(),
            )
        }
        .dimensions {
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            backIconMargin(16.0.dp)
            textBlockTopMargin(0.0.dp)
            horizontalSpacing(4.0.dp)
            descriptionPadding(0.0.dp)
        }
        .actionButtonStyle(IconButtonClear.M.Accent.style())
        .wrap(::WrapperCollapsingNavigationBarInternalPageDefault)
