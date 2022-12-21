import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

// 국가정보 읽어오기.
// 첫번째 줄은 건너뛰어야함
// 자료인 두번째줄 부터 끝까지 한 행씩 국가정보를 읽어와야함.

// 1. 자료 읽기 확인해보기

// 2. 데이터로 활용가능한 형 변환
// 3. 국가들의 인구 합

class CountryData {
	private String code;
	private String country;
	private int area;
	private String capital;
	private int population;

	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return "CountryData [code=" + code + ", country=" + country + ", area=" + area + ", capital=" + capital
				+ ", population=" + population + "]";
	}

	public CountryData(String code, String country, int area, String capital, int population) {
		super();
		this.code = code;
		this.country = country;
		this.area = area;
		this.capital = capital;
		this.population = population;
	}
}

public class Main2 extends JFrame {
	public static void main(String[] args) {
		File file = new File("D:\\myfolder\\country.csv");
		StringBuilder sb = new StringBuilder();
		List<CountryData> countryInfo = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = null;
			String[] data = null;
			br.readLine();
			while ((line = br.readLine()) != null) {
				data = line.split(",");
				System.out.println(Arrays.toString(data));
				CountryData cd = new CountryData(data[0], data[1], Integer.valueOf(data[2]), data[3],
						Integer.valueOf(data[4]));
				countryInfo.add(cd);
			}
			int sum = 0;
			for (int i = 0; i < countryInfo.size(); i++) {
				int pop = countryInfo.get(i).getPopulation();
				sum += pop;
			}
			DecimalFormat decFormat = new DecimalFormat("###,###");
			String str = decFormat.format(sum);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
