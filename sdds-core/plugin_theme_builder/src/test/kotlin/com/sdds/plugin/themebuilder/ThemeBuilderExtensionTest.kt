package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Assert.assertTrue
import org.junit.Test

class ThemeBuilderExtensionTest {

    @Test
    fun `compose устанавливает target compose и включает componentsMetaStyleClass`() {
        val underTest = ThemeBuilderExtension()

        underTest.compose {
            componentsMetaStyleClass(true)
        }

        assertEquals(ThemeBuilderTarget.COMPOSE, underTest.target)
        assertTrue(underTest.componentsMetaStyleClass)
    }

    @Test
    fun `view устанавливает target view_system и сохраняет родительскую тему`() {
        val underTest = ThemeBuilderExtension()

        underTest.view {
            themeParents {
                materialComponentsTheme()
            }
        }

        assertEquals(ThemeBuilderTarget.VIEW_SYSTEM, underTest.target)
        assertEquals(
            setOf(
                ViewThemeParent(
                    themePrefix = "Theme.MaterialComponents",
                    themeSuffix = "",
                    childSuffix = "MaterialComponents",
                ),
            ),
            underTest.viewThemeParents,
        )
        assertEquals(
            setOf(ShapeAppearanceConfig.materialShape()),
            underTest.viewShapeAppearanceConfig,
        )
    }

    @Test
    fun `view без настроек устанавливает target view_system`() {
        val underTest = ThemeBuilderExtension()

        underTest.view()

        assertEquals(ThemeBuilderTarget.VIEW_SYSTEM, underTest.target)
        assertTrue(underTest.viewThemeParents.isEmpty())
        assertTrue(underTest.viewShapeAppearanceConfig.isEmpty())
    }

    @Test
    fun `compose и view устанавливают target all`() {
        val underTest = ThemeBuilderExtension()

        underTest.compose()
        underTest.view()

        assertEquals(ThemeBuilderTarget.ALL, underTest.target)
    }

    @Test
    fun `повторный compose оставляет target compose`() {
        val underTest = ThemeBuilderExtension()

        underTest.compose()
        underTest.compose()

        assertEquals(ThemeBuilderTarget.COMPOSE, underTest.target)
    }

    @Test
    fun `compose не меняет target если он уже all`() {
        val underTest = ThemeBuilderExtension()

        underTest.compose()
        underTest.view()
        underTest.compose()

        assertEquals(ThemeBuilderTarget.ALL, underTest.target)
    }

    @Test
    fun `themeSources без defaultSource падает с ошибкой`() {
        val underTest = ThemeBuilderExtension()

        val exception = assertThrows(ThemeBuilderException::class.java) {
            underTest.themeSources(baseAlias = "Base") {
                source(
                    name = "DarkTheme",
                    version = "1.0.0",
                    tenant = "dark",
                )
            }
        }
        assertEquals("Default source must be defined when use multitenant mode", exception.message)
    }

    @Test
    fun `themeSources сохраняет default и tenant sources`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSources(baseAlias = "BaseTheme") {
            defaultSource(
                name = "BaseRemoteTheme",
                version = "1.0.0",
            )
            source(
                name = "DarkRemoteTheme",
                version = "1.0.0",
                tenant = "dark",
            )
        }

        val result = requireNotNull(underTest.getThemeSourcesOrNull())

        assertEquals("BaseTheme", result.baseAlias)
        assertEquals(2, result.sources?.size)

        val defaultSource = result.sources.get(0) as ThemeBuilderSource.NameAndVersion
        assertEquals("BaseRemoteTheme", defaultSource.remoteName)
        assertEquals("1.0.0", defaultSource.version)
        assertEquals("BaseTheme", defaultSource.themeName)
        assertEquals("", defaultSource.tenant)

