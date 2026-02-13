package com.sdds.playground.sandbox.bottomsheet.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.Divider
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.serv.theme.SddsServTheme
import kotlinx.coroutines.launch

/**
 * Экран с [ModalBottomSheet]
 */
@Composable
internal fun BottomSheetScreen(componentKey: ComponentKey = ComponentKey.BottomSheet) {
    ComponentScaffold(
        key = componentKey,
        viewModel = viewModel<BottomSheetParametersViewModel>(
            factory = BottomSheetParametersViewModelFactory(BottomSheetUiState(), componentKey),
            key = componentKey.toString(),
        ),
        component = { uiState, style ->
            val sheetState = rememberModalBottomSheetState(
                initialValue = BottomSheetValue.Hidden,
            )
            val scope = rememberCoroutineScope()
            val scrollState = rememberScrollState()
            Button(
                label = "показать BottomSheet",
                onClick = {
                    scope.launch {
                        sheetState.show()
                    }
                },
            )
            ModalBottomSheet(
                style = style,
                sheetState = sheetState,
                dimBackground = uiState.dimBackground,
                useNativeBlackout = uiState.useNativeBlackout,
                handlePlacement = uiState.handlePlacement,
                fitContent = uiState.fitContent,
                header = { if (uiState.header && uiState.fixedHeader) Header() },
                footer = { if (uiState.footer && uiState.fixedFooter) Footer() },
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(scrollState),
                ) {
                    if (uiState.header && !uiState.fixedHeader) {
                        Header()
                    }
                    if (uiState.littleContent) {
                        SmallBody()
                    } else {
                        LargeBody()
                    }
                    if (uiState.footer && !uiState.fixedFooter) {
                        Footer()
                    }
                }
            }
        },
    )
}

@Composable
private fun Header() {
    Column(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp)
            .background(SddsServTheme.colors.surfaceDefaultSolidSecondary),
    ) {
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text("Introduction to Android Development")
        }
        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) { Divider() }
    }
}

@Composable
private fun Footer() {
    Row(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 30.dp)
            .background(SddsServTheme.colors.surfaceDefaultSolidSecondary),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text("The End")
    }
}

@Composable
private fun LargeBody() {
    Text(
        "Android operating system is the largest" +
            "installed base among various mobile platforms" +
            "across the globe. Hundreds of millions of mobile devices" +
            "are powered by Android in more than 190 countries of the world." +
            " It conquered around 71% of the global market share by the end of 2021," +
            "and this trend is growing bigger every other day." +
            "The company named Open Handset Alliance developed Android" +
            " for the first time that is based on the modified version " +
            "of the Linux kernel and other open-source software. " +
            "Google sponsored the project at initial stages and in the year 2005" +
            " it acquired the whole company. In September 2008, the first Android-powered device" +
            " was launched in the market. Android dominates the mobile OS industry" +
            " because of the long list of features it provides. It’s user-friendly," +
            " has huge community support, provides a greater extent of customization," +
            " and a large number of companies build Android-compatible smartphones." +
            " As a result, the market observes a sharp increase in the demand" +
            " for developing Android mobile applications, and with that companies" +
            " need smart developers with the right skill set. At first, the purpose" +
            " of Android was thought of as a mobile operating system. However, " +
            "with the advancement of code libraries and its popularity among developers" +
            " of the divergent domain, Android becomes an absolute set of software" +
            " for all devices like tablets, wearables, set-top boxes, smart TVs, notebooks, etc." +
            "It is stated that “If you give me six hours to chop down a tree then" +
            " I will spend the first four hours in sharpening the axe”. " +
            "So in the Android Development World if we consider Android Development " +
            "as the tree then Android Studio should be the axe. Yes, if you are starting" +
            " Android Development then you must be familiar with Android Studio i.e. the tool" +
            " that is used for developing Android applications. Android Studio is the official " +
            "IDE (Integrated Development Environment) for Android app development, and it is based o" +
            "n JetBrains’ IntelliJ IDEA software.",
    )
}

@Composable
private fun SmallBody() {
    Text(
        "Android operating system is the largest" +
            "installed base among various mobile platforms" +
            "across the globe. Hundreds of millions of mobile devices" +
            "are powered by Android in more than 190 countries of the world.",
    )
}

@Preview(showBackground = true)
@Composable
private fun CounterScreenPreview() {
    SandboxTheme {
        BottomSheetScreen()
    }
}
