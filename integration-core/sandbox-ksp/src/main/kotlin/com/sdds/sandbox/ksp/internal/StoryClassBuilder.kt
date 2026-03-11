package com.sdds.sandbox.ksp.internal

import com.squareup.kotlinpoet.FileSpec

internal interface StoryClassBuilder<Data : Any> {

    fun build(data: Data): FileSpec
}
