package com.sdds.plugin.themebuilder.internal.components.textfield

import com.sdds.plugin.themebuilder.internal.components.ComponentConfig
import com.sdds.plugin.themebuilder.internal.components.base.Color
import com.sdds.plugin.themebuilder.internal.components.base.ComponentStyle
import com.sdds.plugin.themebuilder.internal.components.base.Config
import com.sdds.plugin.themebuilder.internal.components.base.Dimension
import com.sdds.plugin.themebuilder.internal.components.base.PropertyOwner
import com.sdds.plugin.themebuilder.internal.components.base.Shape
import com.sdds.plugin.themebuilder.internal.components.base.Typography
import com.sdds.plugin.themebuilder.internal.components.base.Variation
import com.sdds.plugin.themebuilder.internal.components.base.ViewVariation
import kotlinx.serialization.Serializable

/**
 *
 * @author Малышев Александр on 10.12.2024
 */

@Serializable
internal data class TextFieldProperties(
    val shape: Shape?,
    val boxPaddingStart: Dimension?,
    val boxPaddingEnd: Dimension?,
    val boxPaddingTop: Dimension?,
    val boxPaddingBottom: Dimension?,
    val labelPadding: Dimension?,
    val optionalPadding: Dimension?,
    val helperTextPadding: Dimension?,
    val startContentEndPadding: Dimension?,
    val endContentStartPadding: Dimension?,
    val chipsPadding: Dimension?,
    val boxMinHeight: Dimension?,
    val alignmentMinHeight: Dimension?,
    val startContentSize: Dimension?,
    val endContentSize: Dimension?,
    val labelStyle: Typography?,
    val optionalStyle: Typography?,
    val valueStyle: Typography?,
    val captionStyle: Typography?,
    val counterStyle: Typography?,
    val placeholderStyle: Typography?,
    val chipGroupStyle: ComponentStyle?,
    val chipStyle: ComponentStyle?,
    val indicatorSize: Dimension?,
    val indicatorOffsetX: Dimension?,
    val indicatorOffsetY: Dimension?,
    val valueColor: Color?,
    val valueColorReadOnly: Color?,
    val labelColor: Color?,
    val labelColorReadOnly: Color?,
    val captionColor: Color?,
    val captionColorReadOnly: Color?,
    val startContentColor: Color?,
    val endContentColor: Color?,
    val optionalColor: Color?,
    val counterColor: Color?,
    val placeholderColor: Color?,
    val placeholderColorReadOnly: Color?,
    val backgroundColor: Color?,
    val backgroundColorReadOnly: Color?,
    val indicatorColor: Color?,
    val cursorColor: Color?,
) : PropertyOwner

@Serializable
internal data class TextFieldView(override val props: TextFieldProperties): ViewVariation<TextFieldProperties>

@Serializable
internal data class TextFieldVariation(
    override val id: String,
    override val parent: String? = null,
    override val view: Map<String, TextFieldView> = emptyMap(),
    override val props: TextFieldProperties,
    override val childVariations: Map<String, TextFieldVariation> = emptyMap()
) : Variation<TextFieldProperties>

@Serializable
internal data class TextFieldConfig(
    override val view: Map<String, TextFieldView>,
    override val props: TextFieldProperties,
    override val variations: List<TextFieldVariation>
) : Config<TextFieldProperties>, ComponentConfig