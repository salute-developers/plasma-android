package com.sdds.plugin.themebuilder.internal.components

import com.sdds.plugin.themebuilder.internal.components.avatar.AvatarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.avatar.group.AvatarGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.badge.BadgeConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.bottomsheet.BottomSheetConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.button.ButtonConfigDelegate.ButtonType
import com.sdds.plugin.themebuilder.internal.components.card.CardConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.cell.CellConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.checkbox.CheckBoxConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.checkbox.group.CheckBoxGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.chip.ChipConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.chip.group.ChipGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.circularprogress.CircularProgressConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.counter.CounterConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.divider.DividerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.indicator.IndicatorConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.modal.ModalConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.notification.NotificationConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.overlay.OverlayConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.popover.PopoverConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.progress.ProgressBarConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.radiobox.RadioBoxConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.radiobox.group.RadioBoxGroupConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.rectskeleton.RectSkeletonConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.segment.SegmentConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.segment.item.SegmentItemConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.spinner.SpinnerConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.switcher.SwitchConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textfield.TextAreaConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.textfield.TextFieldConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.toast.ToastConfigDelegate
import com.sdds.plugin.themebuilder.internal.components.tooltip.TooltipConfigDelegate
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import org.gradle.kotlin.dsl.provideDelegate

internal val componentDelegates by unsafeLazy {
    mapOf<String, ComponentConfigDelegate<*>>(
        "avatar" to AvatarConfigDelegate(),
        "avatar-group" to AvatarGroupConfigDelegate(),
        "text-field" to TextFieldConfigDelegate(),
        "text-area" to TextAreaConfigDelegate(),
        "segment" to SegmentConfigDelegate(),
        "segment-item" to SegmentItemConfigDelegate(),
        "indicator" to IndicatorConfigDelegate(),
        "divider" to DividerConfigDelegate(),
        "counter" to CounterConfigDelegate(),
        "check-box" to CheckBoxConfigDelegate(),
        "check-box-group" to CheckBoxGroupConfigDelegate(),
        "cell" to CellConfigDelegate(),
        "card" to CardConfigDelegate(),
        "basic-button" to ButtonConfigDelegate(ButtonType.Basic),
        "icon-button" to ButtonConfigDelegate(ButtonType.Icon),
        "link-button" to ButtonConfigDelegate(ButtonType.Link),
        "badge" to BadgeConfigDelegate(),
        "icon-badge" to BadgeConfigDelegate(),
        "bottom-sheet" to BottomSheetConfigDelegate(),
        "chip" to ChipConfigDelegate(),
        "chip-group" to ChipGroupConfigDelegate(),
        "radio-box" to RadioBoxConfigDelegate(),
        "radio-box-group" to RadioBoxGroupConfigDelegate(),
        "circular-progress-bar" to CircularProgressConfigDelegate(),
        "check-box" to CheckBoxConfigDelegate(),
        "check-box-group" to CheckBoxGroupConfigDelegate(),
        "progress-bar" to ProgressBarConfigDelegate(),
        "switch" to SwitchConfigDelegate(),
        "popover" to PopoverConfigDelegate(),
        "tooltip" to TooltipConfigDelegate(),
        "overlay" to OverlayConfigDelegate(),
        "toast" to ToastConfigDelegate(),
        "modal" to ModalConfigDelegate(),
        "notification" to NotificationConfigDelegate(),
        "rect-skeleton" to RectSkeletonConfigDelegate(),
        "spinner" to SpinnerConfigDelegate(),
    )
}
