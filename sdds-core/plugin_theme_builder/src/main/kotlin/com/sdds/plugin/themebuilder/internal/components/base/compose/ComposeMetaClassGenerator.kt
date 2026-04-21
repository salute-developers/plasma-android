package com.sdds.plugin.themebuilder.internal.components.base.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.ComposeStyleApiInfo
import com.sdds.plugin.themebuilder.internal.components.ComposeStyleApiParam
import com.sdds.plugin.themebuilder.internal.components.ComposeStyleApiParamType
import com.sdds.plugin.themebuilder.internal.components.ComposeStyleApiValue
import com.sdds.plugin.themebuilder.internal.components.VariationInfo
import com.sdds.plugin.themebuilder.internal.components.VariationProp
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec

@JvmInline
internal value class MetaClassAppearance(val name: String)

internal data class ComposeMetaClassInfo(
    val coreComponentName: String,
    val styleClassName: ClassName?,
    val styleBuilderClassName: ClassName?,
    val appearances: Map<MetaClassAppearance, AppearanceInfo>,
)

internal data class AppearanceInfo(
    val props: List<VariationProp>,
    val variations: List<VariationInfo>,
)

internal fun buildComposeStyleApiInfos(
    info: ComposeMetaClassInfo,
    componentPackage: String,
): Map<MetaClassAppearance, ComposeStyleApiInfo> {
    val camelCoreComponentName = info.coreComponentName.toCamelCase()
    val stylesClass = ClassName(componentPackage, "${camelCoreComponentName}Styles")
    return buildAppearanceModels(
        info = info,
        camelCoreComponentName = camelCoreComponentName,
    ).associate { appearance ->
        val receiverClass = if (appearance.holderName == null) {
            ClassName(componentPackage, stylesClass.simpleNames.last(), "Companion")
        } else {
            ClassName(componentPackage, stylesClass.simpleNames.last(), appearance.holderName)
        }
        appearance.appearance to ComposeStyleApiInfo(
            packageName = componentPackage,
            stylesClassName = stylesClass.renderSimpleName(),
            stylesClassQualifiedName = stylesClass.renderQualifiedName(),
            receiverClassName = receiverClass.renderSimpleName(),
            receiverClassQualifiedName = receiverClass.renderQualifiedName(),
            holderName = appearance.holderName,
            params = appearance.props.map { prop ->
                val parameterType = prop.type.asApiTypeName(componentPackage)
                ComposeStyleApiParam(
                    name = prop.parameterName,
                    type = when (prop.type) {
                        PropType.Boolean -> ComposeStyleApiParamType.BOOLEAN
                        is PropType.Enum -> ComposeStyleApiParamType.ENUM
                    },
                    required = prop.required,
                    typeName = parameterType.simpleName,
                    typeQualifiedName = parameterType.qualifiedName,
                    defaultValue = prop.defaultValue?.let { defaultValue ->
                        ComposeStyleApiValue(
                            value = defaultValue,
                            codeName = prop.type.toCodeName(defaultValue),
                        )
                    },
                    values = when (val type = prop.type) {
                        PropType.Boolean -> listOf(
                            ComposeStyleApiValue(value = "true", codeName = "true"),
                            ComposeStyleApiValue(value = "false", codeName = "false"),
                        )
                        is PropType.Enum -> type.values.map { value ->
                            ComposeStyleApiValue(
                                value = value,
                                codeName = value.toPropEnumName(),
                            )
                        }
                    },
                )
            },
            returnTypeName = info.styleClassName?.renderSimpleName().orEmpty(),
            returnTypeQualifiedName = info.styleClassName?.renderQualifiedName().orEmpty(),
            modifyReceiverTypeName = info.styleBuilderClassName?.renderSimpleName().orEmpty(),
            modifyReceiverTypeQualifiedName = info.styleBuilderClassName?.renderQualifiedName().orEmpty(),
        )
    }
}

