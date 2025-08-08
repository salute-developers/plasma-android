// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.styles.circularprogressbar.CircularProgressBar
import com.sdkit.star.designsystem.styles.circularprogressbar.Default
import com.sdkit.star.designsystem.styles.circularprogressbar.L
import com.sdkit.star.designsystem.styles.spinner.Default
import com.sdkit.star.designsystem.styles.spinner.L
import com.sdkit.star.designsystem.styles.spinner.Spinner
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperLoader : BuilderWrapper<LoaderStyle, LoaderStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperLoaderDefault(
    public override val builder: LoaderStyleBuilder,
) : WrapperLoader

public val Loader.Default: WrapperLoaderDefault
    @Composable
    @JvmName("WrapperLoaderDefault")
    get() = LoaderStyle.builder(this)
        .spinnerStyle(Spinner.L.Default.style())
        .circularProgressStyle(CircularProgressBar.L.Default.style())
        .wrap(::WrapperLoaderDefault)
