## 1. Публичный API (`sdds-core:uikit-compose`)

- [x] 1.1 Добавить новый публичный enum состояния CheckBox (Off/On/Indeterminate/Error) в `CheckBox.kt`
- [x] 1.2 Добавить новые composable-перегрузки `CheckBox(...)`, принимающие новый enum, не изменяя существующие перегрузки на `ToggleableState`
- [x] 1.3 Обновить/добавить KDoc для новых перегрузок и нового enum (описание состояния Error, отметка "задаётся только программно")

## 2. Внутренняя отрисовка и анимация (`CheckBoxControl.kt`, `BaseCheckBox.kt`)

- [x] 2.1 Добавить геометрию глифа Error (две диагонали в рамке 0.3…0.71, тот же stroke width/`StrokeCap.Round`, что у галочки)
- [x] 2.2 Реализовать reveal-анимацию появления/исчезания Error через Off (переиспользовать существующий `tween(animationDuration)`)
- [x] 2.3 Реализовать кроссфейд-переход между Error и Checked/Indeterminate напрямую (минуя Off)
- [x] 2.4 Свести 4 разрозненных `when(state)`-блока (`BaseCheckBox.SideEffect`, `checkDrawFraction`, `checkCenterGravitationShiftFraction`, `IconsContent`) в единую внутреннюю таблицу состояние → { семья, геометрия, reveal-стиль }
- [x] 2.5 Убедиться, что маппинг `ValueState` (`CheckBoxStates`) в `BaseCheckBox.SideEffect` корректно добавляет `CheckBoxStates.Error` для стилей

## 3. Стили (`CheckBoxStyle.kt`)

- [x] 3.1 Добавить значение `Error` в `CheckBoxStates : ValueState`
- [x] 3.2 Завести цветовые ключи для Error (`toggleColor`, `toggleBorderColor`, `toggleIconColor`, `backgroundColor`) в `CheckBoxColorValues` с fallback-плейсхолдером `Color.Red` в `DefaultCheckBoxColorValues` (по аналогии с `Color.Green` для Checked/Indeterminate)

## 4. Кодогенерация / api-info

- [x] 4.1 Прогнать генератор api-info/themebuilder для `CheckBox` после добавления нового значения состояния, сверить сгенерированный вывод (после `spotlessApply`)
- [x] 4.2 Не трогать генерируемые per-brand файлы `tokens/*/styles/checkbox/CheckBoxStyles.kt` — донастройка цветов Error по вертикалям ведётся отдельно через `checkbox_config.json` в `theme-converter`, вне этого changes

## 5. Сэндбокс — `CheckBoxStory`

- [x] 5.1 Изменить тип поля `CheckBoxUiState.state` с `ToggleableState` на новый enum
- [x] 5.2 Обновить вызов `CheckBox(...)` в `Content()` на новую перегрузку
- [x] 5.3 Обновить click-хелпер: `Off/Indeterminate/Error → On`, `On → Off`
- [x] 5.4 Проверить, что пикер состояния в панели свойств сэндбокса пересобрался автоматически (KSP `enumProperty`) после смены типа поля
- [x] 5.5 Обновить `Preview(...)` при необходимости

## 6. Сэндбокс — `CheckBoxGroupStory`

- [x] 6.1 Обновить `CheckBoxGroupItem`/локальные типы под новый enum состояния
- [x] 6.2 Обновить `getParentState()`: приоритетная ветка `any { it.state == Error } -> Error` перед остальной логикой
- [x] 6.3 Обновить общий click-хелпер (см. 5.3) для root и child чекбоксов группы

## 7. Документация

- [x] 7.1 Добавить пример `CheckBox_Error` в `CheckBoxSamples.kt` (перегрузка на `CheckBoxValue`, состояние Error) и пример настройки цвета Error в `CheckBox_Style`
- [x] 7.2 Дополнить `CheckBoxUsage.md` (compose-template) разделом про `CheckBoxValue` и состояние Error, со ссылкой на новый сэмпл и скриншот

## 8. Тесты и валидация

- [x] 8.1 Добавить/обновить unit- или screenshot-тест на новое состояние Error в `sdds-core:uikit-compose`
- [x] 8.2 Прогнать `./gradlew :sdds-core:uikit-compose:test`
- [x] 8.3 Прогнать `./gradlew :sdds-core:uikit-compose:detekt`
- [x] 8.4 Прогнать `./gradlew :sdds-core:uikit-compose:spotlessApply`
- [x] 8.5 Собрать `integration-core:uikit-compose-fixtures` и вручную проверить новое состояние в сэндбоксе — сборка прошла успешно; визуальную проверку выполнил пользователь после перегенерации sandbox-темы (токены Error для `sandbox-compose` донастроены и подтверждены)
- [ ] 8.6 При необходимости прогнать `./gradlew testAll` для проверки отсутствия регрессов в затронутых brand-модулях (screenshot-тесты) — не запускалось в этой сессии (полный прогон долгий), рекомендуется перед мёржем/в CI
