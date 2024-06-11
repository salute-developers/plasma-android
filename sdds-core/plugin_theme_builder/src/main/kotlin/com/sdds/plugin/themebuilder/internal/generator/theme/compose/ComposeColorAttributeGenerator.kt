package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.configurationcache.extensions.capitalized

/**
 * Генератор Compose-атрибутов цвета.
 * Генерирует kt-файл, содержащий в себе все цвета темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 */
internal class ComposeColorAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
) : SimpleBaseGenerator {

    private val colors = mutableListOf<ColorTokenResult.TokenData>()

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(colorClassName)
    }

    private val colorClassName = "${themeName.capitalized()}Colors"
    private val colorClassType by unsafeLazy {
        colorKtFileBuilder.getInternalClassType(colorClassName)
    }

    override fun generate() {
        if (colors.isEmpty()) return

        addImports()
        addColorsClass()
        addUpdateColorsFromFun()
        addLocalColorsVal()
        addLightColorsFun()
        addDarkColorsFun()

        colorKtFileBuilder.build(outputLocation)
    }

    fun setColorTokenData(colors: List<ColorTokenResult.TokenData>) {
        this.colors.clear()
        this.colors.addAll(colors)
    }

    private fun addColorsClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = colorClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = colors.map {
                        KtFileBuilder.FunParameter(
                            name = it.attrName,
                            type = KtFileBuilder.TypeColor,
                        )
                    },
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Цвета $themeName",
            )

            colors.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color.attrName,
                    typeName = KtFileBuilder.TypeColor,
                    isMutable = true,
                    delegate = "mutableStateOf(${color.attrName}, structuralEqualityPolicy())",
                )
            }

            rootColorsClass.appendFun(
                name = "copy",
                returnType = getInternalClassType(colorClassName),
                params = colors.map {
                    KtFileBuilder.FunParameter(
                        name = it.attrName,
                        type = KtFileBuilder.TypeColor,
                        defValue = "this.${it.attrName}",
                    )
                },
                body = listOf(
                    "return $colorClassName(${
                        colors.joinToString(separator = ",·") { it.attrName }
                    })",
                ),
                description = "Возвращает копию [$colorClassName]",
            )

            rootColorsClass.appendFun(
                name = "toString",
                modifiers = listOf(Modifier.OVERRIDE),
                body = listOf(
                    "return \"\${this::class.simpleName}(${
                        colors.joinToString(
                            separator = ",·",
                        ) { "${it.attrName}=$${it.attrName}" }
                    })\"",
                ),
            )
        }
    }

    private fun addUpdateColorsFromFun() {
        colorKtFileBuilder.appendRootFun(
            name = "updateColorsFrom",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "other",
                    type = colorClassType,

                ),
            ),
            receiver = colorClassType,
            body = colors.map { "${it.attrName} = other.${it.attrName}\n" },
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addLightColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "light${themeName}Colors",
            params = colors.map {
                KtFileBuilder.FunParameter(
                    name = it.attrName,
                    type = KtFileBuilder.TypeColor,
                    defValue = "LightColorTokens.${it.tokenRefName}",
                )
            },
            returnType = colorClassType,
            body = listOf(
                "return $colorClassName(${
                    colors.joinToString(
                        separator = ",·",
                    ) { it.attrName }
                })",
            ),
            description = "Цвета [$colorClassName] для светлой темы",
        )
    }

    private fun addDarkColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "dark${themeName}Colors",
            params = colors.map {
                KtFileBuilder.FunParameter(
                    name = it.attrName,
                    type = KtFileBuilder.TypeColor,
                    defValue = "DarkColorTokens.${it.tokenRefName}",
                )
            },
            returnType = colorClassType,
            body = listOf(
                "return $colorClassName(${
                    colors.joinToString(
                        separator = ",·",
                    ) { it.attrName }
                })",
            ),
            description = "Цвета [$colorClassName] для темной темы",
        )
    }

    private fun addLocalColorsVal() {
        colorKtFileBuilder.appendRootVal(
            name = "Local${themeName}Colors",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorClassType,
            initializer = "staticCompositionLocalOf { light${themeName}Colors() }",
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addImports() {
        with(colorKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "structuralEqualityPolicy",
                    "mutableStateOf",
                    "getValue",
                    "setValue",
                    "Immutable",
                ),
            )
            addImport(
                packageName = "androidx.compose.ui.graphics",
                names = listOf("Color"),
            )
        }
    }
}
