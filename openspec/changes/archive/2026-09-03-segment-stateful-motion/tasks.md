## 1. Stateful-стили — sdds-core:uikit-compose

- [x] 1.1 Добавить новые свойства формы, фона и семи размеров в SegmentStyle/SegmentColors/SegmentDimensions по таблице design.md; сохранить численные и цветовые defaults.
- [x] 1.2 Добавить новые свойства формы, двух текстовых стилей, пяти Brush-цветов и девяти размеров SegmentItem; сохранить counterStyle и disabledAlpha.
- [x] 1.3 Сохранить старые свойства с deprecated/ReplaceWith, реализовать совместимые getters и перегрузки builder-ов для обычных/stateful-значений; сохранить состояния InteractiveColor и описанный fallback для градиентов.
- [x] 1.4 Сохранить ApiInfo и маппинги ApiName iconMargin/counterMargin у новых перегрузок, обновить KDoc новых свойств и builder-контрактов.

## 2. Публичный Motion API — sdds-core:uikit-compose

- [x] 2.1 Добавить SegmentMotionStyle, builder, LocalSegmentMotionStyle и rememberSegmentMotion для фона и всех семи размерных свойств с noMotion defaults.
- [x] 2.2 Добавить SegmentItemMotionStyle на основе CommonButtonMotionStyle, конкретный builder, LocalSegmentItemMotionStyle и rememberSegmentItemMotion; покрыть пять цветов, два текстовых стиля и девять размеров с noMotion defaults.
- [x] 2.3 Добавить KDoc Motion API и CompositionLocal: источники контекста, отсутствие анимации по умолчанию, переключение формы без интерполяции.

## 3. Отрисовка и совместимость — sdds-core:uikit-compose

- [x] 3.1 Добавить перегрузки SegmentHorizontal/SegmentVertical с обязательным Motion; направить старые вызовы в общий путь, сохранив interactionSource и порядок/defaults параметров.
- [x] 3.2 Перевести контейнер на stateful-фон, форму и все размеры; сохранить stretch, hasBackground, ориентацию/отступы разделителей, нормализацию Dp.Unspecified и независимость контекстов дочерних элементов.
- [x] 3.3 Добавить Motion-аналоги трёх форм SegmentItem; сохранить старые overload-ы с делегированием и исходными interactionSource/semanticStateSource.
- [x] 3.4 Перевести текст, фон, tint слотов и все размеры SegmentItem на полный MotionContext и соответствующие MotionProperty; использовать LocalTintBrushProducer, согласованную форму фона/focus selector и отдельные размеры start/end во всех перегрузках.
- [x] 3.5 Адаптировать внутренний ButtonText для разрешённого Dp-margin и сохранить прежний StatefulValue-overload с чтением semanticStateSource; подключить SegmentItemMotionStyle.valueMargin.
- [x] 3.6 Передать встроенному Counter общий MotionContext элемента при собственном CounterMotionStyle; сохранить selected, приоритет endIcon, отсутствие пустого Counter и прежнее поведение enabled/clickable.

## 4. Метаданные и генерация — sdds-core, integration-core, tokens

- [x] 4.1 Выполнить `./gradlew :sdds-core:uikit-compose:kspCommonMainKotlinMetadata`; проверить полноту stateful-перегрузок, типы Brush/Dp/TextStyle/формы и aliases iconMargin/counterMargin в метаданных.
- [x] 4.2 Проверить штатную генерацию Segment/SegmentItem на конфигурации со stateful-размерами, формой, типографикой, градиентом и комбинированными состояниями; при найденной несовместимости внести минимальное исправление и целевой тест генератора.
- [x] 4.3 Проверить сборку старых сгенерированных стилей; выполнить необходимую регенерацию затронутых Compose-стилей в tokens и sandbox-compose существующими задачами dsBuilder с текущими версиями источников, проверить diff без ручной правки generated-файлов.

## 5. Целевые тесты — sdds-core:uikit-compose и integration-core:uikit-compose-testcases

