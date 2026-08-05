package com.sdds.plugin.themebuilder.internal.universal.view

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.nullable
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementFormat
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.attrsFile
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.utils.withPrefixIfNeed
import java.io.File
import java.util.Locale

/**
 * Генератор функционала ColorState для компонентов
 * @author Малышев Александр on 04.12.2024
 */
internal class ViewColorStateGenerator(
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputResDir: File,
    private val colorStateOutputLocation: KtFileBuilder.OutputLocation,
    private val componentName: String,
    private val resourcePrefix: String,
    private val namespace: String,
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {

    private val colorStateAttributes = mutableListOf<ColorStateAttribute>()

    /**
     * Билдеры пересоздаются на каждый [generate]: генератор общий для всех видов
     * компонента (`counter` и `segment-item-counter` пишут один enum и один attrs-файл),
     * поэтому generate() вызывается по разу на вид. Билдеры накапливают элементы, и без
     * пересоздания блоки задваивались бы; при пересоздании файл каждый раз собирается
     * целиком из накопленного набора состояний.
     */
    private fun newXmlBuilder() = xmlBuilderFactory.create(
        rootAttributes = mapOf(
            "xmlns:tools" to "http://schemas.android.com/tools",
        ),
    )

    private fun newKtFileBuilder() = ktFileBuilderFactory.create(
        fileName = "${componentName}ColorState",
        fullPackageName = "${packageResolver.getPackage()}.colorstate",
    ).also {
        // Регистрация типов задаёт импорты генерируемого файла.
        it.getInternalClassType("R", namespace)
        it.getInternalClassType("${capitalizedComponentName}ColorState")
        it.getInternalClassType("${capitalizedComponentName}ColorStateProvider")
    }

    /** Билдер для резолва канонических имён генерируемых классов. */
    private val ktFileBuilder by unsafeLazy { newKtFileBuilder() }
    private val lowercaseComponentName by unsafeLazy { componentName.toLowerCase(Locale.getDefault()) }
    private val capitalizedComponentName by unsafeLazy { componentName.capitalized() }

    /**
     * Возвращает информацию о сущности ColorState компонента
     */
    val colorStateInfo by unsafeLazy {
        ColorStateInfo(
            classSimpleName = "${capitalizedComponentName}ColorState",
            classCanonicalName = ktFileBuilder.getInternalClassType("${capitalizedComponentName}ColorState")
                .canonicalName,
            colorStateViewAttr = "${resourcePrefix}_${lowercaseComponentName}Colors",
        )
    }

    /**
     * Возвращает информацию о сущности ColorStateProvider компонента
     */
    val colorStateProviderInfo by unsafeLazy {
        ColorStateInfo(
            classSimpleName = "${capitalizedComponentName}ColorStateProvider",
            classCanonicalName = ktFileBuilder.getInternalClassType("${capitalizedComponentName}ColorStateProvider")
                .canonicalName,
            colorStateViewAttr = "sd_colorStateProvider",
        )
    }

    /**
     * Возвращает true, если есть хотя бы один ColorState
     */
    val hasColorStates: Boolean
        get() = colorStateAttributes.isNotEmpty()

    /**
     * Регистрирует новый ColorState
     */
    fun registerColorState(name: String): ColorStateAttribute {
        val normalizedName = name.toLowerCase(Locale.getDefault())
        return ColorStateAttribute(
            name = normalizedName,
            attr = "${resourcePrefix}_${lowercaseComponentName}_state_$normalizedName",
            enum = "state_$normalizedName",
        ).also { colorStateAttributes.add(it) }
    }

    /**
     * Возвращает ColorState по названию
     */
    fun getColorStateAttribute(name: String): ColorStateAttribute? {
        val normalizedName = name.toLowerCase(Locale.getDefault())
        return colorStateAttributes.find { it.name == normalizedName }
    }

    override fun generate() {
        if (!hasColorStates) return
        val xmlBuilder = newXmlBuilder()
        val ktFileBuilder = newKtFileBuilder()
        xmlBuilder.createColorStateAttrsSet()
        xmlBuilder.createColorStateViewAttr()
        ktFileBuilder.createColorStateClass()
        ktFileBuilder.createColorStateProviderClass()
        xmlBuilder.build(outputResDir.attrsFile(lowercaseComponentName))
        ktFileBuilder.build(colorStateOutputLocation)
    }

    private fun KtFileBuilder.createColorStateClass() {
        rootClass(
            name = colorStateInfo.classSimpleName,
            modifiers = listOf(Modifier.ENUM),
            primaryConstructor = KtFileBuilder.Constructor.Primary(
                parameters = listOf(
                    KtFileBuilder.FunParameter(
                        name = "attrs",
                        asProperty = true,
                        modifiers = listOf(Modifier.OVERRIDE),
                        type = KtFileBuilder.TypeIntArray,
                    ),
                ),
            ),
            description = "Реализация [ColorState] для компонента $capitalizedComponentName",
            superInterface = KtFileBuilder.TypeColorState,
        ).apply {
            colorStateAttributes.forEach { viewStyle ->
                appendEnumConstant(
                    name = viewStyle.name.toUpperCase(Locale.getDefault()),
                    initializer = "intArrayOf(R.attr.${viewStyle.attr})",
                )
            }
        }
    }

    private fun KtFileBuilder.createColorStateProviderClass() {
        rootClass(
            name = "${colorStateInfo.classSimpleName}Provider",
            modifiers = listOf(Modifier.INTERNAL),
            annotation = KtFileBuilder.TypeAnnotationKeep,
            description = "Реализация [ColorStateProvider] для ${colorStateInfo.classSimpleName}",
            superInterface = KtFileBuilder.TypeColorStateProvider,
        ).appendFun(
            name = "obtain",
            modifiers = listOf(Modifier.OVERRIDE),
            params = listOf(
                KtFileBuilder.FunParameter("context", type = KtFileBuilder.TypeContext),
                KtFileBuilder.FunParameter("attrs", type = KtFileBuilder.TypeAttributeSet.nullable()),
                KtFileBuilder.FunParameter("defStyleAttr", type = KtFileBuilder.TypeInt),
                KtFileBuilder.FunParameter("defStyleRes", type = KtFileBuilder.TypeInt),
            ),
            returnType = getInternalClassType(colorStateInfo.classSimpleName).nullable(),
            body = listOf(
                """
                    val typedArray = context.obtainStyledAttributes(
                        attrs,
                        R.styleable.$capitalizedComponentName,
                        defStyleAttr,
                        defStyleRes,
                    )
                    val stateOrdinal: Int = typedArray.getInt(R.styleable.${capitalizedComponentName}_${colorStateInfo.colorStateViewAttr}, 0)
                    typedArray.recycle()
                    return ${colorStateInfo.classSimpleName}.values().getOrNull(stateOrdinal)
                """.trimIndent(),
            ),
        )
    }

    private fun XmlResourcesDocumentBuilder.createColorStateAttrsSet() {
        appendBaseElement(
            elementName = ElementName.DECLARE_STYLEABLE.value,
            attrs = mapOf(
                "name" to colorStateInfo.classSimpleName.withPrefixIfNeed(resourcePrefix.capitalized(), ""),
            ),
        ) {
            colorStateAttributes.forEach { viewStyle ->
                appendElement(
                    elementName = ElementName.ATTR,
                    tokenName = viewStyle.attr,
                    format = ElementFormat.BOOLEAN,
                    value = "",
                    usePrefix = false,
                )
            }
        }
    }

    private fun XmlResourcesDocumentBuilder.createColorStateViewAttr() {
        appendBaseElement(
            elementName = ElementName.DECLARE_STYLEABLE.value,
            attrs = mapOf(
                "name" to capitalizedComponentName,
                "tools:ignore" to "ResourceName",
            ),
        ) {
            appendBaseElement(
                elementName = ElementName.ATTR.value,
                attrs = mapOf(
                    "name" to colorStateInfo.colorStateViewAttr,
                    "format" to ElementFormat.ENUM.value,
                ),
            ) {
                colorStateAttributes.forEachIndexed { index, viewStyle ->
                    appendBaseElement(
                        elementName = ElementName.ENUM.value,
                        attrs = mapOf(
                            "name" to viewStyle.enum,
                            "value" to "$index",
                        ),
                    )
                }
            }
        }
    }
}

/**
 * Информация о классах ColorState
 */
internal data class ColorStateInfo(
    val classSimpleName: String,
    val classCanonicalName: String,
    val colorStateViewAttr: String,
)

/**
 * Атрибуты ColorState
 */
internal data class ColorStateAttribute(
    val name: String,
    val attr: String,
    val enum: String,
)

/**
 * Преобразует [ColorStateAttribute] в атрибут для ColorStateList [StateListAttribute]
 */
internal fun ColorStateAttribute.toStateListAttribute(enabled: Boolean = true): StateListAttribute =
    StateListAttribute("app:$attr", enabled.toString())
