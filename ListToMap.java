package listToMapJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {

        List<Objects> list = new ArrayList<>();
        list.add(new Objects(1, "liquidweb.com", 80000));
        list.add(new Objects(2, "linode.com", 90000));
        list.add(new Objects(3, "digitalocean.com", 120000));
        list.add(new Objects(4, "aws.amazon.com", 200000));
        list.add(new Objects(5, "mkyong.com", 1));

        // key = id, value - websites
        Map<Integer, String> result1 = list.stream().collect(
                Collectors.toMap(Objects::getId, Objects::getName));

        System.out.println("Result 1 : " + result1);

}
}