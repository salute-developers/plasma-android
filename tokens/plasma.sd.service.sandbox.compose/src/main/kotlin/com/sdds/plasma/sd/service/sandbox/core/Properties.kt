@file:Suppress("ConstPropertyName")

package com.sdds.plasma.sd.service.sandbox.core

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.sandbox.compose.R
import com.sdds.plasma.sd.service.styles.button.icon.Clear
import com.sdds.plasma.sd.service.styles.button.icon.Xs
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
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
    properties: List<Property<*>>,
) {
    Column(
        modifier = Modifier
            .clip(PlasmaSdServiceTheme.shapes.roundM)
            .border(1.dp, PlasmaSdServiceTheme.colors.surfaceDefaultSolidTertiary, PlasmaSdServiceTheme.shapes.roundM)
            .background(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard),
    ) {
        PropertiesHeader(
            modifier = Modifier.background(PlasmaSdServiceTheme.colors.surfaceDefaultSolidSecondary),
            onResetClicked = onReset,
        )

        properties.forEach { property ->
            when (property) {
                is Property.BooleanProperty ->
                    SwitchPropertyListItem(
                        onClick = {
                            property.onApply.invoke(!property.value)
                        },
                        propertyName = property.name,
                        propertyValue = property.value,
                    )

                is Property.IntProperty ->
                    ValuePropertyListItem(
                        onClick = { onSelect(property) },
                        propertyName = property.name,
                        propertyValue = property.value.toString(),
                    )

                is Property.SingleChoiceProperty ->
                    ValuePropertyListItem(
                        onClick = { onSelect(property) },
                        propertyName = property.name,
                        propertyValue = property.value,
                    )

                is Property.StringProperty ->
                    ValuePropertyListItem(
                        onClick = { onSelect(property) },
                        propertyName = property.name,
                        propertyValue = property.value,
                    )
            }

            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(PlasmaSdServiceTheme.colors.surfaceDefaultSolidSecondary),
            )
        }
    }
}

@Composable
private fun PropertiesHeader(
    onResetClicked: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = stringResource(R.string.sandbox_properties_header_name),
            style = PlasmaSdServiceTheme.typography.bodyMBold.copy(
                color = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            ),
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
        )
        Text(
            text = stringResource(R.string.sandbox_properties_header_value),
            style = PlasmaSdServiceTheme.typography.bodyMBold.copy(
                color = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            ),
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.End),
        )

        Spacer(modifier = Modifier.width(10.dp))

        IconButton(
            style = IconButton.Xs.Clear.style(),
            icon = painterResource(id = Icons.ic_reset_outline_24),
            onClick = onResetClicked,
        )
    }
}

@Composable
private fun ValuePropertyListItem(
    onClick: () -> Unit,
    propertyName: String,
    propertyValue: String,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = propertyName,
            style = PlasmaSdServiceTheme.typography.bodyMBold.copy(
                color = PlasmaSdServiceTheme.colors.textDefaultPrimary,
            ),
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
        )
        Text(
            text = propertyValue,
            style = PlasmaSdServiceTheme.typography.bodyMBold.copy(
                color = PlasmaSdServiceTheme.colors.textDefaultSecondary,
            ),
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.End),
        )
    }
}

@Composable
private fun SwitchPropertyListItem(
    propertyName: String,
    propertyValue: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = propertyName,
            style = PlasmaSdServiceTheme.typography.bodyMBold.copy(
                color = PlasmaSdServiceTheme.colors.textDefaultPrimary,
            ),
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.Start),
        )
        Switch(
            active = propertyValue,
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.End),
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun PropertiesPreview() {
    PlasmaSdServiceTheme {
        Column {
            ValuePropertyListItem(
                propertyName = "Property",
                propertyValue = "Value",
                onClick = {},
            )
        }
    }
}
