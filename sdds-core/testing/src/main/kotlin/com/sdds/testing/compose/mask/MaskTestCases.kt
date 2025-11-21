package com.sdds.testing.compose.mask

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.mask.DateMask
import com.sdds.compose.uikit.mask.MaskedTextField
import com.sdds.compose.uikit.mask.NumberMask
import com.sdds.compose.uikit.mask.PhoneMask
import com.sdds.compose.uikit.mask.TextFieldMask
import com.sdds.compose.uikit.mask.TextFieldMaskMode
import com.sdds.compose.uikit.mask.TimeMask
import com.sdds.icons.R

/**
 * Тест-кейсы для компонента [MaskTextField]
 */

/**
 * PLASMA-T1243
 */
@Composable
fun MaskPhoneDisplayAlwaysPlaceholder(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Phone,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    Box(modifier = Modifier.padding(start = 20.dp)) {
        MaskedTextField(
            modifier = Modifier
                .testTag("MaskedTextField"),
            style = style,
            value = value,
            mask = mask,
            enabled = true,
            readOnly = false,
            placeholderText = "placeholder",
            labelText = "Label",
            prefix = "",
            suffix = "",
            startContent = null,
            endContent = null,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            onValueChange = { value = it },
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}

/**
 * PLASMA-T1247
 */
@Composable
fun MaskDisabledIconAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Phone,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = false,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T1248
 */
@Composable
fun MaskReadOnlyIconAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Phone,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = "",
        mask = mask,
        enabled = true,
        readOnly = true,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2377
 */
@Composable
fun MaskShortDateAlwaysIconAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.DateShort,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2378
 */
@Composable
fun MaskTimeAlwaysIcon(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Time,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = null,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2379
 */
@Composable
fun MaskNumberAlwaysAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Number,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = null,
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2380
 */
@Composable
fun MaskTimeAlwaysTBTA(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Phone,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "TB",
        suffix = "TA",
        startContent = null,
        endContent = null,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASma-T2381
 */
@Composable
fun MaskPhoneOnInput(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Phone,
    maskMode: TextFieldMaskMode = TextFieldMaskMode.OnInput,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType, maskMode) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T1281
 */
@Composable
fun MaskPhoneType(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Phone,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2384
 */
@Composable
fun MaskLongDateAlwaysIconAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.DateLong,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) {
        when (maskType) {
            MaskTypeForTest.DateLong -> DateMask(
                maskMode = TextFieldMaskMode.Always,
                pattern = listOf("ДД", "ММ", "ГГГГ"),
            )
            MaskTypeForTest.DateShort -> DateMask(
                maskMode = TextFieldMaskMode.Always,
                pattern = listOf("ДД", "ММ", "ГГ"),
            )

            MaskTypeForTest.Phone -> PhoneMask(maskMode = TextFieldMaskMode.Always)
            MaskTypeForTest.Time -> TimeMask(maskMode = TextFieldMaskMode.Always)
            MaskTypeForTest.Number -> NumberMask()
        }
    }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2385
 */
@Composable
fun MaskTimeIconAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Time,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

/**
 * PLASMA-T2389
 */
@Composable
fun MaskNumberIconAction(
    style: TextFieldStyle,
    maskType: MaskTypeForTest = MaskTypeForTest.Number,
) {
    var value by remember { mutableStateOf("") }
    val mask = remember(maskType) { placeholderMask(maskType) }
    val placeholder = placeholderForTest(maskType)
    MaskedTextField(
        modifier = Modifier
            .testTag("MaskedTextField"),
        style = style,
        value = value,
        mask = mask,
        enabled = true,
        readOnly = false,
        placeholderText = placeholder,
        labelText = "Label",
        prefix = "",
        suffix = "",
        startContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_scribble_diagonal_24),
                contentDescription = "",
            )
        },
        endContent = {
            Icon(
                painter = painterResource(id = R.drawable.ic_shazam_24),
                contentDescription = "",
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        onValueChange = { value = it },
        focusSelectorSettings = FocusSelectorSettings.None,
    )
}

private fun placeholderMask(maskType: MaskTypeForTest): TextFieldMask = when (maskType) {
    MaskTypeForTest.Phone -> PhoneMask(maskMode = TextFieldMaskMode.Always)
    MaskTypeForTest.DateShort -> DateMask(maskMode = TextFieldMaskMode.Always)
    MaskTypeForTest.DateLong -> DateMask(maskMode = TextFieldMaskMode.Always)
    MaskTypeForTest.Time -> TimeMask(maskMode = TextFieldMaskMode.Always)
    MaskTypeForTest.Number -> NumberMask()
}

private fun placeholderForTest(maskType: MaskTypeForTest): String = when (maskType) {
    MaskTypeForTest.Phone -> "+7 (000) 000-00-00"
    MaskTypeForTest.DateShort -> "ДД.ММ.ГГ"
    MaskTypeForTest.DateLong -> "ДД.ММ.ГГГГ"
    MaskTypeForTest.Time -> "ЧЧ:ММ"
    MaskTypeForTest.Number -> "0,00"
}

/**
 * enum for testing mask type
 */
enum class MaskTypeForTest {
    Phone, DateShort, DateLong, Time, Number
}
