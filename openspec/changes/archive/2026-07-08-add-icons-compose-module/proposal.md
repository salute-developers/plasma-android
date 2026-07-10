## Why

Сейчас дизайн-система поставляет иконки на Android только как Android vector drawable (`sdds-core:icons`), что привязано к android-ресурсам и непригодно для Compose Multiplatform. Нужен параллельный набор Compose-иконок (`ImageVector`), который можно использовать в `commonMain` (KMP), при 100% паритете набора и геометрии с существующим XML-модулем.

## What Changes

- Новый мультиплатформенный модуль `sdds-core:icons-compose` (по образцу `third-party/sdds-haze/haze`): `convention.cmp-lib` + `convention.maven-publish` + `convention.auto-bump`, публикуемый как `sdds-icons-compose` со своим `gradle/icons-compose.version.toml`.
- Генерация Compose-иконок из того же `android-icons/*.xml`, что и XML-модуль, инструментом Valkyrie CLI (`svgxml2imagevector`, формат `lazy-property`, плоские имена с суффиксом размера). Иконки — чистый `ImageVector` без android-ресурсов, пригодны для `commonMain`.
- Расширение существующего `.github/workflows/generate-icons.yml` (НЕ второй workflow): после генерации `android-icons` добавляется шаг установки Valkyrie и генерации в `icons-compose`, второй `bump`, общий PR.
- Разрешение коллизии имён (case-insensitive ФС) **только для Compose-набора**: из 6 пар, где plasma заменял `Sber`→`Sb` (например `ic_sb_boom_cast_*` и `ic_sbboom_cast_*`), в Compose-набор попадает первая (`ic_sb_boom_cast`), вторая (`ic_sbboom_cast`) отбрасывается перед вызовом Valkyrie.
- XML-модуль `sdds-core:icons` **не меняется** — обратная совместимость XML-набора сохраняется полностью (в нём подчёркивания сохраняются, коллизии нет).
- Настройка heap в CI (`org.gradle.jvmargs` / `kotlin.daemon.jvmargs`) для сборки крупного сгенерированного модуля (~4000 файлов).

## Capabilities

### New Capabilities
- `icons-compose-generation`: генерация и поставка Compose-иконок (`ImageVector`) в KMP-совместимый модуль `sdds-core:icons-compose` из общего с XML-модулем источника, включая правило отсева 6 case-insensitive коллизий только для Compose-набора.

### Modified Capabilities
<!-- Нет изменений требований к существующим capability: XML-модуль icons остаётся как есть. -->

## Impact

- **Новый модуль**: `sdds-core/icons-compose` (build.gradle.kts, gradle.properties, сгенерированный `src/commonMain/kotlin`, объект-приёмник `SddsIcons`).
- **Изменяемые файлы конфигурации**: `sdds-core/settings.gradle.kts` (version catalog `iconsCompose` + `include(":icons-compose")`), новый `gradle/icons-compose.version.toml`.
- **CI**: `.github/workflows/generate-icons.yml` — добавление шагов Valkyrie, отсева коллизий и второго bump.
- **Публичный API**: вводится новый публичный набор extension-property `SddsIcons.*` в артефакте `sdds-icons-compose`. Из Compose-набора отсутствуют 6 `sbboom*`-глифов (осознанный tradeoff, зафиксирован в design.md).
- **Зависимости / инфраструктура**: Valkyrie CLI как build-time инструмент в CI; `convention.cmp-lib`, Compose Multiplatform, `utils.addDefaultTargets()`.
- **XML-набор `sdds-core:icons`**: без изменений (backward compatibility).
