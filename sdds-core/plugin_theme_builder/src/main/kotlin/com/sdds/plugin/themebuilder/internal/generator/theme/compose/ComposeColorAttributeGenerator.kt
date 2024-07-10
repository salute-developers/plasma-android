package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
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
) : SimpleBaseGenerator {

    private var tokenData: ColorTokenResult.TokenData? = null
    private val colorAttributes = mutableSetOf<String>()

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(colorClassName)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val colorClassName = "${camelThemeName}Colors"
    private val colorClassType by unsafeLazy {
        colorKtFileBuilder.getInternalClassType(colorClassName)
    }

    override fun generate() {
        tokenData ?: return

        addImports()
        addColorsClass()
        addUpdateColorsFromFun()
        addLocalColorsVal()
        addLightColorsFun()
        addDarkColorsFun()

        colorKtFileBuilder.build(outputLocation)
    }

    fun setColorTokenData(data: ColorTokenResult.TokenData) {
        tokenData = data
        colorAttributes.clear()
        colorAttributes.addAll(data.mergedLightAndDark())
    }

    private fun addColorsClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = colorClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = colorAttributes.map {
                        KtFileBuilder.FunParameter(
                            name = it,
                            type = KtFileBuilder.TypeColor,
                        )
                    },
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Цвета $camelThemeName",
            )

            colorAttributes.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeColor,
                    isMutable = true,
                    delegate = "mutableStateOf($color, structuralEqualityPolicy())",
                )
            }

            rootColorsClass.appendFun(
                name = "copy",
                returnType = getInternalClassType(colorClassName),
                params = colorAttributes.map {
                    KtFileBuilder.FunParameter(
                        name = it,
                        type = KtFileBuilder.TypeColor,
                        defValue = "this.$it",
                    )
                },
                body = listOf(
                    "return $colorClassName(${
                        colorAttributes.joinToString(separator = ",·")
                    })",
                ),
                description = "Возвращает копию [$colorClassName]",
            )

            rootColorsClass.appendFun(
                name = "toString",
                modifiers = listOf(Modifier.OVERRIDE),
                body = listOf(
                    "return \"\${this::class.simpleName}(${
                        colorAttributes.joinToString(
                            separator = ",·",
                        ) { "$it=$$it" }
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
            body = colorAttributes.map { "$it = other.$it\n" },
            modifiers = listOf(INTERNAL),
        )
    }

    private fun addLightColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "light${camelThemeName}Colors",
            params = colorAttributes.map {
                val defaultValue = if (tokenData?.light?.get(it) != null) {
                    "LightColorTokens.${tokenData?.light?.get(it)}"
                } else {
                    "DarkColorTokens.${
                        tokenData?.dark?.get(it) ?: throw ThemeBuilderException(
                            "Can't find token value for color $it",
                        )
                    }"
                }
                KtFileBuilder.FunParameter(
                    name = it,
                    type = KtFileBuilder.TypeColor,
                    defValue = defaultValue,
                )
            },
            returnType = colorClassType,
            body = listOf(
                "return $colorClassName(${colorAttributes.joinToString(separator = ",·")})",
            ),
            description = "Цвета [$colorClassName] для светлой темы",
        )
    }

    private fun addDarkColorsFun() {
        colorKtFileBuilder.appendRootFun(
            name = "dark${camelThemeName}Colors",
            params = colorAttributes.map {
                val defaultValue = if (tokenData?.dark?.get(it) != null) {
                    "DarkColorTokens.${tokenData?.dark?.get(it)}"
                } else {
                    "LightColorTokens.${
                        tokenData?.light?.get(it) ?: throw ThemeBuilderException(
                            "Can't find token value for gradient $it",
                        )
                    }"
                }
                KtFileBuilder.FunParameter(
                    name = it,
                    type = KtFileBuilder.TypeColor,
                    defValue = defaultValue,
                )
            },
            returnType = colorClassType,
            body = listOf(
                "return $colorClassName(${colorAttributes.joinToString(separator = ",·")})",
            ),
            description = "Цвета [$colorClassName] для темной темы",
        )
    }

    private fun addLocalColorsVal() {
        colorKtFileBuilder.appendRootVal(
            name = "Local$colorClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorClassType,
            initializer = "staticCompositionLocalOf { light${camelThemeName}Colors() }",
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
