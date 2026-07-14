## Context

Генератор стилей в `sdds-core/plugin_theme_builder` — единый data-driven пайплайн (пакет `internal/universal`, KotlinPoet поверх `KtFileBuilder`). Каждый `PropertyMapper` возвращает **строку** builder-call; `UniversalComposeVariationGenerator` собирает их в дерево групп и рендерит `*Styles.kt`. Плагин уже различает таргеты `VIEW_SYSTEM` / `COMPOSE` / `ALL`; текущий COMPOSE — это Android-compose.

Разведка кода уточнила исходное состояние (важно для объёма):

- `IconPropertyMapper.getTokenRef` эмитит **сырой `Int`**: `com.sdds.icons.R.drawable.ic_<name>` (подтверждено `IconPropertyMapperTest`: `startIcon(com.sdds.icons.R.drawable.ic_actions_add)`). `painterResource` в стиль не попадает — его резолвят потребляющие компоненты; импорт `painterResource` в `addCommonImports()` фактически мёртв.
- `ImageSource` уже существует в `uikit-compose/Icon.kt` как `@Stable fun interface { @Composable fun painter(): Painter }` с фабриками `resourceImageSource(@DrawableRes Int)` (Android), `imageVectorSource(ImageVector)` (мультиплатформа), `bitmapSource(ImageBitmap)`.
- Появился KMP-модуль `sdds-core/icons-compose` (пакет `com.sdds.icons.compose`): иконки — extension-property на объекте-маркере `SddsIcons`, `val SddsIcons.AddFill16: ImageVector` (обычный `ImageVector`, **не** `@Composable`, lazy). Генерируются из vector XML тулом **Valkyrie**. Собрано **4230 из 4248** drawable — ~18 не прошли (экзотика drawable). Агрегатор-списка имён в модуле нет.
- Билдеры 32 файлов стилей типизированы `Int?` + `@DrawableRes`. Их перевод на `ImageSource` идёт в **параллельной ветке** `uikit-compose` — вне скоупа этой задачи, но emit генератора обязан ей соответствовать.

## Goals / Non-Goals

**Goals:**

- Ввести суб-флаг `compose { multiplatform(true) }` и пробросить его до мапперов и `UniversalComposeVariationGenerator` без нового `ThemeBuilderTarget`.
- В CMP-режиме эмитить иконки как `imageVectorSource(SddsIcons.<Name>)` (включая stateful через `getStateTokenRef`) и шрифты как `Font(Res.font.*)` через compose-resources.
- Гарантировать пустой golden-дифф Android/View-вывода при выключенном флаге.

**Non-Goals:**

- Смена типа билдеров `Int → ImageSource` в `uikit-compose` (параллельная ветка).
- Размеры `fromResources` / адаптивность `plasma-stards` — отдельное продуктовое решение.
- Миграция самих vector XML и раскладка модулей на `commonMain`/`androidMain` (план 06).
- Мультиплатформенные вариативные шрифты (требуют CMP ≥ 1.8.x).

## Decisions

### Р1. Суб-флаг вместо нового таргета

Флаг `multiplatform: Boolean` добавляется в `ComposeConfigBuilder` и пробрасывается через `StyleGeneratorDependencies` → `UniversalComponentConfigDelegate` → `PropertyMapperRegistry` → мапперы и `UniversalComposeVariationGenerator`. Default `false`.

_Почему:_ новый `ThemeBuilderTarget` породил бы матрицу `vs/compose/cmp/all` и дублирование логики выбора таргета. Суб-флаг минимально инвазивен. _Альтернатива (отклонена):_ отдельный `ThemeBuilderTarget.CMP`.

### Р2. Иконки — `imageVectorSource(SddsIcons.<Name>)`, а не compose-resources

В CMP-режиме `IconPropertyMapper` эмитит `imageVectorSource(SddsIcons.<Name>)`; импорты собираются через `ImportCollector`.

_Почему:_ `imageVectorSource(ImageVector)` уже есть и мультиплатформенна; иконки уходят из ресурсов **в код** (Valkyrie), поэтому `org.jetbrains.compose.resources`/`Res.drawable`/миграция XML для иконок не нужны вовсе. _Альтернатива (отклонена):_ `resourceImageSource(Res.drawable.*)` через compose-resources — тянет миграцию 4248 XML и лишнюю зависимость.

### Р3. Манглинг имён — репликация правил Valkyrie (вариант A)

Идентификатор `<Name>` выводится алгоритмом (`ComposeIconName`), воспроизводящим правила Valkyrie (`ic_add_fill_16 → AddFill16`, `ic_button_2x2_top_l_fill_36 → Button2X2TopLFill36`). Это отдельная утилита именования, **не** переиспользующая существующий `PropertyMapper.toCamelCase` (у него другое правило для цифр — префикс `x`).

_Почему A:_ выбрано пользователем. _Проверено на реальном корпусе (ветка `feature/kmp-icons`):_ из 4248 drawable утилита воспроизводит **все 4230 реально сгенерированных `SddsIcons.*` байт-в-байт (0 расхождений, 0 коллизий)**. Оставшиеся 18 имён утилиты не имеют реальной иконки — это ровно те drawable, что Valkyrie не собрал (семейство `Sbboom*`/`Sbbox*`). Фрагильность варианта A снята эмпирически; риск остаётся только при будущем обновлении Valkyrie → нужна повторная сверка корпуса.

