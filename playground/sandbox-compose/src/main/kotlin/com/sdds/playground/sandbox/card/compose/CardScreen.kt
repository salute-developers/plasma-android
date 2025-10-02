package com.sdds.playground.sandbox.card.compose

import androidx.compose.foundation.layout.Box
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
import com.sdds.compose.uikit.CardOrientation
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.Image
import com.sdds.compose.uikit.Text
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.icons.R.drawable as Icons

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
            Card(
                style = style,
                orientation =
                when (cardUiState.orientation) {
                    Orientation.VERTICAL -> CardOrientation.Vertical
                    else -> CardOrientation.Horizontal
                },
                label = { Text(cardUiState.label) },
                extra = {
                    IconButton(
                        Icons.ic_plasma_24,
                        modifier = Modifier.align(Alignment.BottomEnd),
                    ) { }
                },
            ) {
                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp),
                ) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.FillBounds,
                        painter = painterResource(id = R.drawable.il_avatar_test),
                        contentDescription = "Android",
                    )
                }
            }
        },
    )
}

@Composable
@Preview
internal fun CardScreenPreview() {
    SandboxTheme {
        CardScreen()
    }
}
