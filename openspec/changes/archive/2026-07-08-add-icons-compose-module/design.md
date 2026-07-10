## Context

XML-иконки приходят в этот репозиторий уже сгенерированными: workflow `generate-icons.yml` чекаутит `salute-developers/plasma`, запускает `npm run generate:android` (получая `android-icons/*.xml`) и копирует их в `sdds-core/icons/src/main/res/drawable/`. Сам android-репозиторий SVG→XML не конвертирует.

Для Compose Multiplatform нужен набор чистых `ImageVector` без android-ресурсов. Инфраструктура KMP уже есть: `convention.cmp-lib`, `utils.addDefaultTargets()` (сейчас `jvm()` + `androidTarget()`), рабочий образец — `third-party/sdds-haze/haze`. Конвертацию XML→`ImageVector` делает Valkyrie CLI (`svgxml2imagevector`).

Замеры (ресёрч): генерация ~4200 `.kt` за ~2 с; компиляция kotlinc по одному JVM-таргету ~24 с при heap 12g, OOM при 4g. Память — реальное ограничение. Установлено также, что Valkyrie падает на 6 парах имён, схлопывающихся на case-insensitive ФС (macOS/Windows).

## Goals / Non-Goals

**Goals:**
- Новый модуль `sdds-core:icons-compose` (KMP, по образцу `haze`), публикуемый как `sdds-icons-compose` со своей версией.
- Генерация Compose-иконок из общего с XML-модулем `android-icons/*.xml` через Valkyrie, формат `lazy-property`, плоские имена с суффиксом размера.
- Расширение единого `generate-icons.yml`: шаг Valkyrie + отсев коллизий + второй bump + общий PR.
- Детерминированный отсев 6 коллизирующих `ic_sbboom_*` **только для Compose-набора**.
- Настройка heap в CI, чтобы сборка не падала по OOM.

**Non-Goals:**
- Не меняем XML-модуль `sdds-core:icons` и его drawable — полная обратная совместимость.
- Не чиним корень проблемы имён в plasma (`sber→Sb`) — это отдельный issue в web/design.
- Не включаем сейчас iOS/macOS/wasm/js таргеты — оставляем `jvm + android`, как в текущем `addDefaultTargets()`; расширение таргетов — отдельное решение.
- Не вводим nested packs / группировку по размеру — плоские имена (см. ресёрч 7B).

## Decisions

### Решение 1: Один workflow, а не два
Расширяем `generate-icons.yml`. Оба модуля генерируются из одного и того же `android-icons/*.xml` одного прогона → физический паритет наборов, дорогие шаги (checkout plasma + npm ci + generate) выполняются один раз, релиз атомарен (один PR).
Ветка и PR общие, но изменения разнесены по отдельным коммитам на модуль: отдельный commit на bump `icons`, на bump `icons-compose`, на xml-иконки `icons` и на compose-иконки `icons-compose` (свои conventional-commit-скоупы). Это даёт чистую историю и раздельный ревью каждого модуля без потери атомарности релиза (всё в одном PR).
*Альтернатива:* второй workflow — отклонена: два независимых триггера могут стриггериться на разных `plasma-ref` и наборы разъедутся.

### Решение 2: Источник для Valkyrie — сгенерированный XML, не SVG
Valkyrie конвертирует тот же `android-icons/*.xml`, что уходит в XML-модуль.
*Альтернатива:* брать SVG из `src/scalable/Icon.svg.{16,24,36}` — отклонена: два независимых конвейера конвертации могут дать расхождения геометрии; XML уже нормализован plasma.

### Решение 3: Формат `lazy-property` + плоские имена с суффиксом размера
`val SddsIcons.Accessibility24: ImageVector by lazy(...)`. Совпадает 1:1 с XML-неймингом (`ic_accessibility_24`), все размеры одной иконки идут подряд в автокомплите, один прогон Valkyrie без раскладки по подпапкам. Технической выгоды от nested packs нет (file-per-icon + top-level extensions, лимита 64K методов нет — см. ресёрч 7B).

