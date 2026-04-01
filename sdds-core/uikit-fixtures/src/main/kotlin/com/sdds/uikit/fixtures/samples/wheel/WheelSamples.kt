package com.sdds.uikit.fixtures.samples.wheel

import android.content.Context
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.stories.wheel.WheelSeparatorType
import com.sdds.uikit.fixtures.stories.wheel.WheelUiState
import com.sdds.uikit.fixtures.stories.wheel.wheel

@DocSample
fun Wheel_Simple(context: Context): View {
    return wheel(
        context,
        state = WheelUiState(
            variant = "",
            itemLabel = "Label",
            itemTextAfter = "",
            description = "description",
            hasControls = true,
            wheelCount = 3,
            visibleItemsCount = 5,
            separatorType = WheelSeparatorType.DOTS,
            hasInfiniteScroll = false,
        ),
    ).apply { id = R.id.wheel }
}
