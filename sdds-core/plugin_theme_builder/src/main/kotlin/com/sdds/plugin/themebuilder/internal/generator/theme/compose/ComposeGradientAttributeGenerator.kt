package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult
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

    private val gradients = mutableListOf<GradientTokenResult.TokenData>()

    private val gradientKtFileBuilder: KtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(gradientClassName)
    }

    private val ktFileFromResBuilder: KtFileFromResourcesBuilder by unsafeLazy {
        ktFileFromResourcesBuilderFactory.create()
    }

    private val gradientClassName = "${themeName.capitalized()}Gradients"

    fun setGradientTokenData(gradients: List<GradientTokenResult.TokenData>) {
        this.gradients.clear()
        this.gradients.addAll(gradients)
    }

    override fun generate() {
        if (gradients.isEmpty()) return

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
                constructorParams = gradients.map {
                    KtFileBuilder.FunParameter(
                        name = it.attrName,
                        type = KtFileBuilder.TypeShaderBrush,
                        asProperty = true,
                    )
                },
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Градиенты $themeName",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLocalGradientsVal() {
        gradientKtFileBuilder.appendRootVal(
            name = "Local${themeName}Gradients",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            initializer = "staticCompositionLocalOf { light${themeName}Gradients() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addLightGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "light${themeName}Gradients",
            params = gradients.map {
                KtFileBuilder.FunParameter(
                    name = it.attrName,
                    type = KtFileBuilder.TypeShaderBrush,
                    defValue = defaultGradientValue("LightGradientTokens", it),
                )
            },
            returnType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            body = listOf(
                "return $gradientClassName(${
                    gradients.joinToString(
                        separator = ",·",
                    ) { it.attrName }
                })",
            ),
            description = "Градиенты [$gradientClassName] для светлой темы",
        )
    }

    private fun defaultGradientValue(
        objectName: String,
        tokenData: GradientTokenResult.TokenData,
    ): String {
        return when (tokenData.gradientType) {
            GradientTokenResult.TokenData.GradientType.LINEAR -> createGradientFabricCall(
                funName = "linearGradient",
                objectName = objectName,
                tokenData = tokenData,
            )

            GradientTokenResult.TokenData.GradientType.RADIAL -> createGradientFabricCall(
                funName = "radialGradient",
                objectName = objectName,
                tokenData = tokenData,
            )

            GradientTokenResult.TokenData.GradientType.SWEEP -> createGradientFabricCall(
                funName = "sweepGradient",
                objectName = objectName,
                tokenData = tokenData,
            )
        }
    }

    private fun createGradientFabricCall(
        funName: String,
        objectName: String,
        tokenData: GradientTokenResult.TokenData,
    ): String {
        return "$funName(${
            tokenData.tokenRefs.joinToString(separator = ",·") { tokenRef ->
                "$objectName.$tokenRef"
            }
        })"
    }

    private fun addDarkGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "dark${themeName}Gradients",
            params = gradients.map {
                KtFileBuilder.FunParameter(
                    name = it.attrName,
                    type = KtFileBuilder.TypeShaderBrush,
                    defValue = defaultGradientValue("DarkGradientTokens", it),
                )
            },
            returnType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            body = listOf(
                "return $gradientClassName(${
                    gradients.joinToString(
                        separator = ",·",
                    ) { it.attrName }
                })",
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
