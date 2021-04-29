fun main(args: Array<String>) {
    val xogador = Xogador(545, "Juan", "Madres", 20, 5, "Defensa")
    val adestrador = Adestrador(444, "Javier", "Lopez", 40, "Receptor de porculeros")
    val xogador2 : Seleccion = Xogador(546, "Marcos", "Madres", 20, 6, "Centro")

    xogador.concentrarse(5, 10)
    xogador.viaxar("Españita")
    adestrador.concentrarse(8, 10)
    adestrador.viaxar("Brasil")
    xogador2.concentrarse(4, 10)
    xogador2.viaxar("Rusia Comunista")
    xogador.getDorsal()
    xogador2.entrenar()
}