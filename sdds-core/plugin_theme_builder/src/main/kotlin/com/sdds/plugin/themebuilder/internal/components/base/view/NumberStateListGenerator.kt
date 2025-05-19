package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.selectorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import java.io.File

/**
 * Генератор NumberStateList
 * @author Малышев Александр on 11.04.2025
 */
internal class NumberStateListGenerator<T : Number, S : State<T>, V : Stateful<T, out S>>(
    outputResDir: File,
    private val fileName: String,
    resourcePrefix: String,
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
) : ValueStateListGenerator<T, S, V>(xmlBuilderFactory) {

    override val rootElement: String = "number-selector"
    override val valueAttr: String = "app:sd_number"
    override val outputFile: File = outputResDir.selectorXmlFile(fileName, resourcePrefix)

    override fun onAddItemState(index: Int, rawValue: T, value: V, state: S, states: Set<StateListAttribute>) {
        addItem(createItem(index, rawValue, value, states))
    }

    override fun onAddItem(index: Int, rawValue: T, value: V, states: Set<StateListAttribute>) {
        addItem(createItem(index, rawValue, value, states))
    }

    override fun sortStateList(stateList: Set<StateListItem>): List<StateListItem> {
        return stateList.sortedByDescending { it.states.size }
    }

    private fun createItem(
        index: Int,
        rawValue: T,
        value: Stateful<out T, out State<T>>,
        states: Set<StateListAttribute>,
    ) = StateListItem(
        value = when (value) {
            is Dimension -> {
                val dimen = DimenData(
                    name = "${fileName}_value_$index",
                    value = rawValue,
                    type = DimenData.Type.DP,
                )
                dimensAggregator.addDimen(dimen)
                resourceReferenceProvider.dimen(dimen)
            }

            is FloatValue -> rawValue.toFloat().toString()
            else -> rawValue.toInt().toString()
        },
        states = states,
    )
}
