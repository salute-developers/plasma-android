package com.sdds.testing.compose.card

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.CardContent
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.testing.R

/**
 * Vertical [Card]
 */

@Composable
fun CardVertical(style: CardStyle) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(150.dp),
        style = style,
        focusSelectorSettings = LocalFocusSelectorSettings.current,
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
            ) {
                Text(
                    "Card text",
                    modifier = Modifier
                        .align(Alignment.Center),
                )
            }
            CardContent(
                modifier = Modifier
                    .weight(2f)
                    .align(Alignment.CenterHorizontally),
                style = style,
                focusSelectorSettings = FocusSelectorSettings.None,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.il_avatar_for_test),
                    contentDescription = "Android",
                )
                Text(
                    text = "Content",
                )
            }
        }
    }
}

/**
 * Horizontal [Card]
 */

@Composable
fun CardHorizontal(style: CardStyle) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(100.dp),
        style = style,
        focusSelectorSettings = LocalFocusSelectorSettings.current,
    ) {
        Row {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
            ) {
                Text(
                    "Card text",
                    modifier = Modifier
                        .align(Alignment.Center),
                )
            }
            CardContent(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f),
                style = style,
                focusSelectorSettings = FocusSelectorSettings.None,
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.il_avatar_for_test),
                    contentDescription = "Android",
                )
                Text(
                    text = "Content",
                )
            }
        }
    }
}
