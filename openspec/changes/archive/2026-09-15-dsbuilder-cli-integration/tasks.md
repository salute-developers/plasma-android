## 1. `sdds-core/plugin_theme_builder`: пер-платформенные таски

- [x] 1.1 Вынести регистрацию `GenerateThemeTask` в функцию, принимающую `target` параметром (а не читающую его из
      `extension.target()`), и звать её отдельно для каждой платформы из `extension.targets.get()`:
      `generateComposeTheme` (`ThemeBuilderTarget.COMPOSE`), `generateViewTheme` (`ThemeBuilderTarget.VIEW_SYSTEM`).
- [x] 1.2 То же самое для `GenerateComponentsTask`: `generateComposeComponents`, `generateViewComponents`.
- [x] 1.3 `generateTheme`/`generateComponents` регистрируются как раньше (то же имя, тот же тип, `target =
      extension.target`, включая `ALL`) — этот вызов не меняется; пер-платформенные таски регистрируются
      дополнительно, отдельными вызовами той же функции с форсированным `target`.
- [x] 1.4 Пер-платформенные таски не регистрируются вовсе, если `extension.target == null` — `generateTheme`/
      `generateComponents` сохраняют сегодняшнее поведение (ошибка при выполнении из-за отсутствующего `target`,
      без изменений).
- [x] 1.5 Прогнать существующие тесты `ThemeBuilderPluginTest`, `DsBuilderPluginTest`, `GenerateThemeTaskTest`,
      `GenerateComponentsTaskTest` — поведение `target = ALL` (обе платформы через старые имена тасок) не должно
      измениться для внешнего наблюдателя. (`./gradlew :sdds-core:plugin_theme_builder:test` — зелёный, без правок
      существующих тестов.)

## 2. `sdds-core/plugin_theme_builder`: локальный `.sdds/components`

- [x] 2.1 `SddsComponentsSourceReader`: читает `.sdds/components/meta.json`, строит
      `ThemeBuilderSource.LocalDirectory` на саму `.sdds/components` (без промежуточного per-tenant разбиения —
      components не тенантозависимы).
- [x] 2.2 `ComponentsCapability.toLegacyExtension(root)`: fallback на `SddsComponentsSourceReader`, когда явный
      `source(...)` не задан — симметрично `ThemeCapability.toLegacyExtension(root)` для темы. Fallback подключён
      только на уровне новой `dsBuilder.components{}` DSL (`DsBuilderPlugin`); низкоуровневый
      `ThemeBuilderExtension`/`ThemeBuilderPlugin.configure()` не меняет поведение (warn+skip при отсутствии
      `componentSource`, как и раньше) — эти два уровня и так не связаны напрямую (`ThemeBuilderPlugin`
      инстанцируется только из `DsBuilderPlugin`).
- [x] 2.3 `registerFetchAndUnzipComponents`: ветка для `ThemeBuilderSource.LocalDirectory` — не регистрирует
      `fetchComponents`/`unpackComponentFiles`, отдаёт `componentsDir` как `Provider`, указывающий прямо на
      `.sdds/components` (реализовано через `ComponentsInput(componentsDir, dependsOnTask)`, `dependsOnTask = null`
      для локального источника).
- [x] 2.4 Понятные ошибки: `SddsComponentsSourceReader` бросает `ThemeBuilderException`, если `.sdds/components`
      без явного source не найден или в нём нет `meta.json`.

## 3. Тесты

- [x] 3.1 Юнит-тесты на регистрацию тасок: одна платформа → одна пер-платформенная таска; обе платформы → обе
      пер-платформенные таски (`generateTheme`/`generateComponents` сохраняют `target = ALL`); нет платформ — ни
      одна пер-платформенная таска не регистрируется (`ThemeBuilderPluginTest`, 5 новых тестов).
- [x] 3.2 Юнит-тест: `generateComposeTheme`/`generateViewTheme` (и components-аналоги) получают форсированный
      `target`, не совпадающий с `extension.target` при `ALL` — проверено через `task.target.get()`, что
      достаточно: `GenerateThemeTask`/`GenerateComponentsTask` уже фильтруют вывод по `target` (не менялись).
