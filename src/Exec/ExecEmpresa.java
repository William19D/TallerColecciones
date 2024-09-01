package Exec;

import Library.Request;
import Objects.Empresa;
import Objects.Producto;

public class ExecEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarProducto(new Producto("001", "Pan", 1.50));
        empresa.agregarProducto(new Producto("002", "Croissant", 2.00));
        empresa.agregarProducto(new Producto("003", "Donut", 1.75));

        String codigo = "002";
        Producto producto = empresa.buscarPorCodigo(codigo);

        if (producto != null) {
            Request.showMessage("Producto encontrado: " + producto);
        } else {
            Request.showMessage("Producto con código " + codigo + " no encontrado.");
        }
    }
}
