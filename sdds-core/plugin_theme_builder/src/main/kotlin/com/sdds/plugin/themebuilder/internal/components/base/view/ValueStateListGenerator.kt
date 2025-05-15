package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.view.AndroidState.Companion.asAndroidStates
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import java.io.File

/**
 * Генератор ValueStateList
 * @author Малышев Александр on 11.04.2025
 */
internal abstract class ValueStateListGenerator<Raw : Any, S : State<Raw>, Value : Stateful<out Raw, out S>>(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
) : SimpleBaseGenerator {
    private val _stateListItems = mutableSetOf<StateListItem>()

    protected abstract val rootElement: String
    protected abstract val valueAttr: String
    protected abstract val outputFile: File

    protected val items: Set<StateListItem> get() = _stateListItems

    /**
     * Добавляет цвет из токена [colorTokenName] с состояниями [states] и прозрачностью [alpha] в ColorStateList
     */
    protected fun addItem(item: StateListItem) {
        _stateListItems.removeIf { it.states == item.states }
        _stateListItems.add(item)
    }

    protected open fun sortStateList(stateList: Set<StateListItem>): List<StateListItem> {
        return stateList.toList()
    }

    fun addValue(
        value: Value,
        stateAttrs: Set<StateListAttribute> = emptySet(),
        extraStateAttrsBuilder: ((S) -> Set<StateListAttribute>)? = null,
    ) {
        value.states?.forEach { valueState ->
            val androidStates = valueState.state.asAndroidStates()
            val extraStateAttrs = extraStateAttrsBuilder?.invoke(valueState) ?: emptySet()
            val androidStateAttrs = androidStates.map { it.toStateListAttribute() }
                .filter { !extraStateAttrs.contains(it) }
            val states = stateAttrs + androidStateAttrs + extraStateAttrs
            onAddItemState(items.size, valueState.value, value, valueState, states)
        }
        onAddItem(items.size, value.value, value, stateAttrs)
    }

    protected abstract fun onAddItem(
        index: Int,
        rawValue: Raw,
        value: Value,
        states: Set<StateListAttribute>,
    )

    protected abstract fun onAddItemState(
        index: Int,
        rawValue: Raw,
        value: Value,
        state: S,
        states: Set<StateListAttribute>,
    )

    override fun generate() {
        if (_stateListItems.isEmpty()) return
        val xmlBuilder = xmlBuilderFactory.create(
            rootAttributes = mapOf(
                "xmlns:app" to "http://schemas.android.com/apk/res-auto",
                "xmlns:android" to "http://schemas.android.com/apk/res/android",
            ),
            rootElement = rootElement,
        )
        xmlBuilder.prepareStateList(valueAttr)
        xmlBuilder.build(outputFile)
    }

    private fun XmlResourcesDocumentBuilder.prepareStateList(valueAttrName: String) {
        sortStateList(_stateListItems)
            .forEach { stateListItem ->
                appendBaseElement(
                    elementName = ElementName.ITEM.value,
                    attrs = mutableMapOf<String, String>().apply {
                        stateListItem.extraAttr.forEach { put(it.name, it.value) }
                        put(valueAttrName, stateListItem.value)
                        stateListItem.states.forEach {
                            put(it.name, it.value)
                        }
                    },
                )
            }
    }

    internal class StateListItem(
        val value: String,
        val states: Set<StateListAttribute>,
        val extraAttr: Set<StateListAttribute> = emptySet(),
    )
}

/**
 * Атрибут элемента в ValueStateList
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
    CHECKED("checked", "android:state_checked"),
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
