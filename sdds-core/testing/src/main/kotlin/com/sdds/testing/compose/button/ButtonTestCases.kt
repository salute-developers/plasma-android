package com.sdds.testing.compose.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButton
import com.sdds.icons.R

/**
 * Тест кейсы для Button, IconButton, LinkButton
 */

/**
 * PLASMA-T1319
 */
@Composable
fun ButtonSizeLDefault(style: ButtonStyle) {
    Button(
        style = style,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1327
 */
@Composable
fun ButtonSizeMAccent(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_24)),
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1328
 */
@Composable
fun ButtonSizeSWarning(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_24)),
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1329
 */
@Composable
fun ButtonSizeXSDark(style: ButtonStyle) {
    Button(
        style = style,
        label = "Label",
        value = "Value",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1330
 */
@Composable
fun ButtonSizeLIsLoading(style: ButtonStyle) {
    Button(
        style = style,
        label = "Label",
        enabled = true,
        loading = true,
        onClick = {},
    )
}

/**
 * PLASMA-T1331
 */
@Composable
fun ButtonSizeLDisabled(style: ButtonStyle) {
    Button(
        style = style,
        spacing = Button.Spacing.Packed,
        label = "Label",
        enabled = false,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1332
 */
@Composable
fun ButtonSizeLSecondary(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_24)),
        spacing = Button.Spacing.Packed,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1333
 */
@Composable
fun ButtonSizeMSpaceBetween(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_16)),
        spacing = Button.Spacing.SpaceBetween,
        label = "Label",
        value = "Value",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1337
 */
@Composable
fun ButtonSizeSLongText(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_16)),
        spacing = Button.Spacing.Packed,
        label = "LabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabelLabel",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1395
 */
@Composable
fun ButtonSizeXSNegative(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_16)),
        spacing = Button.Spacing.Packed,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1931
 */
@Composable
fun ButtonSizeLWhite(style: ButtonStyle) {
    Button(
        style = style,
        icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_24)),
        spacing = Button.Spacing.Packed,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1396
 */
@Composable
fun IconButtonLDefault(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1397
 */
@Composable
fun IconButtonMAccent(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1398
 */
@Composable
fun IconButtonSWarning(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1399
 */
@Composable
fun IconButtonXsDark(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_16),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1400
 */
@Composable
fun IconButtonIsLoading(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = true,
    )
}

/**
 * PLASMA-T1401
 */
@Composable
fun IconButtonLDisabled(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = false,
        loading = false,
    )
}

/**
 * PLASMA-T1402
 */
@Composable
fun IconButtonLSecondary(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1403
 */
@Composable
fun IconButtonMClear(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1404
 */
@Composable
fun IconButtonSPositive(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1405
 */
@Composable
fun IconButtonXSNegative(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = true,
    )
}

/**
 * PLASMA-T1932
 */
@Composable
fun IconButtonLWhite(iconButtonStyle: ButtonStyle) {
    IconButton(
        style = iconButtonStyle,
        icon = painterResource(id = R.drawable.ic_plasma_24),
        onClick = {},
        enabled = true,
        loading = false,
    )
}

/**
 * PLASMA-T1466
 */
@Composable
fun LinkButtonSizeLDefault(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1467
 */
@Composable
fun LinkButtonSizeLIsLoading(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        label = "Label",
        enabled = true,
        loading = true,
        onClick = {},
    )
}

/**
 * PLASMA-T1468
 */
@Composable
fun LinkButtonSizeLSecondary(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1469
 */
@Composable
fun LinkButtonSizeMAccent(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        icons = Button.Icons(start = painterResource(id = R.drawable.ic_plasma_24)),
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1470
 */
@Composable
fun LinkButtonSizeLDisabled(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        spacing = Button.Spacing.Packed,
        label = "Label",
        enabled = false,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1471
 */
@Composable
fun LinkButtonSizeSWarning(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        icons = Button.Icons(end = painterResource(id = R.drawable.ic_plasma_24)),
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}

/**
 * PLASMA-T1472
 */
@Composable
fun LinkButtonSizeXSNegative(linkButtonStyle: ButtonStyle) {
    Button(
        style = linkButtonStyle,
        label = "Label",
        enabled = true,
        loading = false,
        onClick = {},
    )
}
