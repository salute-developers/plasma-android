package com.sdds.compose.uikit.fixtures.samples.collapsingnavigationbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.sdds.compose.docs.composableCodeSnippet
import com.sdds.compose.uikit.CollapsingNavigationBar
import com.sdds.compose.uikit.CollapsingNavigationBarDefaults
import com.sdds.compose.uikit.CollapsingNavigationBarStates
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.Icon
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.rememberCollapsingNavigationBarState
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.docs.DocSample
import com.sdds.icons.R

@Composable
@DocSample(needScreenshot = true)
fun CollapsingNavigationBar_Simple() {
    composableCodeSnippet {
        val scrollBehavior =
            CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior(
                rememberCollapsingNavigationBarState(),
            )
        Column(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        ) {
            CollapsingNavigationBar(
                scrollBehavior = scrollBehavior,
                collapsedTitle = { Text("Title") },
                expandedTitle = { Text("Title") },
                collapsedDescription = { Text("Description") },
                expandedDescription = { Text("Description") },
                content = { Text("Content") },
                actionStart = {
                    Icon(
                        painter = painterResource(com.sdds.icons.R.drawable.ic_search_24),
                        contentDescription = "",
                    )
                },
                actionEnd = {
                    Icon(
                        painter = painterResource(com.sdds.icons.R.drawable.ic_menu_24),
                        contentDescription = "",
                    )
                },
                onBackPressed = {
                    println("Back button was pressed")
                },
            )
            LazyColumn {
                items(100) {
                    Text(modifier = Modifier.padding(32.dp), text = "Label text $it")
                }
            }
        }
    }
}

@Composable
@DocSample
fun CollapsingNavigationBar_Style() {
    composableCodeSnippet {
        CollapsingNavigationBarStyle.builder()
            .shadow(placeholder(ShadowAppearance(), "/** Токен тени */"))
            .bottomShape(placeholder(RoundedCornerShape(8.dp), "/** Токен формы(скругления) */"))
            .titleStyle(placeholder(TextStyle.Default, "/** Токен типографки */").asStatefulValue())
            .descriptionStyle(placeholder(TextStyle.Default, "/** Токен типографки */").asStatefulValue())
            .backIcon(R.drawable.ic_disclosure_left_outline_24)
            .colors {
                backIconColor(placeholder(Color.DarkGray, "/** Токен цвета */").asStatefulValue())
                titleColor(placeholder(Color.Black, "/** Токен цвета */").asStatefulValue())
                descriptionColor(placeholder(Color.Black, "/** Токен цвета */").asStatefulValue())
                actionStartColor(placeholder(Color.Black, "/** Токен цвета */").asStatefulValue())
                actionEndColor(placeholder(Color.Black, "/** Токен цвета */").asStatefulValue())
                backgroundColor(placeholder(Color.Black, "/** Токен цвета */").asStatefulValue())
            }
            .dimensions {
                paddingStart(20.0.dp)
                paddingEnd(20.0.dp)
                paddingTop(20.0.dp)
                paddingBottom(20.0.dp)
                backIconMargin(4.0.dp)
                textBlockTopMargin(16.0.dp)
                horizontalSpacing(16.0.dp)
                descriptionPadding(
                    12.dp.asStatefulValue(
                        setOf(CollapsingNavigationBarStates.Collapsed) to 4.dp,
                    ),
                )
            }
            .style()
    }
}
