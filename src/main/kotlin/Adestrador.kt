class Adestrador : Seleccion{

    var idFederacion = "Buzon de suicidios"

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.idFederacion = idFederacion
    }

    override fun concentrarse(tiempoDescanso : Int, tiempoEntreno : Int) : Int{
        println("Concentrase a selección e o tempo")
        return tiempoEntreno + tiempoDescanso
    }

    override fun viaxar(paisDestino : String) : String {
        println("Viaxa o adestrador")
        return paisDestino
    }

    fun dirixirPartido() : Unit {}

    fun dirixirAdestramento() : Unit {}

    @JvmName("getIdFederacion1")
    fun getIdFederacion() : String = idFederacion

    @JvmName("setIdFederacion1")
    fun setIdFederacion(idFederacion: String) : Unit {
        this.idFederacion = idFederacion;
    }

    override fun toString(): String {
        return "Adestrador(id=$id, nome='$nome', apelido='$apelido', edade=$edade, idFederacion='$idFederacion')"
    }
}