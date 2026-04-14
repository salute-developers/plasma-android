// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.LoaderStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBar
import com.sdds.sbcom.styles.circularprogressbar.ModeColorAccent
import com.sdds.sbcom.styles.circularprogressbar.ModeColorDanger
import com.sdds.sbcom.styles.circularprogressbar.ModeColorGlobalWhite
import com.sdds.sbcom.styles.circularprogressbar.ModeColorPrimary
import com.sdds.sbcom.styles.circularprogressbar.ModeColorSecondary
import com.sdds.sbcom.styles.circularprogressbar.Size16
import com.sdds.sbcom.styles.circularprogressbar.Size24
import com.sdds.sbcom.styles.circularprogressbar.Size32
import com.sdds.sbcom.styles.circularprogressbar.Size40
import com.sdds.sbcom.styles.spinner.ModeColorAccent
import com.sdds.sbcom.styles.spinner.ModeColorDanger
import com.sdds.sbcom.styles.spinner.ModeColorGlobalWhite
import com.sdds.sbcom.styles.spinner.ModeColorPrimary
import com.sdds.sbcom.styles.spinner.ModeColorSecondary
import com.sdds.sbcom.styles.spinner.Size16
import com.sdds.sbcom.styles.spinner.Size24
import com.sdds.sbcom.styles.spinner.Size32
import com.sdds.sbcom.styles.spinner.Size40
import com.sdds.sbcom.styles.spinner.Spinner
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperLoader : BuilderWrapper<LoaderStyle, LoaderStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариации size-40
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLoaderSize40View : WrapperLoader

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperLoaderTerminate(
    public override val builder: LoaderStyleBuilder,
) : WrapperLoader

/**
 * Обертка для вариации Size40
 */
@JvmInline
public value class WrapperLoaderSize40(
    public override val builder: LoaderStyleBuilder,
) : WrapperLoaderSize40View

/**
 * Интерфейс, который реализуют все обертки вариации size-32
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLoaderSize32View : WrapperLoader

/**
 * Обертка для вариации Size32
 */
@JvmInline
public value class WrapperLoaderSize32(
    public override val builder: LoaderStyleBuilder,
) : WrapperLoaderSize32View

/**
 * Интерфейс, который реализуют все обертки вариации size-24
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLoaderSize24View : WrapperLoader

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperLoaderSize24(
    public override val builder: LoaderStyleBuilder,
) : WrapperLoaderSize24View

/**
 * Интерфейс, который реализуют все обертки вариации size-16
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLoaderSize16View : WrapperLoader

/**
 * Обертка для вариации Size16
 */
@JvmInline
public value class WrapperLoaderSize16(
    public override val builder: LoaderStyleBuilder,
) : WrapperLoaderSize16View

private val LoaderStyleBuilder.invariantProps: LoaderStyleBuilder
    @Composable
    get() = this

