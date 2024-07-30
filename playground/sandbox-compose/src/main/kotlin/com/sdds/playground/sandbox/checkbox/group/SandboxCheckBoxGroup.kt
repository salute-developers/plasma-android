package com.sdds.playground.sandbox.checkbox.group

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.checkbox.SandboxCheckBox
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxSettingsProvider.descriptionTextStyleFor
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxSettingsProvider.labelTextStyleFor
import com.sdds.playground.sandbox.checkbox.group.SandboxCheckBoxGroupSettingsProvider.indentFor
import com.sdds.playground.sandbox.checkbox.group.SandboxCheckBoxGroupSettingsProvider.verticalArrangementFor
import com.sdds.playground.sandbox.tokens.compose.StylesSaluteTheme

@Composable
internal fun SandboxCheckBoxGroup(
    items: List<CheckBoxGroup.Item>,
    modifier: Modifier = Modifier,
    rootItem: CheckBoxGroup.RootItem? = null,
    size: SandboxCheckBox.Size = SandboxCheckBox.Size.M,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    CheckBoxGroup(
        items = items,
        modifier = modifier,
        rootItem = rootItem,
        enabled = enabled,
        startIndent = indentFor(size),
        verticalArrangement = verticalArrangementFor(size),
        onRootStateChanged = { },
        onChildCheckedChanged = { _, _ -> },
        labelColor = StylesSaluteTheme.colors.textDefaultPrimary,
        descriptionColor = StylesSaluteTheme.colors.textDefaultSecondary,
        idleColor = StylesSaluteTheme.colors.textDefaultSecondary,
        checkedColor = StylesSaluteTheme.colors.surfaceDefaultPositive,
        focusedColor = StylesSaluteTheme.colors.surfaceDefaultSolidDefault,
        baseColor = StylesSaluteTheme.colors.textOnDarkPrimary,
        labelTextStyle = labelTextStyleFor(size),
        descriptionTextStyle = descriptionTextStyleFor(size),
        controlSize = size.controlSize,
        controlRadius = size.controlRadius,
        verticalSpacing = size.verticalSpacing,
        horizontalSpacing = size.horizontalSpacing,
        innerCheckBoxPadding = size.innerCheckBoxPadding,
        interactionSource = interactionSource,
    )
}

/**
 * Превью [SandboxCheckBox]
 */
@Composable
@Preview(showBackground = true)
fun SandboxCheckBoxPreview() {
    SandboxTheme {
        SandboxCheckBoxGroup(
            rootItem = CheckBoxGroup.RootItem(
                label = "label",
                description = "description",
            ),
            items = listOf(
                CheckBoxGroup.Item(
                    id = 1,
                    label = "label",
                    description = "description",
                    initialChecked = true,
                ),
                CheckBoxGroup.Item(
                    id = 2,
                    label = "label",
                    description = "description",
                    initialChecked = false,
                ),
            ),
            size = SandboxCheckBox.Size.M,
        )
    }
}
