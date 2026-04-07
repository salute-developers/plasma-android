import utils.withVersionCatalogs

plugins {
    id("convention.testing")
}

withVersionCatalogs {
    dependencies {
        add("testImplementation", "integration-core:uikit-compose-testcases")
        add("testImplementation", base.test.ui.compose.jUnit4)
        add("testImplementation", test.roborazzi.compose)
    }
}
