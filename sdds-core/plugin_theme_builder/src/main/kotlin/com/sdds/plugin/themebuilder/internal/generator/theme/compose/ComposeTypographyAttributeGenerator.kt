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
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
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
    private val multiplatform: Boolean = false,
) : SimpleBaseGenerator {

    private var tokenData: Map<Tenant, TypographyTokenResult.ComposeTokenData> = emptyMap()
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
        if (tokenData.isEmpty()) return

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

    fun setTypographyTokenData(data: Map<Tenant, TypographyTokenResult.ComposeTokenData>) {
        tokenData = data
        val defaultTenantData = data[Tenant.Default] ?: return
        typographyAttributes.clear()
        typographyAttributes.addAll(defaultTenantData.mergedScreenClasses())
    }

    private fun createWindowSizeFile() {
        // В CMP-режиме используется мультиплатформенный шаблон (без Android-only
        // LocalContext/displayMetrics), но имя выходного файла остаётся прежним.
        val templateName = if (multiplatform) WINDOW_SIZE_CMP_TEMPLATE_NAME else WINDOW_SIZE_KT_FILE_NAME
        ktFileFromResBuilder.buildFromResource(
            inputRes = "$RAW_KT_FILE_RES_DIR/$templateName.txt",
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
            tokenData.forEach { (tenant, data) ->
                if (data.small.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${TYPOGRAPHY_SMALL_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
                if (data.medium.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${TYPOGRAPHY_MEDIUM_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
                if (data.large.isNotEmpty()) {
                    addImport(
                        getInternalClassType(
                            className = "${TYPOGRAPHY_LARGE_TOKENS_NAME}${tenant.name}",
                            classPackage = packageResolver.getPackage(TargetPackage.TOKENS),
                        ),
                    )
                }
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
        tokenData.forEach { (tenant, data) ->
            val largeFunCall = "large$typographyClassName${tenant.name}()"
            val mediumFunCall = "medium$typographyClassName${tenant.name}()"
            val smallFunCall = "small$typographyClassName${tenant.name}()"
            typographyKtFileBuilder.appendRootFun(
                name = "dynamic$typographyClassName${tenant.name}",
                annotations = listOf(KtFileBuilder.TypeAnnotationComposable),
                returnType = typographyClassType,
                body = listOf(
                    """
                    |val widthClass = collectWindowSizeInfoAsState().value.widthClass
                    |return when (widthClass) {
                    |    ${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Expanded -> $largeFunCall
                    |    ${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Medium -> $mediumFunCall
                    |    ${KtFileBuilder.DEFAULT_FILE_INDENT}WindowSizeClass.Compact -> $smallFunCall
                    |}
                    """.trimMargin(),
                ),
                description = "Возвращает разные [$typographyClassName] в зависимости от ширины окна. " +
                    "Значение динамически изменяется при изменении ширины окна.",
            )
        }
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
            val defaultTokenData = tokenData[Tenant.Default]
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
                                description = defaultTokenData?.description(it),
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
        tokenData.forEach { entry ->
            addScreenSpecificTypographyFun(
                funName = "small$typographyClassName${entry.key.name}",
                screenClass = ScreenClass.SMALL,
                description = "Возвращает [$typographyClassName] для WindowSizeClass.Compact",
                tenant = entry.key,
            )
        }
    }

    private fun addMediumTypographyFun() {
        tokenData.forEach { entry ->
            addScreenSpecificTypographyFun(
                funName = "medium$typographyClassName${entry.key.name}",
                screenClass = ScreenClass.MEDIUM,
                description = "Возвращает [$typographyClassName] для WindowSizeClass.Medium",
                tenant = entry.key,
            )
        }
    }

    private fun addLargeTypographyFun() {
        tokenData.forEach { entry ->
            addScreenSpecificTypographyFun(
                funName = "large$typographyClassName${entry.key.name}",
                screenClass = ScreenClass.LARGE,
                description = "Возвращает [$typographyClassName] для WindowSizeClass.Expanded",
                tenant = entry.key,
            )
        }
    }

    private fun addScreenSpecificTypographyFun(
        funName: String,
        screenClass: ScreenClass,
        description: String,
        tenant: Tenant,
    ) {
        with(typographyKtFileBuilder) {
            appendRootFun(
                name = funName,
                returnType = typographyClassType,
                body = listOf(
                    KtFileBuilder.createConstructorCall(
                        constructorName = typographyClassName,
                        initializers = typographyAttributes.map {
                            "$it = ${findTypographyTokenRef(it, screenClass, tenant)}"
                        }.toTypedArray(),
                    ).let { "return $it" },
                ),
                description = description,
                annotations = when {
                    // fromResources: токены типографики — @Composable @ReadOnlyComposable (LocalDensity)
                    dimensionsConfig.fromResources -> listOf(
                        KtFileBuilder.TypeAnnotationComposable,
                        KtFileBuilder.TypeAnnotationReadOnlyComposable,
                    )
                    // CMP: токены типографики — обычные @Composable (ссылаются на @Composable FontTokens),
                    // поэтому фабрика тоже @Composable (без ReadOnlyComposable)
                    multiplatform -> listOf(KtFileBuilder.TypeAnnotationComposable)
                    else -> null
                },
            )
        }
    }

    @Suppress("CyclomaticComplexMethod")
    private fun findTypographyTokenRef(
        attributeName: String,
        screenClass: ScreenClass,
        tenant: Tenant,
    ): String? {
        val defaultTokenData = tokenData[Tenant.Default] ?: return null
        val safeTokenData = tokenData[tenant] ?: defaultTokenData
        val info = when (screenClass) {
            ScreenClass.SMALL -> safeTokenData.small[attributeName]
                ?: safeTokenData.medium[attributeName]
                ?: safeTokenData.large[attributeName]
                ?: defaultTokenData.small[attributeName]
                ?: defaultTokenData.medium[attributeName]
                ?: defaultTokenData.large[attributeName]

            ScreenClass.LARGE -> safeTokenData.large[attributeName]
                ?: safeTokenData.medium[attributeName]
                ?: safeTokenData.small[attributeName]
                ?: defaultTokenData.large[attributeName]
                ?: defaultTokenData.medium[attributeName]
                ?: defaultTokenData.small[attributeName]

            else -> safeTokenData.medium[attributeName]
                ?: safeTokenData.small[attributeName]
                ?: safeTokenData.large[attributeName]
                ?: defaultTokenData.medium[attributeName]
                ?: defaultTokenData.small[attributeName]
                ?: defaultTokenData.large[attributeName]
        }
        return info?.tokenRef
    }

    private companion object {
        private const val RAW_KT_FILE_RES_DIR = "raw-kt-files/compose"
        private const val WINDOW_SIZE_KT_FILE_NAME = "WindowSize"
        private const val WINDOW_SIZE_CMP_TEMPLATE_NAME = "WindowSizeCmp"
    }
}
