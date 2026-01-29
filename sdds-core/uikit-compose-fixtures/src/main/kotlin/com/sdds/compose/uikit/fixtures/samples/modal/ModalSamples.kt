package com.sdds.compose.uikit.fixtures.samples.modal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Modal_Simple() {
    composableCodeSnippet {
        val showModal = remember { mutableStateOf(false) }
        Button(
            label = "Show modal",
            onClick = { showModal.value = true },
        )
        Modal(
            show = showModal.value,
            onDismissRequest = { showModal.value = false },
            modifier = Modifier.width(300.dp),
            hasClose = true,
            closeIcon = painterResource(com.sdds.icons.R.drawable.ic_close_24),
        ) {
            Column {
                Text("Modal text")
                Button(label = "Ok", onClick = { showModal.value = false })
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun Modal_Style() {
    composableCodeSnippet {
        ModalStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .shape(placeholder(RoundedCornerShape(16.dp), "/** Токен формы (скругления) */"))
            .dimensions {
                closeSize(16.0.dp)
                paddingStart(8.dp)
                paddingEnd(8.dp)
                paddingTop(8.dp)
                paddingBottom(8.dp)
            }
            .colors {
                backgroundColor(SolidColor(Color.Gray))
                closeColor(Color.LightGray)
            }
            .style()
    }
}
