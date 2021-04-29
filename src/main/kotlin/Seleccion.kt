open abstract class Seleccion {

    var id = 545
    var nome = "David"
    var apelido = "Mariño"
    var edade = 20

    constructor(id: Int, nome: String, apelido: String, edade: Int) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
    }

    abstract fun concentrarse(tiempoDescanso : Int, tiempoEntreno : Int) : Int

    abstract fun viaxar(nombrePais : String) : String

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
}