package com.like.dependencies

object ThirdPart {
    object Like {
        const val Common = "com.github.like5188:Common:6.6.5"
        const val Paging = "com.github.like5188:Paging:0.0.2"
        const val Banner = "com.github.like5188:Banner:2.0.4"
        const val Dependencies = "com.github.like5188:Dependencies:0.1.8"

        object Component {
            private const val version = "2.0.2"
            const val component = "com.github.like5188.Component:component:$version"
            const val component_plugin = "com.github.like5188.Component:component-plugin:$version"
        }

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
    const val LoadingButton = "com.github.FlodCoding:LoadingButton:1.1.0-alpha01"
    const val PhotoView = "com.github.chrisbanes:PhotoView:2.3.0"
    const val PageTransformerHelp = "com.github.OCNYang:PageTransformerHelp:v1.0.1"
    const val Java_WebSocket = "org.java-websocket:Java-WebSocket:1.5.1"
    const val toast = "com.github.getActivity:ToastUtils:9.2"
    const val pictureselector = "io.github.lucksiege:pictureselector:v2.7.3-rc03"

    // 日期时间格式化工具
    const val joda = "net.danlew:android.joda:2.10.9.1"

    // 选择器
    const val Android_PickerView = "com.contrarywind:Android-PickerView:4.1.9"

    // 手写签名
    const val signature_pad = "com.github.gcacace:signature-pad:1.3.1"

    // VideoView视频边播放边缓存
    const val videocache = "com.danikula:videocache:2.7.1"

    // pdf浏览器
    const val pdfviewpager = "es.voghdev.pdfviewpager:library:1.1.2"

    // 汉字转拼音
    object Tinypinyin {
        const val tinypinyin = "com.github.promeg:tinypinyin:2.0.3"

        // 可选，适用于Android的中国地区词典
        const val lexicons_android_cncity = "com.github.promeg:tinypinyin-lexicons-android-cncity:2.0.3"

        // 可选，适用于Java的中国地区词典
        const val lexicons_java_cncity = "com.github.promeg:tinypinyin-lexicons-java-cncity:2.0.3"
    }

    object Scanner {
        const val Scanner = "com.shouzhong:Scanner:1.1.3"

        // zxing
        const val zxing = "com.google.zxing:core:3.3.3"

        // zbar
        const val ScannerZBarLib = "com.shouzhong:ScannerZBarLib:1.0.0"

        // 银行卡识别
        const val ScannerBankCardLib = "com.shouzhong:ScannerBankCardLib:1.0.3"

        // 身份证识别
        const val ScannerIdCardLib = "com.shouzhong:ScannerIdCardLib:1.0.4"

        // 车牌识别
        const val ScannerLicensePlateLib = "com.shouzhong:ScannerLicensePlateLib:1.0.3"

        // 图片文字识别
        const val ScannerTextLib = "com.shouzhong:ScannerTextLib:1.0.0"

        // 黄图识别
        const val ScannerNsfwLib = "com.shouzhong:ScannerNsfwLib:1.0.0"

        // 驾驶证识别
        const val ScannerDrivingLicenseLib = "com.shouzhong:ScannerDrivingLicenseLib:1.0.1"

        // 身份证识别（第二种方式）
        const val ScannerIdCard2Lib = "com.shouzhong:ScannerIdCard2Lib:1.0.0"
    }

    // coil图片加载库
    object Coil {
        private const val version = "1.2.2"
        const val coil = "io.coil-kt:coil:$version"
        const val gif = "io.coil-kt:coil-gif:$version"
        const val svg = "io.coil-kt:coil-svg:$version"
        const val video = "io.coil-kt:coil-video:$version"
    }

    // koin依赖注入库。如果升级到2.2.2版本，那么此库引入的androidx.activity:activity库会和activity-ktx冲突
    const val koin_androidx_viewmodel = "org.koin:koin-androidx-viewmodel:2.2.2"
}
