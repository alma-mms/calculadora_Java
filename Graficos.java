import javax.swing.JOptionPane;

public class Graficos {
    public static void main(String[] args) {
        // Crear un mensaje para el usuario donde indicamos que introduzca un numero
        String n1 = JOptionPane.showInputDialog("Introduce el primer numero");
        String n2 = JOptionPane.showInputDialog("Introduce un segundo numero");

        // Convertir el dato de tipo string a double utilizando parseDouble
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        // Crear objeto de tipo operaciones
        Operaciones op = new Operaciones();

        double suma = op.sumar(num1, num2);
        double resta = op.restar(num1, num2);
        double multiplicacion = op.multiplicar(num1, num2);
        double division = op.dividir(num1, num2);

        // Crear cuadro de dialogo para imprimir los resultados de las operaciones
        // utilizando JOptionPane

        JOptionPane.showMessageDialog(null, "Suma: " + suma);
        JOptionPane.showMessageDialog(null, "Resta: " + resta);
        JOptionPane.showMessageDialog(null, "Multiplicacion: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "Division: " + division);

    }

}
