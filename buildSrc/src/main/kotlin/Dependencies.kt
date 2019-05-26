object Versions {
    const val androidx = "1.0.0"
    const val androidxAppCompat = "1.1.0-alpha05"
    const val androidxLifecycleExtensions = "2.2.0-alpha01"
    const val constraintLayout = "2.0.0-beta1"
    const val espresso = "3.1.0"
    const val glide = "4.9.0"
    const val gradlePlugin = "3.5.0-beta02"
    const val gson = "2.8.5"
    const val jUnit = "4.12"
    const val kotlin = "1.3.31"
    const val kotlinxCoroutines = "1.2.1"
    const val ktxLifecycleExtensions = "2.2.0-alpha01"
    const val markwon = "3.0.1"
    const val materialComponents = "1.1.0-alpha06"
    const val okHttp = "3.14.1"
    const val retrofit = "2.6.0-SNAPSHOT"
    const val room = "2.1.0-alpha04"
    const val testRunner = "1.1.0"
    const val timber = "4.7.1"
}

object Dep {
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxBrowser = "androidx.browser:browser:${Versions.androidx}"
    const val androidxLifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidxLifecycleExtensions}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideProcessor = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val ktxLifecycleExtensions = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ktxLifecycleExtensions}"
    const val markwonCore = "ru.noties.markwon:core:${Versions.markwon}"
    const val markwonImageOkhttp = "ru.noties.markwon:image-okhttp:${Versions.markwon}"
    const val markwonRecycler = "ru.noties.markwon:recycler:${Versions.markwon}"
    const val markwonStrikethrough = "ru.noties.markwon:ext-strikethrough:${Versions.markwon}"
    const val materialComponents = "com.google.android.material:material:${Versions.materialComponents}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCoroutines = "androidx.room:room-coroutines:${Versions.room}"
    const val roomProcessor = "androidx.room:room-compiler:${Versions.room}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
}
