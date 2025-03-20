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
import com.sdds.plugin.themebuilder.internal.components.base.Icon
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
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
) : ComponentStyleGenerator<Config<PO>> {

    private val componentXmlPrefix: String = componentName
    private val camelComponentName = componentName.toCamelCase()
    private val ktFileName: String = "${camelComponentName}Styles"
    private val generatedWrappers = mutableSetOf<String>()
    private var shouldAddInvariantPropsCall = false

    private val baseWrapperInterfaceName = "Wrapper$camelComponentName"
    private val styleBuilderFactoryMethodName = "${camelComponentName.decapitalized()}Builder"

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
            classPackage = "com.sdds.compose.uikit",
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

    protected abstract fun propsToBuilderCalls(
        props: PO,
        ktFileBuilder: KtFileBuilder,
        variationId: String = "",
    ): List<String>

    protected open fun KtFileBuilder.onAddImports() = Unit

    protected fun getColor(colorName: String, color: Color): String {
        val alphaString = color.alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        return """
            $colorName(
                $themeClassName.colors.${color.default.toKtTokenName()}$alphaString.${color.asInteractiveFragment}
            )
        """.trimIndent()
    }

    protected fun getShape(shape: Shape, variationId: String): String {
        return if (ShapeToken.isCircle(shape.value)) {
            ktFileBuilder.addImport(
                packageName = "androidx.compose.foundation.shape",
                names = listOf("CircleShape"),
            )
            ".shape(CircleShape)"
        } else {
            ".shape($themeClassName.shapes.${shape.value.toKtAttrName()}${
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
        ktFileBuilder.addImport(ClassName("com.sdds.compose.uikit", listOf(objectName)))
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
        appendLine(
            "$camelCaseName(${
                getDimension(
                    dimensionName,
                    dimension.value,
                    variationId,
                )
            })",
        )
    }

    private fun String.toKtAttrName(): String =
        toCamelCase().decapitalize(Locale.getDefault())

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

    private fun KtFileBuilder.createVariation(
        variation: VariationNode<PO>,
        isRoot: Boolean = false,
        viewExtensionReceiverName: String,
    ) {
        val hasViewVariations = variation.value.view.isNotEmpty()
        val newViewExtensionReceiverName: String
        if (hasViewVariations) {
            newViewExtensionReceiverName = "Wrapper${variation.id.toCamelCase()}View"
            val description = if (variation.parent == null) {
                """
                    Интерфейс, который реализуют все обертки вариаций корневого уровня 
                    и обертки их подвариаций. 
                    Является ресивером для extension-функций view, 
                    применимых к этим оберткам.
                """
            } else {
                """
                    Интерфейс, который реализуют все обертки вариации ${variation.name}
                    и обертки ее подвариаций.
                    Является ресивером для extension-функций view,
                    применимых к этим оберткам.
                """
            }.trimIndent()
            addVariationWrapperInterface(
                interfaceName = newViewExtensionReceiverName,
                superTypeName = viewExtensionReceiverName,
                description = description,
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
            variationId = variation.id.techToSnakeCase(),
            ktFileBuilder = this,
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
            builderRef = "$componentStyleName.$styleBuilderFactoryMethodName(this)"
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

    private fun Color?.getAsInteractiveParameters(): String {
        return this?.states?.joinToString(separator = ", ") { it.getStateParameter() }.orEmpty()
    }

    private fun ColorState.getStateParameter(): String {
        val alphaString = alpha?.let { ".multiplyAlpha(${it}f)" }.orEmpty()
        return """
            setOf(${state.toColorStates()})
                to $themeClassName.colors.${value.toKtAttrName()}$alphaString
        """.trimIndent()
    }

    private fun List<String>.toColorStates(): String =
        joinToString { "InteractiveState.${it.capitalize(Locale.getDefault())}" }

    private fun KtFileBuilder.addCommonImports() {
        onAddImports()
        addImport(
            packageName = "com.sdds.compose.uikit",
            names = listOf(
                "adjustBy",
                styleBuilderFactoryMethodName,
                "multiplyAlpha",
            ),
        )
        addImport(
            packageName = "com.sdds.compose.uikit.style",
            names = listOf("wrap", "style"),
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
            names = listOf("InteractiveState", "asInteractive"),
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
}
