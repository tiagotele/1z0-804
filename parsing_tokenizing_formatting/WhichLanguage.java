import java.util.Locale;
import java.util.ResourceBundle;

public class WhichLanguage{
	public static void main(String ... args){
		Locale locale = new Locale(args[0]);
		ResourceBundle rb = ResourceBundle.getBundle("Labels",locale);
		System.out.println(rb.getLocale());
		System.out.println(rb.keySet());
		System.out.println(rb.getString("hello"));
	}
}