package com.sdds.plasma.homeds.docs.samples

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Card
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.style.style
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet
import com.sdds.icons.R
import com.sdds.plasma.homeds.components.bubble.BubbleHost
import com.sdds.plasma.homeds.components.bubble.BubbleStyle
import com.sdds.plasma.homeds.components.bubble.BubbleTrigger
import com.sdds.plasma.homeds.styles.card.L
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Default
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import com.sdds.plasma.homeds.styles.card.Card as CardStyles
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Bubble as BubbleStyles

@Composable
@DocSample(needScreenshot = true)
fun Bubble_Default() {
    composableCodeSnippet {
        val deviceId = "living-room"
        var expanded by remember { mutableStateOf(false) }
        var hasOffer by remember { mutableStateOf(true) }
        val visibleTriggers = remember { mutableStateMapOf<String, Boolean>() }
        BubbleHost {
            if (hasOffer) {
                BubbleTrigger(
                    onExpandedClick = {},
                    expanded = expanded,
                    text = "Прокачать до 100%",
                    progress = 0.6f,
                    style = BubbleStyles.Default.style(),
                    onDismissRequest = {
                        expanded = false
                        hasOffer = false
                    },
                    onTriggerClick = { expanded = true },
                    onTriggerVisibilityChange = { visible ->
                        visibleTriggers[deviceId] = visible
                    },
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Bubble_Card() {
    composableCodeSnippet {
        var expanded by remember { mutableStateOf(false) }

        BubbleHost(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Card(
                    style = CardStyles.L.style(),
                    extra = {
                        BubbleTrigger(
                            onExpandedClick = { /* переход на экран апсейла */ },
                            expanded = expanded,
                            text = "Прокачать до 100%",
                            progress = 0.6f,
                            style = BubbleStyles.Default.style(),
                            onTriggerClick = { expanded = true },
                            onDismissRequest = { expanded = false },
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(8.dp),
                        )
                    },
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(text = "Устройство")
                    }
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Bubble_BubbleStyle() {
    composableCodeSnippet {
        BubbleStyle.builder()
            .colors {
                bodyColor(PlasmaHomeDsTheme.colors.surfaceInversePositive)
                iconColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary)
                textColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary)
            }
            .dimensions {
                circleSize(32.dp)
                iconSize(16.dp)
                bodyCornerRadius(16.dp)
                bodyNearCornerRadius(4.dp)
                bodyMinHeight(40.dp)
                neckWidth(12.dp)
                neckLength(20.dp)
                neckFilletRadius(4.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(6.dp)
                paddingBottom(8.dp)
            }
            .starIcon(R.drawable.ic_star_four_fill_16)
            .closeIcon(R.drawable.ic_close_24)
            .expandDuration(600)
            .collapseDuration(600)
            .style()
    }
}
