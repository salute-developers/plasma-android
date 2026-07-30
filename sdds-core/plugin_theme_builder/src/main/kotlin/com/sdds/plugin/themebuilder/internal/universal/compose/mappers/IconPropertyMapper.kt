package com.sdds.plugin.themebuilder.internal.universal.compose.mappers

import com.sdds.plugin.themebuilder.internal.universal.StringState
import com.sdds.plugin.themebuilder.internal.universal.Value
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeIconName
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeIconPropertyMeta
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeStateEnum
import com.sdds.plugin.themebuilder.internal.universal.compose.ImportCollector

internal class IconPropertyMapper(
    stateEnum: ComposeStateEnum?,
    private val importCollector: ImportCollector? = null,
    private val multiplatform: Boolean = false,
) : PropertyMapper<String, ComposeIconPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ComposeIconPropertyMeta,
        resSuffix: String,
    ): String {
        val resourceName = value.replace('.', '_')
        return if (multiplatform) {
            multiplatformRef(resourceName)
        } else {
            androidRef(resourceName)
        }
    }

    private fun androidRef(resourceName: String): String {
        importCollector?.addImport(UIKIT_PACKAGE, RESOURCE_IMAGE_SOURCE_NAME)
        return "$RESOURCE_IMAGE_SOURCE_NAME(com.sdds.icons.R.drawable.ic_$resourceName)"
    }

    private fun multiplatformRef(resourceName: String): String {
        val iconId = ComposeIconName.fromDrawableName(resourceName)
        importCollector?.addImport(UIKIT_PACKAGE, IMAGE_VECTOR_SOURCE_NAME)
        importCollector?.addImport(SDDS_ICONS_PACKAGE, SDDS_ICONS_OBJECT)
        importCollector?.addImport(SDDS_ICONS_PACKAGE, iconId)
        return "$IMAGE_VECTOR_SOURCE_NAME($SDDS_ICONS_OBJECT.$iconId)"
    }

    private companion object {
        const val UIKIT_PACKAGE = "com.sdds.compose.uikit"
        const val IMAGE_VECTOR_SOURCE_NAME = "imageVectorSource"
        const val RESOURCE_IMAGE_SOURCE_NAME = "resourceImageSource"
        const val SDDS_ICONS_PACKAGE = "com.sdds.icons.compose"
        const val SDDS_ICONS_OBJECT = "SddsIcons"
    }
}
