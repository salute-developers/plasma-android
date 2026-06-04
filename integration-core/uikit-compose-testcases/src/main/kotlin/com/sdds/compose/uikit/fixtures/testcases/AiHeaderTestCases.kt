package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.ai.AiHeader
import com.sdds.compose.uikit.ai.AiHeaderSeparationType
import com.sdds.compose.uikit.ai.AiHeaderStyle
import com.sdds.compose.uikit.ai.AiHeaderTitleAlignment
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [AiHeader]
 */

/**
 * PLASMA-T2664, PLASMA-T2670
 */
@Composable
fun AiHeaderTitleSubtitleStartHasStartEndButton(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
    )
}

/**
 * PLASMA-T2665
 */
@Composable
fun AiHeaderTitleSubtitleCenter(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
        titleAlignment = AiHeaderTitleAlignment.Center,
        actionBefore = null,
        actionAfter = null,
    )
}

/**
 * PLASMA-T2666
 */
@Composable
fun AiHeaderTitleHasDividerStartButton(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
        separationType = AiHeaderSeparationType.Divider,
        subtitleContent = null,
        titleAlignment = AiHeaderTitleAlignment.End,
        actionAfter = null,
    )
}

/**
 * PLASMA-T2667
 */
@Composable
fun AiHeaderNoTitleEndButton(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
        titleContent = null,
        actionBefore = null,
    )
}

/**
 * PLASMA-T2668
 */
@Composable
fun AiHeaderLongTitleSubtitleDividerCenter(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
        separationType = AiHeaderSeparationType.Divider,
        titleAlignment = AiHeaderTitleAlignment.Center,
        titleContent = {
            Text(
                "There is no one who loves pain itself, who seeks after " +
                    "it and wants to have it, simply because it is pain",
            )
        },
        subtitleContent = {
            Text(
                "Lorem Ipsum is simply dummy text of the printing and " +
                    "typesetting industry. Lorem Ipsum has been the industry's standard dummy " +
                    "text ever since the 1500s, when an unknown printer took a galley of type " +
                    "and scrambled it to make a type specimen book.",
            )
        },
    )
}

/**
 * PLASMA-T2669, PLASMA-T2672
 */
@Composable
fun AiHeaderTitleAlignmentEndStartEndButton(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
        titleAlignment = AiHeaderTitleAlignment.End,
    )
}

/**
 * PLASMA-T2671
 */
@Composable
fun AiHeaderCenterStartEndButton(
    style: AiHeaderStyle,
) {
    AiHeaderCommon(
        style = style,
        titleAlignment = AiHeaderTitleAlignment.Center,
    )
}

/**
 * Общий тест-кейс
 */
@Composable
fun AiHeaderCommon(
    modifier: Modifier = Modifier,
    style: AiHeaderStyle,
    separationType: AiHeaderSeparationType = AiHeaderSeparationType.None,
    actionBefore: (@Composable () -> Unit)? = {
        IconButton(
            iconRes = R.drawable.ic_panel_sidebar_l_outline_24,
            onClick = {},
        )
    },
    actionAfter: @Composable (() -> Unit)? = {
        IconButton(iconRes = R.drawable.ic_close_24, onClick = {})
    },
    titleContent: @Composable (() -> Unit)? = {
        Text(text = "Заголовок")
    },
    subtitleContent: @Composable (() -> Unit)? = {
        Text(text = "Подзаголовок")
    },
    titleAlignment: AiHeaderTitleAlignment = AiHeaderTitleAlignment.Start,
) {
    AiHeader(
        modifier = modifier.fillMaxWidth(),
        style = style,
        separationType = separationType,
        actionBefore = actionBefore,
        actionAfter = actionAfter,
        titleContent = titleContent,
        subtitleContent = subtitleContent,
        titleAlignment = titleAlignment,
    )
}
