object Versions {
  const val androidGradlePlugin = "3.5.0"
  const val kotlin = "1.3.50"
  const val appcompat = "1.1.0"
  const val coreKtx = "1.1.0"
  const val constraintLayout = "1.1.3"
  const val material = "1.0.0"
  const val viewModel = "2.0.1"
  const val testRunner = "1.2.0"
  const val espressoCore = "3.2.0"
  const val testRules = "1.2.0"
  const val mockk = "1.9.3"
  const val kakao = "2.1.0"
  const val detekt = "1.0.1"
  const val junit = "5.5.2"
  const val assertJ = "3.13.2"
}

object GradlePlugins {
  const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
  const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detekt}"
}

object Libs {
  const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
  const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
  const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
  const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
  const val material = "com.google.android.material:material:${Versions.material}"
  const val viewModel = "org.koin:koin-android-viewmodel:${Versions.viewModel}"
  const val testRunner = "androidx.test:runner:${Versions.testRunner}"
  const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
  const val testRules = "androidx.test:rules:${Versions.testRules}"
  const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
  const val kakao = "com.agoda.kakao:kakao:${Versions.kakao}"
  const val detektApi = "io.gitlab.arturbosch.detekt:detekt-api:${Versions.detekt}"
  const val detektTest = "io.gitlab.arturbosch.detekt:detekt-test:${Versions.detekt}"
  const val junitApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junit}"
  const val junitParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junit}"
  const val assertJ = "org.assertj:assertj-core:${Versions.assertJ}"
  const val junitEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit}"
}