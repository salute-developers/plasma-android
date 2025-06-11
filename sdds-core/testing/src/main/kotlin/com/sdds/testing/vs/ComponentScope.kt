package com.sdds.testing.vs

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.FrameLayout.LayoutParams
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.annotation.StyleRes
import androidx.fragment.app.FragmentActivity
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
    fun <V : View> margins(
        value: Int = context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_10x),
        content: Context.() -> V,
    ): V

    /**
     * Растягивает компонент на всю возможную ширину.
     */
    fun <V : View> fillWidth(content: Context.() -> V): V

    /**
     * Растягивает компонент на всю возможную высоту.
     */
    fun <V : View> fillHeight(content: Context.() -> V): V

    /**
     * Растягивает компонент на всю возможную ширину и высоту.
     */
    fun <V : View> fillSize(content: Context.() -> V): V

    /**
     * Оборачивает компонент в вертикальный скролл
     */
    fun <V : View> verticalScroll(content: Context.() -> V): V

    /**
     * Оборачивает компонент в горизонтальный скролл
     */
    fun <V : View> horizontalScroll(content: Context.() -> V): V
}

/**
 * Создание компонента и скриншота
 */
fun component(
    theme: Int,
    backgroundColorAttr: Int = 0,
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    action: ((View) -> Unit)? = null,
    skipDefaultCaptureRoboImage: Boolean = false,
    factory: ComponentScope.() -> View,
) {
    val controller = Robolectric.buildActivity(FragmentActivity::class.java)
    val activity = controller.get()
    val testTheme = ContextThemeWrapper(activity, R.style.TestTheme)
    val componentScope = ComponentScopeImpl(testTheme)
    activity.setTheme(theme)
    if (backgroundColorAttr != 0) {
        activity.window.decorView.setBackgroundColor(
            activity.colorFromAttr(backgroundColorAttr),
        )
    }
    controller.setup()
    val container = FrameLayout(testTheme).apply {
        id = R.id.test_component_container
        clipChildren = false
        clipToPadding = false
    }
    var view = componentScope.factory()
    if (componentScope.hasHorizontalScroll) {
        view = view.horizontalScrollable()
    }
    if (componentScope.hasVerticalScroll) {
        view = view.verticalScrollable()
    }
    val lp = view.layoutParams ?: componentScope.defaultLayoutParams()
    container.addView(view, lp)
    activity.setContentView(container, componentScope.defaultLayoutParams())
    action?.invoke(view)
    val matcher: Matcher<View> = viewMatcherFactory?.invoke(view)
        ?: ViewMatchers.withId(if (componentScope.hasMargins) container.id else view.id)
    if (!skipDefaultCaptureRoboImage) {
        onView(matcher)
            .captureRoboImage()
    }
}

/**
 * Оборачивает [Context] в [ContextThemeWrapper] с overlay стилем [style]
 */
fun Context.styleWrapper(@StyleRes style: Int? = null): Context =
    style?.let { ContextThemeWrapper(this, it) } ?: this

private fun View.horizontalScrollable(): HorizontalScrollView {
    return HorizontalScrollView(context).apply {
        isHorizontalScrollBarEnabled = false
        clipChildren = false
        id = R.id.test_horizontal_scroll
        val params = this@horizontalScrollable.layoutParams ?: LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        addView(
            this@horizontalScrollable,
            params,
        )
    }
}

private fun View.verticalScrollable(): ScrollView {
    return ScrollView(context).apply {
        isVerticalScrollBarEnabled = false
        clipChildren = false
        id = R.id.test_horizontal_scroll
        val params = this@verticalScrollable.layoutParams ?: LayoutParams(
            LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT,
        )
        addView(
            this@verticalScrollable,
            params,
        )
    }
}

private fun ComponentScopeImpl.defaultLayoutParams(): ViewGroup.LayoutParams =
    ViewGroup.LayoutParams(
        if (fillWidth) ViewGroup.LayoutParams.MATCH_PARENT else ViewGroup.LayoutParams.WRAP_CONTENT,
        if (fillHeight) ViewGroup.LayoutParams.MATCH_PARENT else ViewGroup.LayoutParams.WRAP_CONTENT,
    )

private class ComponentScopeImpl(override val context: Context) : ComponentScope {

    var hasMargins: Boolean = false
    var fillWidth: Boolean = false
    var fillHeight: Boolean = false
    var hasVerticalScroll: Boolean = false
    var hasHorizontalScroll: Boolean = false

    override fun <V : View> margins(value: Int, content: Context.() -> V): V {
        hasMargins = true
        return context.content().apply {
            val lp = layoutParams as? MarginLayoutParams
                ?: MarginLayoutParams(MarginLayoutParams.WRAP_CONTENT, MarginLayoutParams.WRAP_CONTENT)
            lp.setMargins(value, value, value, value)
            layoutParams = lp
        }
    }

    override fun <V : View> fillWidth(content: Context.() -> V): V {
        fillWidth = true
        return context.content()
    }

    override fun <V : View> fillHeight(content: Context.() -> V): V {
        fillHeight = true
        return context.content()
    }

    override fun <V : View> fillSize(content: Context.() -> V): V {
        fillWidth = true
        fillHeight = true
        return context.content()
    }

    override fun <V : View> verticalScroll(content: Context.() -> V): V {
        hasVerticalScroll = true
        return context.content()
    }

    override fun <V : View> horizontalScroll(content: Context.() -> V): V {
        hasHorizontalScroll = true
        return context.content()
    }
}
