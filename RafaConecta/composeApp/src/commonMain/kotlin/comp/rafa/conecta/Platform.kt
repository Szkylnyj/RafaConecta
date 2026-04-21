package comp.rafa.conecta

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform