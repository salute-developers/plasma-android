package com.sdds.compose.uikit.ai

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.style.TextAlign
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.aiheader.AiHeaderMotionStyle
import com.sdds.compose.uikit.motion.components.aiheader.rememberAiHeaderMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент шапки для AI-интерфейсов.
 *
 * Содержит два опциональных слота [startContent] и [endContent] по краям и текстовый блок
 * с [titleContent] и [subtitleContent] между ними. Внутри слотов стиль кнопки провайдится
 * через [LocalIconButtonStyle] из [AiHeaderStyle.startButtonStyle] / [AiHeaderStyle.endButtonStyle].
 *
 * @param modifier модификатор
 * @param style стиль компонента [AiHeaderStyle]
 * @param motion объект анимаций
 * @param hasDivider отображение разделителя по нижнему краю компонента
 * @param titleAlignment горизонтальное выравнивание текстового блока [AiHeaderTitleAlignment]
 * @param startContent слот для содержимого слева; стиль кнопки провайдится через [LocalIconButtonStyle]
 * @param endContent слот для содержимого справа; стиль кнопки провайдится через [LocalIconButtonStyle]
 * @param titleContent слот заголовка
 * @param subtitleContent слот подзаголовка; если `null`, отступ между заголовком и подзаголовком не добавляется
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
    startContent: (@Composable () -> Unit)? = null,
    endContent: (@Composable () -> Unit)? = null,
    titleContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
) {
    val dimensions = style.dimensions

    val shape = style.shape.getValueAsState(motion.context)
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
                shape = shape.value,
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
        startContent?.let {
            CompositionLocalProvider(LocalIconButtonStyle provides style.startButtonStyle) {
                it()
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

        endContent?.let {
            CompositionLocalProvider(LocalIconButtonStyle provides style.endButtonStyle) {
                it()
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

private fun AiHeaderTitleAlignment.toTextAlign(): TextAlign =
    when (this) {
        AiHeaderTitleAlignment.Start -> TextAlign.Start
        AiHeaderTitleAlignment.Center -> TextAlign.Center
        AiHeaderTitleAlignment.End -> TextAlign.End
    }
