package com.sdds.compose.uikit.fixtures.samples.avatar.group

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarCounter
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.AvatarGroupStyle
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.compose.uikit.AvatarStyle
import com.sdds.docs.DocSample

@Composable
@DocSample(needScreenshot = true)
fun AvatarGroup_Simple() {
    composableCodeSnippet {
        AvatarGroup(
            threshold = 1,
        ) {
            repeat(3) {
                avatar {
                    Avatar(
                        status = AvatarStatus.Active,
                        placeholder = AvatarPlaceholder.Name("Michael Scott"),
                    )
                }
                counter {
                    AvatarCounter(3)
                }
            }
        }
    }
}

@Composable
@DocSample(needScreenshot = false)
fun AvatarGroup_Style() {
    composableCodeSnippet {
        AvatarGroupStyle.builder()
            .avatarStyle(placeholder(AvatarStyle.builder().style(), "/** Стиль компонента */"))
            .dimensions {
                itemSpacing(2.0.dp)
                itemOffset(16.0.dp)
            }
            .style()
    }
}
