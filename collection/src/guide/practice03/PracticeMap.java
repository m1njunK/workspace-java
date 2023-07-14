package guide.practice03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class PracticeMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Location> manage = new HashMap<>();
		System.out.println("도시, 경도, 위도를 한번에 입력해주세요.(q는 입력완료)");
		
		// 코드 작성
		while(true) {
			
			System.out.print(">> ");
			String x = sc.nextLine();
			if(x.equals("q")) {
				break;
			}

			StringTokenizer tkn = new StringTokenizer(x.replaceAll(" ",""), ",");

			String city = tkn.nextToken();
			double longitude = Double.parseDouble(tkn.nextToken());
			double latitude = Double.parseDouble(tkn.nextToken());
			
			Location location = new Location(longitude,latitude);
			
			manage.put(city, location);
	
		}
		
		System.out.println("-----------------------------------------");
		
		Set<Entry<String,Location>> set = manage.entrySet();
		Iterator<Entry<String,Location>> iter = set.iterator();
		
		while(iter.hasNext()) {
			Entry<String, Location> entry = iter.next();
			Location location = entry.getValue();
			System.out.println(entry.getKey() + " "  + location.getLongitude() + " " + location.getLatitude());
		}
		
		System.out.println("-----------------------------------------");
		while(true) {
			
			System.out.print("도시 이름 ( q는 종료 )>> ");
			String x = sc.next();
			
			if(x.equals("q")) {
				break;
			}
			
			if(manage.containsKey(x)) {
				System.out.println(x + " " + manage.get(x));
			}else{
				System.out.println(x + "는 없습니다.");
				continue;
			};
			
		}
		
		System.out.println("시스템 종료");
	}
}
