package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Companion.TypeString
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INFIX
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.INTERNAL
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier.PRIVATE
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator.Companion.DARK_COLOR_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.ColorTokenGenerator.Companion.LIGHT_COLOR_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.data.ColorTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedLightAndDark
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName

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
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {

    private var tokenData: Map<Tenant, ColorTokenResult.TokenData> = emptyMap()
    private val colorAttributes = mutableSetOf<String>()

    private val colorKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(colorClassName, TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val colorClassName = "${camelThemeName}Colors"
    private val colorClassType by unsafeLazy {
        colorKtFileBuilder.getInternalClassType(colorClassName)
    }

    override fun generate() {
        addImports()
        addColorsClass()
        addUpdateColorsFromFun()
        addLocalColorsVal()
        addMutableMapExtension()
        addLightColorsFun()
        addDarkColorsFun()
        addLightTenants()
        addDarkTenants()
        addColorOverrideScopeClass()
        addColorAttrOverrideScopeClass()
        addObtainStateFun()

        colorKtFileBuilder.build(outputLocation)
    }

    fun setColorTokenData(data: Map<Tenant, ColorTokenResult.TokenData>) {
        tokenData = data
        val defaultTenantData = data[Tenant.Default] ?: return
        colorAttributes.clear()
        colorAttributes.addAll(defaultTenantData.mergedLightAndDark())
    }

    private fun addColorsClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = colorClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = listOf(
                        KtFileBuilder.FunParameter(
                            name = "colors",
                            type = KtFileBuilder.TypeMapOfColors,
                            asProperty = true,
                            modifiers = listOf(PRIVATE),
                        ),
                    ),
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Цвета $camelThemeName",
            )

            colorAttributes.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeColor,
                    isMutable = true,
                    delegate = "colors.obtain(\"$color\")",
                    description = tokenData[Tenant.Default]?.description(color),
                )
            }

            rootColorsClass.appendFun(
                name = "copy",
                returnType = getInternalClassType(colorClassName),
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "overrideColors",
                        type = KtFileBuilder.getLambdaType(
                            receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                        ),
                        defValue = "{}",
                    ),
                ),
                body = listOf(
                    "val colorOverrideScope = ColorOverrideScope()\n",
                    "overrideColors.invoke(colorOverrideScope)\n",
                    "val overrideMap = colorOverrideScope.overrideMap\n",
                    "return $colorClassName(colors.mapValues { overrideMap[it.key] ?: it.value })",
                ),
                description = "Возвращает копию [$colorClassName]. " +
                    "Предоставляет возможность переопределять цвета.",
            )

            rootColorsClass.appendFun(
                name = "copyAttrs",
                returnType = getInternalClassType(colorClassName),
                params = listOf(
                    KtFileBuilder.FunParameter(
                        name = "overrideColors",
                        type = KtFileBuilder.getLambdaType(
                            receiver = colorKtFileBuilder.getInternalClassType("ColorAttrOverrideScope"),
                        ),
                        defValue = "{}",
                    ),
                ),
                body = listOf(
                    "val colorOverrideScope = ColorAttrOverrideScope()\n",
                    "overrideColors.invoke(colorOverrideScope)\n",
                    "val overrideMap = colorOverrideScope.overrideMap\n",
                    "return $colorClassName(colors.mapValues { colors[overrideMap[it.key]] ?: it.value })",
                ),
                modifiers = listOf(INTERNAL),
                description = "Возвращает копию [$colorClassName]. " +
                    "Предоставляет возможность переопределять цвета.",
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
            suppressAnnotations = listOf("LongMethod"),
        )
    }

    private fun addMutableMapExtension() {
        colorKtFileBuilder.appendRootFun(
            name = "add",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "attribute",
                    type = KtFileBuilder.TypeString,
                ),
                KtFileBuilder.FunParameter(
                    name = "defaultTokenValue",
                    type = KtFileBuilder.TypeColor,
                ),
                KtFileBuilder.FunParameter(
                    name = "overwriteMap",
                    type = KtFileBuilder.TypeMapOfColors,
                ),
            ),
            modifiers = listOf(PRIVATE),
            receiver = KtFileBuilder.TypeMutableMapOfColors,
            body = listOf("this[attribute] = overwriteMap[attribute] ?: defaultTokenValue"),
        )
    }

    private fun addLightTenants() {
        tokenData
            .filter { it.key != Tenant.Default }
            .forEach { (tenant, data) ->
                if (data.light.isNotEmpty()) {
                    colorKtFileBuilder.appendRootFun(
                        name = "light${camelThemeName}Colors${tenant.name}",
                        params = listOf(
                            KtFileBuilder.FunParameter(
                                name = "overrideColors",
                                type = KtFileBuilder.getLambdaType(
                                    receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                                ),
                                defValue = "{}",
                            ),
                        ),
                        returnType = colorClassType,
                        body = listOf(
                            "return light${camelThemeName}Colors {\n",
                            data.light.entries.joinToString(separator = "\n") {
                                "${it.key} overrideBy LightColorTokens${tenant.name}.${it.value.colorRef}"
                            },
                            "\noverrideColors()",
                            "\n}",
                        ),
                        description = "Цвета [$colorClassName] для светлой темы в тенанте ${tenant.name}",
                        suppressAnnotations = listOf("LongMethod"),
                    )
                }
            }
    }

    private fun addDarkTenants() {
        tokenData
            .filter { it.key != Tenant.Default }
            .forEach { (tenant, data) ->
                if (data.dark.isNotEmpty()) {
                    colorKtFileBuilder.appendRootFun(
                        name = "dark${camelThemeName}Colors${tenant.name}",
                        params = listOf(
                            KtFileBuilder.FunParameter(
                                name = "overrideColors",
                                type = KtFileBuilder.getLambdaType(
                                    receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                                ),
                                defValue = "{}",
                            ),
                        ),
                        returnType = colorClassType,
                        body = listOf(
                            "return dark${camelThemeName}Colors {\n",
                            data.light.entries.joinToString(separator = "\n") {
                                "${it.key} overrideBy  DarkColorTokens${tenant.name}.${it.value.colorRef}"
                            },
                            "\noverrideColors()",
                            "\n}",
                        ),
                        description = "Цвета [$colorClassName] для темной темы в тенанте ${tenant.name}",
                        suppressAnnotations = listOf("LongMethod"),
                    )
                }
            }
    }

    private fun addLightColorsFun() {
        val defaultTokenData = tokenData[Tenant.Default]
            ?: throw ThemeBuilderException("color token data must be presented for default tenant")
        colorKtFileBuilder.appendRootFun(
            name = "light${camelThemeName}Colors",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "overrideColors",
                    type = KtFileBuilder.getLambdaType(
                        receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                    ),
                    defValue = "{}",
                ),
            ),
            returnType = colorClassType,
            body = listOf(
                "val colorOverrideScope = ColorOverrideScope()\n",
                "overrideColors.invoke(colorOverrideScope)\n",
                "val overwrite = colorOverrideScope.overrideMap\n",
                "val initial = mutableMapOf<String, Color>()\n",
                colorAttributes.joinToString(separator = "\n") {
                    val defaultValue = if (defaultTokenData.light[it]?.colorRef != null) {
                        "LightColorTokens.${defaultTokenData.light[it]?.colorRef}"
                    } else {
                        "DarkColorTokens.${
                            defaultTokenData.dark[it]?.colorRef ?: throw ThemeBuilderException(
                                "Can't find token value for color $it",
                            )
                        }"
                    }
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $colorClassName(initial)",
            ),
            description = "Цвета [$colorClassName] для светлой темы",
            suppressAnnotations = listOf("LongMethod"),
        )
    }

    private fun addDarkColorsFun() {
        val defaultTokenData = tokenData[Tenant.Default]
            ?: throw ThemeBuilderException("color token data must be presented for default tenant")
        colorKtFileBuilder.appendRootFun(
            name = "dark${camelThemeName}Colors",
            params = listOf(
                KtFileBuilder.FunParameter(
                    name = "overrideColors",
                    type = KtFileBuilder.getLambdaType(
                        receiver = colorKtFileBuilder.getInternalClassType("ColorOverrideScope"),
                    ),
                    defValue = "{}",
                ),
            ),
            returnType = colorClassType,
            body = listOf(
                "val colorOverrideScope = ColorOverrideScope()\n",
                "overrideColors.invoke(colorOverrideScope)\n",
                "val overwrite = colorOverrideScope.overrideMap\n",
                "val initial = mutableMapOf<String, Color>()\n",
                colorAttributes.joinToString(separator = "\n") {
                    val defaultValue = if (defaultTokenData.dark[it]?.colorRef != null) {
                        "DarkColorTokens.${defaultTokenData.dark[it]?.colorRef}"
                    } else {
                        "LightColorTokens.${
                            defaultTokenData.light[it]?.colorRef ?: throw ThemeBuilderException(
                                "Can't find token value for color $it",
                            )
                        }"
                    }
                    "initial.add(\"$it\", $defaultValue, overwrite)"
                },
                "\nreturn $colorClassName(initial)",
            ),
            description = "Цвета [$colorClassName] для темной темы",
            suppressAnnotations = listOf("LongMethod"),
        )
    }

    private fun addColorOverrideScopeClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = "ColorOverrideScope",
                description = "Скоуп переопределения цветов",
            )

            rootColorsClass.appendProperty(
                name = "_overrideMap",
                typeName = KtFileBuilder.TypeMutableMapOfColors,
                initializer = "mutableMapOf()",
                modifiers = listOf(PRIVATE),
            )

            rootColorsClass.appendProperty(
                name = "overrideMap",
                typeName = KtFileBuilder.TypeMapOfColors,
                modifiers = listOf(INTERNAL),
                propGetter = KtFileBuilder.Getter.Annotated(
                    body = "return _overrideMap.toMap()",
                ),
            )
            val defaultTokenData = tokenData[Tenant.Default]
            colorAttributes.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeString,
                    isMutable = false,
                    initializer = "\"$color\"",
                    description = defaultTokenData?.description(color),
                )
            }

            rootColorsClass.appendFun(
                name = "overrideBy",
                params = listOf(
                    KtFileBuilder.FunParameter("color", type = KtFileBuilder.TypeColor),
                ),
                modifiers = listOf(INFIX),
                receiver = KtFileBuilder.TypeString,
                body = listOf("_overrideMap[this] = color"),
                description = "Переопределяет аттрибут цвета.",
            )
        }
    }

    private fun addColorAttrOverrideScopeClass() {
        with(colorKtFileBuilder) {
            val rootColorsClass = rootClass(
                name = "ColorAttrOverrideScope",
                description = "Скоуп переопределения цветов по арибутам",
                modifiers = listOf(INTERNAL),
            )
            val mutableMapType = ClassName(
                "kotlin.collections",
                "MutableMap",
            ).parameterizedBy(TypeString, TypeString)
            val mapType = Map::class.asClassName().parameterizedBy(TypeString, TypeString)

            rootColorsClass.appendProperty(
                name = "_overrideMap",
                typeName = mutableMapType,
                initializer = "mutableMapOf()",
                modifiers = listOf(PRIVATE),
            )

            rootColorsClass.appendProperty(
                name = "overrideMap",
                typeName = mapType,
                modifiers = listOf(INTERNAL),
                propGetter = KtFileBuilder.Getter.Annotated(
                    body = "return _overrideMap.toMap()",
                ),
            )
            val defaultTokenData = tokenData[Tenant.Default]
            colorAttributes.forEach { color ->
                rootColorsClass.appendProperty(
                    name = color,
                    typeName = KtFileBuilder.TypeString,
                    isMutable = false,
                    initializer = "\"$color\"",
                    description = defaultTokenData?.description(color),
                )
            }

            rootColorsClass.appendFun(
                name = "overrideBy",
                params = listOf(
                    KtFileBuilder.FunParameter("color", type = KtFileBuilder.TypeString),
                ),
                modifiers = listOf(INFIX),
                receiver = KtFileBuilder.TypeString,
                body = listOf("_overrideMap[this] = color"),
                description = "Переопределяет аттрибут цвета.",
            )
        }
    }

    private fun addLocalColorsVal() {
        colorKtFileBuilder.appendRootVal(
            name = "Local$colorClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = colorClassType,
            initializer = """
                staticCompositionLocalOf·{
                    light${camelThemeName}Colors()
                }
            """.trimIndent(),
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
            tokenData.forEach { (tenant, data) ->
                if (data.dark.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${DARK_COLOR_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
                if (data.light.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${LIGHT_COLOR_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
            }
        }
    }

    private fun addObtainStateFun() {
        colorKtFileBuilder.appendRootFun(
            name = "obtain",
            receiver = KtFileBuilder.TypeMapOfColors,
            returnType = KtFileBuilder.TypeMutableStateOfColor,
            modifiers = listOf(PRIVATE),
            params = listOf(
                KtFileBuilder.FunParameter("name", String::class.asTypeName()),
            ),
            body = listOf("return mutableStateOf(get(name)!!, structuralEqualityPolicy())"),
        )
    }
}
