package com.example.common.content

object PagePath {
    object AppPage {
        const val JAVA_MAIN_PAGE = "/app/module/main/page"
    }

    object ModuleJavaPage {
        const val MAIN_PAGE = "/java/module/main/page"
    }

    object ModuleKotlinPage {
        const val MAIN_PAGE = "/kotlin/module/main/page"
        const val TEST_PAGE = "/kotlin/module/test/page"
        const val FUNCTION_PAGE = "/kotlin/module/function/page"
    }

    object ModuleFunctionPage {
        const val MAIN_PAGE = "/function/module/main/page"
        const val WEATHER_PAGE = "/function/module/weather/page"
    }

    object ModuleCommonPage {
        const val TEST_PAGE = "/common/module/test/page"
    }

    object ModuleMainPage {
        const val WELCOME_PAGE = "/main/module/welcome/page"
        const val HOME_PAGE = "/main/module/home/page"
    }
}