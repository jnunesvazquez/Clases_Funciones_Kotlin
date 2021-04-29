class Xogador {

    var id = 545
    var nome = "David"
    var apelido = "Mariño"
    var edade = 20
    var dorsal = 10
    var demarcacion = "Rompepiernas"

    constructor(id: Int, nome: String, apelido: String, edade: Int, dorsal: Int, demarcacion: String) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    fun concentrarse(tiempoDescanso : Int, tiempoEntreno : Int) : Int = tiempoEntreno + tiempoDescanso

    fun viaxar(nombrePais : String) : String = nombrePais

    fun xogarPartido() : Unit {}

    fun entrenar() : Unit {}

    @JvmName("getId1")
    fun getId() : Int = id

    @JvmName("setId1")
    fun setId(id: Int) : Unit {
        this.id = id;
    }

    @JvmName("getNome1")
    fun getNome() : String = nome

    @JvmName("setNome1")
    fun setNome(nome: String) : Unit {
        this.nome = nome;
    }

    @JvmName("getApelido1")
    fun getApelido() : String = apelido

    @JvmName("setApelido1")
    fun setApelido(apelido: String) : Unit {
        this.apelido = apelido;
    }

    @JvmName("getEdade1")
    fun getEdade() : Int = edade

    @JvmName("setEdade1")
    fun setEdade(edade: Int) : Unit {
        this.edade = edade;
    }

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