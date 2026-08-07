package com.sdds.compose.uikit.fixtures.kmp.testcases

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Toast
import com.sdds.compose.uikit.ToastStyle
import com.sdds.icons.compose.Close16
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Shazam16

/**
 * PLASMA-T2041
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun ToastPilledPositiveCenterEndHasContentStartEndKmp(
    style: ToastStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        ToastForTestContentStartEndKmp(
            style = style,
            modifier = Modifier.align(Alignment.CenterEnd),
        )
    }
}

/**
 * PLASMA-T2042
 */
@Suppress("UNUSED_PARAMETER")
@Composable
fun ToastRoundedDefaultBottomStartHasContentEndKmp(
    style: ToastStyle,
    buttonStyle: ButtonStyle,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        ToastForTestContentEndKmp(
            style = style,
            modifier = Modifier.align(Alignment.BottomStart),
        )
    }
}

/**
 * Toast ContentStart and ContentEnd
 */
@Composable
fun ToastForTestContentStartEndKmp(
    style: ToastStyle,
    modifier: Modifier = Modifier,
) {
    Toast(
        style = style,
        modifier = modifier,
        text = "Toast Text",
        contentStart = {
            Icon(imageVector = SddsIcons.Shazam16, contentDescription = "")
        },
        contentEnd = {
            Icon(imageVector = SddsIcons.Close16, contentDescription = "")
        },
    )
}

/**
 * Toast ContentEnd
 */
@Composable
fun ToastForTestContentEndKmp(
    style: ToastStyle,
    modifier: Modifier = Modifier,
) {
    Toast(
        style = style,
        modifier = modifier,
        text = "Toast Text",
        contentStart = null,
        contentEnd = {
            Icon(imageVector = SddsIcons.Close16, contentDescription = "")
        },
    )
}
