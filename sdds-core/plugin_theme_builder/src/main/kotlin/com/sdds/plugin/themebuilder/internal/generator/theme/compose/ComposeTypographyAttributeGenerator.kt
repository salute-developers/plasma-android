package com.sdds.plugin.themebuilder.internal.generator.theme.compose

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.internal.PackageResolver
import com.sdds.plugin.themebuilder.internal.TargetPackage
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Constructor
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Modifier
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.KtFileFromResourcesBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.SimpleBaseGenerator
import com.sdds.plugin.themebuilder.internal.generator.TypographyTokenGenerator.Companion.TYPOGRAPHY_LARGE_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.TypographyTokenGenerator.Companion.TYPOGRAPHY_MEDIUM_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.TypographyTokenGenerator.Companion.TYPOGRAPHY_SMALL_TOKENS_NAME
import com.sdds.plugin.themebuilder.internal.generator.data.TypographyTokenResult
import com.sdds.plugin.themebuilder.internal.generator.data.mergedScreenClasses
import com.sdds.plugin.themebuilder.internal.token.TypographyToken.ScreenClass
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.squareup.kotlinpoet.ClassName

/**
 * Генератор Compose-атрибутов типографики.
 * Генерирует kt-файл, содержащий в себе всю типографику темы.
 *
 * @property ktFileBuilderFactory фабрика [KtFileBuilder]
 * @property ktFileFromResourcesBuilderFactory фабрика для билдера kt файлов из ресурсов
 * @property outputLocation директория для Kotlin-файлов
 * @property themeName название темы
 * @property dimensionsConfig конфигурация размеров
 */
