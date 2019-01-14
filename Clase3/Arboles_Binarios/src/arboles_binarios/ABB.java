package arboles_binarios;

public class ABB {

    Nodo raiz;

    public ABB() {
        this.raiz = null;
    }

    public void Insertar(int _info) {
        Nodo nuevo = new Nodo(_info);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo padre = null;
            Nodo actual = raiz;
            while (actual != null) {
                if (actual.info > _info) {
                    actual = actual.izq;
                } else {
                    actual = actual.der;
                }
            }
            if (padre.info > _info) {
                padre.izq = nuevo;
            } else {
                padre.der = nuevo;
            }
        }
    }

    public void Eliminar(int elem) {
        Nodo Padre = raiz;
        Nodo aux = raiz;
        boolean hijoIzq = true;
        boolean encontrado = false;
        while (aux != null) {
            if (aux.info == elem) {
                encontrado = true;
                if (aux == raiz) {
                    if (raiz.izq == null) {
                        raiz = raiz.der;
                    } else {
                        if (raiz.der == null) {
                            raiz = raiz.izq;
                        } else{
                            Reemplazar(raiz);
                        }
                    }
                }
            }
        }
    }
    /*if (actual == null) {
            System.out.println("No existe");
        } else {
            if (actual.info < _info) {
                Eliminar(actual.der, _info);
            } else {
                if (actual.info > _info) {
                    Eliminar(actual.izq, _info);
                } else {
                    Nodo aux = actual;
                    if (aux.izq == null) {
                        actual = aux.der;
                    } else {
                        if (aux.der == null) {
                            actual = aux.izq;
                        } else {
                            Reemplazar(aux);
                        }
                    }
                }
            }*/
// }
//delete(aux); En java no es necesario hacer esto porque Java hace un barrido o limpieza al ejecutar.
//]

    public void Reemplazar(Nodo ac) { // mètodo para el arbol izquierdo de encntrar el mayor de los menores y el derecho el menor de los mayores.
        Nodo p = ac, a = ac.izq;
        while (a.der != null) {
            p = a;
            a = a.der;
        }
        ac.info = a.info;
        if (ac == p) {
            ac.izq = a.izq;
        } else {
            p.der = a.izq;
            ac = a;
        }
    }
}
