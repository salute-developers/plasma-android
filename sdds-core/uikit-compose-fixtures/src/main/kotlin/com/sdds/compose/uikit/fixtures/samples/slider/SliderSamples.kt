package com.sdds.compose.uikit.fixtures.samples.slider

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.LabelAlignment
import com.sdds.compose.uikit.LimitLabelAlignment
import com.sdds.compose.uikit.SlideDirection
import com.sdds.compose.uikit.Slider
import com.sdds.compose.uikit.SliderAlignment
import com.sdds.compose.uikit.SliderOrientation
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.TitleAlignment
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.ValuePlacement
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Slider_Simple() {
    composableCodeSnippet {
        Slider(
            modifier = Modifier,
            value = 0f,
            title = "Title",
            labelContent = {
                Icon(
                    painter = painterResource(com.sdds.icons.R.drawable.ic_salute_outline_36),
                    contentDescription = null,
                )
            },
            onValueChange = {},
            labelEnabled = true,
            thumbEnabled = true,
            limitLabelEnabled = true,
            slideDirection = SlideDirection.Normal,
            valueRange = 0f..1f,
            valueFormatTransformer = { progress ->
                val totalSeconds = progress.toInt()
                val minutes = totalSeconds / 60
                val seconds = totalSeconds % 60
                "%02d:%02d".format(minutes, seconds)
            },
            alignment = SliderAlignment.Start,
        )
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Slider_Style() {
    composableCodeSnippet {
        SliderStyle.builder()
            .colors {
                thumbColor(Color.White)
                trackColor(Color.LightGray)
                iconColor(Color.Black)
                titleColor(Color.Black)
                limitLabelColor(Color.Black)
                indicatorColor(Color.Green)
                thumbStrokeColor(Color.Red)
            }
            .dimensions {
                trackThickness(4.0.dp)
                indicatorThickness(4.0.dp)
                thumbStrokeWidth(1.0.dp)
                thumbSize(20.0.dp)
                iconSize(24.0.dp)
                labelMargin(14.0.dp)
                limitLabelMargin(12.0.dp)
                titleMargin(4.0.dp)
            }
            .tooltipStyle(
                placeholder(
                    TooltipStyle.builder().style(),
                    "/** Стиль компонента */",
                ),
            )
            .orientation(SliderOrientation.Horizontal)
            .titleAlignment(TitleAlignment.End)
            .labelAlignment(LabelAlignment.Center)
            .slideDirection(SlideDirection.Normal)
            .valuePlacement(ValuePlacement.Top)
            .shape(CircleShape)
            .indicatorShape(CircleShape)
            .thumbShape(CircleShape)
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .limitLabelStyle(placeholder(TextStyle.Default, "/** Токен типографики */"))
            .alignment(SliderAlignment.Start)
            .limitLabelAlignment(LimitLabelAlignment.End)
            .style()
    }
}
