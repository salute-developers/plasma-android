package com.sdds.playground.sandbox.badge.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.BadgeClear
import com.sdds.compose.uikit.BadgeSolid
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeTransparent
import com.sdds.compose.uikit.IconBadgeClear
import com.sdds.compose.uikit.IconBadgeSolid
import com.sdds.compose.uikit.IconBadgeTransparent
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.badge.Accent
import com.sdds.serv.styles.badge.Dark
import com.sdds.serv.styles.badge.Default
import com.sdds.serv.styles.badge.L
import com.sdds.serv.styles.badge.Light
import com.sdds.serv.styles.badge.M
import com.sdds.serv.styles.badge.Negative
import com.sdds.serv.styles.badge.Pilled
import com.sdds.serv.styles.badge.Positive
import com.sdds.serv.styles.badge.S
import com.sdds.serv.styles.badge.Warning
import com.sdds.serv.styles.badge.WrapperBadgeClearView
import com.sdds.serv.styles.badge.WrapperBadgeSolidView
import com.sdds.serv.styles.badge.WrapperBadgeTransparentView
import com.sdds.serv.styles.badge.Xs
import com.sdds.serv.styles.badge.icon.Accent
import com.sdds.serv.styles.badge.icon.Dark
import com.sdds.serv.styles.badge.icon.Default
import com.sdds.serv.styles.badge.icon.L
import com.sdds.serv.styles.badge.icon.Light
import com.sdds.serv.styles.badge.icon.M
import com.sdds.serv.styles.badge.icon.Negative
import com.sdds.serv.styles.badge.icon.Pilled
import com.sdds.serv.styles.badge.icon.Positive
import com.sdds.serv.styles.badge.icon.S
import com.sdds.serv.styles.badge.icon.Warning
import com.sdds.serv.styles.badge.icon.WrapperIconBadgeClearView
import com.sdds.serv.styles.badge.icon.WrapperIconBadgeSolidView
import com.sdds.serv.styles.badge.icon.WrapperIconBadgeTransparentView
import com.sdds.serv.styles.badge.icon.Xs

/**
 * Состояние Badge
 * @property state стиль Badge [State]
 * @property label текст
 * @property contentLeft контент слева
 * @property contentRight контент справа
 */
internal data class BadgeUiState(
    val view: BadgeView = BadgeView.Solid,
    val state: State = State.Accent,
    val variant: BadgeVariant = BadgeVariant.BadgeLPilled,
    val label: String = "Label",
    val contentLeft: Boolean = true,
    val contentRight: Boolean = false,
)

/**
 * Стиль отображения Badge
 */
internal enum class State {
    Default,
    Accent,
    Positive,
    Negative,
    Warning,
    Dark,
    Light,
}

/**
 * Размер и форма скругления Badge
 */
internal enum class BadgeVariant {
    BadgeL,
    BadgeLPilled,
    BadgeM,
    BadgeMPilled,
    BadgeS,
    BadgeSPilled,
    BadgeXS,
    BadgeXSPilled,
}

/**
 * Вариации для стилей отображения Badge
 */
internal enum class BadgeView {
    Solid,
    Clear,
    Transparent,
}

@Composable
internal fun BadgeUiState.badgeStyle(): BadgeStyle {
    return when (view) {
        BadgeView.Solid -> badgeWrapperSize().applyState(state)
        BadgeView.Clear -> badgeClearWrapperSize().applyState(state)
        BadgeView.Transparent -> badgeTransparentWrapperSize().applyState(state)
    }
}

@Composable
internal fun BadgeUiState.badgeWrapperSize(): WrapperBadgeSolidView {
    return when (variant) {
        BadgeVariant.BadgeL -> BadgeSolid.L
        BadgeVariant.BadgeLPilled -> BadgeSolid.L.Pilled
        BadgeVariant.BadgeM -> BadgeSolid.M
        BadgeVariant.BadgeMPilled -> BadgeSolid.M.Pilled
        BadgeVariant.BadgeS -> BadgeSolid.S
        BadgeVariant.BadgeSPilled -> BadgeSolid.S.Pilled
        BadgeVariant.BadgeXS -> BadgeSolid.Xs
        BadgeVariant.BadgeXSPilled -> BadgeSolid.Xs.Pilled
    }
}

@Composable
internal fun BadgeUiState.badgeClearWrapperSize(): WrapperBadgeClearView {
    return when (variant) {
        BadgeVariant.BadgeL -> BadgeClear.L
        BadgeVariant.BadgeLPilled -> BadgeClear.L.Pilled
        BadgeVariant.BadgeM -> BadgeClear.M
        BadgeVariant.BadgeMPilled -> BadgeClear.M.Pilled
        BadgeVariant.BadgeS -> BadgeClear.S
        BadgeVariant.BadgeSPilled -> BadgeClear.S.Pilled
        BadgeVariant.BadgeXS -> BadgeClear.Xs
        BadgeVariant.BadgeXSPilled -> BadgeClear.Xs.Pilled
    }
}

