package com.sdds.playground.sandbox.shadows.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.shadow.shadow
import com.sdds.playground.sandbox.core.compose.ComponentScaffold
import com.sdds.playground.sandbox.core.compose.PropertiesOwner
import com.sdds.playground.sandbox.core.compose.Property
import com.sdds.serv.theme.SddsServTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 *
 * @author Малышев Александр on 29.01.2025
 */

@Composable
fun ShadowsScreen() {
    ComponentScaffold(
        component = {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 64.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .shadow(SddsServTheme.shadows.downHardL)
                        .size(100.dp)
                        .background(Color.White)
                )
            }

        },
        propertiesOwner = EmptyPropertiesOwner
    )
}

private val EmptyPropertiesOwner = object : PropertiesOwner {
    override val properties: StateFlow<List<Property<*>>> =
        MutableStateFlow<List<Property<*>>>(emptyList()).asStateFlow()

    override fun resetToDefault() = Unit
}