import utils.withVersionCatalogs

plugins {
    id("convention.android-lib")
}

android {
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
    tasks.withType<Test> {
        maxHeapSize = "4096m"
    }
}

withVersionCatalogs {
    dependencies {
        add("testImplementation", base.test.unit.jUnit)
        add("testImplementation", test.roborazzi)
        add("testImplementation", test.roborazzi.rule)
        add("testImplementation", base.test.unit.robolectric)
        add("testImplementation", "sdds-core:testing")
    }
}
