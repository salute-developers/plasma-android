package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized

/**
 * Генератор темы для Compose
 */
internal class ComposeThemeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    themeName: String,
) : SimpleBaseGenerator {

    private val themeKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(themeClassName)
    }

    private val capitalizedThemeName = themeName.capitalized()
    private val themeClassName = "${capitalizedThemeName}Theme"

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
        }
    }

    private val colorAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${capitalizedThemeName}Colors")
    }
    private val gradientAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${capitalizedThemeName}Gradients")
    }
    private val shapeAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${capitalizedThemeName}Shapes")
    }
    private val typographyAttributesClassType by unsafeLazy {
        themeKtFileBuilder.getInternalClassType("${capitalizedThemeName}Typography")
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
                        defValue = "$themeClassName.shapes",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "typography",
                        type = typographyAttributesClassType,
                        defValue = "dynamic${capitalizedThemeName}Typography()",
                    ),
                    KtFileBuilder.FunParameter(
                        name = "content",
                        type = KtFileBuilder.getLambdaType(
                            annotation = KtFileBuilder.TypeAnnotationComposable,
                        ),
                    ),
                ),
                body = listOf(buildThemeFunBody()),
                annotation = KtFileBuilder.TypeAnnotationComposable,
                description = "Базовая тема $capitalizedThemeName",
            )
        }
    }

    private fun buildThemeFunBody(): String {
        return buildString {
            appendLine("val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }")
            appendLine()
            textSelectionHandleColor?.let {
                appendLine(
                    "val textSelectionColors = remember { " +
                        "TextSelectionColors(handleColor = rememberColors.$it, " +
                        "backgroundColor = rememberColors.$it.copy(0.3f)) }",
                )
                appendLine()
            }
            val compositionLocalProviderFunParametersList = mutableListOf(
                "Local${capitalizedThemeName}Colors provides rememberColors",
                "Local${capitalizedThemeName}Gradients provides gradients",
                "Local${capitalizedThemeName}Typography provides typography",
                "Local${capitalizedThemeName}Shapes provides shapes",
            )
            textSelectionHandleColor?.let {
                compositionLocalProviderFunParametersList.add(
                    "LocalTextSelectionColors provides textSelectionColors",
                )
            }
            if (textStyle != null && textStyleColor != null) {
                compositionLocalProviderFunParametersList.add(
                    "content = { " +
                        "ProvideTextStyle(value = typography.$textStyle.copy(" +
                        "color = rememberColors.$textStyleColor), content = content,) }",
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
                appendProperty(
                    name = "colors",
                    typeName = colorAttributesClassType,
                    propGetter = KtFileBuilder.Getter.Annotated(
                        annotations = listOf(
                            KtFileBuilder.TypeAnnotationComposable,
                            KtFileBuilder.TypeAnnotationReadOnlyComposable,
                        ),
                        body = "return Local${colorAttributesClassType.simpleName}.current",
                    ),
                )
                appendProperty(
                    name = "gradients",
                    typeName = gradientAttributesClassType,
                    propGetter = KtFileBuilder.Getter.Annotated(
                        annotations = listOf(
                            KtFileBuilder.TypeAnnotationComposable,
                            KtFileBuilder.TypeAnnotationReadOnlyComposable,
                        ),
                        body = "return Local${gradientAttributesClassType.simpleName}.current",
                    ),
                )
                appendProperty(
                    name = "shapes",
                    typeName = shapeAttributesClassType,
                    propGetter = KtFileBuilder.Getter.Annotated(
                        annotations = listOf(
                            KtFileBuilder.TypeAnnotationComposable,
                            KtFileBuilder.TypeAnnotationReadOnlyComposable,
                        ),
                        body = "return Local${shapeAttributesClassType.simpleName}.current",
                    ),
                )
                appendProperty(
                    name = "typography",
                    typeName = typographyAttributesClassType,
                    propGetter = KtFileBuilder.Getter.Annotated(
                        annotations = listOf(
                            KtFileBuilder.TypeAnnotationComposable,
                            KtFileBuilder.TypeAnnotationReadOnlyComposable,
                        ),
                        body = "return Local${typographyAttributesClassType.simpleName}.current",
                    ),
                )
            }
        }
    }

    fun setColorTokenData(colors: ColorTokenResult.TokenData) {
        val attrSet = colors.mergedLightAndDark()
        findDefaultSelectionColors(attrSet)
        findDefaultTextStyleColor(attrSet)
    }

    fun setTypographyTokenData(typography: List<TypographyTokenResult.ComposeTokenData>) {
        findDefaultTextStyle(typography)
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

    private fun findDefaultTextStyle(typography: List<TypographyTokenResult.ComposeTokenData>) {
        val bodyMediumNormal = typography.find {
            it.attrName == "bodyMNormal"
        }?.attrName
        textStyle = bodyMediumNormal ?: return
    }
}
