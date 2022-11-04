package com.pacesettertechnology.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform