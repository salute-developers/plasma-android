package tasks.viewapi

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File

/**
 * Unit-тесты [DeclareStyleableParser] — обязательное покрытие парсера.
 */
class DeclareStyleableParserTest {

    @get:Rule
    val tempFolder = TemporaryFolder()

    private val parser = DeclareStyleableParser(resourcePrefix = "sd_")

    private fun xml(name: String, content: String): File =
        tempFolder.newFile(name).apply { writeText(content) }

    private fun ComponentMeta.param(id: String): PropertyMeta? = params.firstOrNull { it.id == id }

    @Test
    fun `parses single component and auto-strips prefix for id`() {
        val file = xml(
            "button_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="Button">
                    <attr name="sd_valuePadding" format="dimension" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals(listOf("Button"), meta.componentNames)
        assertEquals("Button", meta.styleableName)
        val prop = meta.param("valuePadding")!!
        assertEquals("sd_valuePadding", prop.attrName)
        assertEquals("dimension", prop.type)
    }

    @Test
    fun `sdds api_name overrides auto-stripped id`() {
        val file = xml(
            "tf.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="TextField" sdds:api_info="TextField">
                    <attr name="sd_horizontalPadding" format="dimension" sdds:api_name="indicatorOffsetX" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertNull(meta.param("horizontalPadding"))
        assertEquals("sd_horizontalPadding", meta.param("indicatorOffsetX")!!.attrName)
    }

    @Test
    fun `api_info list yields several components sharing api surface`() {
        val file = xml(
            "tf.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="TextField" sdds:api_info="TextField,TextArea">
                    <attr name="sd_valuePadding" format="dimension" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals(listOf("TextField", "TextArea"), meta.componentNames)
    }

    @Test
    fun `api_type disambiguates reference and heuristic classifies by name`() {
        val file = xml(
            "button_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="Button">
                    <attr name="sd_icon" format="reference" sdds:api_type="icon" />
                    <attr name="sd_iconTint" format="reference|color" />
                    <attr name="sd_shapeAppearance" format="reference" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals("icon", meta.param("icon")!!.type)   // явный api_type
        assertEquals("color", meta.param("iconTint")!!.type) // эвристика: "tint"
        assertEquals("shape", meta.param("shapeAppearance")!!.type) // эвристика: "shape"
    }

    @Test
    fun `enum values carry name value and configName with rename`() {
        val file = xml(
            "button_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="Button">
                    <attr name="sd_spacing" format="enum">
                        <enum name="packed" value="0" />
                        <enum name="spaceBetween" value="1" sdds:api_name="space-between" />
                    </attr>
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()
        val spacing = meta.param("spacing")!!

        assertEquals("value", spacing.type)
        assertEquals(
            listOf(
                EnumValue("packed", "0", "packed"),
                EnumValue("spaceBetween", "1", "space-between"),
            ),
            spacing.values,
        )
    }

    @Test
    fun `android attributes are filtered out`() {
        val file = xml(
            "button_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="Button">
                    <attr name="android:insetLeft" />
                    <attr name="android:checkable" />
                    <attr name="sd_valuePadding" format="dimension" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals(1, meta.params.size)
        assertEquals("valuePadding", meta.params.single().id)
    }

    @Test
    fun `format is resolved cross-file via global index`() {
        val base = xml(
            "base_attrs.xml",
            """
            <resources>
                <attr name="sd_shapeAppearance" format="reference" />
                <attr name="sd_disabledAlpha" format="float" />
            </resources>
            """.trimIndent(),
        )
        val button = xml(
            "button_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="Button">
                    <attr name="sd_disabledAlpha" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(base, button)).components.single { it.styleableName == "Button" }

        // format отсутствует в styleable, но найден в base_attrs через индекс -> float
        assertEquals("float", meta.param("disabledAlpha")!!.type)
    }

    @Test
    fun `unmarked styleable is ignored`() {
        val file = xml(
            "mix.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Marked" sdds:api_info="Marked">
                    <attr name="sd_valuePadding" format="dimension" />
                </declare-styleable>
                <declare-styleable name="Unmarked">
                    <attr name="sd_other" format="dimension" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val result = parser.parse(listOf(file)).components

        assertEquals(1, result.size)
        assertEquals("Marked", result.single().styleableName)
    }

    @Test
    fun `custom states are collected with flavor and deterministic ordinal`() {
        val file = xml(
            "avatar_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="sd_state_online" format="boolean"
                        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="online" />
                    <attr name="sd_state_offline" format="boolean"
                        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="offline" />
                    <attr name="sd_valuePadding" format="dimension" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        // Состояния не попадают в params
        assertEquals(listOf("valuePadding"), meta.params.map { it.id })

        val stateSet = meta.stateSets.single()
        assertEquals("AvatarStatus", stateSet.name)
        assertEquals(
            listOf(
                StateInfo("online", "sd_state_online", "scoped"),
                StateInfo("offline", "sd_state_offline", "scoped"),
            ),
            stateSet.states,
        )
    }

    @Test
    fun `enum-driven state set joins to enum values by configName`() {
        // Форма Avatar: ordinal-источник — enum sd_status (none=0/active=1/inactive=2),
        // а drawable-state атрибуты живут в отдельном styleable. Оба помечены одним api_info.
        // Контракт: состояния джойнятся к значениям enum по configName; авторитетный ordinal —
        // в enum-value (value), а не в StateInfo.ordinal (тот = порядок в state-styleable).
        val file = xml(
            "avatar_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="SdAvatarStatus" sdds:api_info="Avatar">
                    <attr name="sd_status_active" format="boolean"
                        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="active" />
                    <attr name="sd_status_inactive" format="boolean"
                        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="inactive" />
                </declare-styleable>
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="sd_status" format="enum">
                        <enum name="none" value="0" />
                        <enum name="active" value="1" />
                        <enum name="inactive" value="2" />
                    </attr>
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val metas = parser.parse(listOf(file)).components

        // Один компонент "Avatar", собранный из двух styleable — join по componentNames.
        assertEquals(setOf("Avatar"), metas.flatMap { it.componentNames }.toSet())

        val stateMeta = metas.single { it.styleableName == "SdAvatarStatus" }
        val statusEnum = metas.single { it.styleableName == "Avatar" }.param("status")!!

        // Авторитетные ordinal'ы — в enum-value (включая none-sentinel = 0).
        assertEquals("value", statusEnum.type)
        assertEquals(
            listOf("none" to "0", "active" to "1", "inactive" to "2"),
            statusEnum.values.map { it.configName to it.value },
        )

        // Состояния несут drawableAttr + flavor; их configName — подмножество имён enum-value.
        val states = stateMeta.stateSets.single { it.name == "AvatarStatus" }.states
        assertEquals(
            listOf(
                StateInfo("active", "sd_status_active", "scoped"),
                StateInfo("inactive", "sd_status_inactive", "scoped"),
            ),
            states,
        )
        val enumNames = statusEnum.values.map { it.configName }.toSet()
        assertTrue(states.all { it.configName in enumNames })
    }

    @Test
    fun `heuristics classify appearance style and thickness with correct priority`() {
        val file = xml(
            "mix_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Note" sdds:api_info="Note">
                    <attr name="sd_titleAppearance" format="reference" />
                    <attr name="sd_shapeAppearance" format="reference" />
                    <attr name="sd_buttonStyleOverlay" format="reference" />
                    <attr name="sd_counterStyle" format="reference" />
                    <attr name="sd_trackThickness" format="reference" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        // `appearance` -> typography, но `shapeAppearance` перехватывается раньше веткой SHAPE.
        assertEquals("typography", meta.param("titleAppearance")!!.type)
        assertEquals("shape", meta.param("shapeAppearance")!!.type)
        // `*Style` / `*StyleOverlay` -> component_style.
        assertEquals("component_style", meta.param("buttonStyleOverlay")!!.type)
        assertEquals("component_style", meta.param("counterStyle")!!.type)
        // `thickness` -> dimension.
        assertEquals("dimension", meta.param("trackThickness")!!.type)
    }

    @Test
    fun `marked framework attributes become params, unmarked are ignored`() {
        val file = xml(
            "button_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="BasicButton">
                    <attr name="sd_iconSize" format="dimension" />
                    <attr name="android:minHeight" sdds:api_name="height" sdds:api_type="dimension" />
                    <attr name="android:textColor" sdds:api_name="labelColor" sdds:api_type="color" />
                    <attr name="android:textAppearance" sdds:api_name="labelStyle" sdds:api_type="typography" />
                    <attr name="android:insetLeft" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val meta = parser.parse(listOf(file)).components.single()

        assertEquals("dimension", meta.param("iconSize")!!.type)
        val height = meta.param("height")!!
        assertEquals("android:minHeight", height.attrName)
        assertEquals("dimension", height.type)
        assertEquals("min_height", height.resSuffix)
        assertEquals("android:textColor", meta.param("labelColor")!!.attrName)
        assertEquals("typography", meta.param("labelStyle")!!.type)
        // неразмеченный framework-атрибут остаётся вне меты
        assertTrue(meta.params.none { it.attrName == "android:insetLeft" })
    }

    @Test
    fun `one config key can bind to several attributes with own suffixes`() {
        val file = xml(
            "avatar_attrs.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Avatar" sdds:api_info="Avatar">
                    <attr name="android:minWidth" sdds:api_name="width" sdds:api_type="dimension"
                        sdds:api_res_suffix="min_width" />
                    <attr name="android:maxWidth" sdds:api_name="width" sdds:api_type="dimension"
                        sdds:api_res_suffix="max_width" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val params = parser.parse(listOf(file)).components.single().params

        assertEquals(listOf("width", "width"), params.map { it.id })
        assertEquals(listOf("android:minWidth", "android:maxWidth"), params.map { it.attrName })
        assertEquals(listOf("min_width", "max_width"), params.map { it.resSuffix })
    }

    @Test
    fun `invalid api_type is rejected`() {
        val file = xml(
            "bad.xml",
            """
            <resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
                <declare-styleable name="Button" sdds:api_info="Button">
                    <attr name="sd_icon" format="reference" sdds:api_type="drawable" />
                </declare-styleable>
            </resources>
            """.trimIndent(),
        )

        val ex = assertThrows(DeclareStyleableParser.MarkupException::class.java) {
            parser.parse(listOf(file)).components
        }
        assertTrue(ex.message!!.contains("sd_icon"))
    }
}
