package com.sdds.playground.sandbox.core.vs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.PopupWindow
import androidx.core.view.doOnNextLayout
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allViewThemes
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.databinding.LayoutThemeSwitcherBinding

internal class ThemeSwitcher(
    context: Context,
    private val themeManager: ThemeManager = ThemeManager,
) : PopupWindow(context) {

    private val adapter = ChoiceAdapter()

    init {
        setBackgroundDrawable(null)
        isFocusable = true
        contentView = LayoutThemeSwitcherBinding.inflate(LayoutInflater.from(context))
            .apply {
                themeRecyclerView.adapter = adapter
                themeRecyclerView.itemAnimator = null
                themeRecyclerView.addItemDecoration(
                    VerticalSpaceBetweenDecorator(
                        context.resources.getDimensionPixelSize(R.dimen.sandbox_properties_choice_spacing),
                    ),
                )
                adapter.setSelectionListener {
                    themeManager.updateTheme(Theme.valueOf(it))
                    dismiss()
                }
            }
            .root
    }

    fun show(anchor: View) {
        adapter.setChoices(allViewThemes.map(Theme::name), themeManager.currentTheme.value.name)
        contentView.doOnNextLayout {
            update(anchor.width, contentView.height)
        }
        showAsDropDown(anchor, 0, 0)
    }
}
