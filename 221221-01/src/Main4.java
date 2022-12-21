import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\dooli.bin");
		
		// 바이트 단위로 입출력
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
			dos.writeUTF("둘리");
			dos.writeInt(22);
			dos.writeDouble(180.3);
			dos.writeUTF("호잇");
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 2진 데이터로 기록
		try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			String hobby = dis.readUTF();
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(hobby);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
