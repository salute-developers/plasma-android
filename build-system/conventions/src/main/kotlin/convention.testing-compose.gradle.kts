import utils.withVersionCatalogs

plugins {
    id("convention.testing")
}

withVersionCatalogs {
    dependencies {
        add("testImplementation", base.test.ui.compose.jUnit4)
        add("testImplementation", test.roborazzi.compose)
    }
}
