package com.like.dependencies

object ThirdPart {
    object Like {
        const val common = "com.github.like5188:Common:6.6.5"
        const val paging = "com.github.like5188:Paging:0.0.2"
        const val banner = "com.github.like5188:Banner:2.0.4"

        object WebViewComponent {
            private const val version = "1.0.3"
            const val service = "com.github.like5188.WebViewComponent:service:$version"
            const val component = "com.github.like5188.WebViewComponent:component:$version"
        }

        object RecyclerView {
            private const val version = "0.2.7"
            const val core = "com.github.like5188.RecyclerView:core:$version"
            const val ext = "com.github.like5188.RecyclerView:ext:$version"
            const val ui = "com.github.like5188.RecyclerView:ui:$version"
        }

        object Retrofit {
            private const val version = "0.2.1"
            const val core = "com.github.like5188.Retrofit:core:$version"
            const val common = "com.github.like5188.Retrofit:common:$version"
            const val download = "com.github.like5188.Retrofit:download:$version"
            const val upload = "com.github.like5188.Retrofit:upload:$version"
        }

        object LiveDataBus {
            private const val version = "2.1.9"
            const val livedatabus = "com.github.like5188.LiveDataBus:livedatabus:$version"
            const val annotations = "com.github.like5188.LiveDataBus:livedatabus_annotations:$version"
            const val compiler = "com.github.like5188.LiveDataBus:livedatabus_compiler:$version"
        }
    }

    object AndroidSkinSupport {
        private const val version = "4.0.5"
        const val support = "skin.support:skin-support:$version"
        const val appcompat = "skin.support:skin-support-appcompat:$version"
        const val design = "skin.support:skin-support-design:$version"
        const val cardview = "skin.support:skin-support-cardview:$version"
        const val constraint_layout = "skin.support:skin-support-constraint-layout:$version"
    }

    object AMap {
        const val location = "com.amap.api:location:5.3.1"
        const val search = "com.amap.api:search:7.9.0"
    }

    const val javapoet = "com.squareup:javapoet:1.13.0"
    const val leakcanary_android = "com.squareup.leakcanary:leakcanary-android:2.7"
    const val android_gif_drawable = "pl.droidsonroids.gif:android-gif-drawable:1.2.23"
    const val loadingButton = "com.github.FlodCoding:LoadingButton:1.1.0-alpha01"
    const val photoView = "com.github.chrisbanes:PhotoView:2.3.0"
    const val pageTransformerHelp = "com.github.OCNYang:PageTransformerHelp:v1.0.1"
    const val java_WebSocket = "org.java-websocket:Java-WebSocket:1.5.2"
    const val toast = "com.github.getActivity:ToastUtils:9.5"
    const val pictureselector = "io.github.lucksiege:pictureselector:v2.7.3-rc03"

    // 日期时间格式化工具
    const val joda = "net.danlew:android.joda:2.10.9.1"

    // 选择器
    const val android_PickerView = "com.contrarywind:Android-PickerView:4.1.9"

    // 手写签名
    const val signature_pad = "com.github.gcacace:signature-pad:1.3.1"

    // VideoView 视频边播放边缓存
    const val videocache = "com.danikula:videocache:2.7.1"

    // pdf 浏览器
    const val pdfviewpager = "es.voghdev.pdfviewpager:library:1.1.3"

    // 汉字转拼音
    object Tinypinyin {
        private const val version = "3.0.0"
        const val tinypinyin = "com.github.promeg:tinypinyin:${version}"

        // 可选，适用于Android的中国地区词典
        const val lexicons_android_cncity = "com.github.promeg:tinypinyin-lexicons-android-cncity:${version}"

        // 可选，适用于Java的中国地区词典
        const val lexicons_java_cncity = "com.github.promeg:tinypinyin-lexicons-java-cncity:${version}"
    }

    // 扫描识别
    object Scanner {
        const val scanner = "com.shouzhong:Scanner:1.1.3"

        // zbar
        const val zBarLib = "com.shouzhong:ScannerZBarLib:1.0.0"

        // 银行卡识别
        const val bankCardLib = "com.shouzhong:ScannerBankCardLib:1.0.3"

        // 身份证识别
        const val idCardLib = "com.shouzhong:ScannerIdCardLib:1.0.4"

        // 车牌识别
        const val licensePlateLib = "com.shouzhong:ScannerLicensePlateLib:1.0.3"

        // 图片文字识别
        const val textLib = "com.shouzhong:ScannerTextLib:1.0.0"

        // 黄图识别
        const val nsfwLib = "com.shouzhong:ScannerNsfwLib:1.0.0"

        // 驾驶证识别
        const val drivingLicenseLib = "com.shouzhong:ScannerDrivingLicenseLib:1.0.1"

        // 身份证识别（第二种方式）
        const val idCard2Lib = "com.shouzhong:ScannerIdCard2Lib:1.0.0"
    }

    // coil 图片加载库
    object Coil {
        private const val version = "1.2.2"
        const val coil = "io.coil-kt:coil:$version"
        const val gif = "io.coil-kt:coil-gif:$version"
        const val svg = "io.coil-kt:coil-svg:$version"
        const val video = "io.coil-kt:coil-video:$version"
    }

    // koin 依赖注入库。如果升级到 2.2.2 版本，那么此库引入的 androidx.activity:activity 库会和 activity-ktx 冲突
    const val koin_androidx_viewmodel = "org.koin:koin-androidx-viewmodel:2.2.2"

    // 通过标签直接生成 shape，无需再写 shape.xml
    const val backgroundLibrary = "com.github.JavaNoober.BackgroundLibrary:libraryx:1.7.2"

    // ViewPager 指示器
    const val viewpager_magicIndicator = "com.github.hackware1993:MagicIndicator:1.7.0"

    // lottie
    const val lottie = "com.airbnb.android:lottie:3.7.0"
}
