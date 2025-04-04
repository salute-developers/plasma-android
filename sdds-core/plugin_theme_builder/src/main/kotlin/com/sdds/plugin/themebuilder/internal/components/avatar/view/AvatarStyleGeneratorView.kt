package com.sdds.plugin.themebuilder.internal.components.avatar.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarProperties
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorStateListGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.ColorValue
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
import com.sdds.plugin.themebuilder.internal.components.base.view.combine
import com.sdds.plugin.themebuilder.internal.components.base.view.isNullOrInherited
import com.sdds.plugin.themebuilder.internal.components.base.view.type
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import org.w3c.dom.Element
import java.io.File

internal class AvatarStyleGeneratorView(
    xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    resourceReferenceProvider: ResourceReferenceProvider,
    dimensAggregator: DimensAggregator,
    outputResDir: File,
    resourcePrefix: String,
    coreComponentName: String = CORE_COMPONENT_NAME,
    componentParent: String = COMPONENT_PARENT,
    viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    defStyleAttr: String = DEF_STYLE_ATTR,
) : ViewVariationGenerator<AvatarProperties>(
    xmlBuilderFactory = xmlBuilderFactory,
    resourceReferenceProvider = resourceReferenceProvider,
    dimensAggregator = dimensAggregator,
    outputResDir = outputResDir,
    resourcePrefix = resourcePrefix,
    coreComponentName = coreComponentName,
    componentParent = componentParent,
    viewColorStateGeneratorFactory = viewColorStateGeneratorFactory,
    colorStateListGeneratorFactory = colorStateListGeneratorFactory,
    defStyleAttr = defStyleAttr,
) {

    override fun onCreateStyle(
        variation: String,
        rootDocument: XmlResourcesDocumentBuilder,
        styleElement: Element,
        variationNode: VariationNode<AvatarProperties>,
    ) = with(styleElement) {
        addProps(variation, variationNode)
        AvatarColorProperty.values().forEach {
            addColorProperties(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<AvatarProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value) }
        props.textStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.width?.let {
            dimenAttribute(variation, "android:minWidth", "min_width", it.value)
            dimenAttribute(variation, "android:maxWidth", "max_width", it.value)
        }
        props.height?.let {
            dimenAttribute(variation, "android:minHeight", "min_height", it.value)
            dimenAttribute(variation, "android:maxHeight", "max_height", it.value)
        }
        props.statusOffsetX?.let { dimenAttribute(variation, "sd_statusOffsetX", "status_offset_x", it.value) }
        props.statusOffsetY?.let { dimenAttribute(variation, "sd_statusOffsetY", "status_offset_y", it.value) }

        props.statusStyle?.let { componentStyleAttribute("sd_statusStyle", it.camelCaseValue()) }
        props.badgeStyle?.let { componentStyleAttribute("sd_extraBadgeStyle", it.camelCaseValue()) }
        props.counterStyle?.let { componentStyleAttribute("sd_extraCounterStyle", it.camelCaseValue()) }
        props.textColor.takeIf { it is Gradient }?.let {
            gradientRefAttribute("sd_textShaderStyle", it.default)
        }
    }

    private fun Element.addColorProperties(
        colorProperty: AvatarColorProperty,
        variation: String,
        variationNode: VariationNode<AvatarProperties>,
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
        when (colorValue?.type) {
            ColorStateListGenerator.ColorType.COLOR -> colorAttribute(colorProperty, variation)
            ColorStateListGenerator.ColorType.GRADIENT -> drawableAttribute(colorProperty, variation)
            null -> Unit
        }
    }

    private enum class AvatarColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<AvatarProperties> {
        // Берем аттрибут background из app-compat, чтобы поддержать установку alpha в xml
        BACKGROUND("background", "background"),
        TEXT_COLOR("android:textColor", "text_color"),
        STATUS_COLOR("sd_statusColor", "status_color"),
        ;

        override fun provide(owner: AvatarProperties): Color? {
            return when (this) {
                BACKGROUND -> owner.background
                // android:textColor может быть только простым цветом,
                // а кейс с градиентом обрабатывается в другом месте
                TEXT_COLOR -> owner.textColor.takeIf { it is SolidColor }
                STATUS_COLOR ->
                    // Комбинируем два цвета в один ColorStateList, чтобы не заводить в API два поля
                    owner.inactiveStatusColor
                        ?.combine(owner.activeStatusColor, withState = "app:sd_status_active")
            }
        }
    }

    private companion object {
        const val CORE_COMPONENT_NAME = "Avatar"
        const val DEF_STYLE_ATTR = "sd_avatarStyle"
        const val COMPONENT_PARENT = "Sdds.Components.Avatar"
    }
}
