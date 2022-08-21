# LevenshteinAlgorithm

Este programa calcula la distancia entre dos palabras según el mínimo número de operaciones (insertar, borrar, sustituir) que se necesitan realizar para  llegar de una palabra a la otra.  Por ejemplo, de hola a ola la distancia es de uno, ya que solo se debe de insertar una h. A este algoritmo se le conoce como Algoritmo de Levenshtein.

Para probar el algoritmo primero se utilizaron casos sencillos en los que sólo se tuviera que insertar, sustituir o borrar una vez. Asimismo, para casos más complicados, se compararon los resultados del algoritmo utilizando una matriz que mide la distancia poniendo una palabra en la primera columna y la otra en la primera fila y contando el numero de casillas que uno se tiene que mover para pasar de una palabra a otra (un salto horizontal/vertical vale uno y un salto diagonal vale cero si las letras son iguales y uno si son distintas).  
![IMG_0278](https://user-images.githubusercontent.com/98540317/185806033-a3a4ff75-ce11-4b79-ab34-00090577f74c.jpg)
