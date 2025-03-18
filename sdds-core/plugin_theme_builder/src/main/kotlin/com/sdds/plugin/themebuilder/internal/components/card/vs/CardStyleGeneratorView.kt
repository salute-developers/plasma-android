package com.sdds.plugin.themebuilder.internal.components.card.vs

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseName
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.card.CardProperties
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class CardStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    styleComponentName: String = coreComponentName,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<CardProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    styleComponentName = styleComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {

    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<CardProperties>,
    ) {
        with(styleElement) {
            addProps(variation, variationNode)
            addFocusSelector(variation, variationNode, FS_TARGET_CARD)
            addCardContentStyle(variation, rootDocument, variationNode)
            CardColorProperty.values().forEach {
                addColorProperties(it, variation, variationNode)
            }
        }
    }

    override fun onCreateOverlayStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<CardProperties>,
    ) = with(styleElement) {
        super.onCreateOverlayStyle(variation, rootDocument, styleElement, variationNode)
        cardContentStyleAttribute(variationNode.camelCaseName())
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<CardProperties>) {
        val props = variationNode.value.props
        props.shape?.let { shapeAttribute(variation, it.value, it.adjustment) }
        props.paddingStart?.let { dimenAttribute(variation, "android:paddingStart", "padding_start", it.value) }
        props.paddingTop?.let { dimenAttribute(variation, "android:paddingTop", "padding_top", it.value) }
        props.paddingEnd?.let { dimenAttribute(variation, "android:paddingEnd", "padding_end", it.value) }
        props.paddingBottom?.let { dimenAttribute(variation, "android:paddingBottom", "padding_bottom", it.value) }
    }

    private fun Element.addColorProperties(
        colorProperty: CardColorProperty,
        variation: String,
        variationNode: VariationNode<CardProperties>,
    ) {
        val colorValue = getColorProperty(colorProperty, variationNode)
        if (colorValue.isNullOrInherited) {
            return
        }

        when (colorValue) {
            is ColorValue.SimpleValue -> addToStateList(colorProperty, colorValue.color, variation)
            is ColorValue.ViewValue -> colorValue.colors.forEach { (colorStateName, color) ->
                addToStateList(colorProperty, color, variation, colorStateName)
            }

            else -> Unit
        }

        colorAttribute(colorProperty, variation)
    }

    private fun Element.addCardContentStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        variationNode: VariationNode<CardProperties>,
    ) {
        val props = variationNode.value.props
        val variationName = variationNode.camelCaseName()
        val overlayStyleName = "Content${variationNode.camelCaseName("")}"
        rootDocument.style(
            cardContentStyleSuffix(variationName),
            base = baseStyleName,
            parent = if (variationName.isEmpty()) "Sdds.Components.CardContent" else null,
        ) {
            props.contentShape?.let { shapeAttribute("${variation}_content", it.value, it.adjustment) }
            props.contentMinWidth?.let { dimenAttribute(variation, "android:minWidth", "content_min_width", it.value) }
            props.contentMinHeight?.let {
                dimenAttribute(
                    variation,
                    "android:minHeight",
                    "content_min_height",
                    it.value,
                )
            }
            addFocusSelector(variation, variationNode, FS_TARGET_CONTENT)
        }

        if (props.cardContentStyleEmpty()) {
            return
        }
        rootDocument.overlayStyle(overlayStyleName) {
            cardContentStyleAttribute(variationName)
        }

        componentOverlayAttribute("android:theme", "$styleComponentName$overlayStyleName")
    }

    private fun Element.addFocusSelector(
        variation: String,
        variationNode: VariationNode<CardProperties>,
        target: String,
    ) {
        val props = variationNode.value.props
        val mergedProps = variationNode.mergedProps

        val targetPropValue = mergedProps.fsTarget?.value
        // Отключаем селектор у карточки, если свойства селектора добавляются к стилю карточки, а target == content
        if (targetPropValue == FS_TARGET_CONTENT && targetPropValue != target && variation.isEmpty()) {
            valueAttribute("sd_fsEnabled", "false")
        }
        if (targetPropValue == target) {
            props.fsTarget?.value?.takeIf { it == FS_TARGET_CONTENT }?.let {
                valueAttribute("sd_fsDuplicateParentState", "true")
                valueAttribute("android:duplicateParentState", "true")
            }
            props.fsBorderMode?.let { valueAttribute("sd_fsBorderMode", it.value) }
            props.fsScaleFactor?.let { valueAttribute("sd_fsScaleFactor", it.value.toString()) }
            props.fsStrokeInset?.let { dimenAttribute(variation, "sd_fsStrokeInset", "fs_stroke_inset", it.value) }
        }
    }

    private fun Element.cardContentStyleAttribute(variationName: String) {
        componentStyleAttribute(
            "sd_cardContentStyle",
            "${styleComponentName}${cardContentStyleSuffix(variationName)}",
        )
    }

    internal enum class CardColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<CardProperties> {
        BACKGROUND_COLOR("android:backgroundTint", "bg_color"),
        ;

        override fun provide(owner: CardProperties): Color? {
            return when (this) {
                BACKGROUND_COLOR -> owner.backgroundColor
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Card"
        const val DEF_STYLE_ATTR = "sd_cardStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Card"
        const val FS_TARGET_CARD = "card"
        const val FS_TARGET_CONTENT = "content"

        private fun cardContentStyleSuffix(variationName: String): String {
            return buildString {
                append("Content")
                if (variationName.isNotBlank()) {
                    append(".")
                    append(variationName)
                }
            }
        }

        fun CardProperties.cardContentStyleEmpty(): Boolean =
            contentShape == null && fsTarget == null && fsBorderMode == null &&
                fsStrokeInset == null && fsScaleFactor == null
    }
}
