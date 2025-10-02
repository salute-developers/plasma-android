// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.circularprogressbar.CircularProgressBar
import com.sdds.plasma.homeds.styles.circularprogressbar.Default
import com.sdds.plasma.homeds.styles.circularprogressbar.M
import com.sdds.plasma.homeds.styles.spinner.Default
import com.sdds.plasma.homeds.styles.spinner.M
import com.sdds.plasma.homeds.styles.spinner.Spinner
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
        .spinnerStyle(Spinner.M.Default.style())
        .circularProgressStyle(CircularProgressBar.M.Default.style())
        .wrap(::WrapperLoaderDefault)
