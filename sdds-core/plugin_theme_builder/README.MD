# Design System Builder Gradle Plugin

Плагин с id `io.github.salute-developers.design-system-builder` объединяет четыре независимые
возможности: генерацию темы, генерацию компонентов, подготовку Android-документации и генерацию
адаптеров для sandbox.

```toml
[plugins]
dsbuilder = { id = "io.github.salute-developers.design-system-builder", version = "<version>" }
```

```kotlin
plugins {
    alias(libs.plugins.dsbuilder)
}
```

Единственная публичная точка конфигурации — `dsBuilder`. Старые plugin id и `themeBuilder` DSL
не поддерживаются.

## Общая директория `.sdds`

`sddsDirectory` по умолчанию ищется сначала в текущем project, затем в его непосредственном parent.
Путь можно переопределить:

```kotlin
dsBuilder {
    sddsDirectory.set(layout.projectDirectory.dir("design-system"))
}
```

Стандартные файлы:

| Назначение | Compose | View |
|---|---|---|
| Components info | `config-info-compose.json` | `config-info-view-system.json` |
| Theme info | `theme-info-compose.json` | `theme-info-view-system.json` |

Если источник темы не задан явно, `theme` читает `.sdds/config.json`. Первый tenant становится
внутренним `Tenant.Default`, остальные сохраняются как вариации одной темы. Alias темы берётся из
`tenant.alias`, с fallback на `tenant.name`.

## Theme и components

```kotlin
import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

dsBuilder {
    compose()
    packageName.set("com.example.designsystem")
    resourcePrefix.set("example")
    outputLocation.set(SRC)
    dimensions {
        fromResources(true)
    }
    theme {
        source(name = "stylesSalute", version = "latest", alias = "Salute")
        mode.set(THEME)
        autoGenerate.set(false)
    }
    components {
        source(name = "componentsSalute", version = "latest", alias = "Salute")
        componentsMetaStyleClass.set(true)
    }
}
```

Для View используйте `view { themeParents { ... } }`. Для Compose Multiplatform —
`compose(multiplatform = true)`. URL-источники и несколько tenant-вариаций поддерживаются через
`source(url = ..., name = ...)` и `sources(baseAlias = ...)`. Общие `target`, `packageName`,
`resourcePrefix`, `outputLocation` и `dimensions` задаются на уровне `dsBuilder`; одноимённые
capability-настройки остаются доступными как точечные overrides.

## Documentation

```kotlin
dsBuilder {
    documentation {
        compose() // либо view()
    }
}
```

Задача `documentationAggregate` создаёт platform enrichment в `.sdds/temp/docs`:

```text
assets/examples/kotlin/
assets/examples/xml/
meta/samples.json
meta/components-info.json
meta/theme-info.json
```

Core snippet artifacts подключаются в configuration `sddsCoreDocumentation`; их `meta.json`
объединяется с локальной metadata в `meta/samples.json`. Поле `snippetPath` хранится относительно
корня `.sdds/temp/docs`, например `assets/examples/kotlin/com/example/Sample.kt`. Плагин не запускает
Docusaurus, npm, публикацию или сетевые portal-задачи и не создаёт `manifest.json`/`docs.json`:
это ответственность `dsbuilder docs generate`.

## Sandbox

```kotlin
dsBuilder {
    sandbox {
        compose {
            multiplatform.set(false)
            // componentsInfoFile, generatedPackageName и themeAlias имеют conventions
        }
    }
}
```

Для View используется `sandbox { view { ... } }`. `componentsInfoFile` выводится из `.sdds`,
package — из Android namespace (либо `componentsInfo.packageName + ".sandbox"`), theme alias —
из первого базового tenant. Scheme по умолчанию — `SandboxScheme.V2`. Все значения можно явно
переопределить.

Generated sandbox sources записываются в `build/generated/sdds/sandbox` и автоматически
подключаются к Android `main` или KMP `commonMain`.
