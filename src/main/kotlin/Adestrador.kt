class Adestrador {

    var id = 545
    var nome = "Hector"
    var apelido = "Failde"
    var edade = 20
    var idFederacion = "Buzon de suicidios"

    constructor(id: Int, nome: String, apelido: String, edade: Int, idFederacion: String) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.edade = edade
        this.idFederacion = idFederacion
    }

    fun concentrarse() : Unit {}

    fun viaxar(paisDestino : String) : String = paisDestino

    fun dirixirPartido() : Unit {}

    fun dirixirAdestramento() : Unit {}

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