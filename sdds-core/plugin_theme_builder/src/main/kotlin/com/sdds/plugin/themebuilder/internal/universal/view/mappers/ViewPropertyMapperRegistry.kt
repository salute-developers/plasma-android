package com.sdds.plugin.themebuilder.internal.universal.view.mappers

import com.sdds.plugin.themebuilder.internal.universal.PropertyType
import com.sdds.plugin.themebuilder.internal.universal.view.PropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.view.ViewPropertyResolver
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStateResolver
import com.sdds.plugin.themebuilder.internal.universal.view.ViewStyleResourceWriter

internal class ViewPropertyMapperRegistry(
    params: List<PropertyMeta>,
    resources: ViewStyleResourceWriter,
    resolver: ViewPropertyResolver,
    stateResolver: ViewStateResolver,
    componentName: String,
    styleNames: Map<String, String>,
) {
    private val mappers: Map<PropertyMeta, ViewPropertyMapper> = params
        .associateWith { meta ->
            createMapper(
                meta = meta,
                resources = resources,
                resolver = resolver,
                stateResolver = stateResolver,
                componentName = componentName,
                styleNames = styleNames,
            )
        }

    operator fun get(meta: PropertyMeta): ViewPropertyMapper =
        requireNotNull(mappers[meta]) { "Mapper не создан для свойства ${meta.id} (${meta.type})" }

    private fun createMapper(
        meta: PropertyMeta,
        resources: ViewStyleResourceWriter,
        resolver: ViewPropertyResolver,
        stateResolver: ViewStateResolver,
        componentName: String,
        styleNames: Map<String, String>,
    ): ViewPropertyMapper = when (meta.type) {
        PropertyType.COLOR -> ColorViewPropertyMapper(meta, resources, resolver, stateResolver)
        PropertyType.DIMENSION -> DimensionViewPropertyMapper(meta, resources, resolver, stateResolver)
        PropertyType.TYPOGRAPHY -> TypographyViewPropertyMapper(meta, resources, resolver, stateResolver)
        PropertyType.FLOAT -> FloatViewPropertyMapper(meta, resources, resolver, stateResolver)
        PropertyType.SHAPE -> ShapeViewPropertyMapper(meta, resources)
        PropertyType.SHADOW -> ShadowViewPropertyMapper(meta, resources)
        PropertyType.ICON -> IconViewPropertyMapper(meta, resources)
        PropertyType.BOOLEAN -> BooleanViewPropertyMapper(meta, resources)
        PropertyType.VALUE -> ValueViewPropertyMapper(meta, resources, componentName)
        PropertyType.COMPONENT_STYLE -> ComponentStyleViewPropertyMapper(meta, resources, styleNames)
        else -> RawValueViewPropertyMapper(meta, resources)
    }
}
