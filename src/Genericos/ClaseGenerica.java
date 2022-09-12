package Genericos;

//Tipos genericos q se pueden utilizar
//E = Element(Utilizado generalmente por el framework de Colecciones de java)
//K = Key(LLave, utilizando en mapas)
//N = Numbre(Utilizado en numeros)
//T = Type(representa un tipo, osea, una clase en si)
//V = Value(Representa un valor, tambien utilizados en mapa)
//S,U,etc(Usados para representar otros tipos)
public class ClaseGenerica<T> {

    T objeto;

    public ClaseGenerica(T objeto)
    {
        this.objeto = objeto;
    }
    
    public void obtenerTipo()
    {
        System.out.println("El tipo <T> es = " + objeto.getClass().getSimpleName());
    }
}
