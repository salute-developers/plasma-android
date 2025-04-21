package com.sdds.utils.config.codec.internal

internal object ConfigCodec {

    fun encode(config: CommonConfig): NativeConfig {
        val nativeConfig = NativeConfig(props = config.commonValues)

        val viewProperty = config.properties.findLast { it.id == "view" }
        val rootsViews = viewProperty?.values
            ?.filter { it.targets == null }
            ?.associate { it.name to NativeViewVariation(it.props) }
            .orEmpty()

        val targetRegistry = config.properties.flatMap { prop ->
            prop.values.map { value ->
                ConfigPropertyTargetInfo(prop.id, value.name)
            }
        }.groupBy { it.id }

        val targetViewRegistry = viewProperty?.values
            ?.filter { it.targets != null }
            ?.flatMap { value ->
                value.targets!!.map { value.copy(targets = setOf(it)) }
            }
            ?.groupBy { it.targets!!.first() }
            ?.mapValues { entry ->
                entry.value.associate { it.name to NativeViewVariation(it.props) }
            }
            ?.mapKeys { entry ->
                entry.key.properties.joinToString(".") { it.value }
            }
            .orEmpty()
            .also { println("target views $it") }

        val variations = config.properties.filter { it.id != "view" }
            .flatMap { property ->
                property.values
                    .flatMap { value ->
                        value.toNativeVariation(
                            property.id,
                            config.rootPropertyId,
                            targetRegistry,
                            targetViewRegistry
                        )
                    }
            }.filter { it.props != null }


        return nativeConfig.copy(view = rootsViews, variations = variations)
    }

    fun decode(config: NativeConfig): CommonConfig {
        val variationRegistry = config.variations.associateBy { it.id }

        val viewPropertyValues = config.view.map { (name, view) ->
            ConfigPropertyValue(
                name = name,
                props = view.props,
                targets = null
            )
        }

        val targetViews = config.variations
            .flatMap { variation ->
                variation.view.map { (name, view) ->
                    var targetId = ""
                    val targets = variation.id.split(".")
                        .map { id ->
                            ConfigPropertyTargetInfo(
                                id = variationRegistry["$targetId$id"]?.kind.orEmpty(),
                                value = id
                            ).also {
                                targetId = "$targetId$id."
                            }
                        }
                        .toSet()
                        .let { ConfigPropertyTarget(it) }
                    ConfigPropertyValue(
                        name = name,
                        props = view.props,
                        targets = setOf(targets)
                    )
                }
            }

        val viewValues = (viewPropertyValues + targetViews).toSet()
        val viewProperty = ConfigProperty(
            id = "view",
            name = "view",
            values = viewValues
        )
            .takeIf { viewValues.isNotEmpty() }
            .let { listOfNotNull(it) }
            .mergeConfigProperty()

        val variationPropertyValues = config.variations.map { variation ->
            var targetId = ""
            val targets = variation.id.split(".")
                .dropLast(1)
                .takeIf { it.isNotEmpty() }
                ?.map { id ->
                    ConfigPropertyTargetInfo(
                        id = variationRegistry["$targetId$id"]?.kind.orEmpty(),
                        value = id
                    ).also { targetId = "$targetId$id." }
                }
                ?.toSet()
                ?.let { setOf(ConfigPropertyTarget(it)) }

            val value = ConfigPropertyValue(
                name = variation.id.removePrefix("${variation.parent}."),
                props = variation.props,
                targets = targets
            )
            ConfigProperty(
                id = variation.kind,
                name = variation.kind,
                values = setOf(value)
            )
        }.mergeConfigProperty()

        return CommonConfig(
            commonValues = config.props,
            properties = viewProperty + variationPropertyValues,
            rootPropertyId = "size"
        )
    }
}

private fun ConfigPropertyValue.toNativeVariation(
    propertyId: String,
    rootPropertyId: String,
    targetRegistry: Map<String, List<ConfigPropertyTargetInfo>>,
    targetViewRegistry: Map<String, Map<String, NativeViewVariation>> = emptyMap(),
): List<NativeVariation> {

    if (targets != null) {
        return targets.map { target ->
            val parent = target.properties.joinToString(".") { it.value }
            val id = "$parent.$name"
            NativeVariation(
                id = id,
                kind = propertyId,
                parent = parent,
                props = props,
                view = targetViewRegistry[id].orEmpty()
            )
        }
    }
    return targetRegistry[rootPropertyId]
        ?.takeIf { rootPropertyId != propertyId }
        ?.map { info ->
            val parent = info.value
            val id = "$parent.$name"
            NativeVariation(
                id = id,
                kind = propertyId,
                parent = parent,
                props = props,
                view = targetViewRegistry[id].orEmpty()
            )
        }
        ?: listOf(
            NativeVariation(
                id = name,
                kind = propertyId,
                props = props,
                view = targetViewRegistry[name].orEmpty()
            )
        )
}

private fun List<ConfigProperty>.mergeConfigProperty(): List<ConfigProperty> {
    return groupBy { it.id }.map { (id, group) ->
        val name = group.first().name

        val mergedValues = group.flatMap { it.values }
            .groupBy { it.name to it.props }
            .map { (key, valuesGroup) ->
                val mergedTargets = valuesGroup
                    .mapNotNull { it.targets }
                    .flatten()
                    .toSet()
                    .takeIf { it.isNotEmpty() }

                ConfigPropertyValue(
                    name = key.first,
                    props = key.second,
                    targets = mergedTargets
                )
            }.toSet()

        ConfigProperty(
            id = id,
            name = name,
            values = mergedValues
        )
    }
}