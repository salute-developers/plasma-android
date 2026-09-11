package com.sdds.plasma.homeds.components.numberedcard

import androidx.compose.foundation.Indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.CardOrientation
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.graphics.LocalIndication
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.motion.Motion
import com.sdds.plasma.homeds.components.numberpanel.NumberPanel
import com.sdds.plasma.homeds.motion.numberpanel.NumberPanelMotionStyle
import com.sdds.plasma.homeds.motion.numberpanel.rememberNumberPanelMotion
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel

/**
 * Компонент для отображения числовых значений в карточке.
 * @param modifier модификатор
 * @param numberPanelValue числовое значение
 * @param numberPanelValue выравнивание числовой панели внутри карточки
 * @param style стиль компонента
 * @param onClick обработчик нажатий
 * @param enabled флаг доступности
 * @param indication [Indication]
 * @param focusSelectorSettings режим отображения фокуса компонента [FocusSelectorSettings]
 * @param orientation расположение контента внутри карточки [CardOrientation]
 * @param interactionSource источник взаимодействий [MutableInteractionSource]
 * @param extra слот для дополнительного контента
 * @param label слот для расположения заголовка
 * @param content контент, например подложка в качестве background
 * @param motion объект анимации для [NumberPanel]
 */
@Composable
fun CardWithNumbers(
    modifier: Modifier = Modifier,
    numberPanelValue: Float? = null,
    numberPanelAlignment: Alignment = Alignment.TopCenter,
    style: CardWithNumbersStyle = LocalCardWithNumbersStyle.current,
    onClick: () -> Unit = {},
    enabled: Boolean = true,
    indication: Indication? = LocalIndication.current,
    focusSelectorSettings: FocusSelectorSettings = LocalFocusSelectorSettings.current,
    orientation: CardOrientation = style.cardStyle.orientation,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    extra: (@Composable BoxScope.() -> Unit)? = null,
    label: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    motion: Motion<NumberPanelMotionStyle> = rememberNumberPanelMotion(),
) {
    Card(
        modifier = modifier,
        style = style.cardStyle,
        onClick = onClick,
        enabled = enabled,
        indication = indication,
        focusSelectorSettings = focusSelectorSettings,
        orientation = orientation,
        interactionSource = interactionSource,
        label = label,
        extra = extra,
    ) {
        content?.invoke()
        numberPanelValue?.let {
            val paddingTop = style.dimensions.paddingTop.getValue(interactionSource)
            val paddingStart = style.dimensions.paddingStart.getValue(interactionSource)
            val paddingEnd = style.dimensions.paddingEnd.getValue(interactionSource)
            val paddingBottom = style.dimensions.paddingBottom.getValue(interactionSource)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = paddingTop, bottom = paddingBottom, start = paddingStart, end = paddingEnd),
                contentAlignment = numberPanelAlignment,
            ) {
                NumberPanel(
                    value = it,
                    style = style.numberPanelStyle,
                    enabled = enabled,
                    motion = motion,
                )
            }
        }
    }
}
