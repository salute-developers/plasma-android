package com.sdds.compose.sandbox

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
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
 * Layout адаптивно выбирается по ширине окна на всех платформах. На Android
 * large-навигация использует focus-driven Drawer, а на iOS, desktop и Web —
 * постоянную панель компонентов.
 *
 * @param navigationIntegration platform-specific integration с общим
 * [NavHostController], например browser history для Web launcher-а.
 */
@Composable
fun SandboxApp(
    navigationIntegration: @Composable (NavHostController) -> Unit = {},
) {
    SandboxTheme {
        SandboxViewModelStoreOwnerProvider {
            OverlayHost(overlayManager = overlayManager(OverlayManagerLifecycle.ComposableScoped)) {
                MainContent(
                    navigationIntegration = navigationIntegration,
                )
            }
        }
    }
}

@Composable
private fun SandboxViewModelStoreOwnerProvider(content: @Composable () -> Unit) {
    val parentOwner = LocalViewModelStoreOwner.current
    val fallbackOwner = remember { SandboxViewModelStoreOwner() }
    DisposableEffect(fallbackOwner) {
        onDispose { fallbackOwner.viewModelStore.clear() }
    }
    CompositionLocalProvider(
        LocalViewModelStoreOwner provides (parentOwner ?: fallbackOwner),
        content = content,
    )
}

private class SandboxViewModelStoreOwner : ViewModelStoreOwner {
    override val viewModelStore: ViewModelStore = ViewModelStore()
}