### Решение 4: Отсев коллизий — «оставить первый, убрать второй», только для Compose
По требованию: из каждой из 6 пар оставляем `ic_sb_boom_*` (литеральный `Sb`), удаляем `ic_sbboom_*` (бывший `Sber`) **перед** вызовом Valkyrie. XML-набор не трогаем.
6 пар (ключ = lowercase без подчёркиваний):
```
sbboomcast              keep ic_sb_boom_cast_*            drop ic_sbboom_cast_*
sbboomerror             keep ic_sb_boom_error_*           drop ic_sbboom_error_*
sbboomminicastoutline   keep ic_sb_boom_mini_cast_outline_*   drop ic_sbboom_mini_cast_outline_*
sbboomminierrorfill     keep ic_sb_boom_mini_error_fill_*     drop ic_sbboom_mini_error_fill_*
sbboomminierroroutline  keep ic_sb_boom_mini_error_outline_*  drop ic_sbboom_mini_error_outline_*
sbboxtopoutline         keep ic_sb_box_top_outline_*      drop ic_sbbox_top_outline_*
```
Реализация: детерминированный шаг в CI на копии входа, только на ветке Compose-генерации. Отсев ведётся по ТОЧНОМУ списку из 6 «стволов» имён (для каждого размера 16/24/36), а НЕ по glob-префиксу — важная ловушка: `ic_sbboom_*` не покрывает `ic_sbbox_top_outline` (там `sbbox`, а не `sbboom`), а слишком широкий `ic_sbbo*` рискует зацепить лишнее. Точный drop-список (× {16,24,36}):
```
ic_sbboom_cast_<size>.xml
ic_sbboom_error_<size>.xml
ic_sbboom_mini_cast_outline_<size>.xml
ic_sbboom_mini_error_fill_<size>.xml
ic_sbboom_mini_error_outline_<size>.xml
ic_sbbox_top_outline_<size>.xml
```
Список стабилен и захардкожен — публичные имена оставшихся иконок не меняются между прогонами.
*Альтернатива A (фикс в plasma):* корневое решение, но требует координации с web/design — выносим в отдельный issue, пайплайн им не блокируется.
*Альтернатива B (пре-переименование в уникальные токены):* сохранило бы оба глифа, но добавляет 6 «искусственных» публичных имён; пользователь сознательно выбрал более простой отсев.

### Решение 5: Объект-приёмник `SddsIcons`
Valkyrie ссылается на существующий объект-пак (`--iconpack-name SddsIcons`). Заводим `public object SddsIcons` в `commonMain` (вручную или подкомандой `iconpack`); генерируемые файлы вешают на него extension-property.

### Решение 6: Настройка heap в CI
Поднять `org.gradle.jvmargs=-Xmx8g` и `kotlin.daemon.jvmargs=-Xmx8g` (или выше) для сборки модуля. Без этого компиляция ~4000 файлов падает по OOM (подтверждено замером: OOM при 4g уже на 2000 файлах).

## Risks / Trade-offs

- **Потеря 6 глифов в Compose-наборе** (5 `sbboom*` + 1 `sbbox_top_outline`) → По требованию tradeoff принят; XML-набор их сохраняет. Зафиксировать в CHANGELOG/README модуля, что эти 6 иконок в Compose отсутствуют; issue в plasma на корневой фикс `sber→Sb` (вариант A) для будущего возврата.
- **Расхождение отсева и реального ввода plasma** (plasma переименует/добавит иконки, захардкоженный список устареет) → Отсев по паттерну + fail-fast: если Valkyrie всё же падает на новой коллизии, прогон должен явно упасть, а не молча пропустить; список коллизий ревьюится при обновлении.
- **OOM при росте набора** → heap с запасом; мониторить время/память сборки; при включении новых KMP-таргетов пересчитать.
- **Стоимость сборки крупного модуля (минуты, ×кол-во таргетов)** → иконки меняются редко, инкрементально почти бесплатно за счёт кэша; ограничиваемся `jvm + android` пока не нужны другие таргеты.
- **KDoc/документация** → Публичный `object SddsIcons` и артефакт `sdds-icons-compose` — новый публичный API; добавить KDoc к `SddsIcons` и README модуля с описанием набора и отсутствующих 6 иконок.

## Migration Plan

1. Завести issue в plasma на корневой фикс имён `sber→Sb` (вариант A) — не блокирует остальное.
2. Создать модуль `sdds-core:icons-compose` (build.gradle.kts, gradle.properties, `gradle/icons-compose.version.toml`), подключить в `sdds-core/settings.gradle.kts`, добавить `object SddsIcons`.
3. Замерить реальную Gradle-сборку `:sdds-core:icons-compose:assemble` (CI-точная цифра), настроить heap.
4. Расширить `generate-icons.yml`: установка Valkyrie (release binary, фикс версии), отсев 6 пар, шаг `svgxml2imagevector`, второй bump, раздельные коммиты по модулям (bump + иконки на каждый модуль), общий PR.
5. Валидация: `./gradlew :sdds-core:icons-compose:assemble`, `:detekt`, `:spotlessApply`; при инфраструктурных правках — `./gradlew detektAll spotlessApplyAll`.

**Rollback:** удаление модуля и шага Valkyrie из workflow; XML-модуль не затронут, откат изолирован.

## Open Questions

- Точный набор KMP-таргетов на первый релиз (`jvm + android` достаточно или сразу iOS?).
- Способ установки Valkyrie в CI (brew/release binary/jar) и пиннинг версии.
- Нужен ли скриншот/паритет-тест «XML vs Compose» хотя бы для sample-подмножества.
