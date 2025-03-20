package com.sdds.playground.sandbox.card.compose

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.CardContent
import com.sdds.compose.uikit.CardStyle
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey

/**
 * Экран с Card
 */
@Composable
internal fun CardScreen(
    componentKey: ComponentKey = ComponentKey.Card,
) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<CardParametersViewModel>(
            factory = CardParametersViewModelFactory(CardUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { cardUiState, style ->
            when (cardUiState.orientation) {
                CardOrientation.VERTICAL -> {
                    VerticalCard(style)
                }

                CardOrientation.HORIZONTAL -> {
                    HorizontalCard(style)
                }
            }
        },
    )
}

@Composable
private fun VerticalCard(style: CardStyle) {
    Card(
        modifier = Modifier
            .width(100.dp)
            .height(150.dp),
        style = style,
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
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentDescription = "Android",
                )
                Text(
                    text = "Content",
                )
            }
        }
    }
}

@Composable
private fun HorizontalCard(style: CardStyle) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(100.dp),
        style = style,
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
            ) {
                Image(
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.il_avatar_test),
                    contentDescription = "Android",
                )
                Text(
                    text = "Content",
                )
            }
        }
    }
}

@Composable
@Preview
internal fun CardScreenPreview() {
    SandboxTheme {
        CardScreen()
    }
}
