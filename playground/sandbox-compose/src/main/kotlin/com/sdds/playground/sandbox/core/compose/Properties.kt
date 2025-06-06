@file:Suppress("ConstPropertyName")

package com.sdds.playground.sandbox.core.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.icons.R.drawable as Icons

/**
 * Создает экземпляр [Property.SingleChoiceProperty] для свойства с заданным типом [E]
 * @param name название свойства
 * @param value значение свойства
 * @param onApply колбэк применения нового значения
 */
internal inline fun <reified E : Enum<E>> enumProperty(
    name: String,
    value: E,
    noinline onApply: (E) -> Unit,
): Property.SingleChoiceProperty {
    val values = enumValues<E>()
    return Property.SingleChoiceProperty(
        name,
        value.name,
        values.map { it.name }.toList(),
    ) { enumName ->
        onApply(values.first { enumName == it.name })
    }
}

/**
 * Базовый класс свойства
 */
internal sealed class Property<Value> {

    /**
     * Название свойства
     */
    abstract val name: String

    /**
     * Значение свойства
     */
    abstract val value: Value

    /**
     * Колбэк применения нового значения
     */
    abstract val onApply: (Value) -> Unit

    /**
     * Свойство с вариантом выбора
     * @property variants множество вариантов
     */
    data class SingleChoiceProperty(
        override val name: String,
        override val value: String,
        val variants: List<String>,
        override val onApply: (String) -> Unit,
    ) : Property<String>()

    /**
     * Свойство типа [Boolean]
     */
    data class BooleanProperty(
        override val name: String,
        override val value: Boolean,
        override val onApply: (Boolean) -> Unit,
    ) : Property<Boolean>()

    /**
     * Свойство типа [String]
     */
    data class StringProperty(
        override val name: String,
        override val value: String,
        override val onApply: (String) -> Unit,
    ) : Property<String>()

    /**
     * Свойство типа [Int]
     */
    data class IntProperty(
        override val name: String,
        override val value: Int,
        override val onApply: (Int) -> Unit,
    ) : Property<Int>()
}

internal val LocalPropertiesListStyle = compositionLocalOf { PropertiesListStyle.create() }

internal interface PropertiesListStyle {
    val shape: Shape

    val borderWidth: Dp
    val borderColor: Color

    val backgroundColor: Color

    val headerBackgroundColor: Color
    val headerHeight: Dp
    val headerPaddings: PaddingValues
    val headerTextStyle: TextStyle
    val headerTextColor: Color
    val headerDescriptionTextColor: Color

    val propertyLabelTextStyle: TextStyle
    val propertyLabelTextColor: InteractiveColor
    val propertyValueTextStyle: TextStyle
    val propertyValueTextColor: InteractiveColor
    val propertyBackgroundColor: InteractiveColor
    val propertyHeight: Dp
    val propertyPaddings: Dp
    val propertySwitchStyle: SwitchStyle
    val propertyItemShape: Shape
    val spaceBetweenProperties: Dp

    val resetButtonStyle: ButtonStyle

    val dividerWidth: Dp
    val dividerColor: Color

