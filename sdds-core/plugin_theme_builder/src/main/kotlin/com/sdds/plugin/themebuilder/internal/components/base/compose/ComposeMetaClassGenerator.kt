package com.sdds.plugin.themebuilder.internal.components.base.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.components.VariationInfo
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.capitalized
import com.squareup.kotlinpoet.ClassName

@JvmInline
internal value class MetaClassAppearance(val name: String)

internal data class ComposeMetaClassInfo(
    val coreComponentName: String,
    val styleClassName: ClassName?,
    val styleBuilderClassName: ClassName?,
    val appearances: Map<MetaClassAppearance, List<VariationInfo>>,
)

internal class ComposeMetaClassGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val componentPackage: String,
    private val outputLocation: KtFileBuilder.OutputLocation,
) {

    fun generate(
        info: ComposeMetaClassInfo,
    ) {
        val camelCoreComponentName = info.coreComponentName.toCamelCase()
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
            val enumClassName = "${camelCoreComponentName}Styles"
            val variations: Map<String, String> = info.appearances
                .flatMap { appearanceEntry ->
                    val variations = appearanceEntry.value
                    variations.map { appearanceEntry.key to it }
                }
                .mapNotNull { appearanceEntry ->
                    val appearanceName = appearanceEntry.first.name
                    val variation = appearanceEntry.second
                    val reference = variation.composeReference ?: return@mapNotNull null
                    "$appearanceName.${variation.name}" to reference.value
                }
                .associate { it.first to it.second }

            addCommonImports(info)
            addEnum(enumClassName, camelCoreComponentName, variations)
            addStyleFun(enumClassName, variations, info)
            build(outputLocation)
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
        variations: Map<String, String>,
    ) {
        rootEnum(
            name = enumClassName,
            description = "Вспомогательный объект для описания всех стилей компонента $camelCoreComponentName",
            primaryConstructor = KtFileBuilder.Constructor.Primary(
                parameters = listOf(
                    KtFileBuilder.FunParameter("key", KtFileBuilder.TypeString, asProperty = true),
                ),
            ),
            enumConstants = variations
                .map { variationEntry ->
                    val enumName = variationEntry.value.replace(".", "")
                    enumName to listOf("\"${variationEntry.value}\"")
                }
                .associate { it },

        )
    }

    @Suppress("SpreadOperator")
    private fun KtFileBuilder.addStyleFun(
        enumClassName: String,
        variations: Map<String, String>,
        info: ComposeMetaClassInfo,
    ) {
        val styleWhenBody: Array<String> = variations.mapNotNull {
            "   $enumClassName.${it.value.replace(".", "")} -> ${it.value}\n"
        }.toTypedArray()

        appendRootFun(
            "style",
            receiver = getInternalClassType(
                className = enumClassName,
                classPackage = componentPackage,
            ),
            params = listOf(
                KtFileBuilder.FunParameter(
                    "modifyAction",
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
                "val builder =  when (this) {\n",
                *styleWhenBody,
                "}\n",
                "return builder.modify(modifyAction).style()",
            ),
        )
    }

    private companion object {

        fun String.toCamelCase(): String {
            val segments = split(".", "-", "_")
            return segments.joinToString("") { it.capitalized() }
        }
    }
}
