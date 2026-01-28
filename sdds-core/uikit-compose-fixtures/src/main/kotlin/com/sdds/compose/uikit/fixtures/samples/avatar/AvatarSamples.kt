package com.sdds.compose.uikit.fixtures.samples.avatar

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = false)
fun Avatar_Style() {
    composableCodeSnippet {
        AvatarStyle.builder()
            .shape(CircleShape)
            .colors {
                backgroundColor(
                    placeholder(
                        Brush.sweepGradient(),
                        "/** Токен градиента */",
                    ).asStatefulValue(),
                )
                textColor(
                    placeholder(
                        Brush.linearGradient(),
                        "/** Токен градиента */",
                    ).asStatefulValue(),
                )
            }
            .dimensions {
                width(88.0.dp)
                height(88.0.dp)
            }
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .badgeStyle(
                placeholder(
                    BadgeStyle.badgeBuilder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .counterStyle(
                placeholder(
                    CounterStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .statusStyle(
                IndicatorStyle.builder()
                    .color {
                        backgroundColor(
                            placeholder(Color.Red, "/** Токен цвета */").asInteractive(
                                setOf(AvatarStatus.Active) to placeholder(
                                    Color.Green, "/** Токен цвета */",
                                ),
                            ),
                        )
                    }
                    .style(),
            )
            .style()
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Avatar_Simple() {
    composableCodeSnippet {
        Avatar(
            status = AvatarStatus.Active,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Avatar_ActionDisabled() {
    composableCodeSnippet {
        Avatar(
            status = AvatarStatus.Active,
            actionEnabled = false,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
        )
    }
}

@Composable
@DocSample(needScreenshot = true)
fun Avatar_Extra() {
    composableCodeSnippet {
        Avatar(
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
            extra = {
                Counter(
                    modifier = Modifier.align(Alignment.TopEnd),
                    count = "1",
                )
            },
            content = { },
        )
    }
}
