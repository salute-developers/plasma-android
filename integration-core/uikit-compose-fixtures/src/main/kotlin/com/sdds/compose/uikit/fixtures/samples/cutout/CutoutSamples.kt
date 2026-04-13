package com.sdds.compose.uikit.fixtures.samples.cutout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.Badge
import com.sdds.compose.uikit.graphics.cutout.ProvideCutoutState
import com.sdds.compose.uikit.graphics.cutout.cutout
import com.sdds.compose.uikit.graphics.cutout.cutoutTarget
import com.sdds.compose.uikit.graphics.cutout.rememberCutoutState
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun Cutout_Simple() {
    composableCodeSnippet {
        val cutoutState = rememberCutoutState()

        ProvideCutoutState(cutoutState) {
            Box {
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .background(Color.Gray, CircleShape)
                        .cutoutTarget(),
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(16.dp)
                        .cutout(
                            shape = CircleShape,
                            padding = PaddingValues(2.dp, 2.dp),
                        )
                        .background(Color.Red, CircleShape),
                )
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = true)
fun AvatarCutout_Simple() {
    composableCodeSnippet {
        Avatar(
            placeholder = AvatarPlaceholder.Name("Michael Scott"),
            extra = {
                Badge(
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .cutout(
                            shape = CircleShape,
                            padding = PaddingValues(2.dp, 2.dp),
                        ),
                    label = "3",
                )
            },
        ) {
            // Avatar Image
        }
    }
}
