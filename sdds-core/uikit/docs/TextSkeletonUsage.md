# Package com.sdds.uikit

## TextSkeleton

Компонент представляет из себя контейнер (вертикальный LinearLayout),  
в котором может отображаться указанное количество строк-заглушек с анимированным мерцанием,  
представленных компонентом ShimmerLayout, поверх которых возможно наложение текста.  
Высота строк и оступы между строками высчитываются на основе переданного стиля текста.  
Ширина строк настраивается провайдером SkeletonLineWidthProvider и может быть двух видов -  
на всю ширину контейнера или с учетом псевдо отклонения от ширины (имитируется неравномерность, как при написании текста).

```kotlin
<com.sdds.uikit.TextSkeleton
    style="@style/Serv.Sdds.Components.TextSkeleton"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:textAppearance="@style/Serv.Sdds.TextAppearance.BodyMNormal"
    app:sd_autoStart="true"
    app:sd_lineCount="4"/>
```

## Стиль TextSkeleton

Существует набор сгенерированных стилей. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгененрированного стиля, необходимо через атрибут style указатать стиль из библиотеки (пример выше).  
По скольку в основе TextSkeleton лежит ShimmerLayout - атрибуты ShimmerLayout так же доступны для конфигурирования.  
Для настройки стиля TextSkeleton в формате xml предусмотрены следующие атрибуты:

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_shimmer|drawable для отрисоки шиммера|reference|
|sd_shimmerDuration|время движения шиммера - скорочть анимации|integer|
|sd_autoStart|анимация запускается сама, автоматически|boolean|
|sd_lineCount|количество строк-заглушек (ShimmerLayout)|integer|
|android:textAppearance|стиль текста, на основе которого будет вычислена высота строки и оступ между строками|reference|

Для настройки и корректировки формы скругления используйте [sd_shapeAppearance](./ShapeAppearance.md#sd_shapeappearance).  

Для использования совместно с текстом - необходимо в контейнере (ViewGroup), например FrameLayout, разместить  
TextSkeleton и TextView, задав им один и тот же стиль текста.  

*style - ресурс оверлэй стиля TextSkeleton  
*textStyle - ресурс стиля textAppearance

```kotlin
val skeletonView = TextSkeleton(ContextThemeWrapper(context, style))
    .apply {
        id = R.id.text_skeleton
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        setTextAppearance(textStyle)
        lineCount = 4
        lineWidthProvider = SkeletonLineWidthProvider.RandomDeviation()
    }
val textView = TextView(context)
    .apply {
        id = R.id.text_over_skeleton
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        setTextAppearance(textStyle)
        maxLines = 4
        text = "some text"
    }
val skeletonWithText = FrameLayout(context).apply {
    layoutParams = ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT,
    )
    addView(textView)
    addView(skeletonView)
}
```