    companion object {

        @Suppress("LongParameterList")
        fun create(
            shape: Shape = RectangleShape,
            borderWidth: Dp = 1.dp,
            borderColor: Color = Color.LightGray,
            backgroundColor: Color = Color.Red,
            headerBackgroundColor: Color = Color.LightGray,
            headerHeight: Dp = 56.dp,
            headerPaddings: PaddingValues = PaddingValues(16.dp),
            headerTextStyle: TextStyle = TextStyle.Default,
            headerTextColor: Color = Color.Black,
            headerDescriptionTextColor: Color = Color.Black,
            propertyLabelTextStyle: TextStyle = TextStyle.Default,
            propertyLabelTextColor: InteractiveColor = Color.Black.asInteractive(),
            propertyValueTextStyle: TextStyle = TextStyle.Default,
            propertyValueTextColor: InteractiveColor = Color.LightGray.asInteractive(),
            propertyBackgroundColor: InteractiveColor = Color.Gray.asInteractive(),
            propertyPaddings: Dp = 6.dp,
            propertySwitchStyle: SwitchStyle = SwitchStyle.builder().style(),
            propertyHeight: Dp = 56.dp,
            propertyItemShape: Shape = RoundedCornerShape(6.dp),
            dividerWidth: Dp = 1.dp,
            dividerColor: Color = Color.LightGray,
            resetButtonStyle: ButtonStyle = ButtonStyle.iconButtonBuilder().style(),
            spaceBetweenProperties: Dp = 10.dp,
        ): PropertiesListStyle =
            PropertiesListStyleImpl(
                shape = shape,
                borderWidth = borderWidth,
                borderColor = borderColor,
                backgroundColor = backgroundColor,
                headerBackgroundColor = headerBackgroundColor,
                headerHeight = headerHeight,
                headerPaddings = headerPaddings,
                headerTextStyle = headerTextStyle,
                headerTextColor = headerTextColor,
                headerDescriptionTextColor = headerDescriptionTextColor,
                propertyLabelTextStyle = propertyLabelTextStyle,
                propertyLabelTextColor = propertyLabelTextColor,
                propertyValueTextStyle = propertyValueTextStyle,
                propertyValueTextColor = propertyValueTextColor,
                propertyBackgroundColor = propertyBackgroundColor,
                propertyPaddings = propertyPaddings,
                propertySwitchStyle = propertySwitchStyle,
                propertyHeight = propertyHeight,
                dividerWidth = dividerWidth,
                dividerColor = dividerColor,
                resetButtonStyle = resetButtonStyle,
                propertyItemShape = propertyItemShape,
                spaceBetweenProperties = spaceBetweenProperties,
            )
    }
}

/**
 * Composable со списком редактируемых свойств
 * @param onSelect колбэк выбора свойства
 * @param onReset колбэк сброса всех свойств к значениям по умолчанию
 * @param properties свойства
 */
@Composable
internal fun PropertiesList(
    onSelect: (Property<*>) -> Unit,
    onReset: () -> Unit,
    headerTitle: String,
    properties: List<Property<*>>,
    modifier: Modifier = Modifier,
    style: PropertiesListStyle = LocalPropertiesListStyle.current,
) {
    Column(
        modifier = modifier
            .clip(style.shape)
            .background(style.backgroundColor)
            .padding(horizontal = 4.dp),
    ) {
        PropertiesHeader(
            title = headerTitle,
            style = style,
            onResetClicked = onReset,
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(style.spaceBetweenProperties),
        ) {
            items(properties.size) {
                when (val property = properties[it]) {
                    is Property.BooleanProperty ->
                        SwitchPropertyListItem(
                            style = style,
                            onClick = {
                                property.onApply.invoke(!property.value)
                            },
                            propertyName = property.name,
                            propertyValue = property.value,
                        )

                    is Property.IntProperty ->
                        ValuePropertyListItem(
                            style = style,
                            onClick = { onSelect(property) },
                            propertyName = property.name,
                            propertyValue = property.value.toString(),
                            icon = painterResource(id = Icons.ic_keyboard_outline_16),
                        )

                    is Property.SingleChoiceProperty ->
                        ValuePropertyListItem(
                            style = style,
                            onClick = { onSelect(property) },
                            propertyName = property.name,
                            propertyValue = property.value,
                            icon = painterResource(id = Icons.ic_disclosure_right_outline_16),
                        )

                    is Property.StringProperty ->
                        ValuePropertyListItem(
                            style = style,
                            onClick = { onSelect(property) },
                            propertyName = property.name,
                            propertyValue = property.value,
                            icon = painterResource(id = Icons.ic_keyboard_outline_16),
                        )
                }
            }
        }
    }
}

