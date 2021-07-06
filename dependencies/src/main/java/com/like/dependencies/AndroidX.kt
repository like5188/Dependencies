package com.like.dependencies

object AndroidX {
    const val core_ktx = "androidx.core:core-ktx:1.6.0"
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val cardview = "androidx.cardview:cardview:1.0.0"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0"
    const val vectordrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
    const val activity_ktx = "androidx.activity:activity-ktx:1.2.3"
    const val fragment_ktx = "androidx.fragment:fragment-ktx:1.3.5"
    const val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
    const val paging_runtime_ktx = "androidx.paging:paging-runtime-ktx:3.0.0"

    // 调色板
    const val palette_ktx = "androidx.palette:palette-ktx:1.0.0"

    const val work_runtime_ktx = "androidx.work:work-runtime-ktx:2.5.0"

    object Lifecycle {
        private const val version = "2.3.1"

        // livedata 对协程的支持：liveData{}
        const val liveData_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"

        // Activity 或 Fragment 对协程的支持：lifecycleScope
        const val runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"

        // ViewModel 对协程的支持：viewModelScope
        const val viewModel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
    }

    object Navigation {
        private const val version = "2.3.5"
        const val fragment_ktx = "androidx.navigation:navigation-fragment-ktx:$version"
        const val ui_ktx = "androidx.navigation:navigation-ui-ktx:$version"

        // Feature module Support
        const val dynamic_features_fragment = "androidx.navigation:navigation-dynamic-features-fragment:$version"

        // Testing Navigation
        const val testing = "androidx.navigation:navigation-testing:$version"
    }

    object Room {
        private const val version = "2.3.0"
        const val ktx = "androidx.room:room-ktx:$version"
        const val compiler = "androidx.room:room-compiler:$version"
    }

    object DataStore {
        private const val version = "1.0.0-beta02"
        const val datastore = "androidx.datastore:datastore:$version"
        const val preferences = "androidx.datastore:datastore-preferences:$version"
    }

}
