package com.sdds.compose.uikit.fixtures.stories.bottomsheet

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.ComposeBaseStory
import com.sdds.compose.uikit.BottomSheetHandlePlacement
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ModalBottomSheet
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.internal.modal.BottomSheetValue
import com.sdds.compose.uikit.internal.modal.rememberModalBottomSheetState
import com.sdds.sandbox.BottomSheetUiStatePropertiesProducer
import com.sdds.sandbox.BottomSheetUiStateTransformer
import com.sdds.sandbox.ComponentKey
import com.sdds.sandbox.Story
import com.sdds.sandbox.StoryUiState
import com.sdds.sandbox.UiState
import kotlinx.coroutines.launch

/**
 * Состояние BottomSheet
 */
@StoryUiState
data class BottomSheetUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val header: Boolean = false,
    val footer: Boolean = false,
    val fixedHeader: Boolean = false,
    val fixedFooter: Boolean = false,
    val handlePlacement: BottomSheetHandlePlacement = BottomSheetHandlePlacement.Auto,
    val fitContent: Boolean = false,
    val skipHalfExpanded: Boolean = false,
    val edgeToEdge: Boolean = true,
    val littleContent: Boolean = false,
    val dimBackground: Boolean = true,
    val useNativeBlackout: Boolean = true,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object BottomSheetStory : ComposeBaseStory<BottomSheetUiState, ModalBottomSheetStyle>(
    ComponentKey.BottomSheet,
    BottomSheetUiState(),
    BottomSheetUiStatePropertiesProducer,
    BottomSheetUiStateTransformer,
) {
    @Composable
    override fun BoxScope.Content(
        style: ModalBottomSheetStyle,
        state: BottomSheetUiState,
    ) {
        val sheetState = rememberModalBottomSheetState(
            initialValue = BottomSheetValue.Hidden,
            skipHalfExpanded = state.skipHalfExpanded,
        )
        val interactionSource = remember { MutableInteractionSource() }
        val backgroundColor = style.colors.backgroundColor.colorForInteraction(interactionSource)
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
        val bottomInsetsModifier = Modifier
            .navigationBarsPadding()
            .imePadding()
        ModalBottomSheet(
            modifier = Modifier.statusBarsPadding(),
            style = style,
            sheetState = sheetState,
            onDismiss = { Log.d("BottomSheetScreen", "OnDismiss") },
            dimBackground = state.dimBackground,
            useNativeBlackout = state.useNativeBlackout,
            handlePlacement = state.handlePlacement,
            fitContent = state.fitContent,
            edgeToEdge = state.edgeToEdge,
            header = { if (state.header && state.fixedHeader) Header(backgroundColor) },
            footer = {
                if (state.footer && state.fixedFooter) {
                    Footer(backgroundColor = backgroundColor, modifier = bottomInsetsModifier)
                }
            },
        ) {
            Column(
                modifier = Modifier
                    .then(if (!state.footer && !state.fixedFooter) bottomInsetsModifier else Modifier)
                    .verticalScroll(scrollState),
            ) {
                if (state.header && !state.fixedHeader) {
                    Header(backgroundColor)
                }
                if (state.littleContent) {
                    SmallBody()
                } else {
                    LargeBody()
                }
                if (state.footer && !state.fixedFooter) {
                    Footer(backgroundColor)
                }
            }
        }
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

@Composable
private fun Header(backgroundColor: Color) {
    Box(
        Modifier
            .fillMaxWidth()
            .heightIn(min = 60.dp)
            .background(backgroundColor),
        contentAlignment = Alignment.Center,
    ) {
        Text("Introduction to Android Development")
    }
}

@Composable
private fun Footer(
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = Modifier
            .background(backgroundColor)
            .then(modifier)
            .fillMaxWidth(),
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = "",
            placeholderText = "Для проверки клавиатуры",
            onValueChange = {},
            focusSelectorSettings = FocusSelectorSettings.None,
        )
    }
}