- [x] 5.1 Проверить старые вызовы обеих ориентаций Segment и трёх форм SegmentItem, обычные builder-вызовы и legacy-getters; проверить сохранение default/selected/комбинированных цветов и однозначность новых overload-ов.
- [x] 5.2 Добавить сценарии selected, selected+pressed/focused, снятия selected и смены стиля при сохранённом Motion; проверить независимость соседних элементов, синхронизацию встроенного Counter и stateful valueMargin без SelectInteraction.
- [x] 5.3 Добавить управляемые по времени проверки noMotion/CompositionLocal и явных переходов фона, tint, типографики и размеров, включая gap контейнера и valueMargin элемента; проверить достижение целевых значений.
- [x] 5.4 Добавить регрессионные сценарии разных start/end размеров в Painter- и slot-overload-ах, градиентного Brush, формы focus selector, disabled, stretch/hasBackground, разделителей и неопределённых размеров.
- [x] 5.5 Проверить представительный Button с value через изменённый общий ButtonText, включая статический margin и semantic selected; убедиться в сохранении раскладки.

## 6. Примеры и документация — integration-core, build-system

- [x] 6.1 Добавить компилируемые примеры в uikit-compose-fixtures для Segment и SegmentItem: StatefulValue, явный MotionStyle, selected и общий interactionSource для clickable; показать Counter в контексте элемента.
- [x] 6.2 Обновить SegmentUsage.md/SegmentItemUsage.md в compose-template: публичный API, миграция со старых свойств, noMotion defaults, ограничения legacy Color для градиентов и отсутствие плавной анимации формы; проверить ссылки на примеры и полноту KDoc компонентов.

## 7. Сборка и приёмка — затронутые included builds

- [x] 7.1 Уточнить реальные задачи через `./gradlew :sdds-core:uikit-compose:tasks --all` и `./gradlew :tokens:sdds.serv.compose:tasks --all`; выполнить `./gradlew :sdds-core:uikit-compose:compileKotlinJvm :sdds-core:uikit-compose:compileDebugKotlinAndroid` либо их реальные target-specific эквиваленты и записать результаты.
- [x] 7.2 Выполнить `./gradlew :sdds-core:uikit-compose:testDebugUnitTest :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessCheck` и целевые новые тесты в модуле, где они размещены; при правках plugin_theme_builder также выполнить `./gradlew :sdds-core:plugin_theme_builder:test`.
- [x] 7.3 Обновить декларации API штатной задачей `./gradlew :sdds-core:uikit-compose:apiDump`, проверить diff на сохранность старых сигнатур и выполнить `./gradlew :sdds-core:uikit-compose:apiCheck`.
- [x] 7.4 Выполнить `./gradlew :integration-core:uikit-compose-fixtures:compileKotlinJvm :integration-core:uikit-compose-testcases:compileDebugKotlin` и `./gradlew :tokens:sdds.serv.compose:compileKotlinJvm :tokens:sdds.serv.compose:compileDebugKotlinAndroid`; собрать также остальные действительно затронутые потребители и проверить форматирование изменённых модулей.
- [x] 7.5 Сверить все подключённые Compose-библиотеки в `tokens/settings.gradle.kts` и выполнить полный набор `verifyRoborazziDebug` из design.md для plasma.giga.compose, plasma.sd.service.compose, plasma.homeds.compose, sdds.serv.compose, plasma-stards-compose, sdds-sbcom-compose, sdds-finai-compose и новых подключённых Compose-библиотек; использовать `--continue`, не ограничивать запуск фильтром Segment или списком изменённых модулей. Для release-workflow выполнить полный набор verifyRoborazziRelease.
- [x] 7.6 Проверить отчёты полного прогона по каждой Compose-библиотеке: количество выполненных/пропущенных/упавших тестов, все предусмотренные темы/конфигурации, пути к результатам и diff; явно отметить отсутствие тестов, NO-SOURCE или блокировки окружения без объявления таких проверок успешными.
- [x] 7.7 Разобрать все визуальные расхождения полного прогона, включая остальные компоненты, до обновления эталонов; исправить регрессии, повторить затронутые проверки и зафиксировать итоговые результаты без необъяснённых падений.
