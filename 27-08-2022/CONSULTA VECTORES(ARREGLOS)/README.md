# VECTORES O ARREGLOS EN JAVA

# ¿Qué son?

Un arreglo en Java es una colección de valores del mismo tipo, en la cual se pueden almacenar valores de tipo primitivo o referencias a objetos.
Java trata los arreglos como objetos, por lo que su sintaxis de declaración y creación no difiere mucho de lo habitual.

//Declaración de un arreglo
int[] numeros = null;

Como cualquier variable de referencia es recomendable inicializar a null. Para crear un arreglo debemos utilizar el operador de instanciacion new en la sentencia, indicando el tamaño del arreglo entre corchetes con un número entero positivo o a través de la evaluación de una expresión.

//Creación de un arreglo tamaño 5

numeros = new int[5];

//Creación de arreglo mediante el

//resultado de una expresión

int y=5,x=2;

numeros = new int[y*x];

Tras ejecutarse estas sentencias el compilador reserva espacio de memoria para un objeto de arreglo de enteros, el cual es referenciado por la variable numeros, todos sus índices son inicializados a 0 que es el valor por defecto para los enteros. Lo habitual es muchas veces realizar la declaración y la creación de un arreglo en una sola sentencia.

int[] numeros = new int[5];

Para inicializar un arreglo con determinados valores, se deben indicar entre llaves separados por comas

int[] numeros = {7,20,34,2,43};

El compilador calcula el tamaño del arreglo conforme al número de valores que indiquemos entre llaves. La sentencia de inicialización de un arreglo también puede incluir expresiones de cálculo o de conversión de tipos permitidos por el compilador

//inicialización con expresión de cálculo

int[] numeros ={7,10+10,12*2};

//inicialización con expresiones de conversión

int[] numeros = {7,((int)32,9),(Integer.valueOf("34"))};

La iteración de arreglos es realizada mediante construcciones del lenguaje, donde las más comúnmente usadas son for y foreach.

//Iteración mediante sentencia for

for(int i = 0;i < numeros.length;i++)

{

System.out.println(numeros[i]);

}

//Iteración mediante sentencia foreach

for(int i : numeros)

System.out.println(i);

El acceso a los valores de un arreglo se realiza colocando entre corchetes el subíndice indicado.

Todo objeto de tipo arreglo tiene una propiedad llamada length, que es una variable final que almacena el tamaño del arreglo al momento de crearse o inicializarse, al ser final hace que el arreglo no pueda modificar su tamaño una vez creado.

# CLONACIÓN DE ARREGLOS
Para realizar una copia exacta de los valores de un arreglo en otro existe una manera sencilla de hacerlo. Al igual que en las demás clases, el tipo arreglo hereda de la clase Object que contiene el método clone. Un tipo arreglo sobrescribe el método clone que hereda de Object al implementar la interfaz Cloneable teniendo su propia versión del mismo.

int[] numeros = {23,7,40,21,5};

//Clonación del arreglo numeros

int[] copiaNumeros = numeros.clone();

# ARREGLOS DE REFERENCIA A OBJETOS
Los arreglos pueden almacenar en sus valores referencias a objetos, el uso de este tipo de arreglos tiene una cierta diferencia del tipo primitivo en sus elementos que veremos a continuación. Ejemplo:

public class Ejemplo{

public static void main(String args[]) {

//Declaración y creación de un arreglo de referencias de tipo Empleado

Empleado[] empleados = new Empleado[4];

//LLamada a método para instanciar las referencias a la clase Empleado

instanciarArreglo(empleados);

empleados[0].setNombre("Luis");

empleados[1].setNombre("Alexis");

empleados[2].setNombre("Ana");

empleados[3].setNombre("Carlos");


for(Empleado emp: empleados){

System.out.println(emp);

}


}

//Método estático que instancia cada referencia a la clase Empleado contenida en el arreglo empleados

private static void instanciarArreglo(Empleado[] emp){

for(int i = 0; i < emp.length;i++)

{

emp[i] = new Empleado();

}

//Muestra que las referencias que apuntan a objetos se pasan por valor a los métodos

emp = new Empleado[7];

}

public class Empleado{


private String nombre = null;


public void setNombre(String nombre)

{

this.nombre = nombre;

}


public String getNombre()

{

return this.nombre;

}

}

La salida del código anterior es:

Luis

Alexis

Ana

Carlos