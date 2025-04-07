package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorSelectorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorXmlFile
import java.io.File

/**
 * Генератор ColorStateList
 * @author Малышев Александр on 03.12.2024
 */
internal class ColorStateListGenerator(
    private val outputResDir: File,
    private val fileName: String,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourcePrefix: String,
) : SimpleBaseGenerator {
    private val stateListItems = mutableSetOf<StateListItem>()

    /**
     * Добавляет цвет из токена [colorTokenName] с состояниями [states] и прозрачностью [alpha] в ColorStateList
     */
    fun addColor(
        type: ColorType,
        colorTokenName: String,
        states: Set<StateListAttribute> = emptySet(),
        alpha: Float? = null,
    ) {
        val newItem = StateListItem(
            type,
            "?${resourcePrefix}_${ColorToken.getAttrName(colorTokenName)}",
            states,
            alpha,
        )
        stateListItems.removeIf { it.states == newItem.states }
        stateListItems.add(newItem)
    }

    override fun generate() {
        if (stateListItems.isEmpty()) return
        val withGradient = stateListItems.any { it.type == ColorType.GRADIENT }
        val rootElement = if (withGradient) "color-selector" else "selector"
        val valueAttrName = if (withGradient) "android:value" else "android:color"
        val xmlBuilder = xmlBuilderFactory.create(
            rootAttributes = mapOf(
                "xmlns:app" to "http://schemas.android.com/apk/res-auto",
                "xmlns:android" to "http://schemas.android.com/apk/res/android",
            ),
            rootElement = rootElement,
        )
        xmlBuilder.prepareStateList(valueAttrName)
        if (withGradient) {
            xmlBuilder.build(outputResDir.colorSelectorXmlFile(fileName, resourcePrefix))
        } else {
            xmlBuilder.build(outputResDir.colorXmlFile(fileName, resourcePrefix))
        }
    }

    private fun XmlResourcesDocumentBuilder.prepareStateList(valueAttrName: String) {
        stateListItems
            .forEach { stateListItem ->
                appendBaseElement(
                    elementName = ElementName.ITEM.value,
                    attrs = mutableMapOf<String, String>().apply {
                        stateListItem.alpha?.let { put("android:alpha", it.toString()) }
                        put(valueAttrName, stateListItem.value)

                        stateListItem.states.forEach {
                            put(it.name, it.value)
                        }
                    },
                )
            }
    }

    private class StateListItem(
        val type: ColorType,
        val value: String,
        val states: Set<StateListAttribute>,
        val alpha: Float? = null,
    )

    enum class ColorType {
        COLOR,
        GRADIENT,
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
    ACTIVATED("activated", "android:state_activated"),
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

        /**
         * Искоючает из списка строк - состояний множество [AndroidState]
         */
        fun List<String>.excludeAndroidStates(): Set<String> = filter {
            fromKeyString(it) == null
        }.toSet()

        private fun fromKeyString(key: String): AndroidState? = AndroidState.values().find { it.key == key }
    }
}
