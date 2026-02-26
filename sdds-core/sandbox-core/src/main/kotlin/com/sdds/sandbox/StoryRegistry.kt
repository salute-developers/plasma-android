package com.sdds.sandbox

object StoryRegistry {

    private val stories: MutableMap<ComponentKey, BaseStory<*>> = mutableMapOf()

    fun get(key: ComponentKey): BaseStory<*>? {
        return stories[key]
    }

    fun register(key: ComponentKey, story: BaseStory<*>) {
        stories[key] = story
    }

    fun clear() {
        stories.clear()
    }
}

fun BaseStory<*>.register() {
    StoryRegistry.register(component, this)
}