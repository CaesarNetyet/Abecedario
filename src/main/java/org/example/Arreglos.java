package org.example;


public class Arreglos {
    int n;
    char[] alfabeto = new char[30];
    int max = 29;
    int i;
    int j;

    public void mostrarAbecedario() {
        for (i = 0; i < n; i++) {
            System.out.println(alfabeto[i]);
        }
    }

    public void insertarLetra(char letra) {
        double letraAscii = asignarLetra(letra);
        if (n == max) {
            System.out.println("alfabeto lleno");
            return;
        }

        if (letraAscii == 0) {
            System.out.println("Tienes que insertar letras del abecedario");
            return;
        }

        for(i = 0; i < n; i++) {
            if (letraAscii <= asignarLetra(alfabeto[i])) break;
        }
        for (j = n; j >= i; j--) {
            alfabeto[j + 1] = alfabeto[j];
        }

        alfabeto[i] = letra;
        n++;
    }

    public char eliminarLetra(char letra) {
        i = encontrarLetra(letra);
        if (i == -1) return '$';
        char aux = alfabeto[i];
        for(j = i; j<n-1; j++){
            alfabeto[j] = alfabeto[j+1];
        }
        n--;
        return aux;
    }

    public void modificarLetra(char letraCambiar, char letraNueva) {
        i = encontrarLetra(letraCambiar);
        if (i == -1) return;
        alfabeto[i] = letraNueva;
        System.out.println("La letra " + letraCambiar + " En la posicion " + i +  " fue cambiada por " + letraNueva);
    }

    public void mostrarLetra(char letra) {
        i = encontrarLetra(letra);
        if (i == -1) return;
        System.out.println("la letra "+ alfabeto[i] + " Esta en la posicion " + i);
    }

    public int encontrarLetra(char letra) {
        if (letra < 64 || letra >= 91 && letra <=96|| letra >=123) return -1;
        for(i = n; i >=0; i--){
            if(alfabeto[i] == letra)  return i;
            if (i == 0 && alfabeto[i] != letra) {
                System.out.println("No se encontro la letra");
                return -1;
            }

        }
        return -1;
    }

    public double asignarLetra(char letra) {
        double letraAscii = (int)letra;
        if (letra < 64 || letra >= 91 && letra <=96|| letra >=123) letraAscii = 0;
        if(letraAscii >96) return letraAscii - 31.5;
        return letraAscii;
    }

}
