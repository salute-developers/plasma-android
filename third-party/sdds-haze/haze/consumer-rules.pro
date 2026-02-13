# Strip all HazeLogger calls. They shouldn't be used in release builds
-assumenosideeffects class com.sdds.haze.HazeLogger {
  public *** d(...);
  public *** getEnabled(...);
  public *** setEnabled(...);
}