#### Р3.1. Проверка существования иконки — не делаем (решение)

Ранняя валидация (проверять `<Name>` против набора реальных `SddsIcons.*`) была реализована, но **удалена**: `availableIconNames` и бросок `ThemeBuilderException` убраны из `IconPropertyMapper`. Причины: требовала converged-classpath (перечислять basename `.kt` из `icons-compose` на стороне подключения плагина), а выигрыш — только более ранняя и внятная ошибка. Без неё отсутствие `ImageVector` проявляется как обычная ошибка компиляции CMP-кода (unresolved reference `SddsIcons.<Name>`) — приемлемо.

### Р4. Stateful-обёртка (через `getTokenRef`)

`imageVectorSource(...)` применяется в `getTokenRef`; базовый `getStateTokenRef` делегирует туда же, поэтому stateful-выражение `imageVectorSource(A).asStatefulValue(setOf(...) to imageVectorSource(B))` собирается автоматически, без отдельного override.

_Проверено по веткам:_ на `feature/plasma-7583` **`StatefulValue<ImageSource>` и `ImageSource.asStatefulValue` ОТСУТСТВУЮТ** (stateful применяется только к color/size/margin). Одновременно **ни один закоммиченный `*Styles.kt` во всех темах не использует stateful-иконку** (0 вхождений `R.drawable.*.asStatefulValue`). Вывод: stateful-иконка — требуемый (пользователь: «stateful нужен»), но пока **латентный** путь. Эмит корректен и forward-looking; для компиляции параллельная ветка должна добавить перегрузку билдера `methodName(StatefulValue<ImageSource>)` + `ImageSource.asStatefulValue`. До этого stateful-иконка в CMP-теме не появится (нет таких токенов), поэтому эмит не ломает текущую генерацию.

### Р5. Шрифты — compose-resources (вариант F1, ПРИНЯТО)

`FontTokenGenerator` в CMP-режиме эмитит `Font(Res.font.<name>)` из `org.jetbrains.compose.resources`, `FontTokens` — `@Composable`-геттеры (перегрузка `Font(FontResource)` — `@Composable`). Реализовано и покрыто string-тестом. Пакет `Res` = `<namespace>.generated.resources` (допущение; должен совпасть с `packageOfResClass` модуля токенов, план 06).

_Почему F1, а не F3:_ таргеты `addDefaultTargets()` включают **wasmJs/js**, а веб не умеет читать ресурсы синхронно → неконкретный (non-@Composable) путь F3 на вебе невозможен без embed байтов шрифта в код (~1.9MB/тема) либо fallback. compose-resources грузит асинхронно и рекомпозит — единственный путь, дающий фирменный шрифт на вебе. Цена — каскад `@Composable` (см. Р5.1).

#### Р5.1. Каскад @Composable (следствие F1)

`Font(FontResource)` — `@Composable`, поэтому `FontTokens.*` становятся `@Composable`-геттерами. Это каскадирует по цепочке потребителей (проверено на `sdds.serv.compose`):

```
FontTokens.display (@Composable get)
  → TypographySmallTokens.DisplayLNormal: TextStyle   (static val → должен стать @Composable)
    → smallSddsServTypography(): SddsServTypography    (plain fun → должен стать @Composable)
      → dynamicSddsServTypography()                    (уже @Composable ✓)
```

Значит F1 трогает **3 генератора** (`FontTokenGenerator` — сделан; `TypographyTokenGenerator` и генератор фабрик темы — стадия 4b) и делает публичный API сгенерированной темы (`<size>SddsServTypography()`) `@Composable` — ломающее изменение. Всё гейтится флагом (default off): Android-вывод не меняется.

#### Р5.2. Раскладка вывода — ответственность генератора (уточнение)

Код в модулях токенов **полностью генерируется** — значит и раскладка под CMP должна рождаться генератором/плагином под флагом, а не писаться руками. Реализовано (группа 7 в tasks):

- `.kt` → `src/commonMain/kotlin` (`CMP_OUTPUT_PATH`), ресурсы/шрифты → `src/commonMain/composeResources` (`CMP_OUTPUT_RESOURCE_PATH`); флаг проброшен в `getSourcePath`/`getResourcePath`.
- Шрифты автоматически ложатся в `commonMain/composeResources/font/` → compose-resources генерит `Res.font.*` с пакетом `<namespace>.generated.resources` (совпадает с эмитом Р5).
- Кастомная регистрация сорсетов не нужна: KMP и compose-resources сканируют `commonMain/kotlin` и `commonMain/composeResources` по умолчанию.

_Что действительно вне генератора (одноразово, на уровне модуля):_ модуль токенов применяет KMP-конвенцию (`convention.cmp-lib`: `kotlin("multiplatform")` + `org.jetbrains.compose` + таргеты) и фиксирует `packageOfResClass = <namespace>.generated.resources`. Это применение Gradle-плагинов, а не генерируемый код. После этого цепационная верификация возможна.

