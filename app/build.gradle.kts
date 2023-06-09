plugins {
    id("starter.android.application")
    id("starter.android.application.compose")
    id("starter.android.hilt")
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":base"))
    implementation(project(":test-shared"))
    implementation(libs.androidx.core)
    implementation(libs.androidx.appcompat)
    implementation(libs.android.material)
    implementation(libs.androidx.constraintLayout)
    implementation(libs.bundles.retrofit)
    implementation(libs.timber)
    implementation(libs.bundles.room)
    kapt(libs.room.compiler)
    implementation(libs.accompanist.pager)
    implementation(libs.accompanist.pager.indicator)
    implementation(libs.startup)
    implementation(libs.androidx.paging.runtime)
}