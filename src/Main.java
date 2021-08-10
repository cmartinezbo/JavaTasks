
public class Main {
    public static void main(String[] args) {

        var miGestion = new Gestion();
        miGestion.procesarComando();
    }
}

/*
todo: Inicializacion(): Inicializa las variables relacionada al array ó list tipo Persona.

todo: AgregarPersona(Persona persona): recibe como parámetro un objeto tipo persona y lo adiciona al array ó list tipo persona.

todo: ListarPersona(): debe recorrer el array ó list tipo Persona y mostrar los registros con el toString().

done: ProcesarComando(): debe poder realizar la lectura desde consola con la siguiente estructura:
 -> opción&tipoPersona&nombre&identificación&teléfono&dirección&elemento
 */