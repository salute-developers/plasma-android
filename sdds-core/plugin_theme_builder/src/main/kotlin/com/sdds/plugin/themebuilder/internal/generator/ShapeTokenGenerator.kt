package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.DimensionsConfig
import com.sdds.plugin.themebuilder.ShapeAppearanceConfig
import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder.Annotation
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.tenant.Tenant
import com.sdds.plugin.themebuilder.internal.token.GeneratedTokenInfo
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.toJson
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shapesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.decapitalized
import com.sdds.plugin.themebuilder.internal.utils.snakeToCamelCase
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.ShapeTokenValidator
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

/**
 * Генератор токенов форм
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param dimensAggregator агрегатор размеров
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @param namespace пакет проекта
 * @author Малышев Александр on 07.03.2024
 */
internal class ShapeTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val viewShapeAppearanceConfig: List<ShapeAppearanceConfig>,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val shapeTokenValues: Map<Tenant, Map<String, ShapeTokenValue>>,
    private val dimensionsConfig: DimensionsConfig,
    namespace: String,
    private val themeName: String,
) : TokenGenerator<ShapeToken, ShapeTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create(ROUND_SHAPE_TOKENS_NAME) }
    private val rootRoundShapes =
        mutableMapOf(Tenant.Default to ktFileBuilder.rootObject(ROUND_SHAPE_TOKENS_NAME, ROUND_SHAPE_TOKENS_DESC))
    private val shouldGenerateShapeStyles: Boolean = viewShapeAppearanceConfig.isNotEmpty()
    private val rFileImport = ClassName(namespace, "R")
    private var needCreateStyle: Boolean = true

    private val composeTokenDataCollectors = mutableMapOf<Tenant, MutableList<ShapeTokenResult.TokenData>>()
    private val viewTokenDataCollector =
        mutableListOf<ShapeTokenResult.TokenData>()

    private val generatedTokens = mutableListOf<GeneratedTokenInfo>()

    override fun collectResult() = ShapeTokenResult(
        composeTokens = composeTokenDataCollectors,
        viewTokens = viewTokenDataCollector,
        tokenInfo = generatedTokens,
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        if (!shouldGenerateShapeStyles) return
        super.generateViewSystem()
        xmlDocumentBuilder.build(outputResDir.shapesXmlFile())
    }

    /**
     * @see TokenGenerator.generateCompose
     */
    override fun generateCompose() {
        super.generateCompose()
        ktFileBuilder.addImport(KtFileBuilder.TypeDpExtension)
        ktFileBuilder.addImport(KtFileBuilder.TypeCornerSize)
        if (dimensionsConfig.fromResources) {
            ktFileBuilder.addImport(KtFileBuilder.TypeDimensionResource)
            ktFileBuilder.addImport(rFileImport)
        }
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: ShapeToken): Boolean = with(xmlDocumentBuilder) {
        val roundedShapeTokenValue = shapeTokenValues[Tenant.Default]?.get(token.name) as? RoundedShapeTokenValue
            ?: throw ThemeBuilderException(
                "Can't find value for shape token ${token.name}. " +
                    "It should be in android_shape.json.",
            )
        ShapeTokenValidator.validate(roundedShapeTokenValue, token.name)
        val cornerSize = DimenData(
            name = "${token.name.techToSnakeCase()}_corner_size",
            value = roundedShapeTokenValue.cornerRadius,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(cornerSize)
        if (shouldGenerateShapeStyles) {
            addShapeStyle(token, cornerSize, viewShapeAppearanceConfig)
        }
        return@with true
    }

    private fun XmlResourcesDocumentBuilder.addShapeStyle(
        token: ShapeToken,
        cornerSize: DimenData,
        viewShapeAppearanceConfig: List<ShapeAppearanceConfig>,
    ) {
        if (needCreateStyle) {
            needCreateStyle = false
            appendStyleWithCompositePrefix("Shape")
            appendStyleWithCompositePrefix("Shape.Round") {
                viewShapeAppearanceConfig.forEach {
                    appendElement(
                        elementName = ElementName.ITEM,
                        tokenName = it.cornerFamilyAttr,
                        value = "rounded",
                        usePrefix = false,
                    )
                }
            }
        }
        appendComment(token.description)
        val styleName = "Shape.${token.xmlName}"
        appendStyleWithCompositePrefix(styleName) {
            viewShapeAppearanceConfig.forEach {
                appendElement(
                    ElementName.ITEM,
                    it.cornerSizeAttr,
                    resourceReferenceProvider.dimen(cornerSize),
                    usePrefix = false,
                )
            }
        }
        viewTokenDataCollector.add(
            ShapeTokenResult.TokenData(
                attrName = ShapeToken.getAttrName(token.name),
                tokenRefName = resourceReferenceProvider.style(styleName),
                description = token.description,
            ),
        )
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ShapeToken): Boolean {
        shapeTokenValues[Tenant.Default]?.get(token.name) as? RoundedShapeTokenValue
            ?: throw ThemeBuilderException(
                "Can't find value for shape token ${token.name}. " +
                    "It should be in android_shape.json.",
            )
        shapeTokenValues.forEach { (tenant, values) ->
            val tokenValue = values[token.name]
            if (tokenValue != null && tokenValue is RoundedShapeTokenValue) {
                ShapeTokenValidator.validate(tokenValue, token.name)

                val rootObject = rootRoundShapes.getOrPut(tenant) {
                    ktFileBuilder.rootObject("${ROUND_SHAPE_TOKENS_NAME}${tenant.name}", ROUND_SHAPE_TOKENS_DESC)
                }
                if (dimensionsConfig.fromResources) {
                    rootObject.addShapeTokenWithResources(token, tokenValue, tenant)
                } else {
                    rootObject.addShapeToken(token, tokenValue)
                }
                val composeTokenDataCollector = composeTokenDataCollectors.getOrPut(tenant) {
                    mutableListOf()
                }
                val attrName = token.ktName.decapitalized()
                generatedTokens += GeneratedTokenInfo(
                    type = "shape",
                    name = token.name,
                    reference = token.ktName,
                    themeReference = "${themeName.snakeToCamelCase()}Theme.shapes.$attrName",
                    displayName = token.displayName,
                    description = token.description,
                    value = tokenValue.toJson(),
                )
                composeTokenDataCollector.add(
                    ShapeTokenResult.TokenData(
                        attrName = attrName,
                        tokenRefName = token.ktName,
                        description = token.description,
                        tokenObjectName = "${ROUND_SHAPE_TOKENS_NAME}${tenant.name}",
                    ),
                )
            }
        }
        return true
    }

    private fun TypeSpec.Builder.addShapeToken(
        token: ShapeToken,
        value: RoundedShapeTokenValue,
    ) = with(ktFileBuilder) {
        val initializer = "${value.cornerRadius * dimensionsConfig.multiplier}.dp"

        appendProperty(
            token.ktName,
            KtFileBuilder.TypeRoundRectShape,
            createInitializer(initializer),
            token.description,
        )
    }

    private fun TypeSpec.Builder.addShapeTokenWithResources(
        token: ShapeToken,
        value: RoundedShapeTokenValue,
        tenant: Tenant,
    ) = with(ktFileBuilder) {
        val tenantSuffix = if (tenant == Tenant.Default) {
            ""
        } else {
            "_${tenant.name}"
        }
        val cornerSize = DimenData(
            name = "${token.name.techToSnakeCase()}_corner_size$tenantSuffix",
            value = value.cornerRadius,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(cornerSize)
        val initializer = "dimensionResource(${resourceReferenceProvider.dimenR(cornerSize)})"

        appendProperty(
            name = token.ktName,
            typeName = KtFileBuilder.TypeRoundRectShape,
            propGetter = KtFileBuilder.Getter.Annotated(
                annotations = listOf(
                    Annotation(KtFileBuilder.TypeAnnotationComposable),
                    Annotation(KtFileBuilder.TypeAnnotationReadOnlyComposable),
                ),
                body = "return ${createInitializer(initializer)}",
            ),
            description = token.description,
        )
    }

    companion object {
        private fun createInitializer(cornerSizeInitializer: String): String =
            KtFileBuilder.createConstructorCall(
                "RoundedCornerShape",
                "CornerSize($cornerSizeInitializer)",
            )

        internal const val ROUND_SHAPE_TOKENS_NAME = "RoundShapeTokens"
        internal const val ROUND_SHAPE_TOKENS_DESC = "Токены скруглений"
    }
}
