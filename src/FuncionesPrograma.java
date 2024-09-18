import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class FuncionesPrograma {

    public static String getFechaString(Date fecha) {
        if (fecha == null) {
            return "";
        }

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        return formato.format(fecha);
    }

    public static Date getFechaDate(int dia, int mes, int anio){
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio,mes-1,dia);
        return calendar.getTime();
    }
}