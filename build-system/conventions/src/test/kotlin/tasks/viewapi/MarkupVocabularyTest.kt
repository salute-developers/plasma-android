package tasks.viewapi

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

/**
 * Unit-тесты словаря разметки, добавленного вместе с универсальным View-генератором:
 * идентичность компонента, `api_res_suffix`, `api_placement`, `api_state_value`,
 * обобщённые привязки состояний и общий словарь состояний модуля.
 */
class MarkupVocabularyTest {

    @get:Rule
    val tempFolder = TemporaryFolder()

    private val parser = DeclareStyleableParser(resourcePrefix = "sd_")

    private fun xml(name: String, content: String): File =
        tempFolder.newFile(name).apply { writeText(content) }

    private fun resources(content: String): String =
        """
        <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
        $content
        </resources>
        """.trimIndent()

    private fun ComponentMeta.param(id: String): PropertyMeta? = params.firstOrNull { it.id == id }

    // region идентичность

    @Test
    fun `single component identity is read from bare values`() {
        val file = xml(
            "avatar_attrs.xml",
            resources(
                """
                <declare-styleable name="Avatar" sdds:api_info="Avatar"
                    sdds:api_def_style_attr="sd_avatarStyle"
                    sdds:api_parent="Sdds.Components.Avatar">
                    <attr name="sd_statusSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        val identity = parser.parse(listOf(file)).components.single().identity

        assertEquals(
            mapOf("Avatar" to ComponentIdentity("Avatar", "sd_avatarStyle", "Sdds.Components.Avatar")),
            identity,
        )
    }

    @Test
    fun `multi component styleable carries per-component identity`() {
        val file = xml(
            "button_attrs.xml",
            resources(
                """
                <declare-styleable name="Button" sdds:api_info="BasicButton,IconButton,LinkButton"
                    sdds:api_core_name="BasicButton=Button"
                    sdds:api_def_style_attr="BasicButton=android:buttonStyle;IconButton=sd_iconButtonStyle;LinkButton=sd_linkButtonStyle"
                    sdds:api_parent="BasicButton=Sdds.Components.Button;IconButton=Sdds.Components.IconButton;LinkButton=Sdds.Components.LinkButton">
                    <attr name="sd_iconSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        val identity = parser.parse(listOf(file)).components.single().identity

        assertEquals("Button", identity.getValue("BasicButton").coreName)
        assertEquals("android:buttonStyle", identity.getValue("BasicButton").defStyleAttr)
        // coreName по умолчанию равен логическому имени компонента
        assertEquals("IconButton", identity.getValue("IconButton").coreName)
        assertEquals("sd_linkButtonStyle", identity.getValue("LinkButton").defStyleAttr)
        assertEquals("Sdds.Components.IconButton", identity.getValue("IconButton").parent)
    }

    @Test
    fun `absent identity means component is not migrated yet`() {
        val file = xml(
            "plain_attrs.xml",
            resources(
                """
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="sd_statusSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        assertTrue(parser.parse(listOf(file)).components.single().identity.isEmpty())
    }

    @Test
    fun `partial identity is a markup error`() {
        val file = xml(
            "partial_attrs.xml",
            resources(
                """
                <declare-styleable name="Avatar" sdds:api_info="Avatar"
                    sdds:api_def_style_attr="sd_avatarStyle">
                    <attr name="sd_statusSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) {
            parser.parse(listOf(file))
        }
        assertTrue(ex.message!!.contains("Неполная идентичность"))
    }

    @Test
    fun `identity for unknown component is rejected`() {
        val file = xml(
            "wrong_attrs.xml",
            resources(
                """
                <declare-styleable name="Button" sdds:api_info="BasicButton"
                    sdds:api_def_style_attr="IconButton=sd_iconButtonStyle"
                    sdds:api_parent="BasicButton=Sdds.Components.Button">
                    <attr name="sd_iconSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        assertThrows(DeclareStyleableParser.MarkupException::class.java) { parser.parse(listOf(file)) }
    }

    @Test
    fun `color state palette belongs to uikit class by default`() {
        val file = xml(
            "counter_attrs.xml",
            resources(
                """
                <declare-styleable name="Counter" sdds:api_info="Counter"
                    sdds:api_def_style_attr="sd_counterStyle"
                    sdds:api_parent="Sdds.Components.Counter">
                    <attr name="android:textColor" sdds:api_type="color" />
                </declare-styleable>
                """,
            ),
        )

        val identity = parser.parse(listOf(file)).components.single().identity

        assertEquals(ColorStateScope.CLASS.key, identity.getValue("Counter").colorStateScope)
    }

    @Test
    fun `color state palette can be scoped to component variety`() {
        val file = xml(
            "button_attrs.xml",
            resources(
                """
                <declare-styleable name="Button" sdds:api_info="BasicButton,IconButton"
                    sdds:api_core_name="BasicButton=Button"
                    sdds:api_color_state_scope="IconButton=variety"
                    sdds:api_def_style_attr="BasicButton=android:buttonStyle;IconButton=sd_iconButtonStyle"
                    sdds:api_parent="BasicButton=Sdds.Components.Button;IconButton=Sdds.Components.IconButton">
                    <attr name="sd_iconSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        val identity = parser.parse(listOf(file)).components.single().identity

        assertEquals(ColorStateScope.VARIETY.key, identity.getValue("IconButton").colorStateScope)
        // разметка одного компонента не задевает соседей по styleable
        assertEquals(ColorStateScope.CLASS.key, identity.getValue("BasicButton").colorStateScope)
    }

    @Test
    fun `unknown color state scope is a markup error`() {
        val file = xml(
            "counter_attrs.xml",
            resources(
                """
                <declare-styleable name="Counter" sdds:api_info="Counter"
                    sdds:api_def_style_attr="sd_counterStyle"
                    sdds:api_color_state_scope="appearance"
                    sdds:api_parent="Sdds.Components.Counter">
                    <attr name="android:textColor" sdds:api_type="color" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) {
            parser.parse(listOf(file))
        }
        assertTrue(ex.message!!.contains("api_color_state_scope"))
    }

    // endregion

    // region имя генерируемого ресурса

    @Test
    fun `res suffix defaults to snake case of attribute name`() {
        val file = xml(
            "res_attrs.xml",
            resources(
                """
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="sd_valuePadding" format="dimension" />
                    <attr name="android:minWidth" sdds:api_name="width" sdds:api_type="dimension" />
                </declare-styleable>
                """,
            ),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals("value_padding", meta.param("valuePadding")!!.resSuffix)
        assertEquals("min_width", meta.param("width")!!.resSuffix)
    }

    @Test
    fun `res suffix can be overridden per attribute`() {
        val file = xml(
            "res_attrs.xml",
            resources(
                """
                <declare-styleable name="TextField" sdds:api_info="TextField">
                    <attr name="sd_boxTint" sdds:api_name="backgroundColor" sdds:api_type="color"
                        sdds:api_res_suffix="bg_color" />
                </declare-styleable>
                """,
            ),
        )

        assertEquals(
            "bg_color",
            parser.parse(listOf(file)).components.single().param("backgroundColor")!!.resSuffix,
        )
    }

    @Test
    fun `same attribute may have different suffixes in different styleables`() {
        val file = xml(
            "res_attrs.xml",
            resources(
                """
                <declare-styleable name="Toast" sdds:api_info="Toast">
                    <attr name="sd_background" sdds:api_name="backgroundColor" sdds:api_type="color"
                        sdds:api_res_suffix="bg_color" />
                </declare-styleable>
                <declare-styleable name="Switch" sdds:api_info="Switch">
                    <attr name="sd_background" sdds:api_name="backgroundColor" sdds:api_type="color"
                        sdds:api_res_suffix="background_color" />
                </declare-styleable>
                """,
            ),
        )

        val suffixes = parser.parse(listOf(file)).components
            .associate { it.styleableName to it.param("backgroundColor")!!.resSuffix }

        assertEquals(mapOf("Toast" to "bg_color", "Switch" to "background_color"), suffixes)
    }

    // endregion

    // region размещение

    @Test
    fun `placement defaults to style and can be set to overlay`() {
        val file = xml(
            "cell_attrs.xml",
            resources(
                """
                <declare-styleable name="CellLayout" sdds:api_info="Cell">
                    <attr name="sd_avatarStyle" sdds:api_name="avatarStyle" sdds:api_type="component_style"
                        sdds:api_placement="overlay" />
                    <attr name="android:checkboxStyle" sdds:api_name="checkBoxStyle"
                        sdds:api_type="component_style" sdds:api_placement="overlay" />
                    <attr name="sd_iconSize" format="dimension" />
                </declare-styleable>
                """,
            ),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals(Placement.OVERLAY.key, meta.param("avatarStyle")!!.placement)
        assertEquals(Placement.OVERLAY.key, meta.param("checkBoxStyle")!!.placement)
        assertEquals(Placement.STYLE.key, meta.param("iconSize")!!.placement)
    }

    @Test
    fun `invalid placement is rejected`() {
        val file = xml(
            "bad_attrs.xml",
            resources(
                """
                <declare-styleable name="Cell" sdds:api_info="Cell">
                    <attr name="sd_avatarStyle" sdds:api_type="component_style" sdds:api_placement="sidecar" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) { parser.parse(listOf(file)) }
        assertTrue(ex.message!!.contains("api_placement"))
    }

    // endregion

    // region владение adjustment формы

    @Test
    fun `shape adjustment belongs to the main shape attribute by default`() {
        val file = xml(
            "button_group_attrs.xml",
            resources(
                """
                <declare-styleable name="ButtonGroup" sdds:api_info="ButtonGroup">
                    <attr name="sd_shapeAppearance" sdds:api_name="shape" />
                    <attr name="sd_externalShapeAppearance" format="reference" sdds:api_name="externalShape" />
                    <attr name="sd_internalShapeAppearance" format="reference" sdds:api_name="internalShape" />
                </declare-styleable>
                """,
            ),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertTrue(meta.param("shape")!!.shapeAdjustment)
        // Прочие формы компонента adjustment не печатают: атрибут в стиле один на всех
        assertFalse(meta.param("externalShape")!!.shapeAdjustment)
        assertFalse(meta.param("internalShape")!!.shapeAdjustment)
    }

    @Test
    fun `shape adjustment owner can be set explicitly`() {
        val file = xml(
            "wheel_attrs.xml",
            resources(
                """
                <declare-styleable name="Wheel" sdds:api_info="Wheel">
                    <attr name="sd_itemSelectorShapeAppearance" format="reference"
                        sdds:api_name="itemSelectorShape" sdds:api_shape_adjustment="true" />
                    <attr name="sd_itemShapeAppearance" format="reference" sdds:api_name="itemShape"
                        sdds:api_shape_adjustment="false" />
                </declare-styleable>
                """,
            ),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertTrue(meta.param("itemSelectorShape")!!.shapeAdjustment)
        assertFalse(meta.param("itemShape")!!.shapeAdjustment)
    }

    @Test
    fun `shape adjustment on a non-shape property is rejected`() {
        val file = xml(
            "bad_shape_attrs.xml",
            resources(
                """
                <declare-styleable name="Wheel" sdds:api_info="Wheel">
                    <attr name="sd_itemSize" format="dimension" sdds:api_shape_adjustment="true" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) { parser.parse(listOf(file)) }
        assertTrue(ex.message!!.contains("api_shape_adjustment"))
    }

    @Test
    fun `invalid shape adjustment value is rejected`() {
        val file = xml(
            "bad_shape_value_attrs.xml",
            resources(
                """
                <declare-styleable name="Wheel" sdds:api_info="Wheel">
                    <attr name="sd_itemShapeAppearance" format="reference" sdds:api_name="itemShape"
                        sdds:api_shape_adjustment="yes" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) { parser.parse(listOf(file)) }
        assertTrue(ex.message!!.contains("api_shape_adjustment"))
    }

    // endregion

    // region значения под состоянием

    @Test
    fun `state value supports alias and alpha forms`() {
        val file = xml(
            "textfield_attrs.xml",
            resources(
                """
                <declare-styleable name="TextField" sdds:api_info="TextField">
                    <attr name="sd_valueColor" sdds:api_name="valueColor" sdds:api_type="color"
                        sdds:api_state_value="readonly=valueColorReadOnly" />
                    <attr name="android:textColor" sdds:api_name="labelColor" sdds:api_type="color"
                        sdds:api_state_value="loading=alpha(loadingAlpha)" />
                </declare-styleable>
                """,
            ),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals(
            listOf(StateValue("readonly", "valueColorReadOnly", StateValueKind.ALIAS.key)),
            meta.param("valueColor")!!.stateValues,
        )
        assertEquals(
            listOf(StateValue("loading", "loadingAlpha", StateValueKind.ALPHA.key)),
            meta.param("labelColor")!!.stateValues,
        )
    }

    @Test
    fun `invalid state value form is rejected`() {
        val file = xml(
            "bad_attrs.xml",
            resources(
                """
                <declare-styleable name="TextField" sdds:api_info="TextField">
                    <attr name="sd_valueColor" sdds:api_type="color"
                        sdds:api_state_value="readonly=lighten(valueColor, 0.5)" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) { parser.parse(listOf(file)) }
        assertTrue(ex.message!!.contains("api_state_value"))
    }

    // endregion

    // region состояния

    @Test
    fun `composite state is expressed by two bindings with the same config name`() {
        val file = xml(
            "textfield_attrs.xml",
            resources(
                """
                <declare-styleable name="TextField" sdds:api_info="TextField">
                    <attr name="android:state_focused" sdds:api_state="TextFieldFocus"
                        sdds:api_state_kind="android" sdds:api_name="focused" />
                    <attr name="android:state_activated" sdds:api_state="TextFieldFocus"
                        sdds:api_state_kind="android" sdds:api_name="focused"
                        sdds:api_state_negated="true" />
                </declare-styleable>
                """,
            ),
        )

        val states = parser.parse(listOf(file)).components.single().stateSets.single().states

        assertEquals(
            listOf(
                StateInfo("focused", "android:state_focused", "android"),
                StateInfo("focused", "android:state_activated", "android", negated = true),
            ),
            states,
        )
    }

    @Test
    fun `state name may be remapped to another framework attribute`() {
        val file = xml(
            "segment_attrs.xml",
            resources(
                """
                <declare-styleable name="SegmentItem" sdds:api_info="SegmentItem">
                    <attr name="android:state_checked" sdds:api_state="SegmentItemSelection"
                        sdds:api_state_kind="android" sdds:api_name="selected" />
                </declare-styleable>
                """,
            ),
        )

        val state = parser.parse(listOf(file)).components.single().stateSets.single().states.single()

        assertEquals(StateInfo("selected", "android:state_checked", "android"), state)
    }

    @Test
    fun `state binding out of sync with enum values is rejected`() {
        val file = xml(
            "avatar_attrs.xml",
            resources(
                """
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="sd_status" format="enum">
                        <enum name="none" value="0" />
                        <enum name="active" value="1" />
                    </attr>
                    <attr name="sd_status_activated" sdds:api_state="AvatarStatus"
                        sdds:api_state_kind="scoped" sdds:api_name="activated" />
                </declare-styleable>
                """,
            ),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) { parser.parse(listOf(file)) }
        assertTrue(ex.message!!.contains("не совпадает ни с одним значением enum"))
    }

    @Test
    fun `state bindings have no ordinal in the model`() {
        val fields = StateInfo::class.java.declaredFields.map { it.name }
        assertTrue("Модель привязки состояния не должна нести ordinal", "ordinal" !in fields)
    }

    // endregion

    // region общий словарь состояний

    @Test
    fun `shared state dictionary is collected from module resources`() {
        val base = xml(
            "base_attrs.xml",
            resources(
                """
                <attr name="sd_state_loading" format="boolean" />
                <attr name="sd_state_readonly" format="boolean" />
                <declare-styleable name="SdInteractiveState">
                    <attr name="sd_state_error" format="boolean" />
                </declare-styleable>
                """,
            ),
        )
        val component = xml(
            "avatar_attrs.xml",
            resources(
                """
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="sd_status_active" sdds:api_state="AvatarStatus" sdds:api_name="active" />
                </declare-styleable>
                """,
            ),
        )

        val sharedStates = parser.parse(listOf(base, component)).sharedStates

        assertEquals(
            mapOf(
                "error" to "sd_state_error",
                "loading" to "sd_state_loading",
                "readonly" to "sd_state_readonly",
            ),
            sharedStates,
        )
        // scoped-состояние компонента в общий словарь не попадает
        assertTrue(sharedStates.values.none { it == "sd_status_active" })
    }

    // endregion

    // region вложенные семьи стилей и вычисляемые значения

    @Test
    fun `sub style declaration is read from styleable`() {
        val file = xml(
            "card_attrs.xml",
            resources(
                """
                <declare-styleable name="CardContent" sdds:api_info="Card"
                    sdds:api_sub_style="Content"
                    sdds:api_style_ref="sd_cardContentStyle"
                    sdds:api_parent="Sdds.Components.CardContent">
                    <attr name="sd_shapeAppearance" sdds:api_name="contentShape" sdds:api_res_prefix="content" />
                    <attr name="android:theme" sdds:api_placement="theme" />
                </declare-styleable>
                """,
            ),
        )

        val component = parser.parse(listOf(file)).components.single()

        assertEquals(
            SubStyleInfo("Content", "style", "sd_cardContentStyle", "Sdds.Components.CardContent"),
            component.subStyle,
        )
        // у вложенной семьи нет идентичности: она не самостоятельный компонент
        assertEquals(emptyMap<String, ComponentIdentity>(), component.identity)
        assertEquals("content", component.param("contentShape")?.resPrefix)
        assertEquals(Placement.THEME.key, component.params.single { it.attrName == "android:theme" }.placement)
    }

    @Test
    fun `overlay sub style keeps its kind`() {
        val file = xml(
            "text_field_attrs.xml",
            resources(
                """
                <declare-styleable name="TextFieldChips" sdds:api_info="TextField"
                    sdds:api_sub_style="Chips" sdds:api_sub_style_kind="overlay"
                    sdds:api_style_ref="sd_chipGroupStyleOverlay">
                    <attr name="sd_chipGroupStyle" />
                </declare-styleable>
                """,
            ),
        )

        assertEquals(
            SubStyleInfo("Chips", "overlay", "sd_chipGroupStyleOverlay"),
            parser.parse(listOf(file)).components.single().subStyle,
        )
    }

    @Test
    fun `sub style without style ref is rejected`() {
        val file = xml(
            "card_attrs.xml",
            resources(
                """
                <declare-styleable name="CardContent" sdds:api_info="Card" sdds:api_sub_style="Content">
                    <attr name="sd_shapeAppearance" />
                </declare-styleable>
                """,
            ),
        )

        val error = assertThrows(DeclareStyleableParser.MarkupException::class.java) {
            parser.parse(listOf(file))
        }
        assertTrue(error.message.orEmpty().contains("sdds:api_style_ref"))
    }

    @Test
    fun `computed and conditional values are read`() {
        val file = xml(
            "image_view_attrs.xml",
            resources(
                """
                <declare-styleable name="ImageView" sdds:api_info="Image"
                    sdds:api_def_style_attr="sd_imageViewStyle"
                    sdds:api_parent="Sdds.Components.ImageView">
                    <attr name="sd_aspectRatio" format="float" sdds:api_value="ratio(width,height)" />
                    <attr name="sd_fsEnabled" sdds:api_value="false" sdds:api_when="fsTarget=content" />
                </declare-styleable>
                """,
            ),
        )

        val component = parser.parse(listOf(file)).components.single()

        assertEquals("ratio(width,height)", component.param("aspectRatio")?.valueExpr)
        assertEquals("false", component.param("fsEnabled")?.valueExpr)
        assertEquals("fsTarget=content", component.param("fsEnabled")?.condition)
    }

    @Test
    fun `malformed computed value is rejected`() {
        val file = xml(
            "image_view_attrs.xml",
            resources(
                """
                <declare-styleable name="ImageView" sdds:api_info="Image">
                    <attr name="sd_aspectRatio" sdds:api_value="ratio(width)" />
                </declare-styleable>
                """,
            ),
        )

        val error = assertThrows(DeclareStyleableParser.MarkupException::class.java) {
            parser.parse(listOf(file))
        }
        assertTrue(error.message.orEmpty().contains("ratio(<ключ>,<ключ>)"))
    }

    @Test
    fun `framework attribute marked only by placement enters meta`() {
        val file = xml(
            "cell_attrs.xml",
            resources(
                """
                <declare-styleable name="CellLayout" sdds:api_info="Cell"
                    sdds:api_def_style_attr="sd_cellStyle"
                    sdds:api_parent="Sdds.Components.Cell">
                    <attr name="android:gravity" />
                    <attr name="android:theme" sdds:api_placement="theme" />
                </declare-styleable>
                """,
            ),
        )

        val params = parser.parse(listOf(file)).components.single().params

        // неразмеченный framework-атрибут в мету не попадает, размеченный placement'ом — попадает
        assertEquals(listOf("android:theme"), params.map { it.attrName })
    }

    // endregion
}