@Composable
internal fun BadgeUiState.badgeTransparentWrapperSize(): WrapperBadgeTransparentView {
    return when (variant) {
        BadgeVariant.BadgeL -> BadgeTransparent.L
        BadgeVariant.BadgeLPilled -> BadgeTransparent.L.Pilled
        BadgeVariant.BadgeM -> BadgeTransparent.M
        BadgeVariant.BadgeMPilled -> BadgeTransparent.M.Pilled
        BadgeVariant.BadgeS -> BadgeTransparent.S
        BadgeVariant.BadgeSPilled -> BadgeTransparent.S.Pilled
        BadgeVariant.BadgeXS -> BadgeTransparent.Xs
        BadgeVariant.BadgeXSPilled -> BadgeTransparent.Xs.Pilled
    }
}

@Composable
private fun WrapperBadgeSolidView.applyState(state: State): BadgeStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Light -> Light
    }.style()
}

@Composable
private fun WrapperBadgeClearView.applyState(state: State): BadgeStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Light -> Light
    }.style()
}

@Composable
private fun WrapperBadgeTransparentView.applyState(state: State): BadgeStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Light -> Light
    }.style()
}

@Composable
internal fun BadgeUiState.iconBadgeStyle(): BadgeStyle {
    return when (view) {
        BadgeView.Solid -> iconBadgeWrapperSize().applyState(state)
        BadgeView.Clear -> iconBadgeClearWrapperSize().applyState(state)
        BadgeView.Transparent -> iconBadgeTransparentWrapperSize().applyState(state)
    }
}

@Composable
internal fun BadgeUiState.iconBadgeWrapperSize(): WrapperIconBadgeSolidView {
    return when (variant) {
        BadgeVariant.BadgeL -> IconBadgeSolid.L
        BadgeVariant.BadgeLPilled -> IconBadgeSolid.L.Pilled
        BadgeVariant.BadgeM -> IconBadgeSolid.M
        BadgeVariant.BadgeMPilled -> IconBadgeSolid.M.Pilled
        BadgeVariant.BadgeS -> IconBadgeSolid.S
        BadgeVariant.BadgeSPilled -> IconBadgeSolid.S.Pilled
        BadgeVariant.BadgeXS -> IconBadgeSolid.Xs
        BadgeVariant.BadgeXSPilled -> IconBadgeSolid.Xs.Pilled
    }
}

@Composable
internal fun BadgeUiState.iconBadgeClearWrapperSize(): WrapperIconBadgeClearView {
    return when (variant) {
        BadgeVariant.BadgeL -> IconBadgeClear.L
        BadgeVariant.BadgeLPilled -> IconBadgeClear.L.Pilled
        BadgeVariant.BadgeM -> IconBadgeClear.M
        BadgeVariant.BadgeMPilled -> IconBadgeClear.M.Pilled
        BadgeVariant.BadgeS -> IconBadgeClear.S
        BadgeVariant.BadgeSPilled -> IconBadgeClear.S.Pilled
        BadgeVariant.BadgeXS -> IconBadgeClear.Xs
        BadgeVariant.BadgeXSPilled -> IconBadgeClear.Xs.Pilled
    }
}

@Composable
internal fun BadgeUiState.iconBadgeTransparentWrapperSize(): WrapperIconBadgeTransparentView {
    return when (variant) {
        BadgeVariant.BadgeL -> IconBadgeTransparent.L
        BadgeVariant.BadgeLPilled -> IconBadgeTransparent.L.Pilled
        BadgeVariant.BadgeM -> IconBadgeTransparent.M
        BadgeVariant.BadgeMPilled -> IconBadgeTransparent.M.Pilled
        BadgeVariant.BadgeS -> IconBadgeTransparent.S
        BadgeVariant.BadgeSPilled -> IconBadgeTransparent.S.Pilled
        BadgeVariant.BadgeXS -> IconBadgeTransparent.Xs
        BadgeVariant.BadgeXSPilled -> IconBadgeTransparent.Xs.Pilled
    }
}

@Composable
private fun WrapperIconBadgeSolidView.applyState(state: State): BadgeStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Light -> Light
    }.style()
}

@Composable
private fun WrapperIconBadgeClearView.applyState(state: State): BadgeStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Light -> Light
    }.style()
}

@Composable
private fun WrapperIconBadgeTransparentView.applyState(state: State): BadgeStyle {
    return when (state) {
        State.Default -> Default
        State.Accent -> Accent
        State.Positive -> Positive
        State.Negative -> Negative
        State.Warning -> Warning
        State.Dark -> Dark
        State.Light -> Light
    }.style()
}
