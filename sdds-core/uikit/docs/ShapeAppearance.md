# Package com.sdds.uikit

## ShapeAppearance

Компоннеты SDDS UI Kit поддерживают разные формы скругления углов. Для задания скругления  
через атрибуты необходимо воспользоваться sd_shapeAppearance и sd_shapeAppearanceAdjustment.

Для конфигурирования формы компонентов предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_shapeAppearance|форма скругления|reference|
|sd_shapeAppearanceAdjustment|попрака к скруглению|dimension|
|sd_strokeWidth|по краю формы компонента возможно установить рамку (бордер), параметр устанавливает толщину бордера|float, fraction, dimension|
|sd_strokeColor|цвет бордера|reference, color|
|sd_shapeColorAnimationEnabled|если фон компонента зависит от состояния (state), то смена цвета фона будет анимирована|boolean|

### sd_shapeAppearance

Если компонент поодерживает скругления, значения атрибутов будут учтены. sd_shapeAppearance -  
по сути является ссылкой на стиль, заложенный в теме конкретной библиотеки. В этом стиле  
содержится значение скргуления в виде атрибута corner_size(sd_cornerSize), например, в  
библиотеке Serv.Sdds значение атрибута sd_shapeAppearance равное ?serv_shapeRoundL  
(знак ? оначает, что значение необходимо искать в теме) будет содержать ссылку на стиль  
@style/Serv.Sdds.Shape.Round.L, который,в свою очередь  содержит атрибут sd_cornerSize = 16dp.
Таким образом радиус скругления равный 16dp будет применен ко всем углам компонента.
Для получения скругления угла 50% - исполльзуйте ?sd_shapeAppearanceCircle.

### sd_shapeAppearanceAdjustment

Предназначен для корректировки значения sd_cornerSize в sd_shapeAppearance. Необходимость этой  
корректировки возникает из за того, что ряд стилей для размеров ограничен: Xxl, Xl, L, M, S, Xs, Xxs.  
Соответственно повляется возможность получить нужное значение sd_cornerSize, указав значение
sd_shapeAppearanceAdjustment. Поддерживаютя положителные и отрицательные значения.  

В xml

```kotlin
<com.sdds.uikit.Button
    app:sd_shapeAppearance="?serv_shapeRoundL"
    app:sd_shapeAppearanceAdjustment="2dp"
    android:text="LabeL"
    app:sd_value="Value"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

При конфигурировании стиля

```kotlin
<resources>
    <style name="CustomButton" parent="Sdds.Components.Button">
        <item name="sd_disabledAlpha">0.4</item>
        <item name="backgroundTint">@color/serv_basic_button_bg_color</item>
        <item name="android:textColor">@color/serv_basic_button_text_color</item>
        <item name="sd_valueTextColor">@color/serv_basic_button_value_color</item>
        <item name="sd_iconTint">@color/serv_basic_button_icon_tint</item>
        <item name="sd_iconTint">@color/serv_basic_button_icon_tint</item>
        <item name="sd_shapeAppearance">?serv_shapeRoundL</item>
        <item name="sd_shapeAppearanceAdjustment">2dp</item>
        ....
    </style>
<resources>
```
