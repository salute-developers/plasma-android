import android.app.Application
import android.content.pm.ActivityInfo
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import org.junit.Rule
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.robolectric.Shadows.shadowOf

class RoborazziConfig {

    /**
     * Объект RoborazziOptions для захвата и сравнения изображений
     * recordOptions задает параметры для захвата
     * compareOptions задает погрешность сравнения
     **/
    @OptIn(ExperimentalRoborazziApi::class)
    val roborazziOptions = RoborazziOptions(
        recordOptions = RoborazziOptions.RecordOptions(
            resizeScale = 0.5,
        ),
        compareOptions = RoborazziOptions.CompareOptions(
            changeThreshold = 0.01f,
        ),
    )

    /**
     * Правило для регистрации Activity до запуска тестов
     */
    @get:Rule(order = 0)
    val addActivityToRobolectricRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            super.starting(description)
            val appContext: Application = ApplicationProvider.getApplicationContext()
            val activityInfo = ActivityInfo().apply {
                name = ComponentActivity::class.java.name
                packageName = appContext.packageName
            }
            shadowOf(appContext.packageManager).addOrUpdateActivity(activityInfo)
        }
    }

    @get:Rule(order = 1)
    val composeRule = createComposeRule()
}
