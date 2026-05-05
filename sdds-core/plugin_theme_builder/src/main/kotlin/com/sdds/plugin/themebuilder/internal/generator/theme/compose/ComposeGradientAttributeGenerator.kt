package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.TypeString
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.nullable
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.FunParameter
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Getter
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INFIX
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.GradientTokenGenerator.Companion.DARK_GRADIENT_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.GradientTokenGenerator.Companion.LIGHT_GRADIENT_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.asClassName

/**
 * Генератор Compose-атрибутов градиента.
 * Генерирует kt-файл, содержащий в себе все градиенты темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeGradientAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {

    private var tokenData: Map<Tenant, ComposeTokenData> = emptyMap()
    private val gradientAttributes = mutableSetOf<String>()

    private val gradientKtFileBuilder: KtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(gradientClassName, TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val gradientClassName = "${camelThemeName}Gradients"
    private val gradientClassType by unsafeLazy {
        gradientKtFileBuilder.getInternalClassType(gradientClassName)
    }

    fun setGradientTokenData(data: Map<Tenant, ComposeTokenData>) {
        tokenData = data
        val defaultTenantData = data[Tenant.Default] ?: return
        gradientAttributes.clear()
        gradientAttributes.addAll(defaultTenantData.mergedLightAndDark())
    }

    override fun generate() {
        if (tokenData.isEmpty()) return
        createGradientsFile()
        gradientKtFileBuilder.build(outputLocation)
    }

    private fun createGradientsFile() {
        addImports()
        addGradientsClass()
        addMutableMapExtension()
        addLightGradientsFun()
        addLightTenants()
        addDarkGradientsFun()
        addDarkTenants()
        addGradientOverrideScopeClass()
        addGradientAttrOverrideScopeClass()
        addLinearGradientFun()
        addRadialGradientFun()
        addSweepGradientFun()
        addSingleColorFun()
        addLocalGradientsVal()
        addGradientModifier()
    }

    private fun addImports() {
        with(gradientKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                ),
            )
            addImport(
                packageName = "androidx.compose.ui",
                names = listOf("Modifier"),
            )
            addImport(
                packageName = "androidx.compose.ui.draw",
                names = listOf("drawBehind"),
            )
            addImport(
                packageName = "androidx.compose.ui.graphics",
                names = listOf("Color", "ShaderBrush"),
            )
            addImport(
                packageName = "com.sdds.compose.uikit.graphics",
                names = listOf("Gradients"),
            )
            addImport(KtFileBuilder.TypeOffset)
            tokenData.forEach { (tenant, data) ->
                if (data.dark.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${DARK_GRADIENT_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
                if (data.light.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${LIGHT_GRADIENT_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
            }
        }
    }

    private fun addGradientsClass() {
        with(gradientKtFileBuilder) {
            val rootGradientClass = rootClass(
                name = gradientClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = listOf(
                        FunParameter(
                            name = "gradients",
                            type = KtFileBuilder.TypeMapOfListOfShaderBrush,
                            asProperty = true,
                            modifiers = listOf(Modifier.PRIVATE),
                        ),
                    ),
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Градиенты $camelThemeName",
            )

            gradientAttributes.forEach { gradient ->
                rootGradientClass.appendProperty(
                    name = gradient,
                    typeName = KtFileBuilder.TypeListOfShaderBrush,
                    delegate = "gradients",
                    description = tokenData[Tenant.Default]?.description(gradient).orEmpty(),
                )
            }

            rootGradientClass.appendFun(
                name = "copy",
                returnType = getInternalClassType(gradientClassName),
                params = listOf(
                    FunParameter(
                        name = "overrideGradients",
                        type = KtFileBuilder.getLambdaType(
                            receiver = gradientKtFileBuilder.getInternalClassType("GradientOverrideScope"),
                        ),
                        defValue = "{}",
                    ),
                ),
                body = listOf(
                    "val gradientOverrideScope = GradientOverrideScope()\n",
                    "overrideGradients.invoke(gradientOverrideScope)\n",
                    "val overrideMap = gradientOverrideScope.overrideMap\n",
                    "return $gradientClassName(gradients.mapValues { overrideMap[it.key] ?: it.value })",
                ),
                description = "Возвращает копию [$gradientClassName]. " +
                    "Предоставляет возможность переопределять градиенты.",
            )

            rootGradientClass.appendFun(
                name = "copyAttrs",
                returnType = getInternalClassType(gradientClassName),
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "overrideGradients",
                        type = KtFileBuilder.getLambdaType(
                            receiver = gradientKtFileBuilder.getInternalClassType("GradientAttrOverrideScope"),
                        ),
                        defValue = "{}",
                    ),
                ),
                body = listOf(
                    "val gradientOverrideScope = GradientAttrOverrideScope()\n",
                    "overrideGradients.invoke(gradientOverrideScope)\n",
                    "val overrideMap = gradientOverrideScope.overrideMap\n",
                    "return $gradientClassName(gradients.mapValues { gradients[overrideMap[it.key]] ?: it.value })",
                ),
                modifiers = listOf(INTERNAL),
                description = "Возвращает копию [$gradientClassName]. " +
                    "Предоставляет возможность переопределять цвета.",
            )
        }
    }

    private fun addLocalGradientsVal() {
        gradientKtFileBuilder.appendRootVal(
            name = "Local$gradientClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            initializer = """
                staticCompositionLocalOf·{
                    light${camelThemeName}Gradients()
                }
            """.trimIndent(),
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addMutableMapExtension() {
        gradientKtFileBuilder.appendRootFun(
            name = "add",
            params = listOf(
                FunParameter(
                    name = "attribute",
                    type = KtFileBuilder.TypeString,
                ),
                FunParameter(
                    name = "defaultTokenValue",
                    type = KtFileBuilder.TypeListOfShaderBrush,
                ),
                FunParameter(
                    name = "overwriteMap",
                    type = KtFileBuilder.TypeMapOfListOfShaderBrush,
                ),
            ),
            modifiers = listOf(Modifier.PRIVATE),
            receiver = KtFileBuilder.TypeMutableMapOfListOfShaderBrush,
            body = listOf("this[attribute] = overwriteMap[attribute] ?: defaultTokenValue"),
        )
    }

    private fun addLightTenants() {
        tokenData
            .filter { it.key != Tenant.Default }
            .forEach { (tenant, data) ->
                if (data.light.isNotEmpty()) {
                    gradientKtFileBuilder.appendRootFun(
                        name = "light${camelThemeName}Gradients${tenant.name}",
                        params = listOf(
                            KtFileBuilder.FunParameter(
                                name = "overrideGradients",
                                type = KtFileBuilder.getLambdaType(
                                    receiver = gradientKtFileBuilder.getInternalClassType("GradientOverrideScope"),
                                ),
                                defValue = "{}",
                            ),
                        ),
                        returnType = gradientClassType,
                        body = listOf(
                            "return light${camelThemeName}Gradients {\n",
                            data.light.entries.joinToString(separator = "\n") {
                                "${it.key} overrideBy ${lightGradientValue(it.key, tenant)}"
                            },
                            "\noverrideGradients()",
                            "\n}",
                        ),
                        description = "Градиенты [$gradientClassName] для светлой темы в тенанте ${tenant.name}",
                        suppressAnnotations = listOf("LongMethod"),
                    )
                }
            }
    }

    private fun addDarkTenants() {
        tokenData
            .filter { it.key != Tenant.Default }
            .forEach { (tenant, data) ->
                if (data.dark.isNotEmpty()) {
                    gradientKtFileBuilder.appendRootFun(
                        name = "dark${camelThemeName}Gradients${tenant.name}",
                        params = listOf(
                            KtFileBuilder.FunParameter(
                                name = "overrideGradients",
                                type = KtFileBuilder.getLambdaType(
                                    receiver = gradientKtFileBuilder.getInternalClassType("GradientOverrideScope"),
                                ),
                                defValue = "{}",
                            ),
                        ),
                        returnType = gradientClassType,
                        body = listOf(
                            "return dark${camelThemeName}Gradients {\n",
                            data.light.entries.joinToString(separator = "\n") {
                                "${it.key} overrideBy ${darkGradientValue(it.key, tenant)}"
                            },
                            "\noverrideGradients()",
                            "\n}",
                        ),
                        description = "Градиенты [$gradientClassName] для темной темы в тенанте ${tenant.name}",
                        suppressAnnotations = listOf("LongMethod"),
                    )
                }
            }
    }

    private fun addLightGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "light${camelThemeName}Gradients",
            params = listOf(
                FunParameter(
                    name = "overrideGradients",
                    type = KtFileBuilder.getLambdaType(
                        receiver = gradientKtFileBuilder.getInternalClassType("GradientOverrideScope"),
                    ),
                    defValue = "{}",
                ),
            ),
            returnType = gradientClassType,
            body = listOf(
                "val gradientOverrideScope = GradientOverrideScope()\n",
                "overrideGradients.invoke(gradientOverrideScope)\n",
                "val overwrite = gradientOverrideScope.overrideMap\n",
                "val initial = mutableMapOf<String, List<ShaderBrush>>()\n",
                gradientAttributes.joinToString(separator = "\n") {
                    val defaultValue = lightGradientValue(it, Tenant.Default)
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $gradientClassName(initial)",
            ),
            description = "Градиенты [$gradientClassName] для светлой темы",
            suppressAnnotations = listOf("LongMethod"),
        )
    }

    private fun lightGradientValue(attrName: String, tenant: Tenant): String {
        val data = tokenData[tenant]
        val lightLayers = data?.light?.get(attrName)
        val darkLayers = data?.dark?.get(attrName)

        val parameters: List<ComposeTokenData.Gradient> = lightLayers
            ?: darkLayers
            ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")

        return KtFileBuilder.createFunCall(
            "listOf",
            parameters.map { createGradientFabricCall(it) },
        )
    }

    private fun darkGradientValue(attrName: String, tenant: Tenant): String {
        val data = tokenData[tenant]
        val lightLayers = data?.light?.get(attrName)
        val darkLayers = data?.dark?.get(attrName)

        val parameters: List<ComposeTokenData.Gradient> = darkLayers
            ?: lightLayers
            ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
        return KtFileBuilder.createFunCall(
            "listOf",
            parameters.map { createGradientFabricCall(it) },
        )
    }

    private fun createGradientFabricCall(
        gradient: ComposeTokenData.Gradient,
    ): String {
        val funName = when (gradient.gradientType) {
            ComposeTokenData.GradientType.LINEAR -> "linearGradient"
            ComposeTokenData.GradientType.RADIAL -> "radialGradient"
            ComposeTokenData.GradientType.SWEEP -> "sweepGradient"
            ComposeTokenData.GradientType.BACKGROUND -> "singleColor"
        }
        return KtFileBuilder.createFunCall(
            funName = funName,
            parameters = gradient.tokenRefs.map { "${gradient.tokenObjectName}.$it" },
        )
    }

    private fun addDarkGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "dark${camelThemeName}Gradients",
            params = listOf(
                FunParameter(
                    name = "overrideGradients",
                    type = KtFileBuilder.getLambdaType(
                        receiver = gradientKtFileBuilder.getInternalClassType("GradientOverrideScope"),
                    ),
                    defValue = "{}",
                ),
            ),
            returnType = gradientClassType,
            body = listOf(
                "val gradientOverrideScope = GradientOverrideScope()\n",
                "overrideGradients.invoke(gradientOverrideScope)\n",
                "val overwrite = gradientOverrideScope.overrideMap\n",
                "val initial = mutableMapOf<String, List<ShaderBrush>>()\n",
                gradientAttributes.joinToString(separator = "\n") {
                    val defaultValue = darkGradientValue(it, Tenant.Default)
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $gradientClassName(initial)",
            ),
            description = "Градиенты [$gradientClassName] для темной темы",
            suppressAnnotations = listOf("LongMethod"),
        )
    }

    private fun addGradientOverrideScopeClass() {
        with(gradientKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = "GradientOverrideScope",
                description = "Скоуп переопределения градиентов",
            )

            rootColorsClass.appendProperty(
                name = "_overrideMap",
                typeName = KtFileBuilder.TypeMutableMapOfListOfShaderBrush,
                initializer = "mutableMapOf()",
                modifiers = listOf(Modifier.PRIVATE),
            )

            rootColorsClass.appendProperty(
                name = "overrideMap",
                typeName = KtFileBuilder.TypeMapOfListOfShaderBrush,
                modifiers = listOf(INTERNAL),
                propGetter = Getter.Annotated(body = "return _overrideMap.toMap()"),
            )

            gradientAttributes.forEach { gradient ->
                rootColorsClass.appendProperty(
                    name = gradient,
                    typeName = KtFileBuilder.TypeString,
                    isMutable = false,
                    initializer = "\"$gradient\"",
                    description = tokenData[Tenant.Default]?.description(gradient),
                )
            }

            rootColorsClass.appendFun(
                name = "overrideBy",
                params = listOf(
                    FunParameter(name = "gradient", type = KtFileBuilder.TypeListOfShaderBrush),
                ),
                modifiers = listOf(Modifier.INFIX),
                receiver = KtFileBuilder.TypeString,
                body = listOf("_overrideMap[this] = gradient"),
                description = "Переопределяет аттрибут градиента.",
            )
        }
    }

    private fun addGradientAttrOverrideScopeClass() {
        with(gradientKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = "GradientAttrOverrideScope",
                description = "Скоуп переопределения градиентов",
            )
            val mutableMapType = ClassName(
                "kotlin.collections",
                "MutableMap",
            ).parameterizedBy(TypeString, TypeString)
            val mapType = Map::class.asClassName().parameterizedBy(TypeString, TypeString)

            rootColorsClass.appendProperty(
                name = "_overrideMap",
                typeName = mutableMapType,
                initializer = "mutableMapOf()",
                modifiers = listOf(Modifier.PRIVATE),
            )

            rootColorsClass.appendProperty(
                name = "overrideMap",
                typeName = mapType,
                modifiers = listOf(INTERNAL),
                propGetter = Getter.Annotated(body = "return _overrideMap.toMap()"),
            )

            gradientAttributes.forEach { gradient ->
                rootColorsClass.appendProperty(
                    name = gradient,
                    typeName = KtFileBuilder.TypeString,
                    isMutable = false,
                    initializer = "\"$gradient\"",
                    description = tokenData[Tenant.Default]?.description(gradient),
                )
            }

            rootColorsClass.appendFun(
                name = "overrideBy",
                params = listOf(
                    FunParameter("gradient", type = KtFileBuilder.TypeString),
                ),
                modifiers = listOf(INFIX),
                receiver = KtFileBuilder.TypeString,
                body = listOf("_overrideMap[this] = gradient"),
                description = "Переопределяет аттрибут градиента.",
            )
        }
    }

    private fun addLinearGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "linearGradient",
            modifiers = listOf(INTERNAL),
            returnType = KtFileBuilder.TypeShaderBrush,
            params = listOf(
                FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeListOfColors,
                    null,
                    false,
                ),
                FunParameter(
                    name = "positions",
                    type = KtFileBuilder.TypeFloatArray,
                    null,
                    false,
                ),
                FunParameter(
                    name = "angle",
                    defValue = "0f",
                    type = KtFileBuilder.TypeFloat,
                ),
                FunParameter(
                    name = "startPoint",
                    type = KtFileBuilder.TypeOffset.nullable(),
                    defValue = "null",
                    asProperty = false,
                ),
                FunParameter(
                    name = "endPoint",
                    type = KtFileBuilder.TypeOffset.nullable(),
                    defValue = "null",
                    asProperty = false,
                ),
            ),
            body = listOf(
                "return $LINEAR_GRADIENT_CLASS_NAME(colors, positions.toList(), angle, startPoint, endPoint)",
            ),
        )
    }

    private fun addRadialGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "radialGradient",
            modifiers = listOf(INTERNAL),
            returnType = KtFileBuilder.TypeShaderBrush,
            params = listOf(
                FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeListOfColors,
                    null,
                    false,
                ),
                FunParameter(
                    name = "positions",
                    type = KtFileBuilder.TypeFloatArray,
                    null,
                    false,
                ),
                FunParameter(
                    name = "radius",
                    type = KtFileBuilder.TypeFloat,
                ),
                FunParameter(
                    name = "centerX",
                    type = KtFileBuilder.TypeFloat,
                ),
                FunParameter(
                    name = "centerY",
                    type = KtFileBuilder.TypeFloat,
                ),
            ),
            body = listOf(
                "return $RADIAL_GRADIENT_CLASS_NAME(colors, positions.toList(), radius, centerX, centerY)",
            ),
        )
    }

    private fun addSweepGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "sweepGradient",
            modifiers = listOf(INTERNAL),
            returnType = KtFileBuilder.TypeShaderBrush,
            params = listOf(
                FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeListOfColors,
                    null,
                    false,
                ),
                FunParameter(
                    name = "positions",
                    type = KtFileBuilder.TypeFloatArray,
                    null,
                    false,
                ),
                FunParameter(
                    name = "centerX",
                    type = KtFileBuilder.TypeFloat,
                ),
                FunParameter(
                    name = "centerY",
                    type = KtFileBuilder.TypeFloat,
                ),
            ),
            body = listOf(
                "return $SWEEP_GRADIENT_CLASS_NAME(colors, positions.toList(), centerX, centerY)",
            ),
        )
    }

    private fun addSingleColorFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "singleColor",
            modifiers = listOf(INTERNAL),
            returnType = KtFileBuilder.TypeShaderBrush,
            params = listOf(
                FunParameter(
                    name = "color",
                    type = KtFileBuilder.TypeColor,
                    null,
                    false,
                ),
            ),
            body = listOf(
                "return $LINEAR_GRADIENT_CLASS_NAME(listOf(color, color), listOf(0f, 1f))",
            ),
        )
    }

    private fun addGradientModifier() {
        gradientKtFileBuilder.appendRootFun(
            name = "compositeGradient",
            params = listOf(
                FunParameter(
                    name = "brushes",
                    type = KtFileBuilder.TypeListOfBrush,
                ),
            ),
            body = listOf("return this then Modifier.drawBehind { brushes.forEach(::drawRect) }"),
            returnType = KtFileBuilder.TypeModifier,
            receiver = KtFileBuilder.TypeModifier,
            annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
            description = "Модификатор, позволяющий применить композитный градиент.",
        )
    }

    private companion object {
        private const val RAW_KT_FILE_RES_DIR = "raw-kt-files/compose"
        private const val LINEAR_GRADIENT_CLASS_NAME = "Gradients.Linear"
        private const val RADIAL_GRADIENT_CLASS_NAME = "Gradients.Radial"
        private const val SWEEP_GRADIENT_CLASS_NAME = "Gradients.Sweep"
    }
}
