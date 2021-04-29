class Xogador : Seleccion{

    var dorsal = 10
    var demarcacion = "Rompepiernas"

    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) : super(
        id,
        nome,
        apelido,
        edade
    ) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    override fun concentrarse(tiempoDescanso : Int, tiempoEntreno : Int) : Int {
        println("Concentrase a selección e o tempo")
        return tiempoEntreno + tiempoDescanso
    }

    override fun viaxar(nombrePais : String) : String {
        println("Viaxan o xogadores")
        return nombrePais
    }

    fun xogarPartido() : Unit {}

    fun entrenar() : Unit {}

    @JvmName("getDorsal1")
    fun getDorsal() : Int = dorsal

    @JvmName("setDorsal1")
    fun setDorsal(dorsal: Int) : Unit {
        this.dorsal = dorsal;
    }

    @JvmName("getDemarcacion1")
    fun getDemarcacion() : String = demarcacion

    @JvmName("setDemarcacion1")
    fun setDemarcacion(demarcacion: String) : Unit {
        this.demarcacion = demarcacion;
    }

    override fun toString(): String {
        return "Xogador(id=$id, nome='$nome', apelido='$apelido', edade=$edade, dorsal=$dorsal, demarcacion='$demarcacion')"
    }
}