internal class ComposeMetaClassGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val outputLocation: KtFileBuilder.OutputLocation,
) {

    fun generate(
        info: ComposeMetaClassInfo,
    ) {
        val camelCoreComponentName = info.coreComponentName.toCamelCase()
        val enumClassName = "${camelCoreComponentName}Styles"
        val appearanceModels = buildAppearanceModels(info, camelCoreComponentName)
        val styleEntries = buildStyleEntries(info)
        val objectFileBuilder = ktFileBuilderFactory.create(
            fileName = "${camelCoreComponentName}StylesCollection",
            fullPackageName = componentPackage,
        )
        objectFileBuilder.addSuppressAnnotation(
            "UndocumentedPublicClass",
            "UndocumentedPublicProperty",
            "ktlint:standard:max-line-length",
            "MatchingDeclarationName",
            "CyclomaticComplexMethod",
            "LongMethod",
        )

        with(objectFileBuilder) {
            addCommonImports(info)
            val stylesEnum = addEnum(enumClassName, camelCoreComponentName, styleEntries)
            addStyleFun(enumClassName, styleEntries, info)
            addTypedApis(
                enumBuilder = stylesEnum,
                enumClassName = enumClassName,
                appearanceModels = appearanceModels,
                info = info,
            )
            build(outputLocation)
        }
    }

    private fun buildStyleEntries(info: ComposeMetaClassInfo): List<StyleEntry> =
        info.appearances.flatMap { (appearance, appearanceInfo) ->
            appearanceInfo.variations.mapNotNull { variation ->
                val reference = variation.composeReference ?: return@mapNotNull null
                StyleEntry(
                    appearance = appearance,
                    variation = variation,
                    reference = reference.value,
                )
            }
        }

    private fun KtFileBuilder.addCommonImports(info: ComposeMetaClassInfo) {
        val styleTypeName = info.styleClassName
        val styleBuilderTypeName = info.styleBuilderClassName

        styleTypeName?.let { addImport(it) }
        styleBuilderTypeName?.let { addImport(styleBuilderTypeName) }
        addImport(
            packageName = "com.sdds.compose.uikit.style",
            names = listOf("style", "modify"),
        )
    }

    private fun KtFileBuilder.addEnum(
        enumClassName: String,
        camelCoreComponentName: String,
        entries: List<StyleEntry>,
    ): TypeSpec.Builder {
        return rootEnum(
            name = enumClassName,
            description = "Вспомогательный объект для описания всех стилей компонента $camelCoreComponentName",
            primaryConstructor = KtFileBuilder.Constructor.Primary(
                parameters = listOf(
                    KtFileBuilder.FunParameter("key", KtFileBuilder.TypeString, asProperty = true),
                ),
            ),
            enumConstants = entries.associate { entry ->
                entry.reference.toStyleEnumName() to listOf("\"${entry.reference}\"")
            },
        )
    }

    @Suppress("SpreadOperator")
    private fun KtFileBuilder.addStyleFun(
        enumClassName: String,
        entries: List<StyleEntry>,
        info: ComposeMetaClassInfo,
    ) {
        val styleWhenBody: Array<String> = entries.map {
            "   $enumClassName.${it.reference.toStyleEnumName()} -> ${it.reference}\n"
        }.toTypedArray()

        appendRootFun(
            "style",
            receiver = getInternalClassType(
                className = enumClassName,
                classPackage = componentPackage,
            ),
            params = listOf(
                KtFileBuilder.FunParameter(
                    "modify",
                    KtFileBuilder.getLambdaType(
                        annotation = KtFileBuilder.TypeAnnotationComposable,
                        receiver = info.styleBuilderClassName,
                    ),
                    defValue = "{}",
                ),
            ),
            annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
            returnType = info.styleClassName,
            description = "Возвращает [${info.styleClassName?.simpleName}] для [$enumClassName]",
            body = listOf(
                "val builder = when (this) {\n",
                *styleWhenBody,
                "}\n",
                "return builder.modify(modify).style()",
            ),
        )
    }

    private fun KtFileBuilder.addTypedApis(
        enumBuilder: TypeSpec.Builder,
        enumClassName: String,
        appearanceModels: List<AppearanceModel>,
        info: ComposeMetaClassInfo,
    ) {
        val singleAppearance = appearanceModels.size == 1
        appearanceModels.forEach { appearance ->
            appearance.props.forEach { prop ->
                val type = prop.type as? PropType.Enum ?: return@forEach
                rootEnum(
                    name = type.enumClassName,
                    description = "Возможные значения свойства ${prop.sourceName} для ${appearance.appearance.name}",
                    enumConstants = type.values.associate { value ->
                        value.toPropEnumName() to emptyList()
                    },
                )
            }

            val receiverType = if (singleAppearance) {
                enumBuilder.addType(
                    TypeSpec.companionObjectBuilder()
                        .addKdoc("Typed API для подбора стиля ${appearance.appearance.name}")
                        .build(),
                )
                ClassName(componentPackage, enumClassName, "Companion")
            } else {
                enumBuilder.addType(
                    TypeSpec.objectBuilder(appearance.holderName!!)
                        .addKdoc("Typed API для подбора стиля ${appearance.appearance.name}")
                        .build(),
                )
                ClassName(componentPackage, enumClassName, appearance.holderName)
            }

            addResolveFun(
                receiverType = receiverType,
                enumClassName = enumClassName,
                appearance = appearance,
            )
            addTypedStyleFun(
                receiverType = receiverType,
                enumClassName = enumClassName,
                appearance = appearance,
                info = info,
            )
        }
    }

    private fun KtFileBuilder.addResolveFun(
        receiverType: ClassName,
        enumClassName: String,
        appearance: AppearanceModel,
    ) {
        if (appearance.props.isEmpty()) {
            val fallbackStyle = appearance.variations.firstOrNull()
                ?: error("No variations available for `${appearance.appearance.name}`")
            appendRootFun(
                name = "resolve",
                receiver = receiverType,
                modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
                returnType = ClassName(componentPackage, enumClassName),
                body = listOf(
                    "return $enumClassName.${fallbackStyle.reference.toStyleEnumName()}",
                ),
            )
            return
        }
        val params = appearance.props.map { prop ->
            KtFileBuilder.FunParameter(
                name = prop.parameterName,
                type = prop.type.asTypeName(componentPackage),
                defValue = prop.defaultValue?.let(prop::toDefaultValueExpression),
            )
        }
        val whenBranches = appearance.variations
            .sortedByDescending { it.props.size }
            .map { variation ->
                val condition = appearance.props
                    .mapNotNull { prop ->
                        val value = variation.props[prop.sourceName] ?: return@mapNotNull null
                        prop.toCondition(value)
                    }
                    .joinToString(" && ")
                val resolvedCondition = condition.ifBlank { "true" }
                "    $resolvedCondition -> $enumClassName.${variation.reference.toStyleEnumName()}\n"
            }
        appendRootFun(
            name = "resolve",
            receiver = receiverType,
            params = params,
            modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
            returnType = ClassName(componentPackage, enumClassName),
            body = listOf(
                "return when {\n",
                *whenBranches.toTypedArray(),
                "    else -> error(\"Unsupported ${appearance.appearance.name} style combination\")\n",
                "}\n",
            ),
        )
    }

    private fun KtFileBuilder.addTypedStyleFun(
        receiverType: ClassName,
        enumClassName: String,
        appearance: AppearanceModel,
        info: ComposeMetaClassInfo,
    ) {
        val params = appearance.props.map { prop ->
            KtFileBuilder.FunParameter(
                name = prop.parameterName,
                type = prop.type.asTypeName(componentPackage),
                defValue = prop.defaultValue?.let(prop::toDefaultValueExpression),
            )
        } + KtFileBuilder.FunParameter(
            "modify",
            KtFileBuilder.getLambdaType(
                annotation = KtFileBuilder.TypeAnnotationComposable,
                receiver = info.styleBuilderClassName,
            ),
            defValue = "{}",
        )
        val resolveArgs = appearance.props.joinToString(", ") { it.parameterName }
        appendRootFun(
            name = "style",
            receiver = receiverType,
            params = params,
            annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
            returnType = info.styleClassName,
            body = listOf(
                "return resolve($resolveArgs).style(modify)",
            ),
            description = "Возвращает [${info.styleClassName?.simpleName}] для ${appearance.appearance.name}",
        )
    }

    private fun PropModel.toCondition(value: String): String {
        return when (val kind = type) {
            PropType.Boolean -> "$parameterName == $value"
            is PropType.Enum -> "$parameterName == ${kind.enumClassName}.${value.toPropEnumName()}"
        }
    }

    private fun PropType.asTypeName(componentPackage: String) = when (this) {
        PropType.Boolean -> KtFileBuilder.TypeBoolean
        is PropType.Enum -> ClassName(componentPackage, enumClassName)
    }
}

