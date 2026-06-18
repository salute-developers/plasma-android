package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.components.VariationProp
import com.sdds.plugin.themebuilder.internal.components.VariationReference
import com.sdds.plugin.themebuilder.internal.components.base.BaseVariation
import com.sdds.plugin.themebuilder.internal.components.base.Binding
import com.sdds.plugin.themebuilder.internal.components.base.Bindings
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.VariationNode
import com.sdds.plugin.themebuilder.internal.components.base.asVariationTree
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.sdds.plugin.themebuilder.internal.utils.techToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy

internal typealias BuilderCallsProvider = (props: PropertyOwner, variationId: String) -> List<String>

internal class VariationTreeProcessor(
    private val camelComponentName: String,
    private val componentStyleName: String,
    private val styleBuilderType: ClassName,
    private val styleType: ClassName,
    private val baseWrapperInterfaceName: String,
    private val styleBuilderFactoryFunName: String,
    private val ktFileBuilder: KtFileBuilder,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val outputLocation: KtFileBuilder.OutputLocation,
) {
    data class Result(
        val variations: Map<String, VariationReference>,
        val variationProps: Map<String, List<VariationProp>>,
        val componentProps: List<VariationProp>,
    )

    private val generatedWrappers = mutableSetOf<String>()
    private var shouldAddInvariantPropsCall = false
    private var viewPropName: String = "view"

    private val variations = mutableMapOf<String, VariationReference>()
    private val viewVariations = mutableMapOf<String, VariationReference>()
    private val variationPropsMap = mutableMapOf<String, List<VariationProp>>()
    private val viewVariationProps = mutableMapOf<String, List<VariationProp>>()

    private val componentRootObjectType: ClassName = ClassName(componentPackage, camelComponentName)

    fun process(
        config: Config<*>,
        componentProps: List<VariationProp>,
        viewPropName: String,
        configuredViewBinding: Bindings?,
        builderCallsProvider: BuilderCallsProvider,
    ): Result {
        this.viewPropName = viewPropName
        variationPropsMap.clear()
        variationPropsMap.putAll(
            config.variations.associate { variation ->
                variation.id to variation.binding.toVariationProps()
            },
        )

        addRootObject()
        ktFileBuilder.addBaseWrapperInterface()
        val rootVariation = config.asVariationTree(camelComponentName)
        ktFileBuilder.createVariation(
            variation = rootVariation,
            isRootVariation = true,
            viewExtensionReceiverName = baseWrapperInterfaceName,
            builderCallsProvider = builderCallsProvider,
        )

        val finalVariations = getVariationsDict()
        val finalVariationProps = getVariationPropsDict()
        val mergedComponentProps = mergeComponentAndViewProps(
            componentProps = componentProps,
            variationProps = finalVariationProps.values,
            configuredViewBinding = configuredViewBinding,
        )
        return Result(
            variations = finalVariations,
            variationProps = finalVariationProps,
            componentProps = mergedComponentProps,
        )
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

    private fun KtFileBuilder.addBaseWrapperInterface() {
        rootInterface(
            name = baseWrapperInterfaceName,
            superInterface = ClassName("com.sdds.compose.uikit.style", "BuilderWrapper")
                .parameterizedBy(styleType, styleBuilderType),
            description = "Базовый интерфейс для всех оберток этого стиля",
        )
    }

    @Suppress("NestedBlockDepth")
    private fun KtFileBuilder.createVariation(
        variation: VariationNode<*>,
        isRootVariation: Boolean = false,
        viewExtensionReceiverName: String,
        builderCallsProvider: BuilderCallsProvider,
    ) {
        val hasViewVariations = variation.value.view.isNotEmpty()
        val newViewExtensionReceiverName: String
        if (hasViewVariations) {
            val areViewVariationsTheOnlyVariations = isRootVariation && variation.children.isEmpty()
            newViewExtensionReceiverName = if (areViewVariationsTheOnlyVariations) {
                addOnlyViewExtensions(variation, builderCallsProvider)
            } else {
                addViewExtensionsAndWrapperInterface(
                    variation = variation,
                    isRootVariation = isRootVariation,
                    currentViewExtensionReceiverName = viewExtensionReceiverName,
                    builderCallsProvider = builderCallsProvider,
                )
            }
        } else {
            newViewExtensionReceiverName = viewExtensionReceiverName
        }

        val builderCalls = builderCallsProvider(variation.value.props, variation.id.techToSnakeCase())

        if (isRootVariation) {
            if (variation.value.view.isEmpty() && variation.children.isEmpty()) {
                @Suppress("UNCHECKED_CAST")
                (variation as VariationNode<PropertyOwner>).addChild(
                    VariationNode("Default", variation.value as BaseVariation<PropertyOwner>),
                )
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
                builderCallsProvider = builderCallsProvider,
            )
        }
    }

    private fun KtFileBuilder.addOnlyViewExtensions(
        variation: VariationNode<*>,
        builderCallsProvider: BuilderCallsProvider,
    ): String {
        addViewExtensions(
            variation = variation,
            receiverName = camelComponentName,
            isWrapperScope = false,
            builderCallsProvider = builderCallsProvider,
        )
        return camelComponentName
    }

    private fun KtFileBuilder.addViewExtensionsAndWrapperInterface(
        variation: VariationNode<*>,
        isRootVariation: Boolean,
        currentViewExtensionReceiverName: String,
        builderCallsProvider: BuilderCallsProvider,
    ): String {
        val variationId = variation.id.toCamelCase()
        val viewWrapperName = if (isRootVariation) variationId else "$camelComponentName$variationId"
        val newViewExtensionReceiverName = "Wrapper${viewWrapperName}View"
        addVariationWrapperInterface(
            interfaceName = newViewExtensionReceiverName,
            superTypeName = currentViewExtensionReceiverName,
            description = variation.getDescription(),
        )
        addViewExtensions(
            variation = variation,
            receiverName = newViewExtensionReceiverName,
            builderCallsProvider = builderCallsProvider,
        )
        return newViewExtensionReceiverName
    }

    private fun KtFileBuilder.addViewExtensions(
        variation: VariationNode<*>,
        receiverName: String,
        isWrapperScope: Boolean = true,
        builderCallsProvider: BuilderCallsProvider,
    ) {
        val receiverType = ClassName(componentPackage, receiverName)
        val mergedViews = variation.mergedViews()
        mergedViews.forEach { viewEntry ->
            val extensionName = viewEntry.key.techToCamelCase().capitalized()
            val extensionBody = builderCallsProvider(viewEntry.value.props, viewEntry.key)
            val outType = getOrGenerateViewWrapper(
                wrapperSuffix = "${camelComponentName}Terminate",
                description = "Терминальная обертка",
            )
            viewVariations[viewEntry.key] = VariationReference(value = extensionName)
            viewVariationProps[viewEntry.key] = viewEntry.value.binding
                .toVariationProps()
                .ifEmpty { listOf(viewEntry.key.asViewProp()) }
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
                        appendLine("return ${getBuilderRef(isWrapperScope)}")
                        if (!isWrapperScope) appendLine(".invariantProps")
                        extensionBody.forEach { appendLine(it) }
                        appendLine(".wrap(::${outType.simpleName})")
                    },
                ),
            )
        }
    }

    @Suppress("LongMethod")
    private fun KtFileBuilder.addVariationExtension(
        variationNode: VariationNode<*>,
        wrapperSuperTypeName: String,
        builderCalls: List<String>,
    ) {
        val parentName = getVariationName(variationNode.parent?.id)
        val parentPath = variationNode.parent?.id?.split(".")
            ?.joinToString(".") { it.toCamelCase() }
        val variationName = getVariationName(variationNode.name)
        val isParentRoot = parentName == camelComponentName

        val outType: ClassName
        val receiverType: ClassName
        val extensionBody: String
        if (isParentRoot) {
            outType = getOrGenerateWrapper(
                wrapperSuffix = "$camelComponentName$variationName",
                superTypeName = wrapperSuperTypeName,
                description = "Обертка для вариации $variationName",
            )
            receiverType = componentRootObjectType
            extensionBody = buildString {
                appendLine("return ${getBuilderRef(isWrapperScope = false)}")
                if (shouldAddInvariantPropsCall) appendLine(".invariantProps")
                builderCalls.forEach { appendLine(it) }
                appendLine(".wrap(::${outType.simpleName})")
            }
            variations[variationNode.id] = VariationReference("$camelComponentName.$variationName")
        } else {
            receiverType = getOrGenerateWrapper(
                wrapperSuffix = "$camelComponentName$parentName",
                description = "Обертка для вариации $parentName",
            )
            outType = getOrGenerateWrapper(
                wrapperSuffix = "$camelComponentName$parentName$variationName",
                superTypeName = wrapperSuperTypeName,
                description = "Обертка для вариации $parentName$variationName",
            )
            extensionBody = buildString {
                appendLine("return builder")
                builderCalls.forEach { appendLine(it) }
                appendLine(".wrap(::${outType.simpleName})")
            }
            if (parentPath != null) {
                variations[variationNode.id] = VariationReference(
                    value = "$camelComponentName.$parentPath.$variationName",
                )
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

    private fun KtFileBuilder.addVariationWrapperInterface(
        interfaceName: String,
        superTypeName: String,
        description: String,
    ) {
        rootInterface(
            name = interfaceName,
            superInterface = ClassName(componentPackage, superTypeName),
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
                superInterface = superTypeName?.let { ClassName(componentPackage, it) },
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
        return ClassName(componentPackage, fullWrapperName)
    }

    @Suppress("NestedBlockDepth")
    private fun getVariationsDict(): Map<String, VariationReference> =
        mutableMapOf<String, VariationReference>().apply {
            if (variations.isEmpty()) {
                if (viewVariations.isEmpty()) {
                    put("default", VariationReference("$camelComponentName.Default"))
                } else {
                    viewVariations.forEach { view ->
                        put(view.key, VariationReference("$camelComponentName.${view.value.value}"))
                    }
                }
                return@apply
            }
            variations.forEach { entry ->
                viewVariations.forEach { view ->
                    put(
                        "${entry.key}.${view.key}",
                        VariationReference("${entry.value.value}.${view.value.value}"),
                    )
                }
                if (viewVariations.isEmpty()) put(entry.key, entry.value)
            }
        }

    @Suppress("NestedBlockDepth")
    private fun getVariationPropsDict(): Map<String, List<VariationProp>> =
        mutableMapOf<String, List<VariationProp>>().apply {
            if (variations.isEmpty()) {
                if (viewVariations.isEmpty()) {
                    put("default", emptyList())
                } else {
                    viewVariations.forEach { view ->
                        put(view.key, viewVariationProps[view.key].orEmpty())
                    }
                }
                return@apply
            }
            variations.forEach { entry ->
                viewVariations.forEach { view ->
                    put(
                        "${entry.key}.${view.key}",
                        variationPropsMap[entry.key].orEmpty() + viewVariationProps[view.key].orEmpty(),
                    )
                }
                if (viewVariations.isEmpty()) put(entry.key, variationPropsMap[entry.key].orEmpty())
            }
        }

    private fun mergeComponentAndViewProps(
        componentProps: List<VariationProp>,
        variationProps: Collection<List<VariationProp>>,
        configuredViewBinding: Bindings?,
    ): List<VariationProp> {
        val viewValues = linkedSetOf<String>()
        variationProps.forEach { props ->
            props.firstOrNull { it.name == viewPropName }?.value?.let(viewValues::add)
        }
        if (viewValues.isEmpty()) return componentProps
        val viewProp = VariationProp(
            name = viewPropName,
            values = ((configuredViewBinding?.values ?: emptySet()) + viewValues).toSet(),
            defaultValue = configuredViewBinding?.defaultValue,
        )
        val existingIndex = componentProps.indexOfFirst { it.name == viewPropName }
        return if (existingIndex >= 0) {
            componentProps.toMutableList().apply { this[existingIndex] = viewProp }
        } else {
            componentProps + viewProp
        }
    }

    private fun getVariationName(variationId: String?): String = variationId?.toCamelCase().orEmpty()

    private fun getBuilderRef(isWrapperScope: Boolean): String {
        return if (isWrapperScope) {
            "builder"
        } else {
            "$componentStyleName.$styleBuilderFactoryFunName(this)"
        }
    }

    private fun VariationNode<*>.getDescription(): String {
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

    private fun String.asViewProp(): VariationProp = VariationProp(
        name = viewPropName,
        value = techToSnakeCase(),
    )

    private fun List<Binding>?.toVariationProps(): List<VariationProp> = this.orEmpty().map { binding ->
        VariationProp(
            name = binding.name,
            value = binding.value,
        )
    }

    private fun String.toCamelCase(): String {
        val segments = split(".", "-", "_")
        val result = StringBuilder()
        for (i in segments.indices) {
            val seg = segments[i]
            val prev = segments.getOrNull(i - 1)
            if (seg.all { it.isDigit() } && prev != null && prev.all { it.isDigit() }) {
                result.append("x")
                result.append(seg)
            } else {
                result.append(seg.capitalized())
            }
        }
        return result.toString()
    }
}
