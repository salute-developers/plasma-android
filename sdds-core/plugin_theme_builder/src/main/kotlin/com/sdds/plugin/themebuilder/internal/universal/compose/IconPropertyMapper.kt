package com.sdds.plugin.themebuilder.internal.universal.compose

import com.sdds.plugin.themebuilder.internal.components.base.StringState
import com.sdds.plugin.themebuilder.internal.components.base.Value

internal class IconPropertyMapper(
    stateEnum: ComposeStateEnum?,
) : PropertyMapper<String, ComposeIconPropertyMeta, StringState, Value>(stateEnum) {

    override fun getTokenRef(
        value: String,
        token: Value,
        meta: ComposeIconPropertyMeta,
        resSuffix: String,
    ): String {
        val resourceRef = "ic_${value.replace('.', '_')}"
        return "com.sdds.icons.R.drawable.$resourceRef"
    }
}