public val WrapperLoaderSize40View.ModeColorPrimary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize40ViewModeColorPrimary")
    get() = builder
        .spinnerStyle(Spinner.Size40.ModeColorPrimary.style())
        .circularProgressStyle(CircularProgressBar.Size40.ModeColorPrimary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize40View.ModeColorSecondary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize40ViewModeColorSecondary")
    get() = builder
        .spinnerStyle(Spinner.Size40.ModeColorSecondary.style())
        .circularProgressStyle(CircularProgressBar.Size40.ModeColorSecondary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize40View.ModeColorGlobalWhite: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize40ViewModeColorGlobalWhite")
    get() = builder
        .spinnerStyle(Spinner.Size40.ModeColorGlobalWhite.style())
        .circularProgressStyle(CircularProgressBar.Size40.ModeColorGlobalWhite.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize40View.ModeColorAccent: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize40ViewModeColorAccent")
    get() = builder
        .spinnerStyle(Spinner.Size40.ModeColorAccent.style())
        .circularProgressStyle(CircularProgressBar.Size40.ModeColorAccent.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize40View.ModeColorDanger: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize40ViewModeColorDanger")
    get() = builder
        .spinnerStyle(Spinner.Size40.ModeColorDanger.style())
        .circularProgressStyle(CircularProgressBar.Size40.ModeColorDanger.style())
        .wrap(::WrapperLoaderTerminate)

public val Loader.Size40: WrapperLoaderSize40
    @Composable
    @JvmName("WrapperLoaderSize40")
    get() = LoaderStyle.builder(this)
        .invariantProps
        .wrap(::WrapperLoaderSize40)

public val WrapperLoaderSize32View.ModeColorPrimary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize32ViewModeColorPrimary")
    get() = builder
        .spinnerStyle(Spinner.Size32.ModeColorPrimary.style())
        .circularProgressStyle(CircularProgressBar.Size32.ModeColorPrimary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize32View.ModeColorSecondary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize32ViewModeColorSecondary")
    get() = builder
        .spinnerStyle(Spinner.Size32.ModeColorSecondary.style())
        .circularProgressStyle(CircularProgressBar.Size32.ModeColorSecondary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize32View.ModeColorGlobalWhite: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize32ViewModeColorGlobalWhite")
    get() = builder
        .spinnerStyle(Spinner.Size32.ModeColorGlobalWhite.style())
        .circularProgressStyle(CircularProgressBar.Size32.ModeColorGlobalWhite.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize32View.ModeColorAccent: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize32ViewModeColorAccent")
    get() = builder
        .spinnerStyle(Spinner.Size32.ModeColorAccent.style())
        .circularProgressStyle(CircularProgressBar.Size32.ModeColorAccent.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize32View.ModeColorDanger: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize32ViewModeColorDanger")
    get() = builder
        .spinnerStyle(Spinner.Size32.ModeColorDanger.style())
        .circularProgressStyle(CircularProgressBar.Size32.ModeColorDanger.style())
        .wrap(::WrapperLoaderTerminate)

public val Loader.Size32: WrapperLoaderSize32
    @Composable
    @JvmName("WrapperLoaderSize32")
    get() = LoaderStyle.builder(this)
        .invariantProps
        .wrap(::WrapperLoaderSize32)

public val WrapperLoaderSize24View.ModeColorPrimary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize24ViewModeColorPrimary")
    get() = builder
        .spinnerStyle(Spinner.Size24.ModeColorPrimary.style())
        .circularProgressStyle(CircularProgressBar.Size24.ModeColorPrimary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize24View.ModeColorSecondary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize24ViewModeColorSecondary")
    get() = builder
        .spinnerStyle(Spinner.Size24.ModeColorSecondary.style())
        .circularProgressStyle(CircularProgressBar.Size24.ModeColorSecondary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize24View.ModeColorGlobalWhite: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize24ViewModeColorGlobalWhite")
    get() = builder
        .spinnerStyle(Spinner.Size24.ModeColorGlobalWhite.style())
        .circularProgressStyle(CircularProgressBar.Size24.ModeColorGlobalWhite.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize24View.ModeColorAccent: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize24ViewModeColorAccent")
    get() = builder
        .spinnerStyle(Spinner.Size24.ModeColorAccent.style())
        .circularProgressStyle(CircularProgressBar.Size24.ModeColorAccent.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize24View.ModeColorDanger: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize24ViewModeColorDanger")
    get() = builder
        .spinnerStyle(Spinner.Size24.ModeColorDanger.style())
        .circularProgressStyle(CircularProgressBar.Size24.ModeColorDanger.style())
        .wrap(::WrapperLoaderTerminate)

public val Loader.Size24: WrapperLoaderSize24
    @Composable
    @JvmName("WrapperLoaderSize24")
    get() = LoaderStyle.builder(this)
        .invariantProps
        .wrap(::WrapperLoaderSize24)

public val WrapperLoaderSize16View.ModeColorPrimary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize16ViewModeColorPrimary")
    get() = builder
        .spinnerStyle(Spinner.Size16.ModeColorPrimary.style())
        .circularProgressStyle(CircularProgressBar.Size16.ModeColorPrimary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize16View.ModeColorSecondary: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize16ViewModeColorSecondary")
    get() = builder
        .spinnerStyle(Spinner.Size16.ModeColorSecondary.style())
        .circularProgressStyle(CircularProgressBar.Size16.ModeColorSecondary.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize16View.ModeColorGlobalWhite: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize16ViewModeColorGlobalWhite")
    get() = builder
        .spinnerStyle(Spinner.Size16.ModeColorGlobalWhite.style())
        .circularProgressStyle(CircularProgressBar.Size16.ModeColorGlobalWhite.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize16View.ModeColorAccent: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize16ViewModeColorAccent")
    get() = builder
        .spinnerStyle(Spinner.Size16.ModeColorAccent.style())
        .circularProgressStyle(CircularProgressBar.Size16.ModeColorAccent.style())
        .wrap(::WrapperLoaderTerminate)

public val WrapperLoaderSize16View.ModeColorDanger: WrapperLoaderTerminate
    @Composable
    @JvmName("WrapperLoaderSize16ViewModeColorDanger")
    get() = builder
        .spinnerStyle(Spinner.Size16.ModeColorDanger.style())
        .circularProgressStyle(CircularProgressBar.Size16.ModeColorDanger.style())
        .wrap(::WrapperLoaderTerminate)

public val Loader.Size16: WrapperLoaderSize16
    @Composable
    @JvmName("WrapperLoaderSize16")
    get() = LoaderStyle.builder(this)
        .invariantProps
        .wrap(::WrapperLoaderSize16)
