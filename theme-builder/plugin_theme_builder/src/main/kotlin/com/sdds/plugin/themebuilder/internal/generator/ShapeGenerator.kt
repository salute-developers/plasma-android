package com.sdds.plugin.themebuilder.internal.generator

import com.sdds.plugin.core.token.RoundedShapeTokenValue
import com.sdds.plugin.core.token.ShapeToken
import com.sdds.plugin.core.token.ShapeTokenValue
import com.sdds.plugin.core.utils.techToSnakeCase
import com.sdds.plugin.core.utils.unsafeLazy
import com.sdds.plugin.themebuilder.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.builder.KtFileBuilder
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.Companion.DEFAULT_ROOT_ATTRIBUTES
import com.sdds.plugin.themebuilder.internal.builder.XmlResourcesDocumentBuilder.ElementName
import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.dimens.DimensAggregator
import com.sdds.plugin.themebuilder.internal.factory.KtFileBuilderFactory
import com.sdds.plugin.themebuilder.internal.factory.XmlResourcesDocumentBuilderFactory
import com.sdds.plugin.themebuilder.internal.utils.FileProvider.shapesXmlFile
import com.sdds.plugin.themebuilder.internal.utils.ResourceReferenceProvider
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
 * @author Малышев Александр on 07.03.2024
 */
internal class ShapeGenerator(
    private val outputLocation: KtFileBuilder.OutputLocation,
    private val outputResDir: File,
    target: ThemeBuilderTarget,
    private val xmlBuilderFactory: XmlResourcesDocumentBuilderFactory,
    private val ktFileBuilderFactory: KtFileBuilderFactory,
    private val dimensAggregator: DimensAggregator,
    private val resourceReferenceProvider: ResourceReferenceProvider,
    private val shapeTokenValues: Map<String, ShapeTokenValue>,
) : TokenGenerator<ShapeToken>(target) {

    private val xmlDocumentBuilder by unsafeLazy { xmlBuilderFactory.create(DEFAULT_ROOT_ATTRIBUTES) }
    private val ktFileBuilder by unsafeLazy { ktFileBuilderFactory.create("ShapeTokens") }
    private val rootRoundShapes by unsafeLazy { ktFileBuilder.rootObject("RoundShapeTokens") }
    private var needCreateStyle: Boolean = true

    /**
     * @see TokenGenerator.generateViewSystem
     */
    override fun generateViewSystem() {
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
        val roundedShapeTokenValue =
            shapeTokenValues[token.name] as? RoundedShapeTokenValue ?: return@with false
        val cornerSize = DimenData(
            name = "${token.name.techToSnakeCase()}_corner_size",
            value = roundedShapeTokenValue.cornerRadius,
            type = DimenData.Type.DP,
        )
        dimensAggregator.addDimen(cornerSize)
        if (needCreateStyle) {
            needCreateStyle = false
            appendStyle("Shape")
            appendStyle("Shape.Round") {
                appendElement(ElementName.ITEM, "cornerFamily", "rounded", usePrefix = false)
            }
        }
        appendComment(token.description)
        appendStyle("Shape.${token.xmlName}") {
            appendElement(
                ElementName.ITEM,
                "cornerSize",
                resourceReferenceProvider.dimen(cornerSize),
                usePrefix = false,
            )
        }
        return@with true
    }

    /**
     * @see TokenGenerator.addComposeToken
     */
    override fun addComposeToken(token: ShapeToken): Boolean = with(ktFileBuilder) {
        val roundedShapeTokenValue =
            shapeTokenValues[token.name] as? RoundedShapeTokenValue ?: return@with false

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
        return@with true
    }
}