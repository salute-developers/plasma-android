package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.GradientTokenResult.ComposeTokenData
import com.sdds.plugin.themebuilder.internal.generator.theme.OverrideToken
import com.sdds.plugin.themebuilder.internal.generator.theme.SubTheme
import com.sdds.plugin.themebuilder.internal.generator.theme.overriddenBySubTheme
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.isDark
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase

internal class ComposeSubThemeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val packageResolver: PackageResolver,
    private val outputLocation: KtFileBuilder.OutputLocation,
    themeName: String,
) : SimpleBaseGenerator {

    private val camelCaseThemeName = themeName.snakeToCamelCase()
    private val themeKtClassName = "${camelCaseThemeName}Theme"

    private val colorSubThemes: MutableMap<SubTheme, List<OverrideToken>> = mutableMapOf()
    private val gradientsSubThemes: MutableMap<SubTheme, List<OverrideToken>> = mutableMapOf()
    private var colorTokenData: ColorTokenResult.TokenData? = null
    private var gradientTokenData: ComposeTokenData? = null
    private val themePackage = packageResolver.getPackage(TargetPackage.THEME)

    fun setColorTokens(tokens: List<ColorToken>, data: ColorTokenResult.TokenData) {
        colorTokenData = data
        colorSubThemes.putAll(tokens.overriddenBySubTheme())
    }

    fun setGradientTokens(tokens: List<GradientToken>, data: ComposeTokenData) {
        gradientTokenData = data
        gradientsSubThemes.putAll(tokens.overriddenBySubTheme())
    }

    override fun generate() {
        (colorSubThemes.keys + gradientsSubThemes.keys).forEach { subTheme ->
            val fileBuilder = ktFileBuilderFactory.create(
                "${themeKtClassName}${subTheme.suffix}",
                "${packageResolver.getPackage(TargetPackage.THEME)}.subthemes",
            )
            with(fileBuilder) {
                addImports()
                val colorAttrs = colorSubThemes[subTheme] ?: emptyList()
                if (colorAttrs.isNotEmpty()) {
                    addSubThemeColorsVal(subTheme, true, colorAttrs)
                    addSubThemeColorsVal(subTheme, false, colorAttrs)
                }

                val gradientAttrs = gradientsSubThemes[subTheme] ?: emptyList()
                if (gradientAttrs.isNotEmpty()) {
                    addSubThemeGradientsVal(subTheme, true, gradientAttrs)
                    addSubThemeGradientsVal(subTheme, false, gradientAttrs)
                }

                addSubTheme(subTheme, colorAttrs.isNotEmpty(), gradientAttrs.isNotEmpty())
                build(outputLocation)
            }
        }
    }

    private fun KtFileBuilder.addImports() {
        addImport("androidx.compose.foundation", listOf("isSystemInDarkTheme"))
        val tokensPackage = packageResolver.getPackage(TargetPackage.TOKENS)
        addImport(getInternalClassType("DarkColorTokens", tokensPackage))
        addImport(getInternalClassType("DarkGradientTokens", tokensPackage))
        addImport(getInternalClassType("LightColorTokens", tokensPackage))
        addImport(getInternalClassType("LightGradientTokens", tokensPackage))

        addImport(getInternalClassType("dark${camelCaseThemeName}Colors", themePackage))
        addImport(getInternalClassType("light${camelCaseThemeName}Colors", themePackage))
        addImport(getInternalClassType("dark${camelCaseThemeName}Gradients", themePackage))
        addImport(getInternalClassType("light${camelCaseThemeName}Gradients", themePackage))
        addImport(getInternalClassType("linearGradient", themePackage))
        addImport(getInternalClassType("radialGradient", themePackage))
        addImport(getInternalClassType("sweepGradient", themePackage))
        addImport(getInternalClassType("singleColor", themePackage))
    }

    private fun KtFileBuilder.addSubTheme(
        subTheme: SubTheme,
        overrideColor: Boolean,
        overrideGradient: Boolean,
    ) {
        appendRootFun(
            name = subTheme.suffix,
            receiver = getInternalClassType(themeKtClassName, themePackage),
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "isDark",
                    type = KtFileBuilder.TypeBoolean,
                    defValue = "isSystemInDarkTheme()",
                ),
                KtFileBuilder.FunParameter(
                    name = "content",
                    type = KtFileBuilder.getLambdaType(
                        annotation = KtFileBuilder.TypeAnnotationComposable,
                    ),
                ),
            ),
            body = listOf(buildSubThemeFunBody(subTheme, overrideColor, overrideGradient)),
            annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
            description = "Подтема $themeKtClassName.${subTheme.suffix}",
        )
    }

    private fun getSubThemeColorsValName(isDark: Boolean, subTheme: SubTheme): String {
        val prefix = if (isDark) "dark" else "light"
        return "$prefix${subTheme.suffix}Colors"
    }

    private fun getSubThemeGradientValName(isDark: Boolean, subTheme: SubTheme): String {
        val prefix = if (isDark) "dark" else "light"
        return "$prefix${subTheme.suffix}Gradients"
    }

    private fun KtFileBuilder.addSubThemeGradientsVal(
        subTheme: SubTheme,
        isDark: Boolean,
        attrs: List<OverrideToken>,
    ) {
        val tokensClassName = if (isDark) "DarkGradientTokens" else "LightGradientTokens"
        val builderPrefix = if (isDark) "dark" else "light"
        appendRootVal(
            name = getSubThemeGradientValName(isDark, subTheme),
            typeName = getInternalClassType(
                "${camelCaseThemeName}Gradients",
                packageResolver.getPackage(TargetPackage.THEME),
            ),
            modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
            lazy = true,
            initializer = buildString {
                appendLine("$builderPrefix${camelCaseThemeName}Gradients {")
                attrs.forEach {
                    if (it.new.isDark == isDark) {
                        val valueReference = getGradientValueReference(tokensClassName, it.new.ktName, isDark)
                        appendLine("${it.old.ktName.decapitalized()}.overrideBy($valueReference)")
                    }
                }
                appendLine("}")
            },
        )
    }

    private fun KtFileBuilder.addSubThemeColorsVal(
        subTheme: SubTheme,
        isDark: Boolean,
        attrs: List<OverrideToken>,
    ) {
        val tokensClassName = if (isDark) "DarkColorTokens" else "LightColorTokens"
        val builderPrefix = if (isDark) "dark" else "light"
        appendRootVal(
            name = getSubThemeColorsValName(isDark, subTheme),
            typeName = getInternalClassType(
                "${camelCaseThemeName}Colors",
                packageResolver.getPackage(TargetPackage.THEME),
            ),
            modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
            lazy = true,
            initializer = buildString {
                appendLine("$builderPrefix${camelCaseThemeName}Colors {")
                attrs.forEach {
                    if (it.new.isDark == isDark) {
                        val valueReference = getValueReference(it.new.ktName, isDark)
                        appendLine("${it.old.ktName.decapitalized()}.overrideBy($tokensClassName.$valueReference)")
                    }
                }
                appendLine("}")
            },
        )
    }

    private fun getValueReference(attributeName: String, isDark: Boolean): String? {
        return if (isDark) {
            colorTokenData?.dark?.get(attributeName.decapitalized())?.colorRef
        } else {
            colorTokenData?.light?.get(attributeName.decapitalized())?.colorRef
        }
    }

    private fun getGradientValueReference(objectName: String, attributeName: String, isDark: Boolean): String? {
        val params = if (isDark) {
            gradientTokenData?.dark?.get(attributeName.decapitalized())
        } else {
            gradientTokenData?.light?.get(attributeName.decapitalized())
        }
        params ?: return null

        return KtFileBuilder.createFunCall(
            "listOf",
            params.map { createGradientFabricCall(objectName, it) },
        )
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
        return KtFileBuilder.createFunCall(
            funName = funName,
            parameters = gradient.tokenRefs.map { "$objectName.$it" },
        )
    }

    private fun buildDefaultSubThemeFunBody(): String = buildString {
        appendLine("val colors = if (isDark) {")
        appendLine("dark${camelCaseThemeName}Colors()")
        appendLine("} else {")
        appendLine("light${camelCaseThemeName}Colors()")
        appendLine("}")
        appendLine("val gradients = if (isDark) {")
        appendLine("dark${camelCaseThemeName}Gradients()")
        appendLine("} else {")
        appendLine("light${camelCaseThemeName}Gradients()")
        appendLine("}")
        appendLine("$themeKtClassName(colors = colors, gradients = gradients, content = content)")
    }

    private fun buildSubThemeFunBody(
        subTheme: SubTheme,
        overrideColors: Boolean,
        overrideGradient: Boolean,
    ): String {
        return when (subTheme) {
            SubTheme.DEFAULT -> buildDefaultSubThemeFunBody()
            else -> buildString {
                if (overrideColors) {
                    appendLine("val colors = if (isDark) {")
                    appendLine(getSubThemeColorsValName(true, subTheme))
                    appendLine("} else {")
                    appendLine(getSubThemeColorsValName(false, subTheme))
                    appendLine("}")
                }
                if (overrideGradient) {
                    appendLine("val gradients = if (isDark) {")
                    appendLine(getSubThemeGradientValName(true, subTheme))
                    appendLine("} else {")
                    appendLine(getSubThemeGradientValName(false, subTheme))
                    appendLine("}")
                }
                appendLine("$themeKtClassName(")
                if (overrideColors) appendLine("colors = colors,")
                if (overrideGradient) appendLine("gradients = gradients,")
                appendLine("content = content,")
                appendLine(")")
            }
        }
    }
}