### Р6. Условные ресурсные импорты

`addCommonImports()` в CMP-режиме не добавляет `painterResource` (мёртвый) и не выполняет ветку `fromResources` (`dimensionResource`/`R`/`LocalDensity`).

### Р7. Двойная генерация на переходный период

Android-compose и CMP-вывод генерируются параллельно (разные выходные директории), чтобы текущие потребители Android-артефактов не ломались.

## Risks / Trade-offs

- **Расхождение манглинга при апдейте Valkyrie** → без ранней валидации (Р3.1) рассинхрон проявится как ошибка компиляции CMP-темы (unresolved reference); митигируется повторной сверкой корпуса при обновлении Valkyrie.
- **~18 иконок без `ImageVector`** (Valkyrie не собрал) → в токенах не используются; если появится ссылка — это ошибка компиляции с именем недостающего `SddsIcons.<Name>`.
- **Зависимость от параллельной ветки билдеров** (`ImageSource`, `StatefulValue<ImageSource>`) → снята: на смердженном дереве билдеры уже типизированы `ImageSource`, CMP-emit компилируется (см. пилот).
- **`@Composable`-геттеры шрифтов меняют структуру `FontTokens`** → покрыть юнит-тестами `FontTokenGenerator`; проверить, что Android-вывод при флаге off не изменился.
- **Вариативные шрифты недоступны на 1.7.3** → гейт по версии; потребителей `variableFonts` сейчас нет, в пилот не берём.
- **Лишняя зависимость compose-resources ради шрифтов** → приемлемо; альтернатива (`FontSource` + expect/actual) отложена, т.к. под капотом всё равно упирается в compose-resources.

## Migration Plan

1. Добавить флаг и проброс (Р1), default `false` — поведение не меняется.
2. Реализовать CMP-ветку `IconPropertyMapper` + `getStateTokenRef` (Р2–Р4) и утилиту манглинга.
3. Реализовать CMP-ветку `FontTokenGenerator` (Р5) и условные импорты (Р6).
4. Включить двойную генерацию (Р7) на пилотной теме.
5. Верификация: golden-дифф Android/View при off (пусто); компиляция CMP-пилота в `commonMain` (после параллельной ветки); скриншот-паритет Android; юнит-тесты мапперов.

_Rollback:_ выключение флага (`multiplatform(false)`) полностью возвращает прежнее поведение; CMP-ветки не задействуются.

_Документация:_ добавить KDoc к новому DSL-методу `compose { multiplatform(...) }` (публичный API Gradle-плагина).

_Валидация (команды):_ `:sdds-core:plugin_theme_builder:test`, `:sdds-core:plugin_theme_builder:detekt`, `:sdds-core:plugin_theme_builder:spotlessApply`; для регресса тем — прогон генерации + `testAll`/golden-дифф по затронутым модулям токенов.

### Стык с параллельными ветками (проверено)

- **`feature/plasma-7583`** (частичный перевод uikit на KMP): `uikit-compose` → `commonMain`; `ImageSource`/`imageVectorSource(ImageVector): ImageSource` (`@Composable`) есть. Билдеры стилей получили **новое свойство** `<name>Source: ImageSource?` + перегрузку метода `<name>(ImageSource)`; старое `<name>: Int?` помечено `@Deprecated`. Метод билдера сохранил **прежнее имя** → эмит `methodName(imageVectorSource(...))` попадает в ImageSource-перегрузку, **если** api-info (`ComponentMeta.methodName`) указывает на неё. Это зона ответственности параллельной ветки (`@ApiInfo` на нужной перегрузке).
- **`feature/kmp-icons`**: модуль `icons-compose` (`convention.cmp-lib`, `commonMain`, `explicitApi`), объект `SddsIcons`, иконки — `public val SddsIcons.<Name>: ImageVector by lazy` (обычный `ImageVector`, не `@Composable`). Закоммичены как `.kt` (Valkyrie в CI).
- **Ветки НЕ сведены:** на `plasma-7583` модули токенов зависят от старого `icons.sdds.icons` (drawable R), не от `icons-compose`. Для компиляции CMP-вывода модуль токенов должен получить на classpath **одновременно** `uikit-compose` (из 7583, ImageSource-билдеры) и `icons-compose` (из kmp-icons, `SddsIcons.*`). Это интеграционная предпосылка верификации, не правка генератора.

## Open Questions

- **api-info на ImageSource-перегрузке**: убедиться, что `ComponentMeta.methodName` в параллельной ветке указывает на `methodName(ImageSource)`, а не на deprecated `methodName(Int)`.
- **`StatefulValue<ImageSource>`**: отсутствует на `plasma-7583`; нужен для компиляции stateful-иконок (сейчас латентны — 0 токенов). Добавить перегрузку при появлении первого stateful-иконочного токена.
- **Пилотная тема** для первой CMP-генерации (не `plasma-stards` — у неё `fromResources`).
- **Шрифты/`Res`-пакет** — определяется планом 06 (compose-resources в модулях токенов).
