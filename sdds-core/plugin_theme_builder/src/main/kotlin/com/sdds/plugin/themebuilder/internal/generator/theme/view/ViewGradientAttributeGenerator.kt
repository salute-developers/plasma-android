package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.DATA
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileFromResourcesBuilder
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.TokenData
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized
import java.util.Locale

/**
 * Генератор View-атрибутов градиента.
 * Генерирует kt-файл, содержащий в себе все градиенты темы и вспомогательные функции для работы с градиентами.
 * Каждый атрибут градиента ViewGradient содержит всю информацию о слоях градиента а также умеет возвращать drawable для
 * установки градиента в background.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property ktFileFromResourcesBuilderFactory фабрика [KtFileFromResourcesBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ViewGradientAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) : SimpleBaseGenerator {

    private var tokenData: TokenData? = null
    private val gradientAttributes = mutableSetOf<String>()

    private val gradientKtFileBuilder: KtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(fileName = gradientClassName, frameworkPackage = KtFileBuilderFactory.Package.VS)
    }

    private val ktFileFromResBuilder: KtFileFromResourcesBuilder by unsafeLazy {
        ktFileFromResourcesBuilderFactory.create(frameworkPackage = KtFileFromResourcesBuilderFactory.Package.VS)
    }

    private val gradientClassName = "${themeName.capitalized()}Gradients"

    fun setGradientTokenData(data: TokenData) {
        tokenData = data
        gradientAttributes.clear()
        gradientAttributes.addAll(data.mergedLightAndDark())
    }

    override fun generate() {
        tokenData ?: return

        createViewGradientClass()
        createViewGradientLayerClass()
        createShapeDrawableWithGradientFile()
        createGradientsFile()

        gradientKtFileBuilder.build(outputLocation)
    }

    private fun createViewGradientClass() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "${RAW_KT_FILE_RES_DIR}/$VIEW_GRADIENT_CLASS_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = VIEW_GRADIENT_CLASS_NAME,
        )
    }

    private fun createViewGradientLayerClass() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "${RAW_KT_FILE_RES_DIR}/$VIEW_GRADIENT_LAYER_CLASS_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = VIEW_GRADIENT_LAYER_CLASS_NAME,
        )
    }

    private fun createShapeDrawableWithGradientFile() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "${RAW_KT_FILE_RES_DIR}/$SHAPE_DRAWABLE_WITH_GRADIENT_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = SHAPE_DRAWABLE_WITH_GRADIENT_NAME,
        )
    }

    private fun createGradientsFile() {
        addImports()
        addGradientsClass()
        addLightGradientsVal()
        addDarkGradientsVal()
        addLinearGradientFun()
        addRadialGradientFun()
        addSweepGradientFun()
        addSingleColorFun()
        addGradientsFun()
    }

    private fun addImports() {
        with(gradientKtFileBuilder) {
            addImport(
                packageName = "android.content",
                names = listOf("Context"),
            )
            addImport(
                packageName = "android.content.res",
                names = listOf("Configuration"),
            )
            addImport(
                packageName = "android.graphics",
                names = listOf("Color"),
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
                            type = gradientKtFileBuilder.getInternalClassType("ViewGradient"),
                            asProperty = true,
                        )
                    },
                ),
                description = "Градиенты $themeName для View фрэймворка",
                modifiers = listOf(DATA),
            )
        }
    }

    private fun addLightGradientsVal() {
        gradientKtFileBuilder.appendRootVal(
            name = "light${themeName.capitalized()}Gradients",
            typeName = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            initializer = "$gradientClassName(\n${
                gradientAttributes.joinToString(separator = ",·") {
                    "   $it = ${defaultLightGradientValue(it)}"
                }}\n)",
        )
    }

    private fun addDarkGradientsVal() {
        gradientKtFileBuilder.appendRootVal(
            name = "dark${themeName.capitalized()}Gradients",
            typeName = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            initializer = "$gradientClassName(\n${
                gradientAttributes.joinToString(separator = ",·") {
                    "   $it = ${defaultDarkGradientValue(it)}"
                }}\n)",
        )
    }

    private fun defaultLightGradientValue(attrName: String): String {
        val lightLayers = tokenData?.light?.get(attrName)
        val darkLayers = tokenData?.dark?.get(attrName)

        val parameters: List<TokenData.Gradient>
        val objectName: String

        if (lightLayers != null) {
            parameters = lightLayers
            objectName = "LightGradientTokens"
        } else {
            parameters = darkLayers
                ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
            objectName = "DarkGradientTokens"
        }

        return "${VIEW_GRADIENT_CLASS_NAME}(listOf(${
            parameters.joinToString(",") {
                createGradientFabricCall(
                    objectName,
                    it
                )
            }
        }))"
    }

    private fun defaultDarkGradientValue(attrName: String): String {
        val lightLayers = tokenData?.light?.get(attrName)
        val darkLayers = tokenData?.dark?.get(attrName)

        val parameters: List<TokenData.Gradient>
        val objectName: String

        if (darkLayers != null) {
            parameters = darkLayers
            objectName = "DarkGradientTokens"
        } else {
            parameters = lightLayers
                ?: throw ThemeBuilderException("Can't find token value for gradient $attrName")
            objectName = "LightGradientTokens"
        }

        return "${VIEW_GRADIENT_CLASS_NAME}(listOf(${
            parameters.joinToString(",") {
                createGradientFabricCall(
                    objectName,
                    it
                )
            }
        }))"
    }

    private fun createGradientFabricCall(
        objectName: String,
        gradient: TokenData.Gradient,
    ): String {
        val funName = when (gradient.gradientType) {
            TokenData.GradientType.LINEAR -> "linearGradient"
            TokenData.GradientType.RADIAL -> "radialGradient"
            TokenData.GradientType.SWEEP -> "sweepGradient"
            TokenData.GradientType.BACKGROUND -> "singleColor"
        }
        return "$funName(${
            gradient.tokenRefs.joinToString(separator = ",·") { tokenRef ->
                "$objectName.$tokenRef"
            }
        })"
    }

    private fun addLinearGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "linearGradient",
            modifiers = listOf(INTERNAL),
            returnType = gradientKtFileBuilder.getInternalClassType(VIEW_GRADIENT_LAYER_LINEAR_CLASS_NAME),
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeIntArray,
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
                "return $VIEW_GRADIENT_LAYER_LINEAR_CLASS_NAME(colors, positions, angle)",
            ),
        )
    }

    private fun addRadialGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "radialGradient",
            modifiers = listOf(INTERNAL),
            returnType = gradientKtFileBuilder.getInternalClassType(VIEW_GRADIENT_LAYER_RADIAL_CLASS_NAME),
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeIntArray,
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
                "return $VIEW_GRADIENT_LAYER_RADIAL_CLASS_NAME(colors, positions, radius, centerX, centerY)",
            ),
        )
    }

    private fun addSweepGradientFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "sweepGradient",
            modifiers = listOf(INTERNAL),
            returnType = gradientKtFileBuilder.getInternalClassType(VIEW_GRADIENT_LAYER_SWEEP_CLASS_NAME),
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "colors",
                    type = KtFileBuilder.TypeIntArray,
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
                "return $VIEW_GRADIENT_LAYER_SWEEP_CLASS_NAME(colors, positions, centerX, centerY)",
            ),
        )
    }

    private fun addSingleColorFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "singleColor",
            modifiers = listOf(INTERNAL),
            returnType = gradientKtFileBuilder.getInternalClassType(VIEW_GRADIENT_LAYER_SINGLE_COLOR_CLASS_NAME),
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "color",
                    type = KtFileBuilder.TypeInt,
                    null,
                    false,
                ),
            ),
            body = listOf(
                "return $VIEW_GRADIENT_LAYER_SINGLE_COLOR_CLASS_NAME(color)",
            ),
        )
    }

    private fun addGradientsFun() {
        gradientKtFileBuilder.appendRootFun(
            name = "${themeName.decapitalize(Locale.getDefault())}Gradients",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "context",
                    type = KtFileBuilder.TypeContext,
                )
            ),
            returnType = gradientKtFileBuilder.getInternalClassType(gradientClassName),
            body = listOf(
                "val isDarkMode = context.resources.configuration.uiMode and\n" +
                        "            Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES\n",
                "return if (isDarkMode) dark${themeName}Gradients else light${themeName}Gradients"
            ),
            description = "Возвращает объект [ViewGradients], который соответствует текущему режиму dark/light для данного [context].",
        )
    }

    private companion object {
        private const val RAW_KT_FILE_RES_DIR = "raw-kt-files/vs"
        private const val VIEW_GRADIENT_CLASS_NAME = "ViewGradient"
        private const val VIEW_GRADIENT_LAYER_CLASS_NAME = "ViewGradientLayer"
        private const val VIEW_GRADIENT_LAYER_LINEAR_CLASS_NAME = "$VIEW_GRADIENT_LAYER_CLASS_NAME.Linear"
        private const val VIEW_GRADIENT_LAYER_RADIAL_CLASS_NAME = "$VIEW_GRADIENT_LAYER_CLASS_NAME.Radial"
        private const val VIEW_GRADIENT_LAYER_SWEEP_CLASS_NAME = "$VIEW_GRADIENT_LAYER_CLASS_NAME.Sweep"
        private const val VIEW_GRADIENT_LAYER_SINGLE_COLOR_CLASS_NAME = "$VIEW_GRADIENT_LAYER_CLASS_NAME.SingleColor"

        private const val SHAPE_DRAWABLE_WITH_GRADIENT_NAME = "ShapeDrawableWithGradient"
    }
}