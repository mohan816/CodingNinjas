import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class CountString {

	public static void countString(String s) {
		String[] str = s.split(",");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < str.length; i++)
        	map.put(str[i], map.getOrDefault(str[i],0)+1);
        System.out.println(map);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Mango,Orange,Mango,Apple,Orange,Mango,Army";
		countString(s);

	}

}
