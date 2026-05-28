package com.sdds.compose.uikit

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.aiheader.AiHeaderMotionStyle
import com.sdds.compose.uikit.motion.components.aiheader.rememberAiHeaderMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент шапки для AI-интерфейсов.
 *
 * Содержит две опциональные кнопки [IconButton] по краям и текстовый блок
 * с [titleContent] и [subtitleContent] между ними. Иконки и стили кнопок берутся из [style].
 * Все элементы выровнены по верхнему краю.
 *
 * @param modifier модификатор
 * @param style стиль компонента [AiHeaderStyle]
 * @param motion объект анимаций
 * @param hasDivider отображение разделителя по нижнему краю компонента
 * @param titleAlignment горизонтальное выравнивание текстового блока [AiHeaderTitleAlignment]
 * @param hasStartButton показывать ли кнопку слева; иконка берётся из [AiHeaderStyle.startButtonIcon]
 * @param hasEndButton показывать ли кнопку справа; иконка берётся из [AiHeaderStyle.endButtonIcon]
 * @param onStartButtonClick обработчик нажатия кнопки слева
 * @param onEndButtonClick обработчик нажатия кнопки справа
 * @param titleContent слот заголовка
 * @param subtitleContent слот подзаголовка; если `null`, отступ между заголовком и подзаголовком не добавляется
 * @param interactionSource источник взаимодействий
 */
@Composable
fun AiHeader(
    modifier: Modifier = Modifier,
    style: AiHeaderStyle = LocalAiHeaderStyle.current,
    motion: Motion<AiHeaderMotionStyle> = rememberAiHeaderMotion(
        motionContext = rememberMotionContext(remember { MutableInteractionSource() }),
    ),
    hasDivider: Boolean = false,
    titleAlignment: AiHeaderTitleAlignment = AiHeaderTitleAlignment.Start,
    hasStartButton: Boolean = false,
    hasEndButton: Boolean = false,
    onStartButtonClick: () -> Unit = {},
    onEndButtonClick: () -> Unit = {},
    titleContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val dimensions = style.dimensions

    val backgroundBrushState = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    val dividerBrushState = style.colors.dividerBrush.getBrushAsState(
        motion.context,
        motion.style.dividerColor,
    )

    Row(
        modifier = modifier
            .backgroundBrush(
                brushProducer = { backgroundBrushState.value },
                shape = style.shape,
            )
            .drawBehind {
                if (hasDivider) {
                    drawLine(
                        brush = dividerBrushState.value,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = dimensions.dividerThickness.toPx(),
                    )
                }
            }
            .padding(
                start = dimensions.paddingStart,
                end = dimensions.paddingEnd,
                top = dimensions.paddingTop,
                bottom = dimensions.paddingBottom,
            ),
        verticalAlignment = Alignment.Top,
    ) {
        if (hasStartButton) {
            style.startButtonIcon?.let { iconRes ->
                IconButton(
                    iconRes = iconRes,
                    style = style.startButtonStyle,
                    onClick = onStartButtonClick,
                )
            }
        }

        val textColumnAlignment = when (titleAlignment) {
            AiHeaderTitleAlignment.Start -> Alignment.Start
            AiHeaderTitleAlignment.Center -> Alignment.CenterHorizontally
            AiHeaderTitleAlignment.End -> Alignment.End
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(
                    start = dimensions.textPaddingStart,
                    end = dimensions.textPaddingEnd,
                    top = dimensions.textPaddingTop,
                    bottom = dimensions.textPaddingBottom,
                ),
            horizontalAlignment = textColumnAlignment,
        ) {
            titleContent?.let {
                val titleColor = style.colors.titleBrush.getBrushAsState(
                    motion.context,
                    motion.style.titleColor,
                )
                val titleStyle by style.titleStyles.getTextStyleAsState(
                    motion.context,
                    motion.style.titleStyle,
                )
                ProvideTextStyle(
                    value = titleStyle.copy(textAlign = titleAlignment.toTextAlign()),
                    brush = { titleColor.value },
                ) {
                    it()
                }
            }

            subtitleContent?.let {
                Spacer(modifier = Modifier.height(dimensions.subtitlePadding))
                val subtitleColor = style.colors.subtitleBrush.getBrushAsState(
                    motion.context,
                    motion.style.subtitleColor,
                )
                val subtitleStyle by style.subtitleStyles.getTextStyleAsState(
                    motion.context,
                    motion.style.subtitleStyle,
                )
                ProvideTextStyle(
                    value = subtitleStyle.copy(textAlign = titleAlignment.toTextAlign()),
                    brush = { subtitleColor.value },
                ) {
                    it()
                }
            }
        }

        if (hasEndButton) {
            style.endButtonIcon?.let { iconRes ->
                IconButton(
                    iconRes = iconRes,
                    style = style.endButtonStyle,
                    onClick = onEndButtonClick,
                )
            }
        }
    }
}

/**
 * Режим горизонтального выравнивания текстового блока в [AiHeader].
 */
enum class AiHeaderTitleAlignment {
    /**
     * Выравнивание по левому краю
     */
    Start,

    /**
     * Выравнивание по центру
     */
    Center,

    /**
     * Выравнивание по правому краю
     */
    End,
}

private fun AiHeaderTitleAlignment.toTextAlign(): androidx.compose.ui.text.style.TextAlign =
    when (this) {
        AiHeaderTitleAlignment.Start -> androidx.compose.ui.text.style.TextAlign.Start
        AiHeaderTitleAlignment.Center -> androidx.compose.ui.text.style.TextAlign.Center
        AiHeaderTitleAlignment.End -> androidx.compose.ui.text.style.TextAlign.End
    }
