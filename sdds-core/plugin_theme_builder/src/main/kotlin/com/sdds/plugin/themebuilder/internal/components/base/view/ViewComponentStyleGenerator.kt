package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.view.AndroidState.Companion.asAndroidStates
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.colorXmlFile
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.componentStyleXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.camelToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.w3c.dom.Element
import java.io.File

/**
 * Базовый генератор стилей для компонентов view system.
 * @author Малышев Александр on 02.12.2024
 */
internal abstract class ViewComponentStyleGenerator<T : ComponentConfig>(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val dimensAggregator: DimensAggregator,
    private val outputResDir: File,
    private val resourcePrefix: String,
    private val coreComponentName: String,
    private val styleComponentName: String = coreComponentName,
    private val componentParent: String,
    private val viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    private val colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    private val defStyleAttr: String,
) : ComponentStyleGenerator<T> {

    private val xmlResourceBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val dimenPrefix by unsafeLazy { styleComponentName.camelToSnakeCase() }
    private val snakeCaseStyleComponentName by unsafeLazy { styleComponentName.camelToSnakeCase() }
    private val baseStyleName by unsafeLazy { "Components.${styleComponentName.capitalized()}" }
    private val baseOverlayStyleName by unsafeLazy { "ComponentOverlays.${styleComponentName.capitalized()}" }
    private val colorStateAttributesGenerator by unsafeLazy {
        viewColorStateGeneratorFactory.create(coreComponentName)
    }
    private val stateListGenerators = mutableMapOf<String?, MutableMap<ColorProperty, ColorStateListGenerator?>>()

    override fun generate(config: T) {
        onGenerate(xmlResourceBuilder, config)
        colorStateAttributesGenerator.generate()
        xmlResourceBuilder.build(outputResDir.componentStyleXmlFile(styleComponentName))
        stateListGenerators.values.flatMap { it.values }.forEach { it?.generate() }
    }

    abstract fun onGenerate(xmlResourcesBuilder: XmlResourcesDocumentBuilder, config: T)

    /**
     * Добавляет ColorState с названием [name]
     * @param name название ColorState, а также вариации цвета
     */
    protected open fun registerColorState(name: String): ColorStateAttribute {
        return colorStateAttributesGenerator.registerColorState(name)
    }

    /**
     * Возвращает ColorState с названием [name]
     * @param name название ColorState, а также вариации цвета
     */
    protected open fun getColorState(name: String): ColorStateAttribute? {
        return colorStateAttributesGenerator.getColorStateAttribute(name)
    }

    /**
     * Добавляет базовый стиль компонента с контентом [content].
     */
    protected fun XmlResourcesDocumentBuilder.baseStyle(content: Element.() -> Unit = {}) {
        appendStyleWithCompositePrefix(baseStyleName, componentParent) {
            stateListGenerators.forEach { (variationName, stateLists) ->
                stateLists.forEach { (property, _) ->
                    colorAttribute(property.attribute, property.colorFileName(variationName))
                }
            }
            colorStateAttributesGenerator.colorStateProviderInfo.run {
                valueAttribute(colorStateViewAttr, classCanonicalName)
            }
            content()
        }
    }

    /**
     * Добавляет стиль вариации с названием [name] и контентом [content].
     */
    protected fun XmlResourcesDocumentBuilder.variationStyle(
        name: String,
        content: Element.() -> Unit,
    ) {
        variationStyle(name, false, content)
    }

    /**
     * Добавляет стиль вариации с названием [name] и контентом [content].
     * Если [withOverlay] == true, то для стиля вариации сгенерируется ThemeOverlay
     */
    protected fun XmlResourcesDocumentBuilder.variationStyle(
        name: String,
        withOverlay: Boolean,
        content: Element.() -> Unit,
    ) {
        val styleName = "$baseStyleName.${name.capitalized()}"
        appendStyleWithCompositePrefix(styleName, content = content)

        if (withOverlay) {
            overlayStyle(name) {
                valueAttribute(defStyleAttr, resourceReferenceProvider.style(styleName))
            }
        }
    }

    /**
     * Добавляет ThemeOverlay стиль с названием [name] и контентом [content]
     */
    protected fun XmlResourcesDocumentBuilder.overlayStyle(
        name: String,
        base: String = baseOverlayStyleName,
        content: Element.() -> Unit,
    ) {
        val normalizedName = name.techToCamelCase()
        appendStyleWithCompositePrefix("$base$normalizedName", content = content)
    }

    /**
     * Добавляет атрибут типа shapeAppearance со значением ?sd_shapeAppearanceCircle
     */
    protected fun Element.circleShapeAttribute() = with(xmlResourceBuilder) {
        this@circleShapeAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = "sd_shapeAppearance",
            value = "?sd_shapeAppearanceCircle",
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут типа shapeAppearance со значением ?prefix_shapeAttr,
     * где shapeAttr - это преобразованный [tokenName].
     * Добавляет sd_shapeAppearanceAdjustment, если [adjustment] != null
     */
    protected fun Element.shapeAttribute(
        variation: String,
        tokenName: String,
        adjustment: Float? = null,
    ) = with(xmlResourceBuilder) {
        val shapeValue = if (ShapeToken.isCircle(tokenName)) {
            "?sd_shapeAppearanceCircle"
        } else {
            "?${resourcePrefix}_${ShapeToken.getAttrName(tokenName)}"
        }
        this@shapeAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = "sd_shapeAppearance",
            value = shapeValue,
            usePrefix = false,
        )
        val normalizedAdjustment = adjustment.takeIf { it != 0f } ?: return@with
        dimenAttribute(variation, "sd_shapeAppearanceAdjustment", "shape_adjustment", normalizedAdjustment)
    }

    /**
     * Добавляет атрибут типа textAppearance со значением @style/TextAppearanceStyle,
     * где TextAppearanceStyle - это преобразованный [tokenName]
     */
    protected fun Element.typographyAttribute(
        attributeName: String,
        tokenName: String,
    ) = with(xmlResourceBuilder) {
        this@typographyAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.style(TypographyToken.getViewTextAppearanceName(tokenName)),
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут типа color со значением вида ?prefix_attrName, где attrName - это преобразованный
     * [tokenName]
     */
    protected fun Element.colorRefAttribute(
        attributeName: String,
        tokenName: String,
    ) = with(xmlResourceBuilder) {
        this@colorRefAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = "?${resourcePrefix}_${ColorToken.getAttrName(tokenName)}",
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут со значением
     */
    protected fun Element.valueAttribute(
        attributeName: String,
        value: String,
    ) = with(xmlResourceBuilder) {
        this@valueAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = value,
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут со значением вида @style/ComponentOverlays.styleName, где [styleName] - стиль компонента
     */
    protected fun Element.componentOverlayAttribute(
        attributeName: String,
        styleName: String,
    ) = with(xmlResourceBuilder) {
        this@componentOverlayAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.style("ComponentOverlays.$styleName"),
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут со значением вида @style/Components.styleName, где [styleName] - стиль компонента
     */
    protected fun Element.componentStyleAttribute(
        attributeName: String,
        styleName: String,
    ) = with(xmlResourceBuilder) {
        this@componentStyleAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.style("Components.$styleName"),
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут со значением ColorState
     */
    protected fun Element.colorStateAttribute(
        value: String,
    ) = valueAttribute(
        attributeName = colorStateAttributesGenerator.colorStateInfo.colorStateViewAttr,
        value = value,
    )

    /**
     * Добавляет атрибут типа color со значением @color/[colorName]
     */
    protected fun Element.colorAttribute(
        attributeName: String,
        colorName: String,
    ) = with(xmlResourceBuilder) {
        this@colorAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.color(colorName),
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут типа color со значением @color/[colorName]
     */
    protected fun Element.colorAttribute(
        colorProperty: ColorProperty,
        variation: String? = null,
    ) = colorAttribute(colorProperty.attribute, colorProperty.colorFileName(variation))

    /**
     * Добавляет атрибут типа dimen
     */
    protected fun Element.dimenAttribute(
        variation: String,
        elementName: String,
        dimenName: String,
        value: Float,
    ) = with(xmlResourceBuilder) {
        val dimen = DimenData(
            name = listOfNotNull(dimenPrefix, variation.takeIf { it.isNotBlank() }, dimenName)
                .joinToString("_"),
            value = value,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(dimen)
        this@dimenAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = elementName,
            value = resourceReferenceProvider.dimen(dimen),
            usePrefix = false,
        )
    }

    /**
     * Конфигурирует ColorState для свойства [property].
     */
    protected fun addToStateList(
        property: ColorProperty,
        block: ColorStateListGenerator.() -> Unit,
    ) {
        addToStateList(null, property, block)
    }

    /**
     * Конфигурирует ColorState для свойства [property].
     */
    protected fun addToStateList(
        property: ColorProperty,
        color: Color,
        variation: String? = null,
        colorStateName: String? = null,
        extraAttrs: Set<StateListAttribute> = emptySet(),
    ) {
        val colorStateAttr = colorStateName?.let {
            getColorState(it) ?: registerColorState(it)
        }?.toStateListAttribute()
        val stateAttrs = if (colorStateAttr != null) {
            extraAttrs + colorStateAttr
        } else {
            extraAttrs
        }
        addToStateList(variation, property) {
            color.states?.forEach { colorState ->
                val androidStateAttrs = colorState.state.asAndroidStates()
                    .map { it.toStateListAttribute() }
                addColor(colorState.value, stateAttrs + androidStateAttrs, alpha = color.alpha)
            }
            addColor(color.default, stateAttrs, alpha = color.alpha)
        }
    }

    private fun addToStateList(
        variationName: String?,
        property: ColorProperty,
        block: ColorStateListGenerator.() -> Unit,
    ) {
        val variationStateLists = stateListGenerators[variationName]
            ?: mutableMapOf<ColorProperty, ColorStateListGenerator?>().also {
                stateListGenerators[variationName] = it
            }
        val generator = variationStateLists[property] ?: colorStateListGeneratorFactory.create(
            outputResDir.colorXmlFile(
                fileName = property.colorFileName(variationName?.techToSnakeCase()),
                prefix = resourcePrefix,
            ),
        ).also { variationStateLists[property] = it }

        generator.block()
    }

    private fun ColorProperty.colorFileName(variationSuffix: String? = null): String = buildString {
        append(snakeCaseStyleComponentName)
        if (!variationSuffix.isNullOrBlank()) {
            append("_")
            append(variationSuffix)
        }
        if (colorFileSuffix.isNotBlank()) {
            append("_")
            append(colorFileSuffix)
        }
    }
}

/**
 * Свойство цвета компонента (цвет текста, фона и т.д.)
 */
internal interface ColorProperty {
    val attribute: String
    val colorFileSuffix: String
}

/**
 * Свойство цвета компонента с возможностью получить ссылку на него из [PropertyOwner]
 */
internal interface ProvidableColorProperty<T : PropertyOwner> : ColorProperty {

    /**
     * Возвращает [Color] для [ProvidableColorProperty] из [PropertyOwner]
     */
    fun provide(owner: T): Color?
}
