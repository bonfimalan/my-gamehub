package br.com.bonfimalan.mygamehub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform