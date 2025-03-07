package com.sdds.playground.sandbox.core.vs

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentContainerView
import com.sdds.playground.sandbox.R
import kotlin.reflect.KClass

/**
 *
 * @author Малышев Александр on 04.03.2025
 */

@Composable
internal fun FragmentScreen(
    fragmentClass: KClass<out Fragment>,
    modifier: Modifier = Modifier,
) {
    AndroidView(
        modifier = modifier.fillMaxSize(),
        factory = { context ->
            val containerId = R.id.screen_container_id
            val fragmentContainerView = FragmentContainerView(context).apply {
                id = containerId
            }
            (context as? FragmentActivity)?.supportFragmentManager?.run {
                beginTransaction()
                    .replace(containerId, fragmentClass.java, null, fragmentClass.simpleName)
                    .commitAllowingStateLoss()
            }
            fragmentContainerView
        },
        update = {
            (it.context as? FragmentActivity)?.supportFragmentManager?.run {
                val shouldReplace = findFragmentByTag(fragmentClass.simpleName) == null
                if (shouldReplace) {
                    beginTransaction()
                        .replace(it.id, fragmentClass.java, null, fragmentClass.simpleName)
                        .commitAllowingStateLoss()
                }
            }
        }
    )
}