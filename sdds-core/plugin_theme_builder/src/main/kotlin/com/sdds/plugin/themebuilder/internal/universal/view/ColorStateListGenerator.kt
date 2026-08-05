package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.universal.Color
import com.sdds.plugin.themebuilder.internal.universal.ColorState
import com.sdds.plugin.themebuilder.internal.universal.Gradient
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.selectorXmlFile
import java.io.File

/**
 * Генератор ColorStateList
 * @author Малышев Александр on 03.12.2024
 */
internal class ColorStateListGenerator(
    private val outputResDir: File,
    private val fileName: String,
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourcePrefix: String,
) : ValueStateListGenerator<String, ColorState, Color>(xmlBuilderFactory) {

    private var hasGradients: Boolean = false

    override val rootElement: String
        get() = if (hasGradients) "color-selector" else "selector"
    override val valueAttr: String
        get() = if (hasGradients) "app:sd_color" else "android:color"

    override val outputFile: File
        get() = if (hasGradients) {
            outputResDir.selectorXmlFile(fileName, resourcePrefix)
        } else {
            outputResDir.colorXmlFile(fileName, resourcePrefix)
        }

    override fun onAddItemState(
        index: Int,
        rawValue: String,
        value: Color,
        state: ColorState,
        states: Set<StateListAttribute>,
    ) {
        // Градиент может появиться только под состоянием: тогда весь state-list всё
        // равно обязан стать `color-selector` в res/xml — атрибут темы указывает на
        // drawable, и `ComplexColor` из res/color на нём падает в рантайме.
        if (value.hasGradients || state.type == GRADIENT_TYPE) {
            hasGradients = true
        }
        addColorItem(
            rawValue,
            states,
            state.alpha ?: value.alpha,
        )
    }

    override fun onAddItem(index: Int, rawValue: String, value: Color, states: Set<StateListAttribute>) {
        if (value.hasGradients) {
            hasGradients = true
        }
        addColorItem(
            rawValue,
            states,
            value.alpha,
        )
    }

    /**
     * Добавляет цвет из токена [colorTokenName] с состояниями [states] и прозрачностью [alpha] в ColorStateList
     */
    private fun addColorItem(
        colorTokenName: String,
        states: Set<StateListAttribute> = emptySet(),
        alpha: Float? = null,
    ) {
        addItem(
            StateListItem(
                value = "?${resourcePrefix}_${ColorToken.getAttrName(colorTokenName)}",
                states = states,
                extraAttr = setOfNotNull(alpha?.let { StateListAttribute("android:alpha", it.toString()) }),
            ),
        )
    }
}

/**
 * Есть ли среди значений цвета градиент — в том числе под состоянием.
 */
internal val Color.hasGradients: Boolean
    get() = this is Gradient || states.orEmpty().any { it.type == GRADIENT_TYPE }

internal const val GRADIENT_TYPE = "gradient"
