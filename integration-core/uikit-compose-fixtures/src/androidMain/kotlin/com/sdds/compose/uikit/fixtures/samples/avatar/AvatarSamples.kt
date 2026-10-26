package com.sdds.compose.uikit.fixtures.samples.avatar

import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.Counter
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.motion.components.avatar.AvatarMotionStyle
import com.sdds.compose.uikit.motion.components.avatar.rememberAvatarMotion
import com.sdds.compose.uikit.motion.finite
import com.sdds.compose.uikit.motion.transition
import com.sdds.docs.DocSample
import com.sdds.docs.composableCodeSnippet

@Composable
@DocSample(needScreenshot = false)
fun Avatar_Style() {
    composableCodeSnippet {
        AvatarStyle.builder()
            .shape(CircleShape)
            .colors {
                backgroundColor(placeholder(Brush.sweepGradient(), "/** Токен градиента */").asStatefulValue())
                textColor(placeholder(Brush.linearGradient(), "/** Токен градиента */").asStatefulValue())
            }
            .dimensions {
                width(88.0.dp)
                height(88.0.dp)
            }
            .textStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .badgeStyle(placeholder(BadgeStyle.badgeBuilder().style(), "/** Стиль компонента */"))
            .counterStyle(placeholder(CounterStyle.builder().style(), "/** Стиль компонента */"))
            .statusStyle(
                IndicatorStyle.builder()
                    .color {
                        backgroundColor(
                            placeholder(Color.Red, "/** Токен цвета */").asInteractive(
                                setOf(AvatarStatus.Active)
                                    to placeholder(Color.Green, "/** Цвет в состоянии active */"),
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
@DocSample(needScreenshot = false)
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

@Composable
@DocSample(needScreenshot = false)
fun Avatar_Motion() {
    composableCodeSnippet {
        var status by remember { mutableStateOf(AvatarStatus.None) }
        val activeState = setOf(AvatarStatus.Active)
        val style = AvatarStyle.builder()
            .shape(CircleShape)
            .colors {
                backgroundColor(
                    Color.LightGray.asStatefulBrush(
                        activeState to Color(0xFF4CAF50),
                    ),
                )
            }
            .dimensions {
                width(88.0.dp)
                height(88.0.dp)
            }
            .style()
        val motion = rememberAvatarMotion(
            style = AvatarMotionStyle.builder()
                .backgroundColor(transition { segment { } changesWith { finite(tween(200)) } })
                .style(),
        )
        Avatar(
            modifier = Modifier.clickable(
                interactionSource = motion.context.interactionSource,
                indication = null,
            ) {
                status = if (status == AvatarStatus.None) AvatarStatus.Active else AvatarStatus.None
            },
            style = style,
            status = status,
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
            motion = motion,
            content = { },
        )
    }
}
