package com.sdds.testing.vs

import android.app.Activity
import android.content.Context
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import androidx.annotation.StyleRes
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.testing.R
import com.sdds.uikit.FrameLayout
import com.sdds.uikit.colorFromAttr
import org.hamcrest.Matcher
import org.robolectric.Robolectric

/**
 * Скоуп для создания компонента в тесте
 */
interface ComponentScope {

    /**
     * Текущий контекст
     */
    val context: Context

    /**
     * Добавляет отступы вокруг компонента.
     * Нужно для случаев, когда компонент может рисовать что-то за своими границами.
     */
    fun margins(
        value: Int = context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_10x),
        content: Context.() -> View,
    ): View
}

/**
 * Создание компонента и скриншота
 */
fun component(
    theme: Int,
    backgroundColorAttr: Int = 0,
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    action: ((View) -> Unit)? = null,
    factory: ComponentScope.() -> View,
) {
    val controller = Robolectric.buildActivity(Activity::class.java)
    val activity = controller.get()
    val componentScope = ComponentScopeImpl(activity)
    activity.setTheme(theme)
    if (backgroundColorAttr != 0) {
        activity.window.decorView.setBackgroundColor(
            activity.colorFromAttr(backgroundColorAttr),
        )
    }
    controller.setup()
    val container = FrameLayout(activity).apply {
        id = R.id.test_component_container
        clipChildren = false
        clipToPadding = false
    }
    val view = componentScope.factory()
    val lp = view.layoutParams ?: ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT,
    )
    container.addView(view, lp)
    activity.setContentView(
        container,
        ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        ),
    )
    action?.invoke(view)
    val matcher: Matcher<View> = viewMatcherFactory?.invoke(view)
        ?: ViewMatchers.withId(if (componentScope.hasMargins) container.id else view.id)
    onView(matcher)
        .captureRoboImage()
}

/**
 * Оборачивает [Context] в [ContextThemeWrapper] с overlay стилем [style]
 */
fun Context.styleWrapper(@StyleRes style: Int? = null): Context =
    style?.let { ContextThemeWrapper(this, it) } ?: this

private class ComponentScopeImpl(override val context: Context) : ComponentScope {

    var hasMargins: Boolean = false

    override fun margins(value: Int, content: Context.() -> View): View {
        hasMargins = true
        return context.content().apply {
            val lp = layoutParams as? MarginLayoutParams
                ?: MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT)
            lp.setMargins(value, value, value, value)
            layoutParams = lp
        }
    }
}
