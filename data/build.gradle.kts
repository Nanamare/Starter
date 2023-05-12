plugins {
    id("starter.android.library")
    id("kotlinx-serialization")
}

android {
    defaultConfig {
        buildConfigField("String", "BASE_URL", "\"https://mock.codes\"")
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":test-shared"))
    implementation(libs.bundles.retrofit)
    implementation(libs.coroutine)
    implementation(libs.bundles.room)
    kapt(libs.room.compiler)
}