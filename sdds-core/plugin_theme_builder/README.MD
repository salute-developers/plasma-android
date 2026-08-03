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

Блок `targets { }` на верхнем уровне `dsBuilder` явно выбирает целевые платформы (Compose/View) и
настраивает платформо-зависимые опции — так сразу видно, что генерируется и как:

```kotlin
import com.sdds.plugin.themebuilder.OutputLocation.SRC
import com.sdds.plugin.themebuilder.ThemeBuilderMode.THEME

dsBuilder {
    autoGenerate.set(false)
    targets {
        compose()
        // либо view {
        //     themeParents {
        //         materialComponentsTheme("NoActionBar")
        //     }
        //     setupShapeAppearance(sddsShape())
        // }
    }
    packageName.set("com.example.designsystem")
    resourcePrefix.set("example")
    outputLocation.set(SRC)
    dimensions {
        fromResources(true)
    }
    theme {
        source(name = "stylesSalute", version = "latest", alias = "Salute")
        mode.set(THEME)
    }
    components {
        source(name = "componentsSalute", version = "latest", alias = "Salute")
        componentsMetaStyleClass.set(true)
    }
}
```

Compose Multiplatform включается через `targets { compose(multiplatform = true) }`. Если нужны обе
платформы, вызовите `compose()` и `view { ... }` внутри одного блока `targets { }` — вызовы
объединяются. URL-источники и несколько tenant-вариаций поддерживаются через `source(url = ..., name = ...)`
и `sources(baseAlias = ...)`. Общие `packageName`, `resourcePrefix`, `outputLocation` и `dimensions`
задаются на уровне `dsBuilder`; одноимённые capability-настройки остаются доступными как точечные
overrides.

> Старые top-level шорткаты `compose()` и `view { ... }` продолжают работать для обратной
> совместимости, но помечены `@Deprecated` и будут удалены в будущих релизах. Для нового кода
> используйте `targets { ... }`.

## Documentation

Платформа для документации определяется верхнеуровневым `targets { }`. Блок `documentation { }`
включает capability и принимает только глобальные настройки (например, `outputDirectory`). Чтобы
переопределить пути к `components-info.json` / `theme-info.json` под конкретную платформу,
используйте вложенные `compose { }` / `view { }` — они не выбирают платформу, а только
конфигурируют:

```kotlin
dsBuilder {
    targets {
        compose() // выбирает платформу для всех capability: theme, components, documentation, sandbox
    }
    documentation {
        // опционально: переопределение путей
        compose {
            componentsInfoFile.set(layout.projectDirectory.file("custom/info.json"))
        }
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

Платформа для sandbox-адаптеров тоже определяется верхнеуровневым `targets { }`. Вложенные
`compose { }` / `view { }` внутри `sandbox { }` — это конфигурационные блоки для уже выбранной
платформы (имя пакета, alias темы, `multiplatform` для KMP и т.п.):

```kotlin
dsBuilder {
    targets {
        compose() // включает генерацию Compose sandbox-адаптера
    }
    sandbox {
        compose {
            multiplatform.set(false)
            // componentsInfoFile, generatedPackageName и themeAlias имеют conventions
        }
    }
}
```

Для View: `targets { view() }` + `sandbox { view { ... } }`. Можно включить обе платформы и
конфигурировать каждую отдельно. `componentsInfoFile` выводится из `.sdds`, package — из Android
namespace (либо `componentsInfo.packageName + ".sandbox"`), theme alias — из первого базового
tenant. Scheme по умолчанию — `SandboxScheme.V2`. Все значения можно явно переопределить.

Generated sandbox sources записываются в `build/generated/sdds/sandbox` и автоматически
подключаются к Android `main` или KMP `commonMain`.

> Выбор платформы — **только** на верхнем уровне `dsBuilder.targets { }`. Внутри `documentation`
> и `sandbox` доступны блоки `compose { }` / `view { }`, но они только конфигурируют платформу,
> а не включают её. Так невозможно случайно рассинхронизировать выбор платформы между
> capability.
