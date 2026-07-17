package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.sdds.compose.sandbox.internal.MainContent
import com.sdds.compose.sandbox.internal.SandboxTheme
import com.sdds.compose.uikit.overlay.OverlayHost
import com.sdds.compose.uikit.overlay.OverlayManagerLifecycle
import com.sdds.compose.uikit.overlay.overlayManager

/**
 * Общий корень Compose-песочницы.
 *
 * Platform launcher-ы должны вызывать эту функцию из своих entrypoint-ов, а
 * platform-specific работу с окном, Activity или installer-ом оставлять в
 * соответствующих source set.
 *
 * @param navigationPolicy определяет модель взаимодействия с навигацией.
 * Значение [SandboxNavigationPolicy.Auto] сохраняет прежнее адаптивное поведение
 * для существующих Android consumers.
 * @param navigationIntegration platform-specific integration с общим
 * [NavHostController], например browser history для Web launcher-а.
 */
@Composable
fun SandboxApp(
    navigationPolicy: SandboxNavigationPolicy = SandboxNavigationPolicy.Auto,
    navigationIntegration: @Composable (NavHostController) -> Unit = {},
) {
    SandboxTheme {
        // A sandbox owns a single root composition. Keeping overlays in that composition works
        // for Android and avoids requiring a ViewModelStoreOwner from desktop and browser hosts.
        OverlayHost(overlayManager = overlayManager(OverlayManagerLifecycle.ComposableScoped)) {
            MainContent(
                navigationPolicy = navigationPolicy,
                navigationIntegration = navigationIntegration,
            )
        }
    }
}

/**
 * Модель взаимодействия с навигацией песочницы.
 */
enum class SandboxNavigationPolicy {
    /** Сохраняет прежний адаптивный выбор между mobile и TV layout. */
    Auto,

    /** Использует TV navigation с открытием панели по фокусу. */
    Tv,

    /** Использует pointer-oriented desktop navigation. */
    Desktop,
}
