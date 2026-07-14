package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class IconPropertyMapperTest {

    @Test
    fun `возвращает ссылку на drawable без состояний`() {
        val underTest = IconPropertyMapper(null)

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value("actions.add"),
            variationId = "",
        )

        assertEquals("startIcon(com.sdds.icons.R.drawable.ic_actions_add)", builderCall)
    }

    @Test
    fun `возвращает ссылку на drawable с состояниями`() {
        val underTest = IconPropertyMapper(null)

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value(
                value = "actions.add",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "actions.remove"),
                    StringState(state = listOf("pressed", "hovered"), value = "actions.close"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "startIcon(com.sdds.icons.R.drawable.ic_actions_add." +
                "asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to com.sdds.icons.R.drawable.ic_actions_remove, " +
                "setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to com.sdds.icons.R.drawable.ic_actions_close))",
            builderCall,
        )
    }

    @Test
    fun `возвращает ссылку на drawable с кастомным stateEnum`() {
        val underTest = IconPropertyMapper(
            stateEnum = StateEnum(
                qualifiedName = "com.test.ChipState",
                simpleName = "ChipState",
                values = listOf(EnumValueInfo(name = "Selected", configName = "selected_chip")),
            ),
        )

        val builderCall = underTest.map(
            meta = iconParam(methodName = "icon"),
            tokenValue = Value(
                value = "actions.add",
                states = listOf(
                    StringState(state = listOf("selected_chip"), value = "actions.check"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "icon(com.sdds.icons.R.drawable.ic_actions_add.asStatefulValue(" +
                "setOf(ChipState.Selected) to com.sdds.icons.R.drawable.ic_actions_check))",
            builderCall,
        )
    }

    @Test
    fun `CMP-режим оборачивает иконку в imageVectorSource`() {
        val importCollector = ImportCollector()
        val underTest = IconPropertyMapper(
            stateEnum = null,
            importCollector = importCollector,
            multiplatform = true,
        )

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value("add.fill.16"),
            variationId = "",
        )

        assertEquals("startIcon(imageVectorSource(SddsIcons.AddFill16))", builderCall)
        assertTrue(
            importCollector.importList.any { it.pck == "com.sdds.compose.uikit" && it.name == "imageVectorSource" },
        )
        assertTrue(importCollector.importList.any { it.pck == "com.sdds.icons.compose" && it.name == "SddsIcons" })
        assertTrue(importCollector.importList.any { it.pck == "com.sdds.icons.compose" && it.name == "AddFill16" })
    }

    @Test
    fun `CMP-режим оборачивает иконку с состояниями в imageVectorSource`() {
        val underTest = IconPropertyMapper(
            stateEnum = null,
            importCollector = ImportCollector(),
            multiplatform = true,
        )

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value(
                value = "add.fill.16",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "remove.fill.16"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "startIcon(imageVectorSource(SddsIcons.AddFill16).asStatefulValue(" +
                "setOf(InteractiveState.Pressed) to imageVectorSource(SddsIcons.RemoveFill16)))",
            builderCall,
        )
    }

    @Test
    fun `Android-режим не меняет вывод при переданном importCollector`() {
        val underTest = IconPropertyMapper(
            stateEnum = null,
            importCollector = ImportCollector(),
            multiplatform = false,
        )

        val builderCall = underTest.map(
            meta = iconParam(methodName = "startIcon"),
            tokenValue = Value("actions.add"),
            variationId = "",
        )

        assertEquals("startIcon(com.sdds.icons.R.drawable.ic_actions_add)", builderCall)
    }

    private fun iconParam(methodName: String) = IconPropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = "",
        paramSimpleType = "",
        group = "",
    )
}
