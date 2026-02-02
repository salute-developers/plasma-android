package com.sdds.compose.uikit.fixtures.samples.mask

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.mask.DateMask
import com.sdds.compose.uikit.mask.MaskedTextField
import com.sdds.compose.uikit.mask.NumberMask
import com.sdds.compose.uikit.mask.PhoneMask
import com.sdds.compose.uikit.mask.TimeMask
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Mask_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember { PhoneMask() }, // маска для телефонных номеров
            placeholderText = "Введите номер телефона",
            labelText = "Номер пользователя",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskPhone_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember { PhoneMask() }, // маска для телефонных номеров
            placeholderText = "Введите номер телефона",
            labelText = "Номер пользователя",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskPhone_Custom() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember {
                PhoneMask(
                    mask = "+365 (###) ###_##_##", // используем кастомный код и разделители '_',
                    digitPlaceholder = '1', // используем символ подсказки 1 вместо 0
                )
            },
            placeholderText = "Введите номер телефона",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskDate_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember { DateMask() }, // Настройки по-умолчанию ДД:ММ:ГГ
            placeholderText = "Введите дату рождения",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskDate_Custom() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember {
                DateMask(
                    pattern = listOf("ММ", "ГГ"), // оставляем только месяц и год
                    separator = '_', // используем кастомный разделитель
                )
            },
            placeholderText = "Введите дату рождения",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskTime_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember { TimeMask() }, // Настройки по-умолчанию ЧЧ:ММ
            placeholderText = "Введите дату рождения",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskTime_Custom() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember {
                TimeMask(
                    pattern = listOf("ЧЧ", "ММ", "СС"), // добавляем секунды
                    separator = '_', // используем кастомный разделитель
                )
            },
            placeholderText = "Введите время",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskNumber_Simple() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember { NumberMask() }, // Настройки по-умолчанию
            placeholderText = "Введите сумму",
            suffix = "млн. руб",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun MaskNumber_Custom() {
    composableCodeSnippet {
        var text by remember { mutableStateOf("") }
        MaskedTextField(
            value = text,
            onValueChange = { text = it },
            mask = remember {
                NumberMask(
                    decimalScale = 3, // изменяем количество знаков после запятой
                    decimalSeparator = ".", // используем кастомный разделитель дробной части
                    decimalSeparatorAliases = listOf(".", ",").toSet(), // изменяем спиок допустимых разделителей
                    thousandGroupSeparator = "_", // кастомный разделитель групп цифр
                    digitsPerGroup = 2, // изменяем количество цифр в группе
                )
            },
            placeholderText = "Введите сумму",
            suffix = "млн. руб",
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}