private fun buildAppearanceModels(
    info: ComposeMetaClassInfo,
    camelCoreComponentName: String,
): List<AppearanceModel> {
    val hasSingleAppearance = info.appearances.size == 1
    return info.appearances.map { (appearance, appearanceInfo) ->
        val typedVariations = appearanceInfo.variations
            .filter { it.composeReference != null }
            .map { variation ->
                TypedVariation(
                    variation = variation,
                    reference = variation.composeReference!!.value,
                    props = variation.props.associate { prop ->
                        prop.name to (prop.value ?: "")
                    },
                )
            }
        val props = buildPropModels(
            camelCoreComponentName = camelCoreComponentName,
            appearance = appearance,
            componentProps = appearanceInfo.props,
            variations = typedVariations,
            includeAppearanceInName = !hasSingleAppearance,
        )
        AppearanceModel(
            appearance = appearance,
            holderName = if (hasSingleAppearance) null else appearance.toHolderName(camelCoreComponentName),
            props = props,
            variations = typedVariations,
        )
    }
}

private fun buildPropModels(
    camelCoreComponentName: String,
    appearance: MetaClassAppearance,
    componentProps: List<VariationProp>,
    variations: List<TypedVariation>,
    includeAppearanceInName: Boolean,
): List<PropModel> {
    val appearanceSuffix = if (includeAppearanceInName) appearance.toHolderName(camelCoreComponentName) else ""
    return componentProps.map { prop ->
        val values = prop.values?.toList().orEmpty()
        val propType = if (values.isEmpty()) {
            PropType.Boolean
        } else {
            PropType.Enum(
                enumClassName = "${camelCoreComponentName}${appearanceSuffix}${prop.name.toCamelCase()}",
                values = values,
            )
        }
        PropModel(
            sourceName = prop.name,
            parameterName = prop.name.toParameterName(),
            required = prop.defaultValue == null,
            defaultValue = prop.defaultValue,
            type = propType,
        )
    }
        .onEach { prop ->
            prop.defaultValue?.let { defaultValue ->
                when (val type = prop.type) {
                    PropType.Boolean -> require(defaultValue == "true" || defaultValue == "false") {
                        "Invalid boolean defaultValue `$defaultValue` for binding `${prop.sourceName}` " +
                            "in `${appearance.name}`"
                    }
                    is PropType.Enum -> require(defaultValue in type.values) {
                        "Invalid enum defaultValue `$defaultValue` for binding `${prop.sourceName}`" +
                            " in `${appearance.name}`"
                    }
                }
            }
            val hasMissingProps = variations.any { variation -> !variation.props.containsKey(prop.sourceName) }
            if (prop.defaultValue == null && hasMissingProps) {
                error("Missing defaultValue for binding `${prop.sourceName}` in `${appearance.name}`")
            }
        }
}

