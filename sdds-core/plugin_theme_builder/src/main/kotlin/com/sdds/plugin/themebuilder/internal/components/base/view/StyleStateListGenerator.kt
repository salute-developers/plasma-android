package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.selectorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Генератор StylesStateList
 * @author Малышев Александр on 10.11.2025
 */
internal class StyleStateListGenerator<S : State<String>, V : Stateful<String, out S>>(
    outputResDir: File,
    private val fileName: String,
    resourcePrefix: String,
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : ValueStateListGenerator<String, S, V>(xmlBuilderFactory) {

    override val rootElement: String = "style-selector"
    override val valueAttr: String = "app:sd_style"
    override val outputFile: File = outputResDir.selectorXmlFile(fileName, resourcePrefix)

    override fun onAddItemState(index: Int, rawValue: String, value: V, state: S, states: Set<StateListAttribute>) {
        addItem(createItem(index, rawValue, value, states))
    }

    override fun onAddItem(index: Int, rawValue: String, value: V, states: Set<StateListAttribute>) {
        addItem(createItem(index, rawValue, value, states))
    }

    override fun sortStateList(stateList: Set<StateListItem>): List<StateListItem> {
        return stateList.sortedByDescending { it.states.size }
    }

    private fun createItem(
        index: Int,
        rawValue: String,
        value: Stateful<out String, out State<String>>,
        states: Set<StateListAttribute>,
    ) = StateListItem(
        value = when (value) {
            is Typography -> resourceReferenceProvider.style(TypographyToken.getViewTextAppearanceName(rawValue))
            else -> rawValue
        },
        states = states,
    )
}