        val darkSource = result.sources[1] as ThemeBuilderSource.NameAndVersion
        assertEquals("DarkRemoteTheme", darkSource.remoteName)
        assertEquals("1.0.0", darkSource.version)
        assertEquals("BaseTheme", darkSource.themeName)
        assertEquals("dark", darkSource.tenant)
    }

    @Test
    fun `themeSources без baseAlias использует пустой baseAlias`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSources {
            defaultSource(
                name = "DefaultTheme",
                version = "1.0.0",
            )
        }

        val result = requireNotNull(underTest.getThemeSourcesOrNull())

        assertEquals("", result.baseAlias)
        assertEquals(1, result.sources?.size)

        val defaultSource = result.sources.single() as ThemeBuilderSource.NameAndVersion
        assertEquals("DefaultTheme", defaultSource.remoteName)
        assertEquals("1.0.0", defaultSource.version)
        assertEquals("", defaultSource.themeName)
        assertEquals("", defaultSource.tenant)
    }

    @Test
    fun `themeSource с name version alias сохраняет source`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSource(
            name = "RemoteTheme",
            version = "1.0.0",
            alias = "AliasTheme",
        )

        val result = requireNotNull(underTest.getThemeSourcesOrNull())

        assertEquals("AliasTheme", result.baseAlias)
        assertEquals(1, result.sources?.size)

        val source = result.sources.single() as ThemeBuilderSource.NameAndVersion

        assertEquals("RemoteTheme", source.remoteName)
        assertEquals("1.0.0", source.version)
        assertEquals("AliasTheme", source.alias)
        assertEquals("AliasTheme", source.themeName)
        assertEquals("", source.tenant)
    }

    @Test
    fun `themeSource с url сохраняет source`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSource("https://example.com/theme.zip")
        val result = requireNotNull(underTest.getThemeSourcesOrNull())

        assertEquals("Default", result.baseAlias)
        assertEquals(1, result.sources?.size)

        val source = result.sources.single() as ThemeBuilderSource.Url
        assertEquals("https://example.com/theme.zip", source.url)
        assertEquals("Default", source.name)
        assertEquals("Default", source.themeName)
        assertEquals("", source.tenant)
    }

    @Test
    fun `themeSource builder с url сохраняет source`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSource {
            name("BuilderTheme")
            url("https://example.com/theme.zip")
            version("1.0.0")
            alias("AliasTheme")
        }
        val result = requireNotNull(underTest.getThemeSourcesOrNull())

        val source = result.sources.single() as ThemeBuilderSource.Url
        assertEquals("https://example.com/theme.zip", source.url)
        assertEquals("BuilderTheme", source.name)
        assertEquals("BuilderTheme", source.themeName)
    }

    @Test
    fun `themeSource builder без url сохраняет name version alias source`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSource {
            name("BuilderTheme")
            version("1.0.0")
            alias("AliasTheme")
        }
        val result = requireNotNull(underTest.getThemeSourcesOrNull())

        val source = result.sources.single() as ThemeBuilderSource.NameAndVersion
        assertEquals("BuilderTheme", source.remoteName)
        assertEquals("1.0.0", source.version)
        assertEquals("AliasTheme", source.alias)
        assertEquals("AliasTheme", source.themeName)
    }

    @Test
    fun `themeSource без version использует latest version`() {
        val underTest = ThemeBuilderExtension()

        underTest.themeSource(name = "RemoteTheme")

        val result = requireNotNull(underTest.getThemeSourcesOrNull())
        val source = result.sources.single() as ThemeBuilderSource.NameAndVersion

        assertEquals("RemoteTheme", result.baseAlias)
        assertEquals("RemoteTheme", source.remoteName)
        assertEquals(ThemeSourceBuilder.VERSION_LATEST, source.version)
        assertEquals("RemoteTheme", source.themeName)
        assertEquals("RemoteTheme", source.alias)
        assertEquals("", source.tenant)
    }

    @Test
    fun `componentSource с url сохраняет url source`() {
        val underTest = ThemeBuilderExtension()

        underTest.componentSource("https://example.com/component.zip")

        val source = underTest.componentSource as ThemeBuilderSource.Url

        assertEquals("https://example.com/component.zip", source.url)
        assertEquals("Default", source.name)
        assertEquals("Default", source.themeName)
        assertEquals("", source.tenant)
    }

    @Test
    fun `componentSource без version использует latest version`() {
        val underTest = ThemeBuilderExtension()

        underTest.componentSource(name = "ComponentsTheme")

        val source = underTest.componentSource as ThemeBuilderSource.NameAndVersion

        assertEquals("ComponentsTheme", source.remoteName)
        assertEquals(ThemeSourceBuilder.VERSION_LATEST, source.version)
        assertEquals("ComponentsTheme", source.alias)
        assertEquals("ComponentsTheme", source.themeName)
        assertEquals("", source.tenant)
    }

    @Test
    fun `componentSource builder с url сохраняет url source`() {
        val underTest = ThemeBuilderExtension()

        underTest.componentSource {
            name("ComponentsTheme")
            url("https://example.com/component.zip")
            version("1.0.0")
            alias("AliasTheme")
        }

        val source = underTest.componentSource as ThemeBuilderSource.Url

        assertEquals("https://example.com/component.zip", source.url)
        assertEquals("ComponentsTheme", source.name)
        assertEquals("ComponentsTheme", source.themeName)
    }

    @Test
    fun `componentSource builder без url сохраняет name version alias source`() {
        val underTest = ThemeBuilderExtension()

        underTest.componentSource {
            name("ComponentsTheme")
            version("1.0.0")
            alias("AliasTheme")
        }

        val source = underTest.componentSource as ThemeBuilderSource.NameAndVersion

        assertEquals("ComponentsTheme", source.remoteName)
        assertEquals("1.0.0", source.version)
        assertEquals("AliasTheme", source.alias)
        assertEquals("AliasTheme", source.themeName)
    }

    @Test
    fun `dimensions сохраняет настройки и не допускает отрицательный multiplier`() {
        val underTest = ThemeBuilderExtension()

        underTest.dimensions {
            multiplier(-1f)
            breakPoints {
                medium(600)
                large(1000)
            }
            fromResources(true)
            variableFonts(true)
        }

        assertEquals(
            DimensionsConfig(
                multiplier = 0f,
                breakPoints = BreakPoints(600, 1000),
                fromResources = true,
                variableFonts = true,
            ),
            underTest.dimensionsConfig,
        )
    }
}
