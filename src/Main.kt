import kotlin.random.Random

fun main()
{
    val random= Random
    val Personaje  = Bob(random.nextInt(3),0,random.nextInt(5))
    val minando= Mina()
    Personaje.Datos()

    for(num in 1..50)
    {   //Comprueba cuanto oro tenemos si es menor a 3 se puede trabajar
        if(Personaje.Gold<3)
        {
            Personaje.Gold=(minando.ConOro(Personaje.Gold))
            Personaje.Sed=(minando.ConSed(Personaje.Sed))
            Personaje.Fatiga=(minando.ConFatiga(Personaje.Fatiga))
            println("Recolectando una pepita de oro. Oro actual: ${Personaje.Gold}")
            Thread.sleep(1000)
        }//Si es mayor a 3 se va a guardarlo al banco
        else
        {
            println("Me voy de la mina de oro con mis bolsillos llenos.")
            println("Voy para el banco, sí señor.")
            Personaje.Gold=(minando.ConOro(Personaje.Gold))
            println("Minero Bob: Depositando el oro en el banco. Total de oro ahorrado: ${minando.total} ")
            Thread.sleep(1000)
        }

        // Comprueba si tiene sed
        if (Personaje.Sed >= 5) {
            println("Minero Bob: Hombre, estoy sediento. Me dirijo a la taberna.")
            Thread.sleep(1000)
            Personaje.Sed = (minando.ConSed(Personaje.Sed))
            println("Minero Bob: Oh! Esto sí que está muy bueno, ha calmado mi sed.")
            //Se revisa de nuevo la fatifa
            if (Personaje.Fatiga >= 10) {
                Personaje.Fatiga = (minando.ConFatiga(Personaje.Fatiga))
                println("Minero Bob: Me siento muy cansado. Iré a descansar.")
                Thread.sleep(1000)
                println("Minero Bob: De camino a mi hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Zzzzz...")
                Thread.sleep(1000)
                println("Ahhh mi fatiga ahora es de ${Personaje.Fatiga}")
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }else{
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }
            //Si esta fatigado
            if (Personaje.Fatiga>=10)
            {
                Personaje.Fatiga=(minando.ConFatiga(Personaje.Fatiga))
                println("Minero Bob: Me siento muy cansado. Iré a descansar.")
                Thread.sleep(1000)
                println("Minero Bob: De camino a mi hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Hogar dulce hogar.")
                Thread.sleep(1000)
                println("Minero Bob: Zzzzz...")
                Thread.sleep(1000)
                println("Minero Bob: De regreso a la mina.")
                Thread.sleep(1000)
            }

        }

    }

}