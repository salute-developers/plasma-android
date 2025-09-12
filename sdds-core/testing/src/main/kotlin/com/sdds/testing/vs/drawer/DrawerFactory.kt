package com.sdds.testing.vs.drawer

import android.content.Context
import android.view.Gravity
import android.widget.FrameLayout.LayoutParams
import androidx.annotation.StyleRes
import com.sdds.testing.R
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.getTextColorPrimary
import com.sdds.testing.vs.scrollbar.ScrollBarUiState
import com.sdds.testing.vs.scrollbar.ScrollOrientation
import com.sdds.testing.vs.scrollbar.scrollBar
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Drawer
import com.sdds.uikit.DrawerLayout
import com.sdds.uikit.TextView
import com.sdds.uikit.dp

/**
 * Создает [DrawerLayout] c [Drawer]
 * @param context контекст
 * @param style стиль
 * @param state состояние компонента
 */
fun drawer(
    context: Context,
    @StyleRes style: Int? = null,
    state: DrawerUiState = DrawerUiState(),
): DrawerLayout {
    val lParams = LayoutParams(
        LayoutParams.WRAP_CONTENT,
        LayoutParams.WRAP_CONTENT,
    ).apply { gravity = Gravity.CENTER }
    val actualContext = context.styleWrapper(style)
    val drawerLayout = DrawerLayout(context).apply {
        id = R.id.drawer_layout
        drawerPlacement = state.alignment
        shouldToShiftContent = state.moveContentEnabled
        focusDepended = true
    }
    val drawer = Drawer(actualContext).apply {
        setCloseIconClickListener {
            with(drawerLayout) {
                if (isExpanded) {
                    collapse()
                } else {
                    expand()
                }
            }
        }
        setBody(
            scrollBar(context),
        )
    }
    val button = basicButton(context).apply {
        id = R.id.drawer_trigger
        text = "Show Drawer"
        setOnClickListener {
            with(drawerLayout) {
                if (isExpanded) {
                    collapse()
                } else {
                    expand()
                }
            }
        }
    }
    drawerLayout.addView(drawer)
    drawerLayout.addView(button, lParams)
    drawerLayout.applyState(state)
    return drawerLayout
}

private fun Drawer.addHeader() {
    val lParams = LayoutParams(
        LayoutParams.WRAP_CONTENT,
        LayoutParams.WRAP_CONTENT,
    ).apply { gravity = Gravity.CENTER }
    setHeader(
        TextView(context).apply {
            layoutParams = lParams
            text = "This is Header content!"
            textSize = 16f
            setTextColor(context.getTextColorPrimary())
        },
    )
}
private fun Drawer.addFooter() {
    val lParams = LayoutParams(
        LayoutParams.WRAP_CONTENT,
        LayoutParams.WRAP_CONTENT,
    ).apply { gravity = Gravity.CENTER }
    setFooter(
        TextView(context).apply {
            layoutParams = lParams
            text = "This is Footer content!"
            textSize = 16f
            setTextColor(context.getTextColorPrimary())
        },
    )
}

/**
 * Применяет [DrawerUiState] к [DrawerLayout]
 */
fun DrawerLayout.applyState(newState: DrawerUiState) = apply {
    val oldAlignment = drawerPlacement
    enableOverlay = newState.hasOverlay
    val closeAlignment = when (newState.closeIconAlignment) {
        CloseAlignment.Left -> Drawer.CloseIconAlignment.START
        CloseAlignment.Right -> Drawer.CloseIconAlignment.END
    }
    drawerPlacement = newState.alignment
    gesturesEnabled = newState.gesturesEnabled
    peekHeight = if (newState.hasPeekOffset) 30.dp else 0.dp
    shouldToShiftContent = newState.moveContentEnabled
    drawer?.setCloseIconAlignment(closeAlignment)
    drawer?.absoluteClosePlacement = newState.absoluteClosePlacement
    when (newState.header) {
        true -> drawer?.addHeader()
        else -> drawer?.clearHeader()
    }
    when (newState.footer) {
        true -> drawer?.addFooter()
        else -> drawer?.clearFooter()
    }
    if (oldAlignment != newState.alignment) {
        drawer?.setBody(
            when (newState.alignment) {
                DrawerLayout.DrawerPlacement.LEFT, DrawerLayout.DrawerPlacement.RIGHT ->
                    scrollBar(context, state = ScrollBarUiState().copy(orientation = ScrollOrientation.VERTICAL))

                DrawerLayout.DrawerPlacement.TOP, DrawerLayout.DrawerPlacement.BOTTOM ->
                    scrollBar(context)
            },
        )
    }
}
