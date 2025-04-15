package com.sdds.plugin.themebuilder.internal.components.base.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.FloatState
import com.sdds.plugin.themebuilder.internal.components.base.Gradient
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.SolidColor
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.asVariationTree
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.gradle.kotlin.dsl.provideDelegate
import java.util.Locale

/**
 * Базовый класс генераторов вариаций на Compose
 */
internal abstract class ComposeVariationGenerator<PO : PropertyOwner>(
    private val themeClassName: String,
    private val themePackage: String,
    private val dimensionsConfig: DimensionsConfig,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val namespace: String,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val outputLocation: KtFileBuilder.OutputLocation,
    componentName: String,
    styleBuilderName: String? = null,
    private val styleBuilderFactoryFunName: String = "builder",
) : ComponentStyleGenerator<Config<PO>> {

    private val componentXmlPrefix: String = componentName
    private val camelComponentName = componentName.toCamelCase()
    private val ktFileName: String = "${camelComponentName}Styles"
    private val generatedWrappers = mutableSetOf<String>()
    private var shouldAddInvariantPropsCall = false

    private val baseWrapperInterfaceName = "Wrapper$camelComponentName"

    private val styleBuilderType: ClassName by unsafeLazy {
        ktFileBuilder.getInternalClassType(
            className = styleBuilderName ?: "${camelComponentName}StyleBuilder",
            classPackage = "com.sdds.compose.uikit",
        )
    }

    private val styleType: ClassName by unsafeLazy {
        ktFileBuilder.getInternalClassType(
            className = componentStyleName,
            classPackage = "com.sdds.compose.uikit",
        )
    }

    private val componentRootObjectType: ClassName by unsafeLazy {
        ktFileBuilder.getInternalClassType(
            className = camelComponentName,
        )
    }

    private val rFile by unsafeLazy { ClassName(namespace, "R") }

    private val ktFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(
            fileName = ktFileName,
            fullPackageName = componentPackage,
        ).also {
            it.addSuppressAnnotation(
                "UndocumentedPublicClass",
                "UndocumentedPublicProperty",
                "ktlint:standard:max-line-length",
            )
        }
    }

    protected open val componentStyleName: String = "${camelComponentName}Style"

    protected open fun propsToBuilderCalls(
        props: PO,
        ktFileBuilder: KtFileBuilder,
        variationId: String = "",
    ): List<String> = emptyList()

    protected open fun propsToBuilderCalls(
        props: PO,
        ktFileBuilder: KtFileBuilder,
        variationNode: VariationNode<PO>,
        variationId: String = "",
    ): List<String> = propsToBuilderCalls(props, ktFileBuilder, variationNode.id.techToSnakeCase())

    protected open fun KtFileBuilder.onAddImports() = Unit

    protected open fun invariantBuilderCalls(): List<String> = emptyList()

    protected fun getColor(colorName: String, color: Color): String {
        val alphaString = when (color) {
            is Gradient -> color.alpha?.let { ".asLayered(${it}f)" } ?: ".asLayered()"
            is SolidColor -> color.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        }
        val tokenGroup = when (color) {
            is Gradient -> "gradients"
            is SolidColor -> "colors"
        }
        val stateSuffix = when (color) {
            is Gradient -> color.asStatefulFragment
            is SolidColor -> color.asInteractiveFragment
        }
        val tokenValue = color.default.toKtTokenName()
        return """
            $colorName(
                $themeClassName.$tokenGroup.$tokenValue$alphaString.$stateSuffix
            )
        """.trimIndent()
    }

    protected fun getShape(shape: Shape, variationId: String, shapeName: String = "shape"): String {
        return if (ShapeToken.isCircle(shape.value)) {
            ktFileBuilder.addImport(
                packageName = "androidx.compose.foundation.shape",
                names = listOf("CircleShape"),
            )
            ".$shapeName(CircleShape)"
        } else {
            ".$shapeName($themeClassName.shapes.${shape.value.toKtAttrName()}${
                shape.shapeAdjustment(suffix = variationId)
            })"
        }
    }

    protected fun getTypography(styleName: String, typography: Typography): String {
        return ".$styleName($themeClassName.typography.${typography.value.toKtAttrName()})"
    }

    protected fun getIcon(iconName: String, icon: Icon): String {
        val resourceRef = "ic_${icon.value.replace('.', '_')}"
        return ".$iconName(painterResource(com.sdds.icons.R.drawable.$resourceRef))"
    }

    private fun getDimension(
        dimenName: String,
        dimenValue: Float,
        dimensionResSuffix: String,
    ): String {
        return if (dimensionsConfig.fromResources) {
            val dimenData = DimenData(
                name = "${componentXmlPrefix}_${dimenName}_$dimensionResSuffix",
                value = dimenValue,
                type = DimenData.Type.DP,
            )
            dimensAggregator.addDimen(dimenData)
            "dimensionResource(${resourceReferenceProvider.dimenR(dimenData)})"
        } else {
            "${dimenValue * dimensionsConfig.multiplier}.dp"
        }
    }

    protected fun String.getComponentStyle(
        ktFileBuilder: KtFileBuilder,
        stylesPackage: String,
    ): String {
        val styleRefParts = split(".")
        val objectName = styleRefParts.first().toCamelCase()
        val extensions = styleRefParts.subList(1, styleRefParts.size).map { it.toCamelCase() }
        ktFileBuilder.addImport(ClassName(stylesPackage, listOf(objectName)))
        extensions.forEach {
            ktFileBuilder.addImport(
                ClassName(
                    packageName = stylesPackage,
                    simpleNames = listOf(it),
                ),
            )
        }
        return styleRefParts
            .joinToString(separator = ".") { it.toCamelCase() }
    }

    protected fun StringBuilder.appendDimension(
        dimensionName: String,
        dimension: Dimension,
        variationId: String,
    ) {
        val camelCaseName = dimensionName.toCamelCase().decapitalized()
        val stateSuffix = if (dimension.states.isNullOrEmpty()) {
            ""
        } else {
            ".${dimension.asStatefulFragment}"
        }
        appendLine(
            "$camelCaseName(${
                getDimension(
                    dimensionName,
                    dimension.value,
                    variationId,
                )
            }$stateSuffix)",
        )
    }

    private fun String.toKtAttrName(): String = toCamelCase().decapitalized()

    private fun String.toCamelCase(): String {
        val segments = split(".", "-", "_")
        return segments.joinToString("") { it.capitalized() }
    }

    private fun Shape.shapeAdjustment(suffix: String): String {
        return this.adjustment?.let {
            ".adjustBy(all = ${getShapeAdjustment(suffix)})"
        }.orEmpty()
    }

    override fun generate(config: Config<PO>) {
        with(ktFileBuilder) {
            addCommonImports()
            addRootObject()
            addBaseWrapperInterface()
            val rootVariation = config.asVariationTree(camelComponentName)
            createVariation(
                variation = rootVariation,
                isRoot = true,
                viewExtensionReceiverName = baseWrapperInterfaceName,
            )
            build(outputLocation)
        }
    }

    private fun addRootObject() {
        val objectFileBuilder = ktFileBuilderFactory.create(
            fileName = camelComponentName,
            fullPackageName = componentPackage,
        )
        with(objectFileBuilder) {
            rootObject(
                name = camelComponentName,
                description = "Вспомогательный объект для описания API и стиля компонента $camelComponentName",
            )
            build(outputLocation)
        }
    }

    private fun VariationNode<PO>.getDescription(): String {
        return if (parent == null) {
            """
                Интерфейс, который реализуют все обертки вариаций корневого уровня 
                и обертки их подвариаций. 
                Является ресивером для extension-функций view, 
                применимых к этим оберткам.
            """
        } else {
            """
                Интерфейс, который реализуют все обертки вариации $name
                и обертки ее подвариаций.
                Является ресивером для extension-функций view,
                применимых к этим оберткам.
            """
        }.trimIndent()
    }

    private fun KtFileBuilder.createVariation(
        variation: VariationNode<PO>,
        isRoot: Boolean = false,
        viewExtensionReceiverName: String,
    ) {
        val hasViewVariations = variation.value.view.isNotEmpty()
        val newViewExtensionReceiverName: String
        if (hasViewVariations) {
            val variationId = variation.id.toCamelCase()
            val viewWrapperName = if (isRoot) variationId else "$camelComponentName$variationId"
            newViewExtensionReceiverName = "Wrapper${viewWrapperName}View"
            addVariationWrapperInterface(
                interfaceName = newViewExtensionReceiverName,
                superTypeName = viewExtensionReceiverName,
                description = variation.getDescription(),
            )
            addViewExtensions(
                variation = variation,
                receiverName = newViewExtensionReceiverName,
            )
        } else {
            newViewExtensionReceiverName = viewExtensionReceiverName
        }
        val builderCalls = propsToBuilderCalls(
            props = variation.value.props,
            variationNode = variation,
            ktFileBuilder = this,
            variationId = variation.id.techToSnakeCase(),
        )
        if (isRoot) {
            if (variation.value.view.isEmpty() && variation.children.isEmpty()) {
                variation.addChild(VariationNode("Default", variation.value))
                shouldAddInvariantPropsCall = false
            } else {
                addInvariantPropsVal(builderCalls)
                shouldAddInvariantPropsCall = true
            }
        } else {
            addVariationExtension(
                variationNode = variation,
                builderCalls = builderCalls,
                wrapperSuperTypeName = newViewExtensionReceiverName,
            )
        }

        variation.children.forEach {
            createVariation(
                variation = it,
                viewExtensionReceiverName = newViewExtensionReceiverName,
            )
        }
    }

    private fun KtFileBuilder.addVariationWrapperInterface(
        interfaceName: String,
        superTypeName: String,
        description: String,
    ) {
        rootInterface(
            name = interfaceName,
            superInterface = getInternalClassType(superTypeName),
            description = description,
        )
    }

    private fun KtFileBuilder.addInvariantPropsVal(body: List<String>) {
        appendRootVal(
            name = "invariantProps",
            modifiers = listOf(Modifier.PRIVATE),
            receiver = styleBuilderType,
            typeName = styleBuilderType,
            getter = KtFileBuilder.Getter.Annotated(
                annotations = listOf(Annotation(KtFileBuilder.TypeAnnotationComposable)),
                body = buildString {
                    appendLine("return this")
                    invariantBuilderCalls().forEach { appendLine(it) }
                    body.forEach { appendLine(it) }
                },
            ),
        )
    }

    private fun KtFileBuilder.addViewExtensions(
        variation: VariationNode<PO>,
        receiverName: String,
    ) {
        val receiverType = getInternalClassType(receiverName)
        val mergedViews = variation.mergedViews()
        mergedViews.forEach { viewEntry ->
            val extensionName = viewEntry.key.capitalized()
            val extensionBody = propsToBuilderCalls(
                props = viewEntry.value.props,
                variationId = viewEntry.key,
                ktFileBuilder = this,
            )
            val outType = getOrGenerateViewWrapper(
                wrapperSuffix = "${camelComponentName}Terminate",
                description = "Терминальная обертка",
            )
            appendRootVal(
                name = extensionName,
                typeName = outType,
                receiver = receiverType,
                getter = KtFileBuilder.Getter.Annotated(
                    annotations = listOfNotNull(
                        Annotation(KtFileBuilder.TypeAnnotationComposable),
                        variation.parent?.let {
                            Annotation(
                                annotation = KtFileBuilder.TypeAnnotationJvmName,
                                parameter = "\"${receiverType.simpleName}$extensionName\"",
                            )
                        },
                    ),
                    body = buildString {
                        appendLine("return builder")
                        extensionBody.forEach { appendLine(it) }
                        appendLine(".wrap(::${outType.simpleName})")
                    },
                ),
            )
        }
    }

    private fun KtFileBuilder.addVariationExtension(
        variationNode: VariationNode<PO>,
        wrapperSuperTypeName: String,
        builderCalls: List<String>,
    ) {
        val parentName = variationNode.parent?.id?.toCamelCase()
        val variationName = variationNode.name.toCamelCase()
        val isParentRoot = parentName == camelComponentName

        val outType: ClassName
        val receiverType: ClassName
        val builderRef: String
        val extensionBody: String
        if (isParentRoot) {
            builderRef = "$componentStyleName.$styleBuilderFactoryFunName(this)"
            outType = getOrGenerateWrapper(
                wrapperSuffix = "$camelComponentName$variationName",
                superTypeName = wrapperSuperTypeName,
                description = "Обертка для вариации $variationName",
            )
            receiverType = componentRootObjectType
            extensionBody = buildString {
                appendLine("return $builderRef")
                if (shouldAddInvariantPropsCall) appendLine(".invariantProps")
                builderCalls.forEach { appendLine(it) }
                appendLine(".wrap(::${outType.simpleName})")
            }
        } else {
            builderRef = "builder"
            receiverType =
                getOrGenerateWrapper(
                    wrapperSuffix = "$camelComponentName$parentName",
                    description = "Обертка для вариации $parentName",
                )
            outType = getOrGenerateWrapper(
                wrapperSuffix = "$camelComponentName$parentName$variationName",
                superTypeName = wrapperSuperTypeName,
                description = "Обертка для вариации $parentName$variationName",
            )
            extensionBody = buildString {
                appendLine("return $builderRef")
                builderCalls.forEach { appendLine(it) }
                appendLine(".wrap(::${outType.simpleName})")
            }
        }

        appendRootVal(
            name = variationName,
            typeName = outType,
            receiver = receiverType,
            getter = KtFileBuilder.Getter.Annotated(
                annotations = listOf(
                    Annotation(KtFileBuilder.TypeAnnotationComposable),
                    Annotation(
                        annotation = KtFileBuilder.TypeAnnotationJvmName,
                        parameter = "\"${outType.simpleName}\"",
                    ),
                ),
                body = extensionBody,
            ),
        )
    }

    private fun KtFileBuilder.getOrGenerateViewWrapper(
        wrapperSuffix: String,
        description: String,
    ): ClassName = getOrGenerateWrapper(
        wrapperSuffix = wrapperSuffix,
        superTypeName = baseWrapperInterfaceName,
        description = description,
    )

    private fun KtFileBuilder.getOrGenerateWrapper(
        wrapperSuffix: String,
        superTypeName: String? = null,
        description: String,
    ): ClassName {
        val fullWrapperName = "Wrapper$wrapperSuffix"
        if (!generatedWrappers.contains(fullWrapperName)) {
            rootClass(
                name = fullWrapperName,
                modifiers = listOf(Modifier.VALUE),
                annotation = KtFileBuilder.TypeAnnotationJvmInline,
                superInterface = superTypeName?.let { getInternalClassType(it) },
                primaryConstructor = KtFileBuilder.Constructor.Primary(
                    parameters = listOf(
                        KtFileBuilder.FunParameter(
                            name = "builder",
                            asProperty = true,
                            modifiers = listOf(Modifier.OVERRIDE),
                            type = styleBuilderType,
                        ),
                    ),
                ),
                description = description,
            )
            generatedWrappers.add(fullWrapperName)
        }
        return getInternalClassType(fullWrapperName)
    }

    private fun Shape.getShapeAdjustment(suffix: String): String {
        return getDimension(
            dimenName = "shapeAdjustment",
            dimenValue = adjustment ?: 0f,
            dimensionResSuffix = suffix,
        )
    }

    private val Color.asInteractiveFragment: String
        get() = if (states.isNullOrEmpty()) {
            "asInteractive()"
        } else {
            """asInteractive·(
                ${getAsInteractiveParameters()}
            )
            """.trimIndent()
        }

    private val Color.asStatefulFragment: String
        get() = if (states.isNullOrEmpty()) {
            "asStatefulValue()"
        } else {
            """asStatefulValue·(
                ${getAsInteractiveParameters()}
            )
            """.trimIndent()
        }

    private val Dimension.asStatefulFragment: String
        get() = if (states.isNullOrEmpty()) {
            "asStatefulValue()"
        } else {
            """asStatefulValue·(
                ${getAsInteractiveParameters()}
            )
            """.trimIndent()
        }

    private fun Color?.getAsInteractiveParameters(): String {
        return this?.states?.joinToString(separator = ", ") { it.getStateParameter(this is Gradient) }.orEmpty()
    }

    private fun Dimension?.getAsInteractiveParameters(): String {
        return this?.states?.joinToString(separator = ", ") { it.getDpStateParameter() }.orEmpty()
    }

    private fun FloatState.getDpStateParameter(): String {
        return """
            setOf(${state.toStateEnums()}) to ${value}f.dp
        """.trimIndent()
    }

    private fun ColorState.getStateParameter(isGradient: Boolean): String {
        val alphaString = alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        val tokenGroupName = if (isGradient) "gradients" else "colors"
        return """
            setOf(${state.toStateEnums()})
                to $themeClassName.$tokenGroupName.${value.toKtAttrName()}$alphaString
        """.trimIndent()
    }

    private fun List<String>.toStateEnums(): String {
        val interactiveStates = asInteractiveStates().map { "InteractiveState.${it.name}" }
        return (interactiveStates + excludeInteractiveStates().map { getCustomState(it) })
            .joinToString()
    }

    protected open fun getCustomState(state: String): String = state

    private fun KtFileBuilder.addCommonImports() {
        onAddImports()
        addImport(
            packageName = "com.sdds.compose.uikit",
            names = listOfNotNull(
                "adjustBy",
                "multiplyAlpha",
                if (styleBuilderFactoryFunName != DEFAULT_BUILDER_FUN_NAME) {
                    styleBuilderFactoryFunName
                } else {
                    null
                },
            ),
        )
        addImport(
            packageName = "com.sdds.compose.uikit.style",
            names = listOf("wrap", "style", "modify"),
        )
        addImport(
            packageName = "androidx.compose.runtime",
            names = listOf("Composable"),
        )
        addImport(
            packageName = "androidx.compose.ui.unit",
            names = listOf("dp"),
        )
        addImport(
            packageName = "androidx.compose.ui.res",
            names = listOf("painterResource"),
        )
        addImport(
            packageName = "com.sdds.compose.uikit.graphics",
            names = listOf("asLayered"),
        )
        if (dimensionsConfig.fromResources) {
            addImport(KtFileBuilder.TypeLocalDensity)
            addImport(KtFileBuilder.TypeDimensionResource)
            addImport(rFile)
        }
        addImport(
            packageName = themePackage,
            names = listOf(themeClassName),
        )
        addImport(
            packageName = "com.sdds.compose.uikit.interactions",
            names = listOf("InteractiveState", "asInteractive", "asStatefulValue"),
        )
    }

    private fun String.toKtTokenName(): String =
        techToCamelCase().decapitalize(Locale.getDefault())

    private fun KtFileBuilder.addBaseWrapperInterface() {
        rootInterface(
            name = baseWrapperInterfaceName,
            superInterface = getInternalClassType("BuilderWrapper", "com.sdds.compose.uikit.style")
                .parameterizedBy(styleType, styleBuilderType),
            description = "Базовый интерфейс для всех оберток этого стиля",
        )
    }

    internal enum class InteractiveState(val key: String) {
        /**
         * Состояние цвета в фокусе
         */
        Focused("focused"),

        /**
         * Состояние цвета в нажатом состоянии
         */
        Pressed("pressed"),

        /**
         * Состояние цвета при наведении курсором
         */
        Hovered("hovered"),

        /**
         * Состояние цвета в активном состоянии
         */
        Activated("activated"),

        /**
         * Состояние цвета в выбранном состоянии
         */
        Selected("selected"),
    }

    private companion object {
        const val DEFAULT_BUILDER_FUN_NAME = "builder"

        private fun fromKeyString(key: String): InteractiveState? = InteractiveState.values().find { it.key == key }

        fun List<String>.asInteractiveStates(): List<InteractiveState> = this.mapNotNull { fromKeyString(it) }

        fun List<String>.excludeInteractiveStates(): Set<String> = filter {
            fromKeyString(it) == null
        }.toSet()
    }
}