private fun String.toCamelCase(): String {
    val segments = split(".", "-", "_")
    return segments.joinToString("") { it.capitalized() }
}

private fun MetaClassAppearance.toHolderName(camelCoreComponentName: String): String {
    val camelName = name.toCamelCase()
    return camelName
        .removePrefix(camelCoreComponentName)
        .ifBlank { "Default" }
}

private fun String.toStyleEnumName(): String {
    val candidate = replace(".", "").replace("-", "").replace("_", "").replace(" ", "")
    return candidate.ensureIdentifier(prefix = "Style")
}

private fun String.toPropEnumName(): String {
    return toCamelCase().ensureIdentifier(prefix = "Value")
}

private fun String.toParameterName(): String {
    val camel = toCamelCase()
    return camel.replaceFirstChar { it.lowercase() }.ensureIdentifier(prefix = "value")
}

private fun String.ensureIdentifier(prefix: String): String {
    val sanitized = replace(Regex("[^A-Za-z0-9_]"), "")
    return when {
        sanitized.isBlank() -> prefix
        sanitized.first().isDigit() -> "$prefix$sanitized"
        else -> sanitized
    }
}

private fun PropType.asApiTypeName(componentPackage: String): ApiTypeName = when (this) {
    PropType.Boolean -> ApiTypeName(
        simpleName = "Boolean",
        qualifiedName = "kotlin.Boolean",
    )
    is PropType.Enum -> ApiTypeName(
        simpleName = enumClassName,
        qualifiedName = "$componentPackage.$enumClassName",
    )
}

private fun PropModel.toDefaultValueExpression(defaultValue: String): String = when (val type = type) {
    PropType.Boolean -> defaultValue
    is PropType.Enum -> "${type.enumClassName}.${defaultValue.toPropEnumName()}"
}

private fun PropType.toCodeName(value: String): String = when (this) {
    PropType.Boolean -> value
    is PropType.Enum -> value.toPropEnumName()
}

private fun ClassName.renderSimpleName(): String = simpleNames.joinToString(".")

private fun ClassName.renderQualifiedName(): String = "$packageName.${renderSimpleName()}"

private data class StyleEntry(
    val appearance: MetaClassAppearance,
    val variation: VariationInfo,
    val reference: String,
)

private data class AppearanceModel(
    val appearance: MetaClassAppearance,
    val holderName: String?,
    val props: List<PropModel>,
    val variations: List<TypedVariation>,
)

private data class TypedVariation(
    val variation: VariationInfo,
    val reference: String,
    val props: Map<String, String>,
)

private data class PropModel(
    val sourceName: String,
    val parameterName: String,
    val required: Boolean,
    val defaultValue: String?,
    val type: PropType,
)

private sealed interface PropType {
    object Boolean : PropType

    data class Enum(
        val enumClassName: String,
        val values: List<String>,
    ) : PropType
}

private data class ApiTypeName(
    val simpleName: String,
    val qualifiedName: String,
)