@Composable
private fun PropertiesHeader(
    title: String,
    style: PropertiesListStyle,
    onResetClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .height(style.headerHeight)
            .fillMaxWidth()
            .padding(style.propertyPaddings),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            Modifier
                .weight(1f)
                .wrapContentWidth(Alignment.Start),
        ) {
            Text(
                modifier = Modifier.align(Alignment.Start),
                text = title.substringBefore(","),
                style = style.headerTextStyle.copy(style.headerDescriptionTextColor),
            )
            Text(
                modifier = Modifier.align(Alignment.Start),
                text = title.substringAfter(","),
                style = style.headerTextStyle.copy(style.headerTextColor),
            )
        }
        IconButton(
            style = style.resetButtonStyle,
            icon = painterResource(id = Icons.ic_reset_outline_16),
            onClick = onResetClicked,
        )
    }
}

@Composable
private fun ValuePropertyListItem(
    style: PropertiesListStyle,
    onClick: () -> Unit,
    propertyName: String,
    propertyValue: String,
    icon: Painter,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val backgroundColor = style.propertyBackgroundColor.colorForInteraction(interactionSource)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .focusableItem(interactionSource = interactionSource)
            .fillMaxWidth()
            .height(style.propertyHeight)
            .clickable(onClick = onClick)
            .background(backgroundColor, style.propertyItemShape)
            .padding(horizontal = style.propertyPaddings),
    ) {
        Text(
            text = propertyName,
            style = style.propertyLabelTextStyle.copy(
                color = style.propertyLabelTextColor.colorForInteraction(interactionSource),
            ),
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = propertyValue,
            style = style.propertyValueTextStyle.copy(
                color = style.propertyValueTextColor.colorForInteraction(interactionSource),
            ),
        )
        Spacer(modifier = Modifier.width(4.dp))
        Icon(painter = icon, contentDescription = "")
    }
}

@Composable
private fun SwitchPropertyListItem(
    style: PropertiesListStyle,
    propertyName: String,
    propertyValue: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val backgroundColor by style.propertyBackgroundColor.colorForInteractionAsState(interactionSource)
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .focusableItem(interactionSource = interactionSource)
            .fillMaxWidth()
            .height(style.propertyHeight)
            .clickable(onClick = onClick)
            .background(backgroundColor, style.propertyItemShape)
            .padding(horizontal = style.propertyPaddings),
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .wrapContentWidth(Alignment.Start),
            text = propertyName,
            style = style.propertyLabelTextStyle.copy(
                color = style.propertyLabelTextColor.colorForInteraction(interactionSource),
            ),

        )
        Switch(
            active = propertyValue,
            style = style.propertySwitchStyle,
            modifier = Modifier
                .weight(1f)
                .wrapContentWidth(Alignment.End),
        )
    }
}

@Immutable
private data class PropertiesListStyleImpl(
    override val shape: Shape,
    override val borderWidth: Dp,
    override val borderColor: Color,
    override val backgroundColor: Color,
    override val headerBackgroundColor: Color,
    override val headerHeight: Dp,
    override val headerPaddings: PaddingValues,
    override val headerTextStyle: TextStyle,
    override val headerTextColor: Color,
    override val propertyLabelTextStyle: TextStyle,
    override val propertyLabelTextColor: InteractiveColor,
    override val propertyValueTextStyle: TextStyle,
    override val propertyValueTextColor: InteractiveColor,
    override val propertyBackgroundColor: InteractiveColor,
    override val propertyPaddings: Dp,
    override val propertySwitchStyle: SwitchStyle,
    override val propertyHeight: Dp,
    override val dividerWidth: Dp,
    override val dividerColor: Color,
    override val resetButtonStyle: ButtonStyle,
    override val propertyItemShape: Shape,
    override val spaceBetweenProperties: Dp,
    override val headerDescriptionTextColor: Color,
) : PropertiesListStyle
