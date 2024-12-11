package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import java.io.File

/**
 * Генератор ColorStateList
 * @author Малышев Александр on 03.12.2024
 */
internal class ColorStateListGenerator(
    private val outputFile: File,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourcePrefix: String,
) : SimpleBaseGenerator {

    private val xmlBuilder by unsafeLazy {
        xmlBuilderFactory.create(
            rootAttributes = mapOf(
                "xmlns:app" to "http://schemas.android.com/apk/res-auto",
                "xmlns:android" to "http://schemas.android.com/apk/res/android",
            ),
            rootElement = "selector",
        )
    }

    private val stateListItems = mutableSetOf<StateListItem>()

    fun addFrom(other: ColorStateListGenerator) {
        stateListItems.addAll(other.stateListItems)
    }

    /**
     * Добавляет цвет из токена [colorTokenName] с состояниями [states] и прозрачностью [alpha] в ColorStateList
     */
    fun addColor(
        colorTokenName: String,
        states: Set<StateListAttribute> = emptySet(),
        alpha: Float? = null,
    ) {
        val newItem = StateListItem(
            "?${resourcePrefix}_${ColorToken.getAttrName(colorTokenName)}",
            states,
            alpha,
        )
        stateListItems.removeIf { it.states == newItem.states }
        stateListItems.add(newItem)
    }

    override fun generate() {
        if (stateListItems.isEmpty()) return
        prepareStateList()
        xmlBuilder.build(outputFile)
    }

    private fun prepareStateList() = with(xmlBuilder) {
        stateListItems
            .sortedByDescending { it.priority }.forEach { stateListItem ->
                appendBaseElement(
                    elementName = ElementName.ITEM.value,
                    attrs = mutableMapOf<String, String>().apply {
                        stateListItem.alpha?.let { put("android:alpha", it.toString()) }
                        put("android:color", stateListItem.value)

                        stateListItem.states.forEach {
                            put(it.name, it.value)
                        }
                    },
                )
            }
    }

    private data class StateListItem(
        val value: String,
        val states: Set<StateListAttribute>,
        val alpha: Float? = null,
    ) {

        val priority: Int = states.size + states.size
    }
}

/**
 * Атрибут элемента в ColorStateList
 */
internal data class StateListAttribute(val name: String, val value: String)

/**
 * Состояния из AndroidSDK
 */
internal enum class AndroidState(val key: String, private val attribute: String) {
    FOCUSED("focused", "android:state_focused"),
    PRESSED("pressed", "android:state_pressed"),
    HOVERED("hovered", "android:state_hovered"),
    ;

    /**
     * Преобразует [AndroidState] в [StateListAttribute]
     */
    fun toStateListAttribute(enabled: Boolean = true) = StateListAttribute(attribute, enabled.toString())

    companion object {

        /**
         * Преобразует список строк в множество [AndroidState], если строка является ключом [AndroidState.key]
         */
        fun List<String>.asAndroidStates(): Set<AndroidState> = mapNotNull { fromKeyString(it) }.toSet()

        private fun fromKeyString(key: String): AndroidState? = AndroidState.values().find { it.key == key }
    }
}
