package com.sdds.plugin.themebuilder.internal.components.avatar.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarProperties
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.combine
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableColorProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ProvidableProperty
import com.sdds.plugin.themebuilder.internal.components.base.view.ViewVariationGenerator
import com.sdds.plugin.themebuilder.internal.components.base.view.camelCaseValue
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
        AvatarDimensionsProperty.values().forEach {
            addDimensionProperty(it, variation, variationNode)
        }
        addProps(variation, variationNode)
        AvatarColorProperty.values().forEach {
            addColorProperty(it, variation, variationNode)
        }
    }

    private fun Element.addProps(variation: String, variationNode: VariationNode<AvatarProperties>) {
        val props = variationNode.value.props

        props.shape?.let { shapeAttribute(variation, it.value) }
        props.textStyle?.let { typographyAttribute("android:textAppearance", it.value) }
        props.statusStyle?.let { componentStyleAttribute("sd_statusStyle", it.camelCaseValue()) }
        props.badgeStyle?.let { componentStyleAttribute("sd_extraBadgeStyle", it.camelCaseValue()) }
        props.counterStyle?.let { componentStyleAttribute("sd_extraCounterStyle", it.camelCaseValue()) }
    }

    private enum class AvatarDimensionsProperty(
        override val attribute: String,
        override val fileSuffix: String,
    ) : ProvidableProperty<AvatarProperties, Float, Dimension> {
        MIN_WIDTH("android:minWidth", "min_width"),
        MAX_WIDTH("android:maxWidth", "max_width"),
        MIN_HEIGHT("android:minHeight", "min_height"),
        MAX_HEIGHT("android:maxHeight", "max_height"),
        STATUS_OFFSET_X("sd_statusOffsetX", "status_offset_x"),
        STATUS_OFFSET_Y("sd_statusOffsetY", "status_offset_y"),
        ;

        override fun provide(owner: AvatarProperties): Dimension? {
            return when (this) {
                MIN_WIDTH,
                MAX_WIDTH,
                -> owner.width
                MIN_HEIGHT,
                MAX_HEIGHT,
                -> owner.height
                STATUS_OFFSET_X -> owner.statusOffsetX
                STATUS_OFFSET_Y -> owner.statusOffsetY
            }
        }
    }

    private enum class AvatarColorProperty(
        override val attribute: String,
        override val colorFileSuffix: String,
    ) : ProvidableColorProperty<AvatarProperties> {
        BACKGROUND("sd_background", "background"),
        TEXT_COLOR("sd_textColor", "text_color"),
        STATUS_COLOR("sd_statusColor", "status_color"),
        ;

        override fun provide(owner: AvatarProperties): Color? {
            return when (this) {
                BACKGROUND -> owner.background
                TEXT_COLOR -> owner.textColor
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
