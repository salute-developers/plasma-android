package com.sdds.plugin.themebuilder.internal.universal

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class IconPropertyMapper(
    stateEnum: StateEnum?,
    private val importCollector: ImportCollector? = null,
    private val multiplatform: Boolean = false,
) : PropertyMapper<String, IconPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: IconPropertyMeta,
        resSuffix: String,
    ): String {
        val resourceName = value.replace('.', '_')
        return if (multiplatform) {
            multiplatformRef(resourceName)
        } else {
            "com.sdds.icons.R.drawable.ic_$resourceName"
        }
    }

    private fun multiplatformRef(resourceName: String): String {
        val iconId = ComposeIconName.fromDrawableName(resourceName)
        importCollector?.addImport(IMAGE_VECTOR_SOURCE_PACKAGE, IMAGE_VECTOR_SOURCE_NAME)
        importCollector?.addImport(SDDS_ICONS_PACKAGE, SDDS_ICONS_OBJECT)
        importCollector?.addImport(SDDS_ICONS_PACKAGE, iconId)
        return "$IMAGE_VECTOR_SOURCE_NAME($SDDS_ICONS_OBJECT.$iconId)"
    }

    private companion object {
        const val IMAGE_VECTOR_SOURCE_PACKAGE = "com.sdds.compose.uikit"
        const val IMAGE_VECTOR_SOURCE_NAME = "imageVectorSource"
        const val SDDS_ICONS_PACKAGE = "com.sdds.icons.compose"
        const val SDDS_ICONS_OBJECT = "SddsIcons"
    }
}
