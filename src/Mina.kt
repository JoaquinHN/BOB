open class Mina {


    var Bank= Banco()
    var Casa= Hogar()
    var Tonio = Taberna()
    var total=0

    open fun ConOro(OroActual: Int): Int {
        return if (OroActual < 3) {
            val oro = OroActual
            oro + 1
        } else {
            total = Bank.BancoOro(OroActual)
            0
        }
    }
        open fun ConSed(Sed: Int): Int {
            return if (Sed < 5) {
                val sed = Sed
                sed + 1
            } else {
                Tonio.taberna(Sed)

            }
        }
    open fun ConFatiga(Fatiga: Int):Int
    {
        return if(Fatiga<10) {
            val fatiga=Fatiga
            fatiga+2
        } else {
            Casa.descanzar(Fatiga)
        }
    }


    }





}