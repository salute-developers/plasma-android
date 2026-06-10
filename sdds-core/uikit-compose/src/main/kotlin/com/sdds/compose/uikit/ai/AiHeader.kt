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
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.aiheader.AiHeaderMotionStyle
import com.sdds.compose.uikit.motion.components.aiheader.rememberAiHeaderMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент шапки для AI-интерфейсов.
 *
 * Содержит два опциональных слота [actionBefore] и [actionAfter] по краям и текстовый блок
 * с [titleContent] и [subtitleContent] между ними. Внутри слотов стиль кнопки провайдится
 * через [LocalIconButtonStyle] из [AiHeaderStyle.startButtonStyle] / [AiHeaderStyle.endButtonStyle].
 *
 * @param modifier модификатор
 * @param style стиль компонента [AiHeaderStyle]
 * @param motion объект анимаций
 * @param separationType тип разделителя по нижнему краю компонента [AiHeaderSeparationType]
 * @param actionBefore слот для содержимого слева; стиль кнопки провайдится через [LocalIconButtonStyle]; стиль группы кнопок — через [LocalButtonGroupStyle]
 * @param actionAfter слот для содержимого справа; стиль кнопки провайдится через [LocalIconButtonStyle]; стиль группы кнопок — через [LocalButtonGroupStyle]
 * @param titleContent слот заголовка
 * @param subtitleContent слот подзаголовка; если `null`, отступ между заголовком и подзаголовком не добавляется
 * @param titleAlignment горизонтальное выравнивание текстового блока [AiHeaderTitleAlignment]
 */
@Composable
fun AiHeader(
    modifier: Modifier = Modifier,
    style: AiHeaderStyle = LocalAiHeaderStyle.current,
    motion: Motion<AiHeaderMotionStyle> = rememberAiHeaderMotion(
        motionContext = rememberMotionContext(remember { MutableInteractionSource() }),
    ),
    separationType: AiHeaderSeparationType = AiHeaderSeparationType.None,
    actionBefore: (@Composable () -> Unit)? = null,
    actionAfter: (@Composable () -> Unit)? = null,
    titleContent: (@Composable () -> Unit)? = null,
    subtitleContent: (@Composable () -> Unit)? = null,
    titleAlignment: AiHeaderTitleAlignment = AiHeaderTitleAlignment.Start,
) {
    val shape = style.shape.getValueAsState(motion.context)
    val backgroundBrushState = style.colors.backgroundBrush.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    val dividerBrushState = style.colors.dividerBrush.getBrushAsState(
        motion.context,
        motion.style.dividerColor,
    )

    val paddingStart by style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd by style.dimensions.paddingEnd.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop by style.dimensions.paddingTop.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom by style.dimensions.paddingBottom.getDpAsState(motion.context, motion.style.paddingBottom)
    val textPaddingStart by style.dimensions.textPaddingStart.getDpAsState(
        motion.context,
        motion.style.textPaddingStart,
    )
    val textPaddingEnd by style.dimensions.textPaddingEnd.getDpAsState(
        motion.context,
        motion.style.textPaddingEnd,
    )
    val textPaddingTop by style.dimensions.textPaddingTop.getDpAsState(
        motion.context,
        motion.style.textPaddingTop,
    )
    val textPaddingBottom by style.dimensions.textPaddingBottom.getDpAsState(
        motion.context,
        motion.style.textPaddingBottom,
    )
    val subtitlePadding by style.dimensions.subtitlePadding.getDpAsState(
        motion.context,
        motion.style.subtitlePadding,
    )
    val dividerThickness by style.dimensions.dividerThickness.getDpAsState(
        motion.context,
        motion.style.dividerThickness,
    )

    Row(
        modifier = modifier
            .backgroundBrush(
                brushProducer = { backgroundBrushState.value },
                shape = shape.value,
            )
            .drawBehind {
                if (separationType == AiHeaderSeparationType.Divider) {
                    drawLine(
                        brush = dividerBrushState.value,
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = dividerThickness.toPx(),
                    )
                }
            }
            .padding(
                start = paddingStart,
                end = paddingEnd,
                top = paddingTop,
                bottom = paddingBottom,
            ),
        verticalAlignment = Alignment.Top,
    ) {
        actionBefore?.let {
            CompositionLocalProvider(
                LocalIconButtonStyle provides style.startButtonStyle,
                LocalButtonGroupStyle provides style.startButtonGroupStyle,
            ) {
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
                    start = textPaddingStart,
                    end = textPaddingEnd,
                    top = textPaddingTop,
                    bottom = textPaddingBottom,
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
                Spacer(modifier = Modifier.height(subtitlePadding))
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

        actionAfter?.let {
            CompositionLocalProvider(
                LocalIconButtonStyle provides style.endButtonStyle,
                LocalButtonGroupStyle provides style.endButtonGroupStyle,
            ) {
                it()
            }
        }
    }
}

/**
 * Тип разделителя по нижнему краю [AiHeader].
 */
enum class AiHeaderSeparationType {

    /**
     * Горизонтальная линия
     */
    Divider,

    /**
     * Разделитель отсутствует
     */
    None,
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
