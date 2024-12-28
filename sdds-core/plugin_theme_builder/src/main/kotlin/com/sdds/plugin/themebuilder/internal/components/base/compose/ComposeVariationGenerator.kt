package com.sdds.plugin.themebuilder.internal.components.base.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.components.ComponentStyleGenerator
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ColorState
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.asVariationTree
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
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
) : ComponentStyleGenerator<Config<PO>> {

    private val componentXmlPrefix: String = componentName
    private val camelComponentName = componentName.toCamelCase()
    private val ktFileName: String = "${camelComponentName}Styles"
    private val generatedWrappers = mutableSetOf<String>()

    private val styleBuilderFactoryMethodName = "${camelComponentName.decapitalized()}Builder"

    private val styleBuilderType: ClassName by unsafeLazy {
        ktFileBuilder.getInternalClassType(
            className = "${camelComponentName}StyleBuilder",
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
        )
    }

    protected open val componentStyleName: String = "${camelComponentName}Style"

    protected abstract fun propsToBuilderCalls(
        props: PO,
        ktFileBuilder: KtFileBuilder,
        variationId: String = "",
    ): List<String>

    protected open fun KtFileBuilder.onAddImports() = Unit

    protected fun getColor(colorName: String, color: Color): String {
        return "$colorName($themeClassName.colors.${color.default.toKtTokenName()}" +
            ".${color.asInteractiveFragment})"
    }

    protected fun getShape(shape: Shape, variationId: String): String {
        return ".shape($themeClassName.shapes.${shape.value.toKtAttrName()}${
            shape.shapeAdjustment(suffix = variationId)
        })"
    }

    protected fun getDimension(
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

    protected fun String.toKtAttrName(): String =
        toCamelCase().decapitalize(Locale.getDefault())

    protected fun String.toCamelCase(): String {
        val segments = split(".", "-", "_")
        return segments.joinToString("") { it.capitalized() }
    }

    protected fun Shape.shapeAdjustment(suffix: String): String {
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
                wrapperInterface = "Wrapper$camelComponentName",
            )
            build(outputLocation)
        }
    }

    private fun KtFileBuilder.createVariation(
        variation: VariationNode<PO>,
        isRoot: Boolean = false,
        wrapperInterface: String,
    ) {
        val newWrapperInterface: String
        val hasViewVariations = variation.value.view.isNotEmpty()
        if (hasViewVariations) {
            newWrapperInterface = "Wrapper${variation.id.toCamelCase()}View"
            addViewInterface(newWrapperInterface, wrapperInterface)
            addViewExtensions(variation, newWrapperInterface)
        } else {
            newWrapperInterface = wrapperInterface
        }

        val builderCalls = propsToBuilderCalls(
            props = variation.value.props,
            variationId = variation.id.techToSnakeCase(),
            ktFileBuilder = this,
        )
        if (isRoot) {
            addInvariantPropsVal(builderCalls)
        } else {
            addVariationExtension(
                variationNode = variation,
                wrapperInterfaceName = newWrapperInterface,
                builderCalls = builderCalls,
            )
        }

        variation.children.forEach {
            createVariation(
                variation = it,
                wrapperInterface = newWrapperInterface,
            )
        }
    }

    private fun KtFileBuilder.addViewInterface(
        interfaceName: String,
        superInterfaceName: String,
    ) {
        rootInterface(
            name = interfaceName,
            superInterface = getInternalClassType(superInterfaceName),
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
        newWrapperInterface: String,
    ) {
        val receiverType = getInternalClassType(newWrapperInterface)
        variation.value.view.forEach { viewEntry ->
            val extensionName = viewEntry.key.capitalized()
            val extensionBody = propsToBuilderCalls(
                props = viewEntry.value.props,
                variationId = viewEntry.key,
                ktFileBuilder = this,
            )
            val outType = getOrGenerateWrapper(
                wrapperSuffix = "${variation.name.toCamelCase()}${extensionName}ViewTerminate",
                superInterfaceName = "Wrapper$camelComponentName",
            )
            appendRootVal(
                name = extensionName,
                typeName = outType,
                receiver = receiverType,
                getter = KtFileBuilder.Getter.Annotated(
                    annotations = listOf(Annotation(KtFileBuilder.TypeAnnotationComposable)),
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
        wrapperInterfaceName: String,
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
                superInterfaceName = wrapperInterfaceName,
            )
            receiverType = componentRootObjectType
            extensionBody = buildString {
                appendLine("return $builderRef")
                appendLine(".invariantProps")
                builderCalls.forEach { appendLine(it) }
                appendLine(".wrap(::${outType.simpleName})")
            }
        } else {
            builderRef = "builder"
            receiverType =
                getOrGenerateWrapper(
                    wrapperSuffix = "$camelComponentName$parentName",
                )
            outType = getOrGenerateWrapper(
                wrapperSuffix = "$camelComponentName$parentName$variationName",
                superInterfaceName = wrapperInterfaceName,
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

    private fun KtFileBuilder.getOrGenerateWrapper(
        wrapperSuffix: String,
        superInterfaceName: String? = null,
    ): ClassName {
        val fullWrapperName = "Wrapper$wrapperSuffix"
        if (!generatedWrappers.contains(fullWrapperName)) {
            rootClass(
                name = fullWrapperName,
                modifiers = listOf(Modifier.VALUE),
                annotation = KtFileBuilder.TypeAnnotationJvmInline,
                superInterface = superInterfaceName?.let { getInternalClassType(it) },
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
            "asInteractive(${getAsInteractiveParameters()})"
        }

    private fun Color?.getAsInteractiveParameters(): String {
        return this?.states?.joinToString(separator = ", ") { it.getStateParameter() }.orEmpty()
    }

    private fun ColorState.getStateParameter(): String {
        return this.let { "setOf(${it.state.toColorStates()}) to $themeClassName.colors.${it.value.toKtAttrName()}" }
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
            ),
        )
        addImport(
            packageName = "com.sdds.compose.uikit.style",
            names = listOf("wrap"),
        )
        addImport(
            packageName = "androidx.compose.runtime",
            names = listOf("Composable"),
        )
        addImport(
            packageName = "androidx.compose.ui.unit",
            names = listOf("dp"),
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
            name = "Wrapper$camelComponentName",
            superInterface = getInternalClassType("BuilderWrapper", "com.sdds.compose.uikit.style")
                .parameterizedBy(styleType, styleBuilderType),
        )
    }
}
