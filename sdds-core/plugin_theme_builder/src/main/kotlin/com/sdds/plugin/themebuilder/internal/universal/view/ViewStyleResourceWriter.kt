package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.ColorStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.NumberStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.StyleStateListGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.ViewColorStateGeneratorFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.universal.Color
import com.sdds.plugin.themebuilder.internal.universal.ColorState
import com.sdds.plugin.themebuilder.internal.universal.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.universal.Dimension
import com.sdds.plugin.themebuilder.internal.universal.FloatState
import com.sdds.plugin.themebuilder.internal.universal.FloatValue
import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Typography
import com.sdds.plugin.themebuilder.internal.universal.VariationReference
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
 * Записывает View-стили и связанные ресурсы одного вида компонента.
 *
 * Класс не знает о структуре конфига или мете: он инкапсулирует XML DSL, регистрацию
 * ссылок на вариации, `ColorState`, dimen-ресурсы и накопители state-list. Обход
 * дерева выполняет [ViewVariationTreeProcessor], а решения об эмиссии принимает
 * [UniversalViewVariationGenerator].
 */
internal class ViewStyleResourceWriter(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val dimensAggregator: DimensAggregator,
    private val outputResDir: File,
    private val resourcePrefix: String,
    private val coreComponentName: String,
    private val styleComponentName: String = coreComponentName,
    colorStateComponentName: String = coreComponentName,
    private val componentParent: String,
    private val viewColorStateGeneratorFactory: ViewColorStateGeneratorFactory,
    private val colorStateListGeneratorFactory: ColorStateListGeneratorFactory,
    private val defStyleAttr: String,
) {

    internal val document by unsafeLazy { xmlBuilderFactory.create() }
    private val dimenPrefix by unsafeLazy { styleComponentName.camelToSnakeCase() }
    private val snakeCaseStyleComponentName by unsafeLazy { styleComponentName.camelToSnakeCase() }
    private val baseStyleName by unsafeLazy { "Components.${styleComponentName.capitalized()}" }
    private val baseOverlayStyleName by unsafeLazy { "ComponentOverlays.${styleComponentName.capitalized()}" }
    private val colorStateAttributesGenerator by unsafeLazy {
        viewColorStateGeneratorFactory.create(colorStateComponentName)
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
    private val stylesStateListGeneratorFactory: StyleStateListGeneratorFactory by unsafeLazy {
        StyleStateListGeneratorFactory(
            xmlBuilderFactory,
            resourcePrefix,
            outputResDir,
            resourceReferenceProvider,
        )
    }
    private val valueStateListGenerators =
        mutableMapOf<String?, MutableMap<ViewProperty<*>, ValueStateListGenerator<*, *, *>?>>()

    private val variations: MutableMap<String, VariationReference> = mutableMapOf()
    private val variationOverlays: MutableMap<String, VariationReference> = mutableMapOf()

    /**
     * Обращался ли **этот** вид компонента к цветовым состояниям.
     *
     * Генератор `ColorState` общий для всех видов класса uikit, поэтому его
     * `hasColorStates` отвечает за весь класс: у второго вида он был бы уже `true` от
     * состояний первого, и `sd_colorStateProvider` попадал бы в стиль вида, который сам
     * состояний не использует. Признак ведётся локально, чтобы вывод не зависел от
     * порядка генерации видов.
     */
    private var usesColorStates: Boolean = false

    /**
     * Завершает запись накопленных ресурсов и возвращает ссылки на стили.
     */
    internal fun finish(): ComponentStyleGenerator.Result.Xml {
        colorStateAttributesGenerator.generate()
        document.build(outputResDir.componentStyleXmlFile(styleComponentName))
        valueStateListGenerators.values.flatMap { it.values }.forEach { it?.generate() }

        if (variations.isEmpty()) {
            variations["default"] = VariationReference(
                "${document.resPrefix}.$baseStyleName",
            )
            variationOverlays["default"] = VariationReference(
                "${document.resPrefix}.$baseOverlayStyleName",
            )
        }

        return ComponentStyleGenerator.Result.Xml(
            coreName = coreComponentName.capitalized(),
            styleName = styleComponentName.capitalized(),
            variations = variations,
            overlays = variationOverlays,
        )
    }

    /**
     * Добавляет ColorState с названием [name]
     * @param name название ColorState, а также вариации цвета
     */
    internal fun registerColorState(name: String): ColorStateAttribute {
        return colorStateAttributesGenerator.registerColorState(name).also { usesColorStates = true }
    }

    /**
     * Возвращает ColorState с названием [name]
     * @param name название ColorState, а также вариации цвета
     */
    internal fun getColorState(name: String): ColorStateAttribute? {
        return colorStateAttributesGenerator.getColorStateAttribute(name)?.also { usesColorStates = true }
    }

    /**
     * Добавляет базовый стиль компонента с контентом [content].
     */
    internal fun XmlResourcesDocumentBuilder.baseStyle(
        withOverlay: Boolean = false,
        content: Element.() -> Unit = {},
    ) {
        appendStyleWithCompositePrefix(baseStyleName, componentParent) {
            content()
            if (usesColorStates) {
                colorStateAttributesGenerator.colorStateProviderInfo.run {
                    valueAttribute(colorStateViewAttr, classCanonicalName)
                }
            }
        }
        if (withOverlay) {
            overlayStyle("", rawVariationName = "") {
                valueAttribute(defStyleAttr, resourceReferenceProvider.style(baseStyleName))
            }
        }
    }

    /**
     * Добавляет стиль вариации с названием [name] и контентом [content].
     * Если [withOverlay] == true, то для стиля вариации сгенерируется ThemeOverlay
     */
    internal fun XmlResourcesDocumentBuilder.variationStyle(
        name: String,
        withOverlay: Boolean,
        overlayContent: (Element.() -> Unit)? = null,
        rawVariationName: String? = null,
        content: Element.() -> Unit,
    ) {
        val styleName = "$baseStyleName.${name.capitalized()}"
        appendStyleWithCompositePrefix(styleName, content = content)
        if (rawVariationName != null) {
            variations[rawVariationName] = VariationReference("${document.resPrefix}.$styleName")
        }
        if (withOverlay) {
            overlayStyle(name, rawVariationName = rawVariationName) {
                valueAttribute(defStyleAttr, resourceReferenceProvider.style(styleName))
                overlayContent?.invoke(this)
            }
        }
    }

    /**
     * Добавляет ThemeOverlay стиль с названием [name] и контентом [content]
     */
    internal fun XmlResourcesDocumentBuilder.overlayStyle(
        name: String,
        base: String = baseOverlayStyleName,
        rawVariationName: String? = null,
        content: Element.() -> Unit,
    ) {
        val normalizedName = name.techToCamelCase()
        if (rawVariationName != null) {
            variationOverlays[rawVariationName] =
                VariationReference("${document.resPrefix}.$base$normalizedName")
        }
        appendStyleWithCompositePrefix("$base$normalizedName", content = content)
    }

    /**
     * Добавляет стиль с названием [name], префиксом [base], родителем [parent] и контентом [content]
     */
    internal fun XmlResourcesDocumentBuilder.style(
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
     * Добавляет атрибут типа shapeAppearance со значением ?prefix_shapeAttr,
     * где shapeAttr - это преобразованный [tokenName].
     * Добавляет sd_shapeAppearanceAdjustment, если [adjustment] != null
     */
    internal fun Element.shapeAttribute(
        variation: String,
        tokenName: String,
        adjustment: Float? = null,
        attrName: String? = null,
    ) = with(document) {
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
        // Атрибут в стиле один на все формы компонента: два владельца с ненулевым
        // adjustment дали бы одинаковый <item> дважды — это ошибка разметки, а не вывода.
        if (this@shapeAttribute.hasItem(SHAPE_ADJUSTMENT_ATTR)) {
            throw ThemeBuilderException(
                "Стиль уже содержит $SHAPE_ADJUSTMENT_ATTR: у компонента больше одного " +
                    "shape-свойства с ненулевым adjustment. Оставьте владельцем одно из них " +
                    "через sdds:api_shape_adjustment.",
            )
        }
        dimenAttribute(variation, SHAPE_ADJUSTMENT_ATTR, "shape_adjustment", normalizedAdjustment)
    }

    private fun Element.hasItem(attrName: String): Boolean {
        val items = childNodes
        for (index in 0 until items.length) {
            val item = items.item(index) as? Element ?: continue
            if (item.getAttribute("name") == attrName) return true
        }
        return false
    }

    /**
     * Добавляет атрибут типа shadowAppearance со значением ?prefix_shadowAttr,
     * где shapeAttr - это преобразованный [tokenName].
     */
    internal fun Element.shadowAttribute(tokenName: String) = with(document) {
        val shadowValue = "?${resourcePrefix}_${ShadowToken.getAttrName(tokenName)}"
        this@shadowAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = "sd_shadowAppearance",
            value = shadowValue,
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут типа textAppearance со значением @style/TextAppearanceStyle,
     * где TextAppearanceStyle - это преобразованный [tokenName]
     */
    internal fun Element.typographyAttribute(
        attributeName: String,
        tokenName: String,
    ) = with(document) {
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
    internal fun Element.colorRefAttribute(
        attributeName: String,
        tokenName: String,
    ) = with(document) {
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
    internal fun Element.valueAttribute(
        attributeName: String,
        value: String,
    ) = with(document) {
        this@valueAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = value,
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут со значением иконки
     */
    internal fun Element.iconAttribute(
        attributeName: String,
        iconName: String,
    ) = with(document) {
        val resourceRef = "ic_${iconName.replace('.', '_')}"
        this@iconAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = resourceReferenceProvider.drawable(resourceRef, false),
            usePrefix = false,
        )
    }

    /**
     * Добавляет boolean атрибут
     */
    internal fun Element.booleanAttribute(
        attributeName: String,
        value: Boolean,
    ) = with(document) {
        this@booleanAttribute.appendElement(
            elementName = XmlResourcesDocumentBuilder.ElementName.ITEM,
            tokenName = attributeName,
            value = value.toString(),
            usePrefix = false,
        )
    }

    /**
     * Добавляет атрибут со значением вида @style/ComponentOverlays.styleName, где [styleName] - стиль компонента
     */
    internal fun Element.componentOverlayAttribute(
        attributeName: String,
        styleName: String,
    ) = with(document) {
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
    internal fun Element.componentStyleAttribute(
        attributeName: String,
        styleName: String,
    ) = with(document) {
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
    internal fun Element.colorStateAttribute(
        value: String,
    ) = valueAttribute(
        attributeName = colorStateAttributesGenerator.colorStateInfo.colorStateViewAttr,
        value = value,
    )

    /**
     * Добавляет атрибут типа color со значением @color/[colorName]
     */
    internal fun Element.colorAttribute(
        attributeName: String,
        colorName: String,
    ) = with(document) {
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
    internal fun Element.xmlRefAttribute(
        attributeName: String,
        xmlName: String,
    ) = with(document) {
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
    internal fun Element.colorAttribute(
        colorProperty: ViewColorProperty,
        variation: String? = null,
    ) = colorAttribute(colorProperty.attribute, colorProperty.fileName(variation))

    /**
     * Добавляет атрибут типа ColorValueStateList со значением @xml/[colorName]
     */
    internal fun Element.colorValueListAttribute(
        colorProperty: ViewColorProperty,
        variation: String? = null,
    ) = xmlRefAttribute(colorProperty.attribute, colorProperty.fileName(variation))

    /**
     * Добавляет атрибут типа ValueStateList со значением @xml/propertyFileName
     */
    internal fun Element.valueListAttribute(
        property: ViewProperty<*>,
        variation: String? = null,
    ) = xmlRefAttribute(property.attribute, property.fileName(variation))

    /**
     * Добавляет атрибут типа dimen
     */
    internal fun Element.dimenAttribute(
        variation: String,
        elementName: String,
        dimenName: String,
        value: Float,
    ) = with(document) {
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

    internal fun addFloatToStateList(
        property: ViewProperty<FloatValue>,
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

    internal fun addTypographyToStateList(
        property: ViewProperty<Typography>,
        value: Typography,
        variation: String? = null,
        colorStateName: String? = null,
        extraAttrs: Set<StateListAttribute> = emptySet(),
        extraStateAttrsBuilder: ((StringState) -> Set<StateListAttribute>)? = null,
    ) {
        val stateAttrs = extraAttrs.withColorStateAttrs(colorStateName)
        val generator = getValueStateList(variation, property) {
            stylesStateListGeneratorFactory.create<StringState, Typography>(
                property.fileName(variation?.techToSnakeCase()),
            )
        }
        generator.addValue(value, stateAttrs, extraStateAttrsBuilder)
    }

    internal fun addDimensionToStateList(
        property: ViewProperty<Dimension>,
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
    internal fun addToStateList(
        property: ViewColorProperty,
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
        property: ViewProperty<*>,
        factory: (String) -> Gen,
    ): Gen {
        val variationStateLists = valueStateListGenerators[variationName]
            ?: mutableMapOf<ViewProperty<*>, ValueStateListGenerator<*, *, *>?>().also {
                valueStateListGenerators[variationName] = it
            }
        return (
            variationStateLists[property] ?: factory(
                property.fileName(variationName?.techToSnakeCase()),
            ).also { variationStateLists[property] = it }
            ) as Gen
    }

    private fun ViewProperty<*>.fileName(variationSuffix: String? = null): String = buildString {
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

    // region API для управляемого метой генератора

    internal fun appendStyle(
        root: XmlResourcesDocumentBuilder,
        name: String,
        parent: String? = null,
        content: Element.() -> Unit,
    ) = root.style(name = name, parent = parent, content = content)

    internal fun appendOverlayStyle(
        root: XmlResourcesDocumentBuilder,
        name: String,
        content: Element.() -> Unit,
    ) = root.overlayStyle(name = name, content = content)

    internal fun appendValue(element: Element, attributeName: String, value: String) =
        element.valueAttribute(attributeName, value)

    internal fun appendIcon(element: Element, attributeName: String, iconName: String) =
        element.iconAttribute(attributeName, iconName)

    internal fun appendBoolean(element: Element, attributeName: String, value: Boolean) =
        element.booleanAttribute(attributeName, value)

    internal fun appendComponentOverlay(element: Element, attributeName: String, styleName: String) =
        element.componentOverlayAttribute(attributeName, styleName)

    internal fun appendComponentStyle(element: Element, attributeName: String, styleName: String) =
        element.componentStyleAttribute(attributeName, styleName)

    internal fun appendColorResource(element: Element, property: ViewColorProperty, variation: String) =
        element.colorAttribute(property, variation)

    internal fun appendColorValueList(element: Element, property: ViewColorProperty, variation: String) =
        element.colorValueListAttribute(property, variation)

    internal fun appendDimen(
        element: Element,
        variation: String,
        attributeName: String,
        resourceSuffix: String,
        value: Float,
    ) = element.dimenAttribute(variation, attributeName, resourceSuffix, value)

    internal fun appendTypography(element: Element, attributeName: String, tokenName: String) =
        element.typographyAttribute(attributeName, tokenName)

    internal fun appendShape(
        element: Element,
        variation: String,
        tokenName: String,
        adjustment: Float?,
        attrName: String?,
    ) = element.shapeAttribute(variation, tokenName, adjustment, attrName)

    internal fun appendShadow(element: Element, tokenName: String) =
        element.shadowAttribute(tokenName)

    // endregion

    private companion object {
        const val SHAPE_ADJUSTMENT_ATTR = "sd_shapeAppearanceAdjustment"
    }
}
