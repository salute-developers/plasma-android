package com.sdds.sandbox

abstract class ComponentProvider {

    abstract val generated: Map<ComponentKey, Component<*>>

    /**
     * Все компоненты, включая общие и сгенерированные.
     */
    @Suppress("UNCHECKED_CAST")
    val components: Map<ComponentKey, Component<*>> by lazy {
        mutableMapOf<ComponentKey, Component<*>>().apply {
            putAll(generated)

            val textFieldStyles = generated[ComponentKey.TextField]
                ?.styleProviders
                ?: emptyMap()
            if (textFieldStyles.isNotEmpty()) {
                val maskKey = ComponentKey.Mask
                put(maskKey, Component(maskKey, textFieldStyles))
            }
        }
    }

    /**
     * Получает Compose-компонент по ключу.
     *
     * @param key Ключ компонента.
     * @return Compose-компонент.
     * @throws IllegalArgumentException если компонент не найден.
     */
    @Suppress("UNCHECKED_CAST")
    operator fun <P: StyleProvider<*>> get(key: ComponentKey): Component<P> {
        return components[key] as? Component<P>
            ?: throw IllegalArgumentException("No $key exists")
    }
}