package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

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
) {

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(colorClassName)
    }

    private val colorClassName = "${themeName}Colors"

    /**
     * Генерирует compose-атрибуты
     *
     * @param colors список названий атрибутов цвета в формате camel-case с маленькой буквы
     */
    fun generate(colors: List<ColorTokenResult.TokenData>) {
        generateColors(colors)
    }

    private fun generateColors(colors: List<ColorTokenResult.TokenData>) {
        if (colors.isEmpty()) return

        addImports()
        addColorsClass(colors)
        addLocalColorsVal()
        addLightColorsFun(colors)
        addDarkColorsFun(colors)

        colorKtFileBuilder.build(outputLocation)
    }

    private fun addColorsClass(colors: List<ColorTokenResult.TokenData>) {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = colorClassName,
                constructorParams = colors.map {
                    KtFileBuilder.FunParameter(
                        name = it.attrName,
                        type = KtFileBuilder.TypeColor,
                    )
                },
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

    private fun addLightColorsFun(colors: List<ColorTokenResult.TokenData>) {
        colorKtFileBuilder.appendRootFun(
            name = "light${themeName}Colors",
            params = colors.map {
                KtFileBuilder.FunParameter(
                    name = it.attrName,
                    type = KtFileBuilder.TypeColor,
                    defValue = "LightColorTokens.${it.tokenRefName}",
                )
            },
            returnType = colorKtFileBuilder.getInternalClassType(colorClassName),
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

    private fun addDarkColorsFun(colors: List<ColorTokenResult.TokenData>) {
        colorKtFileBuilder.appendRootFun(
            name = "dark${themeName}Colors",
            params = colors.map {
                KtFileBuilder.FunParameter(
                    name = it.attrName,
                    type = KtFileBuilder.TypeColor,
                    defValue = "DarkColorTokens.${it.tokenRefName}",
                )
            },
            returnType = colorKtFileBuilder.getInternalClassType(colorClassName),
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
            name = "LocalColors",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorKtFileBuilder.getInternalClassType(colorClassName),
            initializer = "staticCompositionLocalOf { light${themeName}Colors() }",
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
