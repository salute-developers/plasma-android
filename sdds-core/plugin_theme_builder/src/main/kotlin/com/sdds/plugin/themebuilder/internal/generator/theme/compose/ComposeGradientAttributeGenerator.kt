package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.FunParameter
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Getter
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

/**
 * Генератор Compose-атрибутов градиента.
 * Генерирует kt-файл, содержащий в себе все градиенты темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property ktFileFromResourcesBuilderFactory фабрика [KtFileFromResourcesBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeGradientAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) : SimpleBaseGenerator {

    private var tokenData: ComposeTokenData? = null
    private val gradientAttributes = mutableSetOf<String>()

    private val gradientKtFileBuilder: KtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(gradientClassName)
    }

    private val ktFileFromResBuilder: KtFileFromResourcesBuilder by unsafeLazy {
        ktFileFromResourcesBuilderFactory.create()
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val gradientClassName = "${camelThemeName}Gradients"
    private val gradientClassType by unsafeLazy {
        gradientKtFileBuilder.getInternalClassType(gradientClassName)
    }

    fun setGradientTokenData(data: ComposeTokenData) {
        tokenData = data
        gradientAttributes.clear()
        gradientAttributes.addAll(data.mergedLightAndDark())
    }

    override fun generate() {
        tokenData ?: return

        createGradientsFile()
        createLinearGradientClass()
        createRadialGradientClass()
        createSweepGradientClass()

        gradientKtFileBuilder.build(outputLocation)
    }

    private fun createLinearGradientClass() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "$RAW_KT_FILE_RES_DIR/$LINEAR_GRADIENT_CLASS_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = LINEAR_GRADIENT_CLASS_NAME,
        )
    }

    private fun createRadialGradientClass() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "$RAW_KT_FILE_RES_DIR/$RADIAL_GRADIENT_CLASS_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = RADIAL_GRADIENT_CLASS_NAME,
        )
    }

    private fun createSweepGradientClass() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "$RAW_KT_FILE_RES_DIR/$SWEEP_GRADIENT_CLASS_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = SWEEP_GRADIENT_CLASS_NAME,
        )
    }

    private fun createGradientsFile() {
        addImports()
        addGradientsClass()
        addMutableMapExtension()
        addLightGradientsFun()
        addDarkGradientsFun()
        addGradientOverrideScopeClass()
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
                name = "toString",
                modifiers = listOf(Modifier.OVERRIDE),
                body = listOf(
                    "return \"\${this::class.simpleName}(${
                        gradientAttributes.joinToString(
                            separator = ",·",
                        ) { "$it=$$it" }
                    })\"",
                ),
            )
        }
    }

    private fun addLocalGradientsVal() {
        gradientKtFileBuilder.appendRootVal(
            name = "Local$gradientClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            initializer = "staticCompositionLocalOf { light${camelThemeName}Gradients() }",
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
                    val defaultValue = defaultLightGradientValue(it)
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $gradientClassName(initial)",
            ),
            description = "Градиенты [$gradientClassName] для светлой темы",
        )
    }

    private fun defaultLightGradientValue(attrName: String): String {
        val lightLayers = tokenData?.light?.get(attrName)
        val darkLayers = tokenData?.dark?.get(attrName)

        val parameters: List<ComposeTokenData.Gradient>
        val objectName: String

        if (lightLayers != null) {
            parameters = lightLayers
            objectName = "LightGradientTokens"
        } else {
            parameters = darkLayers
                ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
            objectName = "DarkGradientTokens"
        }

        return "listOf(${parameters.joinToString(",") { createGradientFabricCall(objectName, it) }})"
    }

    private fun defaultDarkGradientValue(attrName: String): String {
        val lightLayers = tokenData?.light?.get(attrName)
        val darkLayers = tokenData?.dark?.get(attrName)

        val parameters: List<ComposeTokenData.Gradient>
        val objectName: String

        if (darkLayers != null) {
            parameters = darkLayers
            objectName = "DarkGradientTokens"
        } else {
            parameters = lightLayers
                ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
            objectName = "LightGradientTokens"
        }

        return "listOf(${parameters.joinToString(",") { createGradientFabricCall(objectName, it) }})"
    }

    private fun createGradientFabricCall(
        objectName: String,
        gradient: ComposeTokenData.Gradient,
    ): String {
        val funName = when (gradient.gradientType) {
            ComposeTokenData.GradientType.LINEAR -> "linearGradient"
            ComposeTokenData.GradientType.RADIAL -> "radialGradient"
            ComposeTokenData.GradientType.SWEEP -> "sweepGradient"
            ComposeTokenData.GradientType.BACKGROUND -> "singleColor"
        }
        return "$funName(${
            gradient.tokenRefs.joinToString(separator = ",·") { tokenRef ->
                "$objectName.$tokenRef"
            }
        })"
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
                    val defaultValue = defaultDarkGradientValue(it)
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $gradientClassName(initial)",
            ),
            description = "Градиенты [$gradientClassName] для темной темы",
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
                initializer = "mutableMapOf<String, List<ShaderBrush>>()",
                modifiers = listOf(Modifier.PRIVATE),
            )

            rootColorsClass.appendProperty(
                name = "overrideMap",
                typeName = KtFileBuilder.TypeMapOfListOfShaderBrush,
                modifiers = listOf(Modifier.INTERNAL),
                propGetter = Getter.Annotated(body = "return _overrideMap.toMap()"),
            )

            gradientAttributes.forEach { gradient ->
                rootColorsClass.appendProperty(
                    name = gradient,
                    typeName = KtFileBuilder.TypeString,
                    isMutable = false,
                    initializer = "\"$gradient\"",
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
                    type = KtFileBuilder.TypeFloat,
                ),
            ),
            body = listOf(
                "return $LINEAR_GRADIENT_CLASS_NAME(colors, positions.toList(), " +
                    "angleInDegrees = angle, useAsCssAngle = true)",
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
        private const val LINEAR_GRADIENT_CLASS_NAME = "ThmbldrLinearGradient"
        private const val RADIAL_GRADIENT_CLASS_NAME = "ThmbldrRadialGradient"
        private const val SWEEP_GRADIENT_CLASS_NAME = "ThmbldrSweepGradient"
    }
}
