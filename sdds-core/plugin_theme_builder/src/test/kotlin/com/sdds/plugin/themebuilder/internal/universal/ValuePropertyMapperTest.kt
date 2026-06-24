package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ValuePropertyMapperTest {

    @Test
    fun `возвращает enum значение без состояний`() {
        val underTest = ValuePropertyMapper(null, ImportCollector())

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner", "None"),
            ),
            tokenValue = Value("outer"),
            variationId = "",
        )

        assertEquals("placement(TextFieldLabelPlacement.Outer)", builderCall)
    }

    @Test
    fun `возвращает enum значение с состояниями`() {
        val underTest = ValuePropertyMapper(null, ImportCollector())

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner", "None"),
            ),
            tokenValue = Value(
                value = "outer",
                states = listOf(
                    StringState(state = listOf("pressed"), value = "inner"),
                    StringState(state = listOf("pressed", "hovered"), value = "none"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "placement(TextFieldLabelPlacement.Outer.asStatefulValue(setOf(InteractiveState.Pressed) " +
                "to TextFieldLabelPlacement.Inner, setOf(InteractiveState.Pressed, InteractiveState.Hovered) " +
                "to TextFieldLabelPlacement.None))",
            builderCall,
        )
    }

    @Test
    fun `возвращает enum значение с кастомным state enum`() {
        val underTest = ValuePropertyMapper(
            importCollector = ImportCollector(),
            stateEnum = StateEnum(
                qualifiedName = "com.test.TextFieldState",
                simpleName = "TextFieldState",
                values = listOf(
                    EnumValueInfo(name = "Focused", configName = "activated"),
                    EnumValueInfo(name = "Hovered", configName = "moved"),
                ),
            ),
        )

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner", "None"),
            ),
            tokenValue = Value(
                value = "outer",
                states = listOf(
                    StringState(state = listOf("activated"), value = "inner"),
                    StringState(state = listOf("activated", "moved"), value = "none"),
                ),
            ),
            variationId = "",
        )

        assertEquals(
            "placement(TextFieldLabelPlacement.Outer.asStatefulValue(setOf(TextFieldState.Focused) " +
                "to TextFieldLabelPlacement.Inner, setOf(TextFieldState.Focused, TextFieldState.Hovered) " +
                "to TextFieldLabelPlacement.None))",
            builderCall,
        )
    }

    @Test
    fun `возвращает первый элемент для значения default`() {
        val underTest = ValuePropertyMapper(null, ImportCollector())

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "size",
                paramSimpleType = "ButtonSize",
                values = listOf("Large", "Medium", "Small"),
            ),
            tokenValue = Value("default"),
            variationId = "",
        )

        assertEquals("size(ButtonSize.Large)", builderCall)
    }

    @Test
    fun `сопоставляет по суффиксу для составных имён`() {
        val underTest = ValuePropertyMapper(null, ImportCollector())

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "size",
                paramSimpleType = "ButtonSize",
                values = listOf("Large", "Medium"),
            ),
            tokenValue = Value("button-large"),
            variationId = "",
        )

        assertEquals("size(ButtonSize.Large)", builderCall)
    }

    @Test
    fun `возвращает пустую строку для неизвестного значения`() {
        val underTest = ValuePropertyMapper(null, ImportCollector())

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner"),
            ),
            tokenValue = Value("invalid-value"),
            variationId = "",
        )

        assertEquals("", builderCall)
    }

    @Test
    fun `сопоставляет регистронезависимо`() {
        val underTest = ValuePropertyMapper(null, ImportCollector())

        val builderCall = underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer", "Inner"),
            ),
            tokenValue = Value("OUTER"),
            variationId = "",
        )

        assertEquals("placement(TextFieldLabelPlacement.Outer)", builderCall)
    }

    @Test
    fun `добавляет импорт для параметра с перечислением`() {
        val importCollector = ImportCollector()
        val underTest = ValuePropertyMapper(null, importCollector)

        underTest.map(
            meta = valueParam(
                methodName = "placement",
                paramSimpleType = "TextFieldLabelPlacement",
                values = listOf("Outer"),
                paramQualifiedType = "com.sdds.uikit.TextFieldLabelPlacement",
            ),
            tokenValue = Value("outer"),
            variationId = "",
        )

        assertTrue(
            importCollector.importList.contains(
                ImportCollector.Import("com.sdds.uikit", "TextFieldLabelPlacement"),
            ),
        )
    }

    private fun valueParam(
        methodName: String,
        paramSimpleType: String,
        values: List<String>,
        paramQualifiedType: String = "",
    ) = ValuePropertyMeta(
        id = "",
        methodName = methodName,
        paramName = "",
        paramQualifiedType = paramQualifiedType,
        paramSimpleType = paramSimpleType,
        group = "",
        values = values.map { EnumValueInfo(name = it) },
    )
}
