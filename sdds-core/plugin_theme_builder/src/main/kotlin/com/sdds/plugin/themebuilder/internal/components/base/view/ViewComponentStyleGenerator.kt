package com.sdds.plugin.themebuilder.internal.components.base.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.components.base.FloatValue
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.State
import com.sdds.plugin.themebuilder.internal.components.base.Stateful
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.NumberStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
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
    protected val styleComponentName: String = coreComponentName,
    private val componentParent: String,
    private val viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    private val colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    private val defStyleAttr: String,
) : ComponentStyleGenerator<T> {

    private val xmlResourceBuilder by unsafeLazy { xmlBuilderFactory.create() }
    private val dimenPrefix by unsafeLazy { styleComponentName.camelToSnakeCase() }
    private val snakeCaseStyleComponentName by unsafeLazy { styleComponentName.camelToSnakeCase() }
    protected val baseStyleName by unsafeLazy { "Components.${styleComponentName.capitalized()}" }
    private val baseOverlayStyleName by unsafeLazy { "ComponentOverlays.${styleComponentName.capitalized()}" }
    private val colorStateAttributesGenerator by unsafeLazy {
        viewColorStateGeneratorFactory.create(coreComponentName)
    }
    private val numberStateListGeneratorFactory: NumberStateListGeneratorFactory by unsafeLazy {
        NumberStateListGeneratorFactory(
            xmlBuilderFactory,
            resourcePrefix,
            outputResDir,
            dimensAggregator,
            resourceReferenceProvider,
        )
    }
    private val valueStateListGenerators =
        mutableMapOf<String?, MutableMap<Property, ValueStateListGenerator<*, *, *>?>>()

    override fun generate(config: T) {
        onGenerate(xmlResourceBuilder, config)
        colorStateAttributesGenerator.generate()
        xmlResourceBuilder.build(outputResDir.componentStyleXmlFile(styleComponentName))
        valueStateListGenerators.values.flatMap { it.values }.forEach { it?.generate() }
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
    protected fun XmlResourcesDocumentBuilder.baseStyle(
        withOverlay: Boolean = false,
        content: Element.() -> Unit = {},
    ) {
        appendStyleWithCompositePrefix(baseStyleName, componentParent) {
            content()
            if (colorStateAttributesGenerator.hasColorStates) {
                colorStateAttributesGenerator.colorStateProviderInfo.run {
                    valueAttribute(colorStateViewAttr, classCanonicalName)
                }
            }
        }
        if (withOverlay) {
            overlayStyle("") {
                valueAttribute(defStyleAttr, resourceReferenceProvider.style(baseStyleName))
            }
        }
    }

    /**
     * Добавляет стиль вариации с названием [name] и контентом [content].
     */
    protected fun XmlResourcesDocumentBuilder.variationStyle(
        name: String,
        content: Element.() -> Unit,
    ) {
        variationStyle(name, withOverlay = false, content = content)
    }

    /**
     * Добавляет стиль вариации с названием [name] и контентом [content].
     * Если [withOverlay] == true, то для стиля вариации сгенерируется ThemeOverlay
     */
    protected fun XmlResourcesDocumentBuilder.variationStyle(
        name: String,
        withOverlay: Boolean,
        overlayContent: (Element.() -> Unit)? = null,
        content: Element.() -> Unit,
    ) {
        val styleName = "$baseStyleName.${name.capitalized()}"
        appendStyleWithCompositePrefix(styleName, content = content)

        if (withOverlay) {
            overlayStyle(name) {
                valueAttribute(defStyleAttr, resourceReferenceProvider.style(styleName))
                overlayContent?.invoke(this)
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
     * Добавляет стиль с названием [name], префиксом [base], родителем [parent] и контентом [content]
     */
    protected fun XmlResourcesDocumentBuilder.style(
        name: String,
        base: String? = baseStyleName,
        parent: String? = null,
        content: Element.() -> Unit,
    ) {
        val normalizedName = name.capitalized()
        appendStyleWithCompositePrefix(
            "${base.orEmpty()}$normalizedName",
            styleParent = parent,
            content = content,
        )
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
        attrName: String? = null,
    ) = with(xmlResourceBuilder) {
        val shapeValue = if (ShapeToken.isCircle(tokenName)) {
            "?sd_shapeAppearanceCircle"
        } else {
            "?${resourcePrefix}_${ShapeToken.getAttrName(tokenName)}"
        }
        this@shapeAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = if (attrName == null) {
                "sd_shapeAppearance"
            } else {
                "sd_${attrName}ShapeAppearance"
            },
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
     * Добавляет атрибут типа gradient со значением вида ?prefix_attrName, где attrName - это преобразованный
     * [tokenName]
     */
    protected fun Element.gradientRefAttribute(
        attributeName: String,
        tokenName: String,
    ) = colorRefAttribute(attributeName, tokenName)

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
     * Добавляет атрибут типа xml со значением @xml/[xmlName]
     */
    protected fun Element.xmlRefAttribute(
        attributeName: String,
        xmlName: String,
    ) = with(xmlResourceBuilder) {
        this@xmlRefAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.xml(xmlName),
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут типа color со значением @color/[colorName]
     */
    protected fun Element.colorAttribute(
        colorProperty: ColorProperty,
        variation: String? = null,
    ) = colorAttribute(colorProperty.attribute, colorProperty.fileName(variation))

    /**
     * Добавляет атрибут типа drawable со значением [name]
     */
    protected fun Element.drawableAttribute(
        attributeName: String,
        name: String,
    ) = with(xmlResourceBuilder) {
        this@drawableAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = name,
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут типа ColorValueStateList со значением @xml/[colorName]
     */
    protected fun Element.colorValueListAttribute(
        colorProperty: ColorProperty,
        variation: String? = null,
    ) = xmlRefAttribute(colorProperty.attribute, colorProperty.fileName(variation))

    /**
     * Добавляет атрибут типа ValueStateList со значением @xml/propertyFileName
     */
    protected fun Element.valueListAttribute(
        property: Property,
        variation: String? = null,
    ) = xmlRefAttribute(property.attribute, property.fileName(variation))

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

    protected open fun addFloatToStateList(
        property: Property,
        value: FloatValue,
        variation: String? = null,
        colorStateName: String? = null,
        extraAttrs: Set<StateListAttribute> = emptySet(),
        extraStateAttrsBuilder: ((FloatState) -> Set<StateListAttribute>)? = null,
    ) {
        val stateAttrs = extraAttrs.withColorStateAttrs(colorStateName)
        val generator = getValueStateList(variation, property) {
            numberStateListGeneratorFactory.create<Float, FloatState, FloatValue>(
                property.fileName(variation?.techToSnakeCase()),
            )
        }
        generator.addValue(value, stateAttrs, extraStateAttrsBuilder)
    }

    protected open fun addDimensionToStateList(
        property: Property,
        value: Dimension,
        variation: String? = null,
        colorStateName: String? = null,
        extraAttrs: Set<StateListAttribute> = emptySet(),
        extraStateAttrsBuilder: ((FloatState) -> Set<StateListAttribute>)? = null,
    ) {
        val stateAttrs = extraAttrs.withColorStateAttrs(colorStateName)
        val generator = getValueStateList(variation, property) {
            numberStateListGeneratorFactory.create<Float, FloatState, Dimension>(
                property.fileName(variation?.techToSnakeCase()),
            )
        }
        generator.addValue(value, stateAttrs, extraStateAttrsBuilder)
    }

    /**
     * Конфигурирует ColorState для свойства [property].
     * @param extraAttrs дополнительные атрибуты состояния, которые применяются ко всему [Color].
     * @param extraStateAttrsBuilder билдер дополнительных атрибутов состояния, которые применяются к [Color.states]
     *
     */
    protected open fun addToStateList(
        property: ColorProperty,
        color: Color,
        variation: String? = null,
        colorStateName: String? = null,
        extraAttrs: Set<StateListAttribute> = emptySet(),
        extraStateAttrsBuilder: ((ColorState) -> Set<StateListAttribute>)? = null,
    ) {
        val stateAttrs = extraAttrs.withColorStateAttrs(colorStateName)
        val generator = getValueStateList(variation, property) {
            colorStateListGeneratorFactory.create(property.fileName(variation?.techToSnakeCase()))
        }
        generator.addValue(color, stateAttrs, extraStateAttrsBuilder)
    }

    @Suppress("UNCHECKED_CAST")
    private fun <Gen : ValueStateListGenerator<*, *, *>> getValueStateList(
        variationName: String?,
        property: Property,
        factory: (String) -> Gen,
    ): Gen {
        val variationStateLists = valueStateListGenerators[variationName]
            ?: mutableMapOf<Property, ValueStateListGenerator<*, *, *>?>().also {
                valueStateListGenerators[variationName] = it
            }
        return (
            variationStateLists[property] ?: factory(
                property.fileName(variationName?.techToSnakeCase()),
            ).also { variationStateLists[property] = it }
            ) as Gen
    }

    private fun Property.fileName(variationSuffix: String? = null): String = buildString {
        append(snakeCaseStyleComponentName)
        if (!variationSuffix.isNullOrBlank()) {
            append("_")
            append(variationSuffix)
        }
        if (fileSuffix.isNotBlank()) {
            append("_")
            append(fileSuffix)
        }
    }

    private fun Set<StateListAttribute>.withColorStateAttrs(colorStateName: String?): Set<StateListAttribute> {
        val colorStateAttr = colorStateName?.let {
            getColorState(it) ?: registerColorState(it)
        }?.toStateListAttribute()
        return if (colorStateAttr != null) {
            this + colorStateAttr
        } else {
            this
        }
    }
}

internal interface Property {
    val attribute: String
    val fileSuffix: String
}

/**
 * Свойство цвета компонента (цвет текста, фона и т.д.)
 */
internal interface ColorProperty : Property {
    override val attribute: String
    override val fileSuffix: String get() = colorFileSuffix

    val colorFileSuffix: String
}

/**
 * Свойство цвета компонента с возможностью получить ссылку на него из [PropertyOwner]
 */
internal interface ProvidableColorProperty<T : PropertyOwner> : ProvidableProperty<T, String, Color>, ColorProperty {

    /**
     * Возвращает [Color] для [ProvidableColorProperty] из [PropertyOwner]
     */
    override fun provide(owner: T): Color?
}

/**
 * Свойство компонента с возможностью получить ссылку на него из [PropertyOwner]
 */
internal interface ProvidableProperty<PO : PropertyOwner, RV : Any, out Value : Stateful<out RV, out State<RV>>> :
    Property {

    fun provide(owner: PO): Value?
}
