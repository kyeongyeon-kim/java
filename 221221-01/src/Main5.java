import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main5 {
	public static void main(String[] args) {
		Person p = new Person("둘리", 22, 108.3, "호잇");
		
		File file = new File("d:\\myfolder\\person.ser");
		
		// 직렬화 가능한 객체여야 한다.( 시리얼라이저블 인터페이스 구현)
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(p);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			// 다운캐스팅 필요
			Person read = (Person) ois.readObject();
			System.out.println(read);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
