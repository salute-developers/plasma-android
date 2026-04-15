import utils.withVersionCatalogs

plugins {
    id("convention.android-lib")
}

android {
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
            all {
                it.systemProperty("moduleDir", projectDir.absolutePath)
            }
        }
    }
    tasks.withType<Test> {
        maxHeapSize = "4096m"
    }
}

withVersionCatalogs {
    dependencies {
        add("testImplementation", "integration-core:uikit-testcases")
        add("testImplementation", base.test.unit.jUnit)
        add("testImplementation", test.roborazzi)
        add("testImplementation", test.roborazzi.rule)
        add("testImplementation", base.test.unit.robolectric)
    }
}
