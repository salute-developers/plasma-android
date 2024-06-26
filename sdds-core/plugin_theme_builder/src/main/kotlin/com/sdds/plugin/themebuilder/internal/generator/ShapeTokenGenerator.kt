package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.generator.data.ShapeTokenResult
import com.sdds.plugin.themebuilder.internal.token.RoundedShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.ShapeTokenValue
import com.sdds.plugin.themebuilder.internal.token.attrName
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shapesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import com.sdds.plugin.themebuilder.internal.validator.ShapeTokenValidator
import java.io.File
import java.util.Locale

/**
 * Генератор токенов форм
 * @param outputLocation локация для сохранения kt-файла с токенами
 * @param outputResDir директория для сохранения xml-файла с токенами
 * @param target целевой фреймворк
 * @param xmlBuilderFactory фабрика делегата построения xml файлов
 * @param ktFileBuilderFactory фабрика делегата построения kt файлов
 * @param dimensAggregator агрегатор размеров
 * @param resourceReferenceProvider провайдер ссылок на ресурсы
 * @author Малышев Александр on 07.03.2024
 */
internal class ShapeTokenGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val shapeTokenValues: Map<String, ShapeTokenValue>,
) : TokenGenerator<ShapeToken, ShapeTokenResult>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ShapeTokens") }
    private val rootRoundShapes by unsafeLazy { ktFileBuilder.rootObject("RoundShapeTokens") }
    private var needCreateStyle: Boolean = true

    private val composeTokenDataCollector =
        mutableListOf<ShapeTokenResult.TokenData>()
    private val viewTokenDataCollector =
        mutableListOf<ShapeTokenResult.TokenData>()

    override fun collectResult() = ShapeTokenResult(
        composeTokens = composeTokenDataCollector,
        viewTokens = viewTokenDataCollector,
    )

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
        if (!IS_SHAPE_STYLE_ENABLED) return
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
        ktFileBuilder.build(outputLocation)
    }

    /**
     * @see TokenGenerator.addViewSystemToken
     */
    override fun addViewSystemToken(token: ShapeToken): Boolean = with(xmlDocumentBuilder) {
        val roundedShapeTokenValue = shapeTokenValues[token.name] as? RoundedShapeTokenValue
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
        if (IS_SHAPE_STYLE_ENABLED) {
            addShapeStyle(token, cornerSize)
        }
        return@with true
    }

    private fun XmlResourcesDocumentBuilder.addShapeStyle(
        token: ShapeToken,
        cornerSize: DimenData,
    ) {
        if (needCreateStyle) {
            needCreateStyle = false
            appendStyleWithCompositePrefix("Shape")
            appendStyleWithCompositePrefix("Shape.Round") {
                appendElement(
                    elementName = ElementName.ITEM,
                    tokenName = "cornerFamily",
                    value = "rounded",
                    usePrefix = false,
                )
            }
        }
        appendComment(token.description)
        val styleName = "Shape.${token.xmlName}"
        appendStyleWithCompositePrefix(styleName) {
            appendElement(
                ElementName.ITEM,
                "cornerSize",
                resourceReferenceProvider.dimen(cornerSize),
                usePrefix = false,
            )
        }
        viewTokenDataCollector.add(
            ShapeTokenResult.TokenData(
                attrName = token.attrName(),
                tokenRefName = resourceReferenceProvider.style(styleName),
            ),
        )
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ShapeToken): Boolean = with(ktFileBuilder) {
        val roundedShapeTokenValue = shapeTokenValues[token.name] as? RoundedShapeTokenValue
            ?: throw ThemeBuilderException(
                "Can't find value for shape token ${token.name}. " +
                    "It should be in android_shape.json.",
            )
        ShapeTokenValidator.validate(roundedShapeTokenValue, token.name)

        val value = "${roundedShapeTokenValue.cornerRadius}.dp"
        val initializer = KtFileBuilder.createConstructorCall(
            "RoundedCornerShape",
            "CornerSize($value)",
        )
        rootRoundShapes.appendProperty(
            token.ktName,
            KtFileBuilder.TypeRoundRectShape,
            initializer,
            token.description,
        )
        composeTokenDataCollector.add(
            ShapeTokenResult.TokenData(
                attrName = token.ktName.decapitalize(Locale.getDefault()),
                tokenRefName = token.ktName,
            ),
        )
        return@with true
    }

    internal companion object {
        /**
         * Временный флаг, выключающий генерацию стилей форм, т.к. они требуют атрибуты из material
         */
        var IS_SHAPE_STYLE_ENABLED = false
    }
}
