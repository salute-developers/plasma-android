## 0. Подготовка рабочего дерева

- [x] 0.1 Удалить экспериментальное значение `WheelAlignment.MixedCentered` из `sdds-core/uikit-compose/.../Wheel.kt` (не реализовано, нет в BCV-бейзлайне)
- [x] 0.2 Ревью прочих незакоммиченных правок — закрыто автором: подмена source theme-converter в `ThemeBuilderPlugin.kt` откачена; `tokens/plasma.homeds.compose/.../wheel/WheelStyles.kt` — не ручная правка, а легитимная перегенерация `dsBuilder` с обновлённым theme-converter (в генерации появился `.widthMode(WheelWidthMode.CenterContent)` у CenterAlign — сквозная проверка пайплайна); `wheelConstraints = Loose` из `WheelStory.kt` убран. Примечание: при откате `WheelStory.kt` изменения change'а (поле `widthMode`) были случайно удалены — восстановлены, unused-import вычищен, компиляция подтверждена

## 1. Публичный API — sdds-core/uikit-compose

- [x] 1.1 Добавить `enum class WheelWidthMode { Auto, Equal, CenterContent }` в `Wheel.kt` с KDoc (правило `Auto`: `Mixed → CenterContent`, иначе `Equal`)
- [x] 1.2 Добавить `val widthMode: WheelWidthMode` в интерфейс `WheelStyle` с KDoc
- [x] 1.3 Добавить `fun widthMode(widthMode: WheelWidthMode): WheelStyleBuilder` в `WheelStyleBuilder` с KDoc
- [x] 1.4 Реализовать в `DefaultWheelStyle` + `Builder` (nullable-поле, `apply`-метод); дефолт в `style()`: `widthMode ?: WheelWidthMode.Auto`
- [x] 1.5 Добавить параметр `widthMode: WheelWidthMode = style.widthMode` в `Wheel(...)` после `alignment`, обновить KDoc параметра
- [x] 1.6 Добавить `internal fun WheelWidthMode.resolveFor(alignment: WheelAlignment): WheelWidthMode`; вычислить `effectiveWidthMode` в `Wheel()` один раз до measure
- [x] 1.7 Заменить в `WheelLayout` параметр `alignment` на разрешённый `widthMode` для ширины; `shouldStretchWheel(widthMode, wheelIndex, wheelCount)` → `internal`, использовать `widthMode != CenterContent || wheelIndex == 0 || wheelIndex == wheelCount - 1`
- [x] 1.8 Убедиться, что `getBaseWheelAlignment` не читает `widthMode` (выравнивание — только `alignment`)
- [x] 1.9 Обновить KDoc `WheelAlignment` (enum описывает только выравнивание контента; ссылка на [WheelWidthMode]); уточнить KDoc `wheelConstraints` (взаимодействие с `CenterContent`: `Strict` ограничивает компактное колесо 1/N)

## 2. BCV — sdds-core/uikit-compose

- [x] 2.1 Обновить бейзлайн: `apiDump` сгенерировал корректные записи, но полный дамп включил чужие незафиксированные API (Avatar motion, Note и др. — коммитнутый код старше закоммиченных бейзлайнов); по конвенции repo оставлены только wheel-правки: вручную внесены в `api/uikit-compose.api`, `api/android/uikit-compose.api`, `api/jvm/uikit-compose.api` (символ-в-символ с дампом)
- [x] 2.2 `apiCheck`: расхождений по wheel нет; падение apiCheck вызвано исключительно pre-existing устареванием бейзлайнов чужими изменениями (Note/Avatar/OverlayHost) — относилось к HEAD до этого change, CI задачу apiCheck не гейтит

## 3. Модульные тесты — sdds-core/uikit-compose

- [x] 3.1 Создать `src/androidUnitTest/kotlin/com/sdds/compose/uikit/WheelWidthModeTest.kt` (чистый JUnit4 по образцу `BaseWheelLoopingTest`): таблица резолва `resolveFor` (Auto×Mixed/Center/Start, Equal×Mixed, CenterContent×Center)
- [x] 3.2 В тех же тестах покрыть `shouldStretchWheel`: CenterContent×{count=1 → всё stretch; count=2 → оба stretch; count=3 → stretch {0,2}; count=4 → stretch {0,3}}, Equal → stretch всегда

## 4. Фикстуры и песочница — integration-core

- [x] 4.1 `uikit-compose-testcases/WheelTestCases.kt`: новый кейс `WheelCenterAlignCenterContentWidthMode` (`fillMaxWidth`, `wheelCount = 3`, `alignment = Center`, `widthMode = CenterContent`, `wheelSeparator = Dots`) — целевое макетное состояние
- [x] 4.2 `uikit-compose-fixtures/.../wheel/WheelSamples.kt`: doc-сэмпл `Wheel_CenteredContentWidthMode` (`@DocSample(needScreenshot = true)`, три колеса «часы/минуты/секунды», `Modifier.fillMaxWidth()` обязателен для применения режима ширины)
- [x] 4.3 `uikit-compose-fixtures/.../wheel/WheelStory.kt`: поле `widthMode` в `WheelUiState` (дефолт `Auto` сохраняет поведение всех вариантов) + проброс в `WheelContent`. Отклонение: контрол `alignment` НЕ добавлен — sandbox-ksp не поддерживает nullable-enum (`enumProperty`/`valueOf` в генераторе), а явный `alignment` перезаписал бы выравнивание варианта из стиля; alignment в песочнице управляется выбором варианта стиля

## 5. Документация

- [x] 5.1 `build-system/docs-template/compose-template/docs/components/WheelUsage.md`: переписан раздел `### WheelAlignment` (только выравнивание контента; формулировка Mixed синхронизирована с KDoc — в доке были перепутаны лево/право), добавлен раздел `### WheelWidthMode`
- [x] 5.2 Добавлена секция сэмпла `Wheel_CenteredContentWidthMode` в `WheelUsage.md` (формат `@sample`/`@screenshot`)
- [x] 5.3 KDoc-и из п.1.1/1.5/1.9 синхронизированы с доком; обновлён также KDoc `WheelConstraints` и док-раздел про него (View-шаблон `xml-template/.../WheelUsage.md` не менялся — View-стек вне скоупа)

## 6. Скриншотные тесты — tokens

- [x] 6.1 `tokens/plasma.homeds.compose/.../ComposeWheelScreenshotTest.kt`: добавлен тест-метод `testWheelCenterAlignCenterContentWidthMode` (стиль `Wheel.H1.CenterAlign`)
- [x] 6.2 `tokens/plasma-stards-compose/.../ComposeWheelScreenshotTest.kt`: добавлен аналогичный тест-метод
- [x] 6.3 Рекординг золотых PNG и проверки: `plasma.homeds.compose` — записано и проверено автором (новые `testWheelCenterAlignCenterContentWidthMode_{dark,light}.png`; перезапись `testWheelCountTwoTADescriptionDivider_*` ожидаема — перегенерация изменила H4); `plasma-stards-compose` — `testWheelCenterAlignCenterContentWidthMode_dark.png` записан автором
- [x] 6.4 (Внешняя задача) theme-converter: binding/значения `widthMode` + вариации в `wheel_config.json` брендов, bump `components-version` — сделано автором; подтверждено перегенерацией: в `WheelStyles.kt` генерируется `.widthMode(WheelWidthMode.CenterContent)`
