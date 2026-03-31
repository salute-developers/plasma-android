package com.sdds.compose.uikit.internal.tabs

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.IntSize
import com.sdds.compose.uikit.LocalTabItemStyle
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.fs.FocusSelectorSettings
import com.sdds.compose.uikit.fs.LocalFocusSelectorSettings
import com.sdds.compose.uikit.fs.focusSelector

@Composable
internal fun TabItemContainer(
    modifier: Modifier = Modifier,
    stretch: Boolean,
    isSelected: Boolean,
    onClick: () -> Unit,
    onSizeMeasured: (IntSize) -> Unit,
    tabItemStyle: TabItemStyle,
    enabled: Boolean,
    tabItemContent: @Composable (Boolean) -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState()
    val fsSettings = LocalFocusSelectorSettings.current

    CompositionLocalProvider(
        LocalTabItemStyle provides tabItemStyle,
    ) {
        Box(
            propagateMinConstraints = stretch,
            modifier = modifier
                .onSizeChanged { size -> onSizeMeasured(size) }
                .focusSelector(
                    settings = FocusSelectorSettings.builder()
                        .scale(fsSettings.scale)
                        .border(fsSettings.border.copy(strokeInsets = -fsSettings.border.strokeWidth))
                        .build(),
                    shape = tabItemStyle.shape,
                ) {
                    isFocused.value
                }
                .clickable(
                    enabled = enabled,
                    indication = null,
                    interactionSource = interactionSource,
                ) { onClick.invoke() },
        ) {
            tabItemContent.invoke(isSelected)
        }
    }
}
