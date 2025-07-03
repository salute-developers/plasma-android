package com.sdds.testing.compose.accordion

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.sdds.compose.uikit.Accordion
import com.sdds.compose.uikit.AccordionItem
import com.sdds.compose.uikit.AccordionStyle
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.Text

/**
 * Тест-кейсы для компонента [Accordion]
 */

/**
 * PLASMA-T2094
 */
@Composable
fun AccordionSolidActionEndSizeL(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2095
 */
@Composable
fun AccordionSolidActionStartAmountTenSizeM(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(10) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2096
 */
@Composable
fun AccordionClearActionEndSizeSDivider(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
            Divider()
        }
    }
}

/**
 * PLASMA-T2097
 */
@Composable
fun AccordionClearActionStartSizeXs(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2098
 */
@Composable
fun AccordionSolidActionEndSizeLNoTextNoContent(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = {},
            )
        }
    }
}

/**
 * PLASMA-T2099
 */
@Composable
fun AccordionSolidActionEndSizeLAmountTen(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(9) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2100
 */
@Composable
fun AccordionClearActionStartSizeH2AmountTen(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(10) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2101
 */
@Composable
fun AccordionSolidActionEndSizeH2(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2102
 */
@Composable
fun AccordionSolidActionStartSizeH3(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2103
 */
@Composable
fun AccordionClearActionEndSizeH4(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

/**
 * PLASMA-T2104
 */
@Composable
fun AccordionClearActionStartSizeH5(style: AccordionStyle) {
    Accordion(style = style) {
        repeat(3) {
            var opened by remember { mutableStateOf(false) }
            AccordionItem(
                modifier = Modifier.testTag("Accordion"),
                title = "Title",
                onClick = { opened = !opened },
                opened = opened,
                openTransition = openTransition(true),
                content = { Text("Content text") },
            )
        }
    }
}

@Composable
private fun openTransition(animationEnabled: Boolean): EnterTransition =
    if (animationEnabled) remember { fadeIn() + expandVertically() } else EnterTransition.None
