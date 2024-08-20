package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions

class RoborazziConfig {

    /**
     * Объект RoborazziOptions для захвата и сравнения изображений
     * recordOptions задает параметры для захвата
     * compareOptions задает погрешность сравнения
     **/
    @OptIn(ExperimentalRoborazziApi::class)
    val roborazziOptions = RoborazziOptions(
        recordOptions = RoborazziOptions.RecordOptions(
            resizeScale = 0.5,
        ),
        compareOptions = RoborazziOptions.CompareOptions(
            changeThreshold = 0.01f,
        ),
    )
}
