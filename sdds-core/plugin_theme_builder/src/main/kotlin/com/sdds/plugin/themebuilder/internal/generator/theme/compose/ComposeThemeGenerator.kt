package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.DefaultThemeTypography
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.generator.data.mergedScreenClasses
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec

/**
 * Генератор темы для Compose
 */
internal class ComposeThemeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    themeName: String,
    private val defaultThemeTypography: DefaultThemeTypography,
) : SimpleBaseGenerator {

    private val themeKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(themeClassName, TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val themeClassName = "${camelThemeName}Theme"

    private var textSelectionHandleColor: String? = null
    private var textStyleColor: String? = null
    private var textStyle: String? = null

    override fun generate() {
        addImports()
        addThemeFun()
        addThemeObject()

        themeKtFileBuilder.build(outputLocation)
    }

    private fun addImports() {
        with(themeKtFileBuilder) {
            addImport(
                "androidx.compose.foundation.text.selection",
                listOf(
                    "LocalTextSelectionColors",
                    "TextSelectionColors",
                ),
            )
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "CompositionLocalProvider",
                    "CompositionLocal",
                    "ReadOnlyComposable",
                    "remember",
                ),
            )
            addImport(
                packageName = "com.sdds.compose.uikit",
                names = listOf("ProvideTextStyle"),
            )
        }
    }

    private val colorAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${camelThemeName}Colors")
    }
    private val gradientAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${camelThemeName}Gradients")
    }
    private val shapeAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${camelThemeName}Shapes")
    }
    private val shadowAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${camelThemeName}Shadows")
    }
    private val spacingAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${camelThemeName}Spacing")
    }
    private val typographyAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${camelThemeName}Typography")
    }

    private fun addThemeFun() {
        with(themeKtFileBuilder) {
            appendRootFun(
                name = themeClassName,
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "colors",
                        type = colorAttributesClassType,
                        defValue = "$themeClassName.colors",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "gradients",
                        type = gradientAttributesClassType,
                        defValue = "$themeClassName.gradients",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "shapes",
                        type = shapeAttributesClassType,
                        defValue = "default${camelThemeName}Shapes()",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "shadows",
                        type = shadowAttributesClassType,
                        defValue = "default${camelThemeName}Shadows()",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "typography",
                        type = typographyAttributesClassType,
                        defValue = defaultThemeTypography.typographyCall(),
                    ),
                    KtFileBuilder.FunParameter(
                        name = "spacing",
                        type = spacingAttributesClassType,
                        defValue = "default${camelThemeName}Spacing()",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "content",
                        type = KtFileBuilder.getLambdaType(
                            annotation = KtFileBuilder.TypeAnnotationComposable,
                        ),
                    ),
                ),
                body = listOf(buildThemeFunBody()),
                annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
                description = "Базовая тема $camelThemeName",
            )
        }
    }

    private fun DefaultThemeTypography.typographyCall(): String {
        val prefix = this.name.lowercase()
        return "$prefix${camelThemeName}Typography()"
    }

    private fun buildThemeFunBody(): String {
        return buildString {
            appendLine("val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }")
            appendLine()
            textSelectionHandleColor?.let {
                appendLine(
                    """
                    |val textSelectionColors = remember {
                    |    TextSelectionColors(
                    |        handleColor = rememberColors.$it,
                    |        backgroundColor = rememberColors.$it.copy(0.3f)
                    |    )
                    |}
                    """.trimMargin(),
                )
                appendLine()
            }
            val compositionLocalProviderFunParametersList = mutableListOf(
                "Local${camelThemeName}Colors provides rememberColors",
                "Local${camelThemeName}Gradients provides gradients",
                "Local${camelThemeName}Typography provides typography",
                "Local${camelThemeName}Shapes provides shapes",
                "Local${camelThemeName}Shadows provides shadows",
                "Local${camelThemeName}Spacing provides spacing",
            )
            textSelectionHandleColor?.let {
                compositionLocalProviderFunParametersList.add(
                    "LocalTextSelectionColors provides textSelectionColors",
                )
            }
            if (textStyle != null && textStyleColor != null) {
                compositionLocalProviderFunParametersList.add(
                    """
                        |content = {
                        |    ProvideTextStyle(
                        |        value = typography.$textStyle.copy(color = rememberColors.$textStyleColor),
                        |        content = content,
                        |    )
                        |}
                    """.trimMargin(),
                )
            } else {
                compositionLocalProviderFunParametersList.add(
                    "content = content",
                )
            }
            append(
                KtFileBuilder.createFunCall(
                    funName = "CompositionLocalProvider",
                    parameters = compositionLocalProviderFunParametersList,
                ),
            )
        }
    }

    private fun addThemeObject() {
        with(themeKtFileBuilder) {
            rootObject(name = themeClassName).apply {
                addKdoc("Аттрибуты темы $themeClassName")
                appendThemeProperty("colors", colorAttributesClassType, COLORS_PROPERTY_DESC)
                appendThemeProperty("gradients", gradientAttributesClassType, GRADIENTS_PROPERTY_DESC)
                appendThemeProperty("shapes", shapeAttributesClassType, SHAPES_PROPERTY_DESC)
                appendThemeProperty("shadows", shadowAttributesClassType, SHADOWS_PROPERTY_DESC)
                appendThemeProperty("spacing", spacingAttributesClassType, SPACING_PROPERTY_DESC)
                appendThemeProperty("typography", typographyAttributesClassType, TYPO_PROPERTY_DESC)
            }
        }
    }

    private fun TypeSpec.Builder.appendThemeProperty(
        name: String,
        attrClassType: ClassName,
        description: String,
    ) = with(themeKtFileBuilder) {
        appendProperty(
            name = name,
            typeName = attrClassType,
            description = description,
            propGetter = KtFileBuilder.Getter.Annotated(
                annotations = listOf(
                    Annotation(KtFileBuilder.TypeAnnotationComposable),
                    Annotation(KtFileBuilder.TypeAnnotationReadOnlyComposable),
                ),
                body = "return Local${attrClassType.simpleName}.current",
            ),
        )
    }

    fun setColorTokenData(colors: ColorTokenResult.TokenData) {
        val attrSet = colors.mergedLightAndDark()
        findDefaultSelectionColors(attrSet)
        findDefaultTextStyleColor(attrSet)
    }

    fun setTypographyTokenData(typography: TypographyTokenResult.ComposeTokenData) {
        val attrSet = typography.mergedScreenClasses()
        findDefaultTextStyle(attrSet)
    }

    private fun findDefaultSelectionColors(attrSet: Set<String>) {
        val textAccentColor = attrSet.find {
            it == "textDefaultAccent" || it == "textAccent"
        }
        textAccentColor?.let {
            textSelectionHandleColor = it
        }
    }

    private fun findDefaultTextStyleColor(attrSet: Set<String>) {
        val textPrimaryColor = attrSet.find {
            it == "textDefaultPrimary" || it == "textPrimary"
        }
        textStyleColor = textPrimaryColor ?: return
    }

    private fun findDefaultTextStyle(typography: Set<String>) {
        val bodyMediumNormal = typography.find {
            it == "bodyMNormal"
        }
        textStyle = bodyMediumNormal ?: return
    }

    private companion object {
        const val COLORS_PROPERTY_DESC = "Аттрибуты цвета"
        const val GRADIENTS_PROPERTY_DESC = "Аттрибуты градиентов"
        const val SHAPES_PROPERTY_DESC = "Аттрибуты форм"
        const val SHADOWS_PROPERTY_DESC = "Аттрибуты теней"
        const val SPACING_PROPERTY_DESC = "Аттрибуты отступов"
        const val TYPO_PROPERTY_DESC = "Аттрибуты типографики"
    }
}
