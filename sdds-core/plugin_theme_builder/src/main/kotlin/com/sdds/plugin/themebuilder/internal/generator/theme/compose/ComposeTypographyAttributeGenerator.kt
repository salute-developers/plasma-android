package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized

/**
 * Генератор Compose-атрибутов типографики.
 * Генерирует kt-файл, содержащий в себе всю типографику темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeTypographyAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) : SimpleBaseGenerator {
    private val typography = mutableListOf<TypographyTokenResult.ComposeTokenData>()
    private val typographyKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(typographyClassName)
    }
    private val typographyClassName = "${themeName.capitalized()}Typography"
    private val typographyClassType by unsafeLazy {
        typographyKtFileBuilder.getInternalClassType(typographyClassName)
    }

    fun setTypographyTokenData(typography: List<TypographyTokenResult.ComposeTokenData>) {
        this.typography.clear()
        this.typography.addAll(typography)
    }

    override fun generate() {
        if (typography.isEmpty()) return

        addImports()
        addTypographyClass()
        addSmallTypographyFun()
        addMediumTypographyFun()
        addLargeTypographyFun()
        addLocalTypographyVal()

        typographyKtFileBuilder.build(outputLocation)
    }

    private fun addImports() {
        with(typographyKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                ),
            )
        }
    }

    private fun addLocalTypographyVal() {
        typographyKtFileBuilder.appendRootVal(
            name = "Local$typographyClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = typographyClassType,
            initializer = "staticCompositionLocalOf { medium$typographyClassName() }",
            modifiers = listOf(Modifier.INTERNAL),
        )
    }

    private fun addTypographyClass() {
        with(typographyKtFileBuilder) {
            rootClass(
                name = typographyClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = typography
                        .filter { it.screen == TypographyTokenResult.ComposeTokenData.Screen.MEDIUM }
                        .map {
                            KtFileBuilder.FunParameter(
                                name = it.attrName,
                                type = KtFileBuilder.TypeTextStyle,
                                asProperty = true,
                            )
                        },
                    modifiers = listOf(Modifier.INTERNAL),
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Типографика $themeName",
                modifiers = listOf(Modifier.DATA),
            )
        }
    }

    private fun addSmallTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "small$typographyClassName",
            screen = TypographyTokenResult.ComposeTokenData.Screen.SMALL,
            description = "Возвращает [$typographyClassName] для ширины окна до 600dp",
        )
    }

    private fun addMediumTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "medium$typographyClassName",
            screen = TypographyTokenResult.ComposeTokenData.Screen.MEDIUM,
            description = "Возвращает [$typographyClassName] для ширины окна от 600dp до 840dp",
        )
    }

    private fun addLargeTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "large$typographyClassName",
            screen = TypographyTokenResult.ComposeTokenData.Screen.LARGE,
            description = "Возвращает [$typographyClassName] для ширины окна от 840dp",
        )
    }

    private fun addScreenSpecificTypographyFun(
        funName: String,
        screen: TypographyTokenResult.ComposeTokenData.Screen,
        description: String,
    ) {
        with(typographyKtFileBuilder) {
            appendRootFun(
                name = funName,
                returnType = typographyClassType,
                body = listOf(
                    "return $typographyClassName(${
                        typography
                            .filter { it.screen == screen }
                            .joinToString(separator = ",·") {
                                "${it.attrName} = ${it.tokenRefName}"
                            }
                    })",
                ),
                description = description,
            )
        }
    }
}