- [x] 3.3 Юнит-тесты: `SddsComponentsSourceReaderTest` (4 теста: резолвит `LocalDirectory` с именем из `meta.json`,
      падает без `.sdds/components`, падает без `meta.json`, читает из кастомной `.sdds` директории) +
      `DsBuilderPluginTest` (fallback используется без явного source и `fetchComponents`/`unpackComponentFiles`
      не регистрируются; explicit source не подменяется).
- [x] 3.4 Отдельный тест не нужен: `GenerateComponentsTask` не менялась, а `componentsDir` уже проверен как
      `Provider<Directory>`, указывающий на `.sdds/components` (см. 3.3) — существующий `GenerateComponentsTaskTest`
      уже покрывает генерацию из произвольной директории той же структуры.

## 4. Верификация

- [x] 4.1 `./gradlew :sdds-core:plugin_theme_builder:test` — зелёные (33 + 14 + 4 новых/затронутых теста, 0
      failures).
- [x] 4.2 `./gradlew :sdds-core:plugin_theme_builder:detekt :sdds-core:plugin_theme_builder:spotlessApply` —
      зелёные (потребовалась декомпозиция `configure()` в `registerComponentsBuilder`, чтобы не превысить
      cyclomatic complexity threshold).
- [x] 4.3 Смоук на реальных token-модулях: `tokens/sdds.serv.compose` (`targets { compose(multiplatform = true)
      }`, только Compose) — `generateComposeTheme`/`generateComposeComponents` существуют,
      `generateTheme`/`generateComponents` не затронуты. `tokens/sdds.serv.view` (только View) — симметрично
      `generateViewTheme` существует.
- [x] 4.4 Смоук: `./gradlew -p tokens/sdds.serv.compose help --task generateViewTheme` (и
      `generateViewComponents`) — `BUILD FAILED`, `Task 'generateViewTheme' not found in project
      ':sdds.serv.compose'`; симметрично `generateComposeTheme` отсутствует в `tokens/sdds.serv.view`. Именно то
      сообщение, на которое будет полагаться `doctor` в `platform-android` делегате.

## 5. Аддендум: форматирование сгенерированного кода

Добавлено по итогам ручной проверки на боевом `tokens/sdds-sbcom-compose` (тема уже мигрирована на локальный
`.sdds`, без CLI-фикстур): сырой сгенерированный код не проходил через Spotless, и каждый запуск генерации
раздувал git diff форматированием. Не было частью исходного proposal — добавлено как логичное продолжение той же
задачи (таски генерации уже существуют, форматирование их результата — соседняя забота).

- [x] 5.1 `generateTheme`/`generateComposeTheme`/`generateViewTheme`/`generateComponents`/
      `generateComposeComponents`/`generateViewComponents` — все `finalizedBy(spotlessApply)`, если такая таска
      зарегистрирована в модуле (лениво через `tasks.matching`, не падает при отсутствии Spotless).
- [x] 5.2 Дополнительно `mustRunAfter` объявлен со стороны всех `spotless*`-тасок — без этого Gradle's
      "implicit dependency" валидация падает: `spotlessKotlin` читает `src/main/kotlin` целиком (включая только
      что сгенерированные файлы) и требует явно объявленного порядка именно со стороны потребителя, `finalizedBy`
      с противоположной стороны для этой проверки не считается. Найдено и исправлено при первом же реальном
      прогоне на `sdds-sbcom-compose`.
- [x] 5.3 Тесты в `ThemeBuilderPluginTest`: `finalizedBy` есть на всех 6 generate-тасках, если `spotlessApply`
      зарегистрирован; конфигурация не падает, если его нет.
- [x] 5.4 Подтверждено на `tokens/sdds-sbcom-compose`: `generateComposeTheme` → `spotlessKotlin` →
      `spotlessKotlinApply` → `spotlessApply` в одном прогоне, `BUILD SUCCESSFUL`, diff по репозиторию сократился
      с ~90 файлов (без автоформатирования) до 2.
