package com.sdds.compose.uikit.internal.tabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import com.sdds.compose.uikit.TabScope

internal class TabScopeImpl : TabScope {
    private val _tabs = mutableListOf<TabContent>()

    val tabs: List<TabContent>
        get() = _tabs

    var disclosureContent: (@Composable () -> Unit)? = null
        private set

    fun reset() = _tabs.clear()

    override fun tab(content: @Composable ((Boolean) -> Unit)) {
        _tabs.add(TabContent(content))
    }

    override fun tab(
        dropdownAlias: String,
        content: @Composable ((Boolean) -> Unit),
    ) {
        _tabs.add(TabContent(content, dropdownAlias))
    }

    override fun disclosureButton(content: @Composable (() -> Unit)) {
        this.disclosureContent = content
    }

    @Immutable
    data class TabContent(
        val main: @Composable (Boolean) -> Unit,
        val dropdownAlias: String = "",
    )
}
