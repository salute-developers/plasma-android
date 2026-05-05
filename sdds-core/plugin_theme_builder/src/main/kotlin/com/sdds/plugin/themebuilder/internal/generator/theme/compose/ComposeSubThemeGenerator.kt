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
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
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
    private var colorTokenData: Map<Tenant, ColorTokenResult.TokenData> = emptyMap()
    private var gradientTokenData: Map<Tenant, ComposeTokenData> = emptyMap()
    private val themePackage = packageResolver.getPackage(TargetPackage.THEME)

    fun setColorTokens(tokens: List<ColorToken>, data: Map<Tenant, ColorTokenResult.TokenData>) {
        colorTokenData = data
        colorSubThemes.putAll(tokens.overriddenBySubTheme())
    }

    fun setGradientTokens(tokens: List<GradientToken>, data: Map<Tenant, ComposeTokenData>) {
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
                    addSubThemeColorsVal(subTheme, colorAttrs)
                }

                val gradientAttrs = gradientsSubThemes[subTheme] ?: emptyList()
                if (gradientAttrs.isNotEmpty()) {
                    addSubThemeGradientsVal(subTheme, gradientAttrs)
                }

                addSubTheme(subTheme, colorAttrs.isNotEmpty(), gradientAttrs.isNotEmpty())
                build(outputLocation)
            }
        }
    }

    private fun KtFileBuilder.addImports() {
        addImport("androidx.compose.foundation", listOf("isSystemInDarkTheme"))
        addImport(getInternalClassType("Local${camelCaseThemeName}Colors", themePackage))
        addImport(getInternalClassType("Local${camelCaseThemeName}Gradients", themePackage))
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

    private fun getSubThemeColorsValName(subTheme: SubTheme): String {
        return "${subTheme.suffix}ColorsOverride"
    }

    private fun getSubThemeGradientsValName(subTheme: SubTheme): String {
        return "${subTheme.suffix}GradientsOverride"
    }

    private fun KtFileBuilder.addSubThemeGradientsVal(
        subTheme: SubTheme,
        attrs: List<OverrideToken>,
    ) {
        appendRootVal(
            name = getSubThemeGradientsValName(subTheme),
            typeName = KtFileBuilder.getLambdaType(
                receiver = getInternalClassType(className = "GradientAttrOverrideScope", themePackage),
            ),
            modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
            lazy = true,
            initializer = buildString {
                appendLine("{")
                attrs.forEach {
                    appendLine("${it.old.ktName.decapitalized()}.overrideBy(${it.new.ktName.decapitalized()})")
                }
                appendLine("}")
            },
        )
    }

    private fun KtFileBuilder.addSubThemeColorsVal(
        subTheme: SubTheme,
        attrs: List<OverrideToken>,
    ) {
        appendRootVal(
            name = getSubThemeColorsValName(subTheme),
            typeName = KtFileBuilder.getLambdaType(
                receiver = getInternalClassType(className = "ColorAttrOverrideScope", themePackage),
            ),
            modifiers = listOf(KtFileBuilder.Modifier.PRIVATE),
            lazy = true,
            initializer = buildString {
                appendLine("{")
                attrs.forEach {
                    appendLine("${it.old.ktName.decapitalized()}.overrideBy(${it.new.ktName.decapitalized()})")
                }
                appendLine("}")
            },
        )
    }

    private fun buildDefaultSubThemeFunBody(): String = buildString {
        appendLine("val currentColors = Local${camelCaseThemeName}Colors.current")
        appendLine("val currentGradients = Local${camelCaseThemeName}Gradients.current")
        appendLine("$themeKtClassName(colors = currentColors, gradients = currentGradients, content = content)")
    }

    private fun buildSubThemeFunBody(
        subTheme: SubTheme,
        overrideColors: Boolean,
        overrideGradients: Boolean,
    ): String {
        return when (subTheme) {
            SubTheme.DEFAULT -> buildDefaultSubThemeFunBody()
            else -> buildString {
                if (overrideColors) {
                    appendLine("val currentColors = Local${camelCaseThemeName}Colors.current")
                    appendLine(
                        "val overrideColors = currentColors.copyAttrs(${
                            getSubThemeColorsValName(
                                subTheme,
                            )
                        })",
                    )
                }
                if (overrideGradients) {
                    appendLine("val currentGradients = Local${camelCaseThemeName}Gradients.current")
                    appendLine(
                        "val overrideGradients = currentGradients.copyAttrs(${
                            getSubThemeGradientsValName(
                                subTheme,
                            )
                        })",
                    )
                }
                appendLine("$themeKtClassName(")
                if (overrideColors) appendLine("colors = overrideColors,")
                if (overrideGradients) appendLine("gradients = overrideGradients,")
                appendLine("content = content,")
                appendLine(")")
            }
        }
    }
}
