package com.sdds.sandbox


interface Theme {

    val components: ComponentProvider

    companion object {
        val Default = object : Theme {
            override val components: ComponentProvider = object : ComponentProvider() {
                override val generated: Map<ComponentKey, Component<*>>
                    get() = emptyMap()

            }
        }
    }
}


fun Theme.getAppearances(
    componentKey: ComponentKey,
): Set<String> {
    return components.get<StyleProvider<*>>(componentKey).styleProviders.keys
}

fun Theme.getDefaultAppearance(
    componentKey: ComponentKey,
): String {
    return components.get<StyleProvider<*>>(componentKey).defaultAppearance
}