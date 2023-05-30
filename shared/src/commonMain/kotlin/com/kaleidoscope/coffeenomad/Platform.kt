package com.kaleidoscope.coffeenomad

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform