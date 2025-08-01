package com.sdds.compose.uikit.internal.codeinput

import androidx.annotation.IntRange

internal object CodeInputDefaults {

    fun defaultCodeGroups(@IntRange(from = 2) codeLength: Int = 4): CodeGroupInfo {
        return codeGroups {
            if (codeLength < 6 || codeLength % 2 != 0) {
                group(codeLength)
            } else {
                group(codeLength / 2)
                group(codeLength / 2)
            }
        }
    }

    const val DefaultShakeOffsetDp = 2
    const val DefaultShakeCount = 3
}