internal class ComposeTypographyAttributeGenerator(
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val ktFileFromResourcesBuilderFactory: KtFileFromResourcesBuilderFactory,
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val themeName: String,
    private val dimensionsConfig: DimensionsConfig,
    private val packageResolver: PackageResolver,
) : SimpleBaseGenerator {

    private var tokenData: TypographyTokenResult.ComposeTokenData? = null
    private val typographyAttributes = mutableSetOf<String>()
    private val typographyKtFileBuilder by unsafeLazy {
        ktFileBuilderFactory.create(typographyClassName, TargetPackage.THEME)
    }
    private val ktFileFromResBuilder by unsafeLazy {
        ktFileFromResourcesBuilderFactory.create(TargetPackage.THEME)
    }

    private val camelThemeName = themeName.snakeToCamelCase()
    private val typographyClassName = "${camelThemeName}Typography"
    private val typographyClassType by unsafeLazy {
        typographyKtFileBuilder.getInternalClassType(typographyClassName)
    }

    override fun generate() {
        tokenData ?: return

        createWindowSizeFile()
        addImports()
        addTypographyClass()
        addSmallTypographyFun()
        addMediumTypographyFun()
        addLargeTypographyFun()
        addLocalTypographyVal()
        addDynamicTypographyFun()
        addBreakPointFun()

        typographyKtFileBuilder.build(outputLocation)
    }

    fun setTypographyTokenData(data: TypographyTokenResult.ComposeTokenData) {
        tokenData = data
        typographyAttributes.clear()
        typographyAttributes.addAll(data.mergedScreenClasses())
    }

    private fun createWindowSizeFile() {
        ktFileFromResBuilder.buildFromResource(
            inputRes = "$RAW_KT_FILE_RES_DIR/$WINDOW_SIZE_KT_FILE_NAME.txt",
            outputLocation = outputLocation,
            outputFileName = WINDOW_SIZE_KT_FILE_NAME,
        )
    }

    private fun addImports() {
        with(typographyKtFileBuilder) {
            addImport(
                packageName = "androidx.compose.runtime",
                names = listOf(
                    "staticCompositionLocalOf",
                    "Immutable",
                    "structuralEqualityPolicy",
                    "compositionLocalOf",
                ),
            )
            addImport(KtFileBuilder.TypeDpExtension)
            val tokenData = tokenData ?: return
            if (tokenData.small.isNotEmpty()) {
                addImport(
                    getInternalClassType(
                        className = TYPOGRAPHY_SMALL_TOKENS_NAME,
                        classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                    ),
                )
            }
            if (tokenData.medium.isNotEmpty()) {
                addImport(
                    getInternalClassType(
                        className = TYPOGRAPHY_MEDIUM_TOKENS_NAME,
                        classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                    ),
                )
            }
            if (tokenData.large.isNotEmpty()) {
                addImport(
                    getInternalClassType(
                        className = TYPOGRAPHY_LARGE_TOKENS_NAME,
                        classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                    ),
                )
            }
        }
    }

    private fun addLocalTypographyVal() {
        typographyKtFileBuilder.appendRootVal(
            name = "Local$typographyClassName",
            typeName = KtFileBuilder.TypeProvidableCompositionLocal,
            parameterizedType = typographyClassType,
            initializer = """
                staticCompositionLocalOf·{
                    $typographyClassName()
                }
            """.trimIndent(),
            modifiers = listOf(Modifier.INTERNAL),
        )
    }

    private fun addDynamicTypographyFun() {
        typographyKtFileBuilder.appendRootFun(
            name = "dynamic$typographyClassName",
            annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
            returnType = typographyClassType,
            body = listOf(
                """
                    |val widthClass = collectWindowSizeInfoAsState().value.widthClass
                    |return when (widthClass) {
                    |    ${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Expanded -> large$typographyClassName()
                    |    ${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Medium -> medium$typographyClassName()
                    |    ${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Compact -> small$typographyClassName()
                    |}
                """.trimMargin(),
            ),
            description = "Возвращает разные [$typographyClassName] в зависимости от ширины окна. " +
                "Значение динамически изменяется при изменении ширины окна.",
        )
    }

    private fun addBreakPointFun() {
        val bp = dimensionsConfig.breakPoints
        typographyKtFileBuilder.appendRootFun(
            receiver = ClassName(typographyClassType.packageName, "WindowSizeClass"),
            name = "widthBreakPoint",
            returnType = KtFileBuilder.TypeDp,
            body = listOf(
                "return when (this) {\n",
                "${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Expanded -> ${bp.large.toFloat()}.dp\n",
                "${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Medium -> ${bp.medium.toFloat()}.dp\n",
                "${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Compact -> 0.dp\n",
                "}",
            ),
            description = "Возвращает значение в dp - брейкпоинт по ширине для указанного класса размерности.",
        )
    }

    private fun addTypographyClass() {
        with(typographyKtFileBuilder) {
            rootClass(
                name = typographyClassName,
                primaryConstructor = Constructor.Primary(
                    parameters = typographyAttributes
                        .map {
                            KtFileBuilder.FunParameter(
                                name = it,
                                type = KtFileBuilder.TypeTextStyle,
                                defValue = "TextStyle.Default",
                                asProperty = true,
                                description = tokenData?.description(it),
                            )
                        },
                    modifiers = listOf(Modifier.INTERNAL),
                ),
                annotation = KtFileBuilder.TypeAnnotationImmutable,
                description = "Типографика $camelThemeName",
                modifiers = listOf(Modifier.DATA),
            )
        }
    }

    private fun addSmallTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "small$typographyClassName",
            screenClass = ScreenClass.SMALL,
            description = "Возвращает [$typographyClassName] для WindowSizeClass.Compact",
        )
    }

    private fun addMediumTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "medium$typographyClassName",
            screenClass = ScreenClass.MEDIUM,
            description = "Возвращает [$typographyClassName] для WindowSizeClass.Medium",
        )
    }

    private fun addLargeTypographyFun() {
        addScreenSpecificTypographyFun(
            funName = "large$typographyClassName",
            screenClass = ScreenClass.LARGE,
            description = "Возвращает [$typographyClassName] для WindowSizeClass.Expanded",
        )
    }

    private fun addScreenSpecificTypographyFun(
        funName: String,
        screenClass: ScreenClass,
        description: String,
    ) {
        with(typographyKtFileBuilder) {
            appendRootFun(
                name = funName,
                returnType = typographyClassType,
                body = listOf(
                    KtFileBuilder.createConstructorCall(
                        constructorName = typographyClassName,
                        initializers = typographyAttributes.map {
                            "$it = ${findTypographyTokenRef(it, screenClass)}"
                        }.toTypedArray(),
                    ).let { "return $it" },
                ),
                description = description,
                annotations = listOf(
                    KtFileBuilder.TypeAnnotationComposable,
                    KtFileBuilder.TypeAnnotationReadOnlyComposable,
                ).takeIf { dimensionsConfig.fromResources },
            )
        }
    }

    private fun findTypographyTokenRef(attributeName: String, screenClass: ScreenClass): String? {
        val safeTokenData = tokenData ?: return null
        val info = when (screenClass) {
            ScreenClass.SMALL -> safeTokenData.small[attributeName]
                ?: safeTokenData.medium[attributeName]
                ?: safeTokenData.large[attributeName]

            ScreenClass.LARGE -> safeTokenData.large[attributeName]
                ?: safeTokenData.medium[attributeName]
                ?: safeTokenData.small[attributeName]

            else -> safeTokenData.medium[attributeName]
                ?: safeTokenData.small[attributeName]
                ?: safeTokenData.large[attributeName]
        }
        return info?.tokenRef
    }

    private companion object {
        private const val RAW_KT_FILE_RES_DIR = "raw-kt-files/compose"
        private const val WINDOW_SIZE_KT_FILE_NAME = "WindowSize"
    }
}
