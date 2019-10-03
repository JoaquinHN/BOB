class Banco {
    var Oro =0
    open fun BancoOro (Ahorro: Int): Int{
        var OroActual= Ahorro
        Oro+= OroActual
        return Oro
    }
}