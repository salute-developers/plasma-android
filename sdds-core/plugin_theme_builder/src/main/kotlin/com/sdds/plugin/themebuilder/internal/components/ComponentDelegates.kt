package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.components.badge.BadgeConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfigDelegate.ButtonType
import com.sdds.plugin.themebuilder.internal.components.card.CardConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.cell.CellConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.counter.CounterConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.divider.DividerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.segment.SegmentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.segment.item.SegmentItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textfield.TextAreaConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldConfigDelegate
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy

internal val componentDelegates by unsafeLazy {
    mapOf<String, ComponentConfigDelegate<*>>(
        "text-field" to TextFieldConfigDelegate(),
        "text-area" to TextAreaConfigDelegate(),
        "segment" to SegmentConfigDelegate(),
        "segment-item" to SegmentItemConfigDelegate(),
        "indicator" to IndicatorConfigDelegate(),
        "divider" to DividerConfigDelegate(),
        "counter" to CounterConfigDelegate(),
        "cell" to CellConfigDelegate(),
        "card" to CardConfigDelegate(),
        "basic-button" to ButtonConfigDelegate(ButtonType.Basic),
        "icon-button" to ButtonConfigDelegate(ButtonType.Icon),
        "link-button" to ButtonConfigDelegate(ButtonType.Link),
        "badge" to BadgeConfigDelegate(),
        "icon-badge" to BadgeConfigDelegate(),
    )
}
