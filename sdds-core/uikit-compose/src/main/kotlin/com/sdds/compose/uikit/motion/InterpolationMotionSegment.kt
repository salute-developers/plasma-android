package com.sdds.compose.uikit.motion

import androidx.compose.runtime.Immutable

interface InterpolationSegment<T> : MotionSegment<T, MotionInterpolationSpec<T>> {

    val channelKey: MotionChannelKey

    val vector: InterpolationVectorProvider
}

interface InterpolationSegmentBuilderScope : MotionSegmentBuilderScope {

    fun channel(channelKey: MotionChannelKey)

    fun vector(vector: InterpolationVectorProvider)
}

interface InterpolationSegmentBuilder<T> : InterpolationSegmentBuilderScope {

    fun build(spec: () -> MotionInterpolationSpec<T>): InterpolationSegment<T>

    companion object {
        internal fun <T> instance(): InterpolationSegmentBuilder<T> =
            InterpolationSegmentBuilderImpl()
    }
}

@Immutable
private class InterpolationSegmentImpl<T>(
    override val spec: () -> MotionInterpolationSpec<T>,
    override val channelKey: MotionChannelKey,
    override val condition: MotionSegmentCondition,
    override val vector: InterpolationVectorProvider,
) : InterpolationSegment<T>

private class InterpolationSegmentBuilderImpl<T> : InterpolationSegmentBuilder<T> {
    var channelKey: MotionChannelKey = DefaultInterpolationChannelKey
    var condition: MotionSegmentCondition = MotionSegmentCondition { true }
    var vector: InterpolationVectorProvider = InterpolationVectorProvider { it.forwardVector() }

    override fun channel(channelKey: MotionChannelKey) {
        this.channelKey = channelKey
    }

    override fun vector(vector: InterpolationVectorProvider) {
        this.vector = vector
    }

    override fun condition(condition: MotionSegmentCondition) {
        this.condition = condition
    }

    override fun build(spec: () -> MotionInterpolationSpec<T>): InterpolationSegment<T> {
        return InterpolationSegmentImpl(
            condition = condition,
            spec = spec,
            channelKey = channelKey,
            vector = vector,
        )
    }
}