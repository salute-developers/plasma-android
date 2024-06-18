package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized

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

    private val gradientClassName = "${themeName.capitalized()}Gradients"

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
        addLightGradientsFun()
        addDarkGradientsFun()
        addLinearGradientFun()
        addRadialGradientFun()
        addSweepGradientFun()
        addLocalGradientsVal()
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
                packageName = "androidx.compose.ui.graphics",
                names = listOf("Color", "ShaderBrush"),
            )
        }
    }

    private fun addGradientsClass() {
        with(gradientKtFileBuilder) {
            rootClass(
                name = gradientClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = gradientAttributes.map {
                        KtFileBuilder.FunParameter(
                            name = it,
                            type = KtFileBuilder.TypeShaderBrush,
                            asProperty = true,
                        )
                    },
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Градиенты $themeName",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLocalGradientsVal() {
        gradientKtFileBuilder.appendRootVal(
            name = "Local$gradientClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            initializer = "staticCompositionLocalOf { light${themeName}Gradients() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addLightGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "light${themeName}Gradients",
            params = gradientAttributes.map {
                KtFileBuilder.FunParameter(
                    name = it,
                    type = KtFileBuilder.TypeShaderBrush,
                    defValue = defaultLightGradientValue(it),
                )
            },
            returnType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            body = listOf(
                "return $gradientClassName(${gradientAttributes.joinToString(separator = ",·")})",
            ),
            description = "Градиенты [$gradientClassName] для светлой темы",
        )
    }

    private fun defaultLightGradientValue(attrName: String): String {
        val lightParameters = tokenData?.light?.get(attrName)
        val darkParameters = tokenData?.dark?.get(attrName)

        val parameters: ComposeTokenData.Parameters
        val objectName: String

        if (lightParameters != null) {
            parameters = lightParameters
            objectName = "LightGradientTokens"
        } else {
            parameters = darkParameters
                ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
            objectName = "DarkGradientTokens"
        }

        return createGradientFabricCall(objectName, parameters)
    }

    private fun defaultDarkGradientValue(attrName: String): String {
        val lightParameters = tokenData?.light?.get(attrName)
        val darkParameters = tokenData?.dark?.get(attrName)

        val parameters: ComposeTokenData.Parameters
        val objectName: String

        if (darkParameters != null) {
            parameters = darkParameters
            objectName = "DarkGradientTokens"
        } else {
            parameters = lightParameters
                ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
            objectName = "LightGradientTokens"
        }

        return createGradientFabricCall(objectName, parameters)
    }

    private fun createGradientFabricCall(
        objectName: String,
        parameters: ComposeTokenData.Parameters,
    ): String {
        val funName = when (parameters.gradientType) {
            ComposeTokenData.GradientType.LINEAR -> "linearGradient"
            ComposeTokenData.GradientType.RADIAL -> "radialGradient"
            ComposeTokenData.GradientType.SWEEP -> "sweepGradient"
        }
        return "$funName(${
            parameters.tokenRefs.joinToString(separator = ",·") { tokenRef ->
                "$objectName.$tokenRef"
            }
        })"
    }

    private fun addDarkGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "dark${themeName}Gradients",
            params = gradientAttributes.map {
                KtFileBuilder.FunParameter(
                    name = it,
                    type = KtFileBuilder.TypeShaderBrush,
                    defValue = defaultDarkGradientValue(it),
                )
            },
            returnType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            body = listOf(
                "return $gradientClassName(${gradientAttributes.joinToString(separator = ",·")})",
            ),
            description = "Градиенты [$gradientClassName] для темной темы",
        )
    }

    private fun addLinearGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "linearGradient",
            modifiers = listOf(INTERNAL),
            returnType = KtFileBuilder.TypeShaderBrush,
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeListOfColors,
                    null,
                    false,
                ),
                KtFileBuilder.FunParameter(
                    name = "positions",
                    type = KtFileBuilder.TypeFloatArray,
                    null,
                    false,
                ),
                KtFileBuilder.FunParameter(
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
                KtFileBuilder.FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeListOfColors,
                    null,
                    false,
                ),
                KtFileBuilder.FunParameter(
                    name = "positions",
                    type = KtFileBuilder.TypeFloatArray,
                    null,
                    false,
                ),
                KtFileBuilder.FunParameter(
                    name = "radius",
                    type = KtFileBuilder.TypeFloat,
                ),
                KtFileBuilder.FunParameter(
                    name = "centerX",
                    type = KtFileBuilder.TypeFloat,
                ),
                KtFileBuilder.FunParameter(
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
                KtFileBuilder.FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeListOfColors,
                    null,
                    false,
                ),
                KtFileBuilder.FunParameter(
                    name = "positions",
                    type = KtFileBuilder.TypeFloatArray,
                    null,
                    false,
                ),
                KtFileBuilder.FunParameter(
                    name = "centerX",
                    type = KtFileBuilder.TypeFloat,
                ),
                KtFileBuilder.FunParameter(
                    name = "centerY",
                    type = KtFileBuilder.TypeFloat,
                ),
            ),
            body = listOf(
                "return $SWEEP_GRADIENT_CLASS_NAME(colors, positions.toList(), centerX, centerY)",
            ),
        )
    }

    private companion object {
        private const val RAW_KT_FILE_RES_DIR = "raw-kt-files"
        private const val LINEAR_GRADIENT_CLASS_NAME = "ThmbldrLinearGradient"
        private const val RADIAL_GRADIENT_CLASS_NAME = "ThmbldrRadialGradient"
        private const val SWEEP_GRADIENT_CLASS_NAME = "ThmbldrSweepGradient"
    }
}
