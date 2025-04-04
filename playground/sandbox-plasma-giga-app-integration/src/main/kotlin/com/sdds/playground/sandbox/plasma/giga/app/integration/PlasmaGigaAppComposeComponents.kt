package com.sdds.playground.sandbox.plasma.giga.app.integration

import com.sdds.compose.uikit.style.Style
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.integration.component.ComponentsProviderCompose
import com.sdds.playground.sandbox.core.integration.component.ComposeComponent
import com.sdds.playground.sandbox.core.integration.component.CoreComponent
import com.sdds.playground.sandbox.plasma.giga.app.integration.avatar.PlasmaGigaAppAvatarVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.avatar.group.PlasmaGigaAppAvatarGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.PlasmaGigaAppBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.PlasmaGigaAppBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.PlasmaGigaAppBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon.PlasmaGigaAppIconBadgeClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon.PlasmaGigaAppIconBadgeSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.badge.icon.PlasmaGigaAppIconBadgeTransparentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.bottomsheet.PlasmaGigaAppBottomSheetVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.button.basic.PlasmaGigaAppBasicButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.button.icon.PlasmaGigaAppIconButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.button.link.PlasmaGigaAppLinkButtonVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.card.PlasmaGigaAppCardClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.card.PlasmaGigaAppCardSolidVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.cell.compose.PlasmaGigaAppCellVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.checkbox.PlasmaGigaAppCheckBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.checkbox.group.PlasmaGigaAppCheckBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.PlasmaGigaAppChipVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.chip.group.PlasmaGigaAppChipGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.counter.PlasmaGigaAppCounterVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.divider.compose.PlasmaGigaAppDividerVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.indicator.compose.PlasmaGigaAppIndicatorVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.progress.PlasmaGigaAppProgressVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.radiobox.PlasmaGigaAppRadioBoxVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.radiobox.group.PlasmaGigaRadioBoxGroupVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.segment.PlasmaGigaAppSegmentVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.segment.item.PlasmaGigaAppSegmentItemVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.switcher.PlasmaGigaAppSwitchVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textarea.PlasmaGigaAppTextAreaVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textarea.clear.PlasmaGigaAppTextAreaClearVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textfield.PlasmaGigaAppTextFieldVariationsCompose
import com.sdds.playground.sandbox.plasma.giga.app.integration.textfield.clear.PlasmaGigaAppTextFieldClearVariationsCompose

/**
 *
 * @author Малышев Александр on 04.03.2025
 */
object PlasmaGigaAppComposeComponents : ComponentsProviderCompose {

    override val all: Map<ComponentKey, ComposeComponent<String, out Style>> =
        listOf(
            ComposeComponent(
                ComponentKey.Avatar,
                PlasmaGigaAppAvatarVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.AvatarGroup,
                PlasmaGigaAppAvatarGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeClear", CoreComponent.BADGE),
                PlasmaGigaAppBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeSolid", CoreComponent.BADGE),
                PlasmaGigaAppBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("BadgeTransparent", CoreComponent.BADGE),
                PlasmaGigaAppBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeClear", CoreComponent.ICON_BADGE),
                PlasmaGigaAppIconBadgeClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeSolid", CoreComponent.ICON_BADGE),
                PlasmaGigaAppIconBadgeSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("IconBadgeTransparent", CoreComponent.ICON_BADGE),
                PlasmaGigaAppIconBadgeTransparentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BasicButton,
                PlasmaGigaAppBasicButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.IconButton,
                PlasmaGigaAppIconButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.LinkButton,
                PlasmaGigaAppLinkButtonVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardClear", CoreComponent.CARD),
                PlasmaGigaAppCardClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("CardSolid", CoreComponent.CARD),
                PlasmaGigaAppCardSolidVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Cell,
                PlasmaGigaAppCellVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBox,
                PlasmaGigaAppCheckBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.CheckBoxGroup,
                PlasmaGigaAppCheckBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Chip,
                PlasmaGigaAppChipVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ChipGroup,
                PlasmaGigaAppChipGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Counter,
                PlasmaGigaAppCounterVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Indicator,
                PlasmaGigaAppIndicatorVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.ProgressBar,
                PlasmaGigaAppProgressVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBox,
                PlasmaGigaAppRadioBoxVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.RadioBoxGroup,
                PlasmaGigaRadioBoxGroupVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Switch,
                PlasmaGigaAppSwitchVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextField,
                PlasmaGigaAppTextFieldVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextFieldClear", CoreComponent.TEXT_FIELD),
                PlasmaGigaAppTextFieldClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.TextArea,
                PlasmaGigaAppTextAreaVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey("TextAreaClear", CoreComponent.TEXT_AREA),
                PlasmaGigaAppTextAreaClearVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.SegmentItem,
                PlasmaGigaAppSegmentItemVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Segment,
                PlasmaGigaAppSegmentVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.BottomSheet,
                PlasmaGigaAppBottomSheetVariationsCompose,
            ),
            ComposeComponent(
                ComponentKey.Divider,
                PlasmaGigaAppDividerVariationsCompose,
            ),
        ).associateBy { it.key }
}